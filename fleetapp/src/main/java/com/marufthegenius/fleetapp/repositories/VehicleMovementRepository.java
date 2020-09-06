package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marufthegenius.fleetapp.models.Client;
import com.marufthegenius.fleetapp.models.VehicleMovement;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
