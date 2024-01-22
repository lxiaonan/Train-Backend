package com.xiaonan.train.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.xiaonan")
public class MemberApplication {
    private static final Logger L0G = LoggerFactory.getLogger(MemberApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MemberApplication.class);
        Environment env = app.run(args).getEnvironment();
        L0G.info("启动成功!!");
        L0G.info("地址:\thttp://127.0.0.1:{}{}/hello", env.getProperty("server.port"),env.getProperty("server.servlet.context-path"));

    }
}
