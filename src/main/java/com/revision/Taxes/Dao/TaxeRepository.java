package com.revision.Taxes.Dao;

import com.revision.Taxes.entities.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxeRepository extends JpaRepository<Taxe,Long> {
}
