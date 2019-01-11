package com.example.matijatrans.model;



import lombok.Data;

import javax.persistence.*;



@Data
@Entity
public class Stops{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String stopName;


}