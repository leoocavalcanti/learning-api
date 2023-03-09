package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Enrollment;
import com.devsuperior.dslearnbds.models.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
