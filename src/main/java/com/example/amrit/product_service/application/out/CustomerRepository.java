package com.example.amrit.product_service.application.out;

import com.example.amrit.product_service.domain.entity.Customer;

// repository interface used by the domain service
public interface CustomerRepository {
    Customer findById(String id);
    void save(Customer customer);
}
