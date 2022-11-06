package com.example.springmvc.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "prolinedb", schema = "ProLineDB")
public class ProductLine {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long lineId;
    private String lineName;
}
