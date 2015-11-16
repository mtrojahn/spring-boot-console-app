package com.mtrojahn.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * Manual:
 * public @interface SpringBootApplication
 * Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and
 * component scanning. This is a convenience annotation that is equivalent to declaring @Configuration,
 * @EnableAutoConfiguration and @ComponentScan.
 *
 * Registra uma classe de configuração que declara um ou mais metodos @Bean e também dispara a auto-configuração e
 * busca por componentes neste pacote. Esta é uma anotação de conveniência que é equivalente a declarar @Configuration
 * @EnableAutoConfiguration e @ComponentScan.
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        Application app = context.getBean(Application.class);
        app.start();
    }

    private void start() {
        System.out.println("Hello World!");
    }
}
