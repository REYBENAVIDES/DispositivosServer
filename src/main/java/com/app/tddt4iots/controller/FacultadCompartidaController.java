package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.FacultadCompartida;
import com.app.tddt4iots.repository.FacultadCompartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facultadcompartida")
public class FacultadCompartidaController {

    @Autowired
    private FacultadCompartidaRepository facultadcompartidaRepository;

    @GetMapping
    public ResponseEntity<List<FacultadCompartida>> getFacultadCompartida() {
        List<FacultadCompartida> listFacultadCompartida = facultadcompartidaRepository.findAll();
        return ResponseEntity.ok(listFacultadCompartida);
    }

    @PostMapping
    public ResponseEntity<FacultadCompartida> insertFacultadCompartida(@RequestBody FacultadCompartida facultadcompartida) {
        FacultadCompartida newFacultadCompartida = facultadcompartidaRepository.save(facultadcompartida);
        return ResponseEntity.ok(newFacultadCompartida);
    }

    @PutMapping
    public ResponseEntity<FacultadCompartida> updateFacultadCompartida(@RequestBody FacultadCompartida facultadcompartida) {
        FacultadCompartida upFacultadCompartida = facultadcompartidaRepository.save(facultadcompartida);
        if (upFacultadCompartida != null) {
            return ResponseEntity.ok(upFacultadCompartida);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<FacultadCompartida> deletePersons(@PathVariable("id") Long idFacultadCompartida) {
        facultadcompartidaRepository.deleteById(idFacultadCompartida);
        return ResponseEntity.ok(null);
    }

}
