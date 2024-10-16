package edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.service.impl;

import org.springframework.stereotype.Service;

import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.model.Responsavel;
import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.repository.ResponsavelRepository;
import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.service.ResponsavelService;

import java.util.NoSuchElementException;

@Service
public class ResponsavelServiceImpl  implements ResponsavelService{

    private final ResponsavelRepository responsavelRepository;

    public ResponsavelServiceImpl(ResponsavelRepository responsavelRepository) {
        this.responsavelRepository = responsavelRepository;
    }

    @Override
    public Responsavel findById(Long id) {
        return responsavelRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Responsavel create(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }
}
