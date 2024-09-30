package com.example.amrit.product_service.application.in;

import com.example.amrit.product_service.domain.entity.Customer;

// interface for retrieving a customer
public interface GetCustomerQuery {
    Customer getCustomerById(String id);

}
