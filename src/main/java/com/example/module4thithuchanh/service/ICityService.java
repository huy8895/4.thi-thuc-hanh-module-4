package com.example.module4thithuchanh.service;

import com.example.module4thithuchanh.model.City;

public interface ICityService {
    Iterable<City> findAll();
    City findById(Long id);
    City save(City city);
    void remove(City city);
}

