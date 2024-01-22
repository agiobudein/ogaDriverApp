package com.tamjayz.ogaDriverApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tamjayz.ogaDriverApp.model.domain.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Drivers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private double rating;
    private double latitude;
    private double longitude;
    private Role role;
    @OneToOne(mappedBy = "drivers", cascade = CascadeType.ALL)
    private License license;

    @JsonIgnore
    @OneToMany(mappedBy = "drivers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ride> rides;

    @OneToOne(mappedBy = "drivers", cascade = CascadeType.ALL, orphanRemoval = true)
    private Vehicle vehicle;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Ride currentRide;
    private Integer totalRevenue;


}
