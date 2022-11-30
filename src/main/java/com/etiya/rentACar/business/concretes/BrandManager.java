package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.BrandService;
import com.etiya.rentACar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//IoC
@Service //Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public List<Brand> getAll() {
        //iş kuralları
        return brandRepository.getAll();
    }
}
