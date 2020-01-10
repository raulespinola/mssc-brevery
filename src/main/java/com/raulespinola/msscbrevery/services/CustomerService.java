package com.raulespinola.msscbrevery.services;

import com.raulespinola.msscbrevery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
