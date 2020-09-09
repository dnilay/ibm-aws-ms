package com.example.ridingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ride {
    @Id
    @Column(name = "ride_id")
    private String rideId;
    @Column(name = "ride_name")
    private String rideName;
    @Column(name = "thrillig_factor")
    private Integer thrillingFactor;
    @Column(name = "vomit_factor")
    private Integer vomitFactor;
}
