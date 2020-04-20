package com.example.cusomer_app.service;

import com.example.cusomer_app.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer getCustomerById(long id);

    Customer save(Customer customer);

    void deleteById(long Id);

}
