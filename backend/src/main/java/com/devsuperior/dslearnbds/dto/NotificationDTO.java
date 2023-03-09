package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.models.Notification;
import com.devsuperior.dslearnbds.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id;

    private String text;

    private Instant moment;

    private Boolean read;

    private String route;

    private Long userId;

    public NotificationDTO(Notification entity) {
        this.id = entity.getId();
        this.text = entity.getText();
        this.moment = entity.getMoment();
        this.read = entity.isRead();
        this.route = entity.getRoute();
        this.userId = entity.getUser().getId();
    }
}
