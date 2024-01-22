package com.tamjayz.ogaDriverApp.repository;

import com.tamjayz.ogaDriverApp.model.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Drivers, Integer> {
}
