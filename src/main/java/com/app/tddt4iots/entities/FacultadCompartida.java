package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "FacultadCompartida")
@Data
@NoArgsConstructor
public class FacultadCompartida {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "estado", nullable = false, unique = false, length = 30) 
    private String estado; 
 
    @JoinColumn(name = "idFacultad", referencedColumnName = "id") 
    @ManyToOne 
    private Facultad facultad; 
 
    @JoinColumn(name = "idUsuario", referencedColumnName = "id") 
    @OneToOne 
    private Usuario usuario; 
 
    
}    
