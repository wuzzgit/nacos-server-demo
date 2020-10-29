package com.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *NACOS动态发布与更新相关数据，无需重新启动项目
 * 使用前必须先下载并启动nacos-server服务
 *
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosConfigApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NacosConfigApplication.class, args);
    }
}
