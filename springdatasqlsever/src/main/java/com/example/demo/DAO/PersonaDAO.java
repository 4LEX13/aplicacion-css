package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long>{

}
