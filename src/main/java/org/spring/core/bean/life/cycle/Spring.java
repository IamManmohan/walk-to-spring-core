package org.spring.core.bean.life.cycle;

public class Spring {
    private String lifeCycle;

    public Spring() {
        super();
    }

    public Spring(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return "Spring{" +
                "lifeCycle='" + lifeCycle + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Bean "+lifeCycle+" init method called.....!!!!!");
    }

    public void destroy(){
        System.out.println("Bean "+lifeCycle+" destroy method called.....!!!!!");
    }
}
