package com.DLDev.Chefcito.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DLDev.Chefcito.entities.Product;

@Repository
@Primary
public interface IProductRepository extends JpaRepository<Product, Integer>{

}
