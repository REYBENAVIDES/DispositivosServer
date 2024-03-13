package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "AdministradorYUsuario")
@Data
@NoArgsConstructor
public class AdministradorYUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long {$idClass};
     
    
}    
