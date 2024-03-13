package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "AulaDetalle")
@Data
@NoArgsConstructor
public class AulaDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @JoinColumn(name = "idAula", referencedColumnName = "id") 
    @ManyToOne 
    private Aula aula; 
 
    @JoinColumn(name = "idUsuario", referencedColumnName = "id") 
    @ManyToOne 
    private Usuario usuario; 
 
    @JoinColumn(name = "idRol", referencedColumnName = "id") 
    @ManyToOne 
    private Rol rol; 
 
    
}    
