package com.tp.tp12_webservicesoap.repositories;

import com.tp.tp12_webservicesoap.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
