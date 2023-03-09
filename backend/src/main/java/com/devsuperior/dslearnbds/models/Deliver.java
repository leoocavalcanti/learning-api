package com.devsuperior.dslearnbds.models;

import com.devsuperior.dslearnbds.models.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    public Long id;
    public String uri;
    public Instant moment;
    public DeliverStatus status;

    public String feedback;

    public Integer correctCount;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    public Lesson lesson;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;


}
