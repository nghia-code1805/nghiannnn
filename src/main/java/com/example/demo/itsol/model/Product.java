package com.example.demo.itsol.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ")//
    @SequenceGenerator(name = "PRODUCT_SEQ",sequenceName = "PRODUCT_SEQ",allocationSize = 1)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private String age;

    @Column(name = "EMAIL")
    private String email;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
