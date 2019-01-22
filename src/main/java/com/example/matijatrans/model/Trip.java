package com.example.matijatrans.model;

import lombok.Data;

import javax.persistence.*;



@Data
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String arrivalTime;

    private String departureTime;

    private String tripLength;

    @ManyToOne
    private Line line;


}
