package com.devsuperior.dslearnbds.models.pk;

import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class EnrollmentPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
