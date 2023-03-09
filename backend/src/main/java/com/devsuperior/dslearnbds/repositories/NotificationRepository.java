package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Notification;
import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);
}
