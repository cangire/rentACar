package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();
}
