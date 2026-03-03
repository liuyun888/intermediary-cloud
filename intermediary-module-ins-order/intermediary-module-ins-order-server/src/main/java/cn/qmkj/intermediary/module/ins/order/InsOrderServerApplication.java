package cn.qmkj.intermediary.module.ins.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ins-order 服务启动类
 *
 * @author 芋道源码
 */
@SpringBootApplication
public class InsOrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(InsOrderServerApplication.class, args);
        System.out.println("========================== ins-order 服务已启动 ==========================");
    }
}
