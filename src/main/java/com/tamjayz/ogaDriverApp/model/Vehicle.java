package com.tamjayz.ogaDriverApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private String licensePlate;
    private int capacity;
    @OneToOne(cascade = CascadeType.ALL)
    private Drivers drivers;
}
