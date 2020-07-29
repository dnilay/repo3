package com.example.mycustomerservice.dto;

import com.example.mycustomerservice.dao.entities.CustomerEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-29T09:54:19+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_252 (Private Build)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerEntityToDTO(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setCustomerId( customerEntity.getCustomerId() );
        customerDTO.setFirstName( customerEntity.getFirstName() );
        customerDTO.setLastName( customerEntity.getLastName() );
        customerDTO.setCity( customerEntity.getCity() );
        customerDTO.setCountry( customerEntity.getCountry() );

        return customerDTO;
    }
}
