package com.imooc.distributedid;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: bizy
 * @date: 2020/11/17 20:09
 */
@SpringBootApplication
@EnableLeafServer
public class DistributedIdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedIdApplication.class,args);
    }
}
