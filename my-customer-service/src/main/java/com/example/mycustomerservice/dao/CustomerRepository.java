package com.example.mycustomerservice.dao;
import com.example.mycustomerservice.dao.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

}
