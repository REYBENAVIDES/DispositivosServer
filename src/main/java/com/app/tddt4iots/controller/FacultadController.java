package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Facultad;
import com.app.tddt4iots.repository.FacultadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facultad")
public class FacultadController {

    @Autowired
    private FacultadRepository facultadRepository;

    @GetMapping
    public ResponseEntity<List<Facultad>> getFacultad() {
        List<Facultad> listFacultad = facultadRepository.findAll();
        return ResponseEntity.ok(listFacultad);
    }

    @PostMapping
    public ResponseEntity<Facultad> insertFacultad(@RequestBody Facultad facultad) {
        Facultad newFacultad = facultadRepository.save(facultad);
        return ResponseEntity.ok(newFacultad);
    }

    @PutMapping
    public ResponseEntity<Facultad> updateFacultad(@RequestBody Facultad facultad) {
        Facultad upFacultad = facultadRepository.save(facultad);
        if (upFacultad != null) {
            return ResponseEntity.ok(upFacultad);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Facultad> deletePersons(@PathVariable("id") Long idFacultad) {
        facultadRepository.deleteById(idFacultad);
        return ResponseEntity.ok(null);
    }

}
