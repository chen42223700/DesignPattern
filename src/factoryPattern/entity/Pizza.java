package factoryPattern.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * pizza父类
 */
public abstract class Pizza {

    /**
     * 披萨名称
     */
    String name;

    /**
     * 披萨面饼
     */
    String dough;

    /**
     * 酱料
     */
    String sauce;

    /**
     * 馅
     */
    List<String> toppings = new ArrayList<>();

    /**
     * 披萨准备
     */
    public void prepare(){
        System.out.println("pizza prepare!");
    }

    public void bake(){
        System.out.println("Bake for Pizza!");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal silces");
    }

    public void box(){
        System.out.println("Box for Pizza!");
    }

    public String getName(){
        return name;
    }

}
