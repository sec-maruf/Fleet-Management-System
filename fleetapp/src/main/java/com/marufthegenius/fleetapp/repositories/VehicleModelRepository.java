package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marufthegenius.fleetapp.models.Client;
import com.marufthegenius.fleetapp.models.VehicleModel;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
