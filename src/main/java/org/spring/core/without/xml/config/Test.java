package org.spring.core.without.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Game game = applicationContext.getBean("game", Game.class);
        System.out.println(game);
    }

}
