package org.spring.core.without.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="org.spring.core.without.xml.config")
public class JavaConfig {
    @Bean
    public Game getGame(){
        return  new Game();
    }
    @Bean
    public Player getPlayer(){
        return new Player();
    }
}
