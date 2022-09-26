package org.spring.core.life.cycle.usingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleUsingInterface implements InitializingBean, DisposableBean {
    private String lifeCycleInterface;

    public LifeCycleUsingInterface() {
        super();
    }

    public LifeCycleUsingInterface(String lifeCycleInterface) {
        this.lifeCycleInterface = lifeCycleInterface;
    }

    public String getLifeCycleInterface() {
        return lifeCycleInterface;
    }

    public void setLifeCycleInterface(String lifeCycleInterface) {
        this.lifeCycleInterface = lifeCycleInterface;
    }

    @Override
    public String toString() {
        return "LifeCycleUsingInterface{" +
                "lifeCycleInterface='" + lifeCycleInterface + '\'' +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean "+lifeCycleInterface+" called.....!!!!!");
    }

    public void destroy() throws Exception {
        System.out.println("Bean "+lifeCycleInterface+" called.....!!!!!");
    }
}
