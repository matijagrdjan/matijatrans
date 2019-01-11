package com.example.matijatrans.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int returnTicket;
    private int singleTicket;
    private int studnetTicket;
    private int seniorTicket;
    @OneToOne(fetch = FetchType.EAGER)
    private Stops firstStop;
    @OneToOne(fetch = FetchType.EAGER)
    private Stops secondStop;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "prices")
    private Set<Line> lineSet;

}
