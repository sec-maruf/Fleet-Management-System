package com.marufthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marufthegenius.fleetapp.models.Contact;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
