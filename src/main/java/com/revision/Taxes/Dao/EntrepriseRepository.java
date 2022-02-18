package com.revision.Taxes.Dao;

import com.revision.Taxes.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

@RestResource
public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
