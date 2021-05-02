package org.ocean.ape.tomato;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemInfo {

    @Bean("SystemInfoBean")
    public SystemInfo create()
    {
        return new SystemInfo();
    }
    public static String javaVersion() {
        return System.getProperty("java.version");
    }

    public static String javafxVersion() {
        return System.getProperty("javafx.version");
    }

}