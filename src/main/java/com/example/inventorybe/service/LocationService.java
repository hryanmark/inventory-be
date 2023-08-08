package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.LocationEntity;

public interface LocationService {
	
	public List<LocationEntity> findAllLocation();
	public Optional<LocationEntity> findLocationById(Long id);
	public LocationEntity updateLocation(LocationEntity location);
	public LocationEntity saveLocation(LocationEntity location);
	public void deleteLocation(Long id);
}
