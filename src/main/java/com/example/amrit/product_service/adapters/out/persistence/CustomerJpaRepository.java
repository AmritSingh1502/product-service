package com.example.amrit.product_service.adapters.out.persistence;
import com.example.amrit.product_service.application.out.CustomerRepository;
import com.example.amrit.product_service.domain.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerJpaRepository  implements CustomerRepository {
    private SpringDataCustomerRepository springDataCustomerRepository;

    @Override
    public Customer findById(String id){
        return springDataCustomerRepository.findById(id).orElse(null);
    }
    @Override
    public void save(Customer customer){
        springDataCustomerRepository.save(customer);
    }
}
