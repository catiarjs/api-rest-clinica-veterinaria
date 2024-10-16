package edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.domain.model.Responsavel;
import edu.dio.api_rest.Api.Rest.Clinica.Veterinaria.service.ResponsavelService;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelController {

    private final ResponsavelService responsavelService;

    public ResponsavelController(ResponsavelService responsavelService) {
        this.responsavelService = responsavelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Responsavel> findById(@PathVariable Long id) {
       var responsavel = responsavelService.findById(id);
       return ResponseEntity.ok(responsavel);
    }

    @PostMapping
    public ResponseEntity<Responsavel> create(@RequestBody Responsavel responsavel) {
        var responsavelCreated = responsavelService.create(responsavel);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(responsavelCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(responsavelCreated);
    }
}
