package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.AulaDetalle;
import com.app.tddt4iots.repository.AulaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auladetalle")
public class AulaDetalleController {

    @Autowired
    private AulaDetalleRepository auladetalleRepository;

    @GetMapping
    public ResponseEntity<List<AulaDetalle>> getAulaDetalle() {
        List<AulaDetalle> listAulaDetalle = auladetalleRepository.findAll();
        return ResponseEntity.ok(listAulaDetalle);
    }

    @PostMapping
    public ResponseEntity<AulaDetalle> insertAulaDetalle(@RequestBody AulaDetalle auladetalle) {
        AulaDetalle newAulaDetalle = auladetalleRepository.save(auladetalle);
        return ResponseEntity.ok(newAulaDetalle);
    }

    @PutMapping
    public ResponseEntity<AulaDetalle> updateAulaDetalle(@RequestBody AulaDetalle auladetalle) {
        AulaDetalle upAulaDetalle = auladetalleRepository.save(auladetalle);
        if (upAulaDetalle != null) {
            return ResponseEntity.ok(upAulaDetalle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<AulaDetalle> deletePersons(@PathVariable("id") Long idAulaDetalle) {
        auladetalleRepository.deleteById(idAulaDetalle);
        return ResponseEntity.ok(null);
    }

}
