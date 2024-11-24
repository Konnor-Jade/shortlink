package xyz.konnor.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @project: shortlink
 * @author: Konnor https://github.com/Konnor-Jade
 * @date: 2024/11/24 12:00
 * @desciption:
 */
@SpringBootApplication
@MapperScan("xyz.konnor.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class, args);
    }

}
