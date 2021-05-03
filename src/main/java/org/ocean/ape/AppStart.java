package org.ocean.ape;

import org.ocean.ape.tomato.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart
{
    private static Logger LOGGER = LoggerFactory.getLogger(AppStart.class);

    public static void main(String[] args)
    {
        App.main(args);

//        ConfigurableApplicationContext ctx = SpringApplication.run(AppStart.class, args);
//        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(LOGGER::error);
    }
}
