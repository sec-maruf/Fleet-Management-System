package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marufthegenius.fleetapp.models.EmployeeType;

import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
