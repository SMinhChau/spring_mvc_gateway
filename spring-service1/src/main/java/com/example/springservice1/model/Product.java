package com.example.springservice1.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "productdb", schema = "productDB")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long orderId;
    private String name;
    private Double price;
    private Long productLineId;


}
