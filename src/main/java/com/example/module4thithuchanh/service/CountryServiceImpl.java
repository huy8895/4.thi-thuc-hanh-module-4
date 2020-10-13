package com.example.module4thithuchanh.service;

import com.example.module4thithuchanh.model.Country;
import com.example.module4thithuchanh.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService{
    @Autowired
    CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.getOne(id);
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void remove(Country country) {
        countryRepository.delete(country);
    }
}
