package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Product;

import java.util.List;

    public interface ProductRepository extends JpaRepository<Product, Long> {
        @Query("from Product p where p.name like %:name%")
        List<Product> getProductByName(@Param("name")String name);
    }

