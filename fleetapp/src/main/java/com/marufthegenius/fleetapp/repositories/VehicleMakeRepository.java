package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.VehicleMake;

import org.springframework.stereotype.Repository;
@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
