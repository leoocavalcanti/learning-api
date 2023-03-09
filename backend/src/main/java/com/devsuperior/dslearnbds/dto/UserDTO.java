package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Campo obrigatório")
    @Size(min = 5, max = 60, message = "Deve ter entre 5 e 60 caracteres")
    private String name;

    @NotBlank(message = "Campo obrigatório")
    @Email(message = "Por favor, insira um email válido")
    private String email;

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }
}
