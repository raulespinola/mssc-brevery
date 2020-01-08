package com.raulespinola.msscbrevery.services;

import com.raulespinola.msscbrevery.web.model.BeerDto;

import java.util.UUID;

public interface BeerServices {
    BeerDto getBeerById(UUID beerId);
}
