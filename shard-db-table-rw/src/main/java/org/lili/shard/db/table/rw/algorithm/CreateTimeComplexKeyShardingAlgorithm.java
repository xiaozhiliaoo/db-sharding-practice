package org.lili.shard.db.table.rw.algorithm;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 自定义分片算法
 */
public class CreateTimeComplexKeyShardingAlgorithm implements ComplexKeysShardingAlgorithm<Date> {

    /**
     * 返回表名
     */
    @Override
    public Collection<String> doSharding(Collection<String> collection,
                                         ComplexKeysShardingValue<Date> complexKeysShardingValue) {

        //限制只能查6个月的数据。
        Collection<String> routeTables = new HashSet<>();
        String logicTableName = complexKeysShardingValue.getLogicTableName();
        Range<Date> range = complexKeysShardingValue.getColumnNameAndRangeValuesMap().get("ctime");
        if (range != null) {
            Date lowerEnd = range.lowerEndpoint();
            Date upperEnd = range.upperEndpoint();

            Collection<String> tables = getRouteTable(logicTableName, lowerEnd, upperEnd);
            if (tables.size() > 0) {
                routeTables.addAll(tables);
            }
        }
        List<Date> timeList = (List<Date>) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("ctime");

        if (CollectionUtils.isNotEmpty(timeList)) {
            Date cdate = timeList.get(0);
            String routTable = getRouteTable(logicTableName, cdate);
            if (routTable != null && !routTable.isEmpty()) {
                routeTables.add(routTable);
            }
        }

        return routeTables;

    }


    public static String getRouteTable(String logicTable, Date keyValue) {
        if (keyValue != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
            String formatDate = simpleDateFormat.format(keyValue);
            return logicTable + formatDate;
        }
        return null;
    }

    private static Collection<String> getRouteTable(String logicTable, Date lowerEnd, Date upperEnd) {
        Set<String> routTables = new HashSet<>();
        if (lowerEnd != null && upperEnd != null) {
            List<String> rangeNameList = getDateRange(lowerEnd, upperEnd);
            for (String string : rangeNameList) {
                routTables.add(logicTable + string);
            }
        }
        return routTables;
    }


    public static List<String> getDateRange(Date start, Date end) {
        List<String> result = Lists.newArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String startString = sdf.format(start);
        //定义：ex_collect_order表只能对近六个月的数据进行操作
        for (int i = 0; i < 7; i++) {
            Date endTime = getMouthByParam(end, i);
            String endString = sdf.format(endTime);
            result.add(endString);
            if (startString.equals(endString)) {
                break;
            }
        }
        return result;
    }

    public static Date getMouthByParam(Date date, int beforMouth) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int year = c.get(1);
        int mouth = c.get(2) - beforMouth;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, mouth, 1);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Date(calendar.getTimeInMillis());
    }
}
