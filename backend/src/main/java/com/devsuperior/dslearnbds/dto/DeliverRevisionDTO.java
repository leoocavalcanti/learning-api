package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.models.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliverRevisionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public DeliverStatus status;

    public String feedback;

    public Integer correctCount;
}
