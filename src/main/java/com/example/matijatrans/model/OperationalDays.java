package com.example.matijatrans.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class OperationalDays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean monday;
    private boolean tuesday;
    private boolean wensday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "operationalDays")
    private Set<Trip>trips;

}
