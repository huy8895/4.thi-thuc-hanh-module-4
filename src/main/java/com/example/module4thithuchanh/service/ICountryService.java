package com.example.module4thithuchanh.service;

import com.example.module4thithuchanh.model.Country;

public interface ICountryService {
    Iterable<Country> findAll();
    Country findById(Long id);
    Country save(Country Country);
    void remove(Country Country);
}
