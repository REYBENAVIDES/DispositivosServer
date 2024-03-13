package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rol")
@Data
@NoArgsConstructor
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "Descripcion", nullable = false, unique = false, length = 30) 
    private String Descripcion; 
 
    @Column(name = "Estado", nullable = false, unique = false, length = 30) 
    private String Estado; 
    
}    
