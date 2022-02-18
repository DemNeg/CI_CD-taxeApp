package com.revision.Taxes.Dao;

import com.revision.Taxes.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
