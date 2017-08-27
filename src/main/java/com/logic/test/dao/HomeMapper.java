package com.logic.test.dao;

import java.util.List;

import com.logic.test.model.Country;

/**
 * Handles requests for the application home page.
 */
public interface HomeMapper {
	public List<String> queryCountries();
	
	public List<String> queryCountryById(String countryId);
	
	public void insertCountries(List<Country> countries);
	
	public void updateCountryById(Country country);
	
	public void deleteCountryById(String countryId);
}
