package com.example.matijatrans.model;



import lombok.Data;

import javax.persistence.*;



@Data
@Entity
public class Stations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String name;


}