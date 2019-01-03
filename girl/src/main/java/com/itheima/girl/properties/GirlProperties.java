package com.itheima.girl.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 14:58 2017/11/1
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {


    private String name;
    private String age;
    private String cupSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
