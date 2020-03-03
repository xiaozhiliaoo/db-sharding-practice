package org.lili.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lili
 * @date 2020/3/3 20:05
 * @description
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {
        "org.lili.sharding"
})
@MapperScan(basePackages = {
        "org.lili.sharding.mapper"
})
public class ShardingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
    }

}
