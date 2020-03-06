package org.lili.shard.rw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 读写分离demo
 */
@SpringBootApplication
public class ShardingReadWriteApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ShardingReadWriteApplicaiton.class, args);
    }
}
