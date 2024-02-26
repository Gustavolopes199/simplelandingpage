package com.example.demo.Lopes.simplelandingpage.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Lopes.simplelandingpage.Models.User;

public interface UserRepository extends CrudRepository <User, Integer> {

    static void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
