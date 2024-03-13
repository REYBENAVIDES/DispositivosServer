package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;
import java.util.List;

@Entity
@Table(name = "Aula")
@Data
@NoArgsConstructor
public class Aula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "idAula", nullable = true, unique = true, length = 30) 
    private String idAula; 
 
    @Column(name = "NombreAul", nullable = false, unique = false, length = 30) 
    private String NombreAul; 
 
    @Column(name = "estado", nullable = false, unique = false, length = 30) 
    private String estado; 
 
 
    @JoinColumn(name = "idFacultad", referencedColumnName = "id") 
    @ManyToOne 
    private Facultad facultad; 
 
    
}    
