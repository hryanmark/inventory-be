package com.example.inventorybe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorybe.model.LocationEntity;
import com.example.inventorybe.service.LocationService;

@RestController
@RequestMapping("/api/v1/location")
@CrossOrigin(origins = "http://localhost:3000")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@GetMapping
	public List<LocationEntity> findAllLocation(){
		return locationService.findAllLocation();
	}
	
	@GetMapping("/{id}")
	public Optional<LocationEntity> findLocationEntityById(@PathVariable("id") Long id){
		return locationService.findLocationById(id);
	}
	
	@PutMapping
	public LocationEntity updateLocation(@RequestBody LocationEntity location) {
		return locationService.saveLocation(location);
	}
	
	@PostMapping
	public LocationEntity saveLocation(@RequestBody LocationEntity location) {
		return locationService.saveLocation(location);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") Long id) {
		locationService.deleteLocation(id);
	}
}
