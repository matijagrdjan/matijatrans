package com.example.matijatrans.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private Stations firstStation;

    @OneToOne(fetch = FetchType.EAGER)
    private Stations lastStation;

    private BigDecimal price;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="line_id")
    private List<Trip> trips;

}

