package com.raulespinola.msscbrevery.services;

import com.raulespinola.msscbrevery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("MichiFuz")
                .build();
    }

    @Override
    public CustomerDto newSaveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Raul")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Delete Customer....");
    }
}
