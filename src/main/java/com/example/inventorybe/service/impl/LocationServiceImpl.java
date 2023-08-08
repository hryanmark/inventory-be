package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.LocationEntity;
import com.example.inventorybe.repository.LocationRepository;
import com.example.inventorybe.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService	{
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<LocationEntity> findAllLocation() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Override
	public Optional<LocationEntity> findLocationById(Long id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	@Override
	public LocationEntity updateLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public LocationEntity saveLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Long id) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(id);
	}

}
