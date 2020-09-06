package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marufthegenius.fleetapp.models.Client;
import com.marufthegenius.fleetapp.models.VehicleType;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
