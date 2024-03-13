package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Dispositivo;
import com.app.tddt4iots.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    @GetMapping
    public ResponseEntity<List<Dispositivo>> getDispositivo() {
        List<Dispositivo> listDispositivo = dispositivoRepository.findAll();
        return ResponseEntity.ok(listDispositivo);
    }

    @PostMapping
    public ResponseEntity<Dispositivo> insertDispositivo(@RequestBody Dispositivo dispositivo) {
        Dispositivo newDispositivo = dispositivoRepository.save(dispositivo);
        return ResponseEntity.ok(newDispositivo);
    }

    @PutMapping
    public ResponseEntity<Dispositivo> updateDispositivo(@RequestBody Dispositivo dispositivo) {
        Dispositivo upDispositivo = dispositivoRepository.save(dispositivo);
        if (upDispositivo != null) {
            return ResponseEntity.ok(upDispositivo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Dispositivo> deletePersons(@PathVariable("id") Long idDispositivo) {
        dispositivoRepository.deleteById(idDispositivo);
        return ResponseEntity.ok(null);
    }

}
