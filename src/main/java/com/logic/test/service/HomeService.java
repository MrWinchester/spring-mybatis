package com.logic.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logic.test.dao.HomeMapper;
import com.logic.test.model.Country;
import com.logic.test.service.impl.IHomeService;

/**
 * Handles requests for the application home page.
 */
@Service
public class HomeService implements IHomeService{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeService.class);
	
	@Autowired
	private HomeMapper mapper;

	@Override
	public List<String> queryCountries() {
		return mapper.queryCountries();
	}

	@Override
	public List<String> queryCountryById(String countryId) {
		return mapper.queryCountryById(countryId);
	}

	@Override
	public void insertCountries(List<Country> countries) {
		 mapper.insertCountries(countries);
	}

	@Override
	public void updateCountryById(Country country) {
		mapper.updateCountryById(country);
	}

	@Override
	public void deleteCountryById(String countryId) {
		mapper.deleteCountryById(countryId);
	}
	
	
}
