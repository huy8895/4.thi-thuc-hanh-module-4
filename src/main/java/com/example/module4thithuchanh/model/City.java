package com.example.module4thithuchanh.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne
    private Country country;
    private Long area;
    private Long population;
    private Long gdp;
    private String detail;
}
