package com.tamjayz.ogaDriverApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String licenseNumber;
    private String licenseState;
    private String licenseExpirationDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Drivers driver;
}
