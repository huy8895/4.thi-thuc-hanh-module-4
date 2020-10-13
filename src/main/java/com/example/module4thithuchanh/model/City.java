package com.example.module4thithuchanh.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;
    @NotEmpty
    @ManyToOne
    private Country country;
    @NotEmpty
    private Long area;
    @NotEmpty
    private Long population;
    @NotEmpty
    private Long gdp;
    @NotEmpty
    private String detail;
}
