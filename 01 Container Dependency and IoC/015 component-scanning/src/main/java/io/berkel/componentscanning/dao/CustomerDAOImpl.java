package io.berkel.componentscanning.dao;

import io.berkel.componentscanning.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerDAO") // It can be @Component as well
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public List<Customer> findAll() {

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("Pietro");
        customer1.setSurname("Rossi");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("Sonia");
        customer2.setSurname("Pizarro");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);

        return customerList;

    }


}
