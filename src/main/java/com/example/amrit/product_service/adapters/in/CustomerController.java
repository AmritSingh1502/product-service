package com.example.amrit.product_service.adapters.in;

import com.example.amrit.product_service.application.in.GetCustomerQuery;
import com.example.amrit.product_service.application.out.CustomerRepository;
import com.example.amrit.product_service.domain.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController     {

    private final GetCustomerQuery getCustomerQuery;
    private final CustomerRepository customerRepository;


    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id){
        return getCustomerQuery.getCustomerById(id);
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);

    }

}
