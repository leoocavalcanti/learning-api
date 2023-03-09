package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
