package io.berkel.componentscanning.dao;

import io.berkel.componentscanning.model.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();

}
