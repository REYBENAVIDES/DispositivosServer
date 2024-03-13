package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Rol;
import com.app.tddt4iots.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolRepository rolRepository;

    @GetMapping
    public ResponseEntity<List<Rol>> getRol() {
        List<Rol> listRol = rolRepository.findAll();
        return ResponseEntity.ok(listRol);
    }

    @PostMapping
    public ResponseEntity<Rol> insertRol(@RequestBody Rol rol) {
        Rol newRol = rolRepository.save(rol);
        return ResponseEntity.ok(newRol);
    }

    @PutMapping
    public ResponseEntity<Rol> updateRol(@RequestBody Rol rol) {
        Rol upRol = rolRepository.save(rol);
        if (upRol != null) {
            return ResponseEntity.ok(upRol);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Rol> deletePersons(@PathVariable("id") Long idRol) {
        rolRepository.deleteById(idRol);
        return ResponseEntity.ok(null);
    }

}
