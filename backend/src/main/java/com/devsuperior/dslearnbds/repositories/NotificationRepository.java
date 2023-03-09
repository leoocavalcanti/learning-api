package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Notification;
import com.devsuperior.dslearnbds.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
