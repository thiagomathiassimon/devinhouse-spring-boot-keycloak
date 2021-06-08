package br.com.devinhouse.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.devinhouse.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}