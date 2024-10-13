package edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.model.Responsavel;

@Repository
public interface ResponsavelRepository  extends JpaRepository<Responsavel, Long>{

    
}