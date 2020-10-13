package com.example.module4thithuchanh.controller;

import com.example.module4thithuchanh.model.City;
import com.example.module4thithuchanh.model.Country;
import com.example.module4thithuchanh.service.ICityService;
import com.example.module4thithuchanh.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/city","/"})
public class CityController {
    @Autowired
    ICityService cityService;

    @Autowired
    ICountryService countryService;

    private Iterable<City> getCities(){
        return cityService.findAll();
    }
    private Iterable<Country> getCountries(){
        return countryService.findAll();
    }


    @GetMapping
    public ModelAndView showListCity (){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("cities",getCities());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateCity(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("countries",getCountries());
        modelAndView.addObject("newCity",new City());
        return modelAndView;
    }

    @PostMapping("/create")
    public ResponseEntity<City> createCity(City city){
        cityService.save(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<City> updateCity(City city){
        cityService.save(city);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detailCity(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("detail");
       City currentCity =  cityService.findById(id);
       modelAndView.addObject("city",currentCity);
       return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditCity(@PathVariable("id") Long id){
        City currentCity = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("countries",getCountries());
        modelAndView.addObject("city",currentCity);
        return modelAndView;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<City> deleteCity(City city){
        cityService.remove(city);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteCity(@PathVariable("id") Long id){
        City currentCity = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("countries",getCountries());
        modelAndView.addObject("city",currentCity);
        return modelAndView;
    }
}
