package org.lili.shard.db.table.rw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 分库分表读写分离demo
 */
@SpringBootApplication
public class ShardingDbTableReadWriteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableReadWriteApplication.class, args);
    }
}
