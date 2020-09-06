package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marufthegenius.fleetapp.models.Client;
import com.marufthegenius.fleetapp.models.VehicleStatus;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
