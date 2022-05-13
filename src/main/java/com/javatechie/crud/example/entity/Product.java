package com.javatechie.crud.example.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {

    @Id //primary key
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

}
