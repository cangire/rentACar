package com.etiya.rentACar.webApi.controllers;

import com.etiya.rentACar.business.abstracts.BrandService;
import com.etiya.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //ANNOTATİON
@RequestMapping("/api/brands")

public class BrandsController {
    private BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<Brand> getAll(){

        return brandService.getAll();
    }


}
