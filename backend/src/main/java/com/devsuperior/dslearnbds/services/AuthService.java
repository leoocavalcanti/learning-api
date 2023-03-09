package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.models.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenException;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;



    public User authenticated(){

        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return repository.findByEmail(username);
        }
        catch(Exception e){

            throw new UnauthorizedException("Usuário inválido");
        }

    }

    public void validateSelfOrAdmin(Long userId){

        User user = authenticated();
        if(!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")){

            throw new ForbiddenException("Não autorizado");
        }
    }
}
