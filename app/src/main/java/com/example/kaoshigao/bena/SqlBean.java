package com.example.kaoshigao.bena;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @date：2020/6/23
 * @describe：shujuku bean类
 * @author：FanYaJun
 */
@Entity
public class SqlBean {
    @Id
    private Long id;
    private String name;
    private int age;
    private String sex;
    private String arresstio;
    @Generated(hash = 433185496)
    public SqlBean(Long id, String name, int age, String sex, String arresstio) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.arresstio = arresstio;
    }
    @Generated(hash = 2066760633)
    public SqlBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getArresstio() {
        return this.arresstio;
    }
    public void setArresstio(String arresstio) {
        this.arresstio = arresstio;
    }
    
}
