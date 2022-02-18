package com.revision.Taxes.Dao;

import com.revision.Taxes.entities.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface TaxeRepository extends JpaRepository<Taxe,Long> {
}
