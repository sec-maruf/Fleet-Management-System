package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.InvoiceStatus;

import org.springframework.stereotype.Repository;
@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
