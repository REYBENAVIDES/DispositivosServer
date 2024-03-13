package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Aula;
import com.app.tddt4iots.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaRepository aulaRepository;

    @GetMapping
    public ResponseEntity<List<Aula>> getAula() {
        List<Aula> listAula = aulaRepository.findAll();
        return ResponseEntity.ok(listAula);
    }

    @PostMapping
    public ResponseEntity<Aula> insertAula(@RequestBody Aula aula) {
        Aula newAula = aulaRepository.save(aula);
        return ResponseEntity.ok(newAula);
    }

    @PutMapping
    public ResponseEntity<Aula> updateAula(@RequestBody Aula aula) {
        Aula upAula = aulaRepository.save(aula);
        if (upAula != null) {
            return ResponseEntity.ok(upAula);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Aula> deletePersons(@PathVariable("id") Long idAula) {
        aulaRepository.deleteById(idAula);
        return ResponseEntity.ok(null);
    }

}
