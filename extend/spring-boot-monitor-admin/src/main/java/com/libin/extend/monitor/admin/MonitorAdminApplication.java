package com.libin.extend.monitor.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Admin 监控启动程序
 *
 * @author im_libin@yeah.net
 * @date 2022/4/22 14:31
 */
@SpringBootApplication
@Slf4j
public class MonitorAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(MonitorAdminApplication.class, args);
    log.info("Spring-Boot-Admin Monitor start successful!");
  }

}
