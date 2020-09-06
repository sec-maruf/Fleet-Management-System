package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.Location;

import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
