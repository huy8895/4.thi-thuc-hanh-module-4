package com.example.module4thithuchanh.repository;

import com.example.module4thithuchanh.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
