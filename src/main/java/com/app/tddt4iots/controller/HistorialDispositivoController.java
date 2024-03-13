package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.HistorialDispositivo;
import com.app.tddt4iots.repository.HistorialDispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historialdispositivo")
public class HistorialDispositivoController {

    @Autowired
    private HistorialDispositivoRepository historialdispositivoRepository;

    @GetMapping
    public ResponseEntity<List<HistorialDispositivo>> getHistorialDispositivo() {
        List<HistorialDispositivo> listHistorialDispositivo = historialdispositivoRepository.findAll();
        return ResponseEntity.ok(listHistorialDispositivo);
    }

    @PostMapping
    public ResponseEntity<HistorialDispositivo> insertHistorialDispositivo(@RequestBody HistorialDispositivo historialdispositivo) {
        HistorialDispositivo newHistorialDispositivo = historialdispositivoRepository.save(historialdispositivo);
        return ResponseEntity.ok(newHistorialDispositivo);
    }

    @PutMapping
    public ResponseEntity<HistorialDispositivo> updateHistorialDispositivo(@RequestBody HistorialDispositivo historialdispositivo) {
        HistorialDispositivo upHistorialDispositivo = historialdispositivoRepository.save(historialdispositivo);
        if (upHistorialDispositivo != null) {
            return ResponseEntity.ok(upHistorialDispositivo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<HistorialDispositivo> deletePersons(@PathVariable("id") Long idHistorial) {
        historialdispositivoRepository.deleteById(idHistorial);
        return ResponseEntity.ok(null);
    }

}
