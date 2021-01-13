package org.cs.qa.cherry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.cs.qa")
public class CherryApp {
    public static void main(String[] args) {
        SpringApplication.run(CherryApp.class, args);
    }
}
