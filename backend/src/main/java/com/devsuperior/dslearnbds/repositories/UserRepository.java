package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String username);
}
