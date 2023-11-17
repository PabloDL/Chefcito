package com.DLDev.Chefcito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DLDev.Chefcito.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
