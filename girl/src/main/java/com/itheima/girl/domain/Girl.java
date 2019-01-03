package com.itheima.girl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:18 2017/11/1
 */
@Entity
public class Girl {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cupSize;
    @Min(value = 18,message = "未成年禁止入内!")
    private Integer age;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
