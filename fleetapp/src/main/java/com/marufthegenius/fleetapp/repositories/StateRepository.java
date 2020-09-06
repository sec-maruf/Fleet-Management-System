package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.State;

import org.springframework.stereotype.Repository;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
