package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dispositivo")
@Data
@NoArgsConstructor
public class Dispositivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "idDispositivo", nullable = true, unique = true, length = 30) 
    private String idDispositivo; 
 
    @Column(name = "Marca", nullable = false, unique = false, length = 30) 
    private String Marca; 
 
    @Column(name = "estado", nullable = false, unique = false, length = 30) 
    private String estado; 
 
    @Column(name = "Modelo", nullable = false, unique = false, length = 30) 
    private String Modelo; 
 
    @Column(name = "NombreDispositivo", nullable = false, unique = false, length = 30) 
    private String NombreDispositivo; 
 
    @Column(name = "devid", nullable = false, unique = false, length = 30) 
    private String devid; 
 
    @JoinColumn(name = "idAula", referencedColumnName = "id") 
    @ManyToOne 
    private Aula aula; 

}    
