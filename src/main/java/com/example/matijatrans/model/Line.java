package com.example.matijatrans.model;



import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.EAGER)
    private Stops firstStop;
    @OneToOne(fetch = FetchType.EAGER)
    private Stops secondStop;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "line")
    private Set<Trip> tripSet;
    @ManyToOne
    private Prices prices;

}

