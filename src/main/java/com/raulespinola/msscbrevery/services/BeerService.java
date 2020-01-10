package com.raulespinola.msscbrevery.services;

import com.raulespinola.msscbrevery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
