package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.Invoice;

import org.springframework.stereotype.Repository;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
