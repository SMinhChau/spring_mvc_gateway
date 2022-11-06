package com.example.springservice1.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productLinedb", schema = "productLinedb")
public class ProductLine {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long productLineId;
    private String name;
    private String discrible;

}
