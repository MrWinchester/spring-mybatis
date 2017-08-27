package com.logic.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.logic.test.model.Country;

/**
 * Handles requests for the application home page.
 */
public interface IHomeService {
	public List<String> queryCountries();
	
	public List<String> queryCountryById(String countryId);
	
	public void insertCountries(List<Country> countries);
	
	public void updateCountryById(Country country);
	
	public void deleteCountryById(String countryId);
}
