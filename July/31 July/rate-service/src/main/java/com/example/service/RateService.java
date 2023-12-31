package com.example.service;

import com.example.model.Rate;

public interface RateService {
	
	Rate createRate(Rate rate);
	
	Rate findRate(String fromCurrency, String toCurrency);
}
