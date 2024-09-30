package com.example.amrit.product_service.adapters.out.persistence;

import com.example.amrit.product_service.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCustomerRepository extends JpaRepository<Customer ,String>            {
}
