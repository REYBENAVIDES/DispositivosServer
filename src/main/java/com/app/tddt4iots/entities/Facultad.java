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
@Table(name = "Facultad")
@Data
@NoArgsConstructor
public class Facultad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "NombreFacultad", nullable = false, unique = false, length = 30) 
    private String NombreFacultad; 
 
    @Column(name = "Estado", nullable = false, unique = false, length = 30) 
    private String Estado; 
 
    @JoinColumn(name = "idUsuario", referencedColumnName = "id") 
    @ManyToOne 
    private Usuario usuario; 
     
}    
