package com.example.matijatrans.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String arrivalTime;
    private String departureTime;
    @ManyToOne
    private Line line;
    @ManyToOne
    private OperationalDays operationalDays;


}
