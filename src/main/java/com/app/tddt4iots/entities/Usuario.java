package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "Contrasenia", nullable = false, unique = false, length = 30) 
    private String Contrasenia; 
 
    @Column(name = "email", nullable = false, unique = false, length = 30) 
    private String email; 
 
    @Column(name = "Usuario", nullable = false, unique = false, length = 30) 
    private String Usuario; 
    
}    
