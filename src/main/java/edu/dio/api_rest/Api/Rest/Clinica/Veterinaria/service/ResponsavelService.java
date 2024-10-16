package edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.service;

import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.model.Responsavel;

public interface ResponsavelService {
    Responsavel findById(Long id);
    Responsavel create(Responsavel userToCreate);
}
