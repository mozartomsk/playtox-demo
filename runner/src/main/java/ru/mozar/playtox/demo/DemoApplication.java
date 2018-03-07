package ru.mozar.playtox.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .run(args);
    }
}
