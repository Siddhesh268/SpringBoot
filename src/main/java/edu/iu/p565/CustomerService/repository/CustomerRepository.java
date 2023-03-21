package edu.iu.p565.CustomerService.repository;

import java.util.ArrayList;
import java.util.List;

import edu.iu.p565.CustomerService.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    private List<Customer> customers=new ArrayList<>();

    public List<Customer> findAll(){
        return customers;
    }
    public int create(Customer customer){
        int id=customers.size()+1;
        customer.setId(id);
        customers.add(customer);
        return id;
    }


}
