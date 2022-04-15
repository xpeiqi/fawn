package org.x.fawn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.x.fawn.*.mapper")
public class FawnApplication {

    public static void main(String[] args) {
        SpringApplication.run(FawnApplication.class, args);
    }

}
