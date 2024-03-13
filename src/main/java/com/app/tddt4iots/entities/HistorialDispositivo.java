package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "HistorialDispositivo")
@Data
@NoArgsConstructor
public class HistorialDispositivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "AccionRealizada", nullable = false, unique = false, length = 30) 
    private String AccionRealizada; 
 
    @Column(name = "FechaAccion", nullable = false, unique = false, length = 30) 
    private String FechaAccion; 
 
    @JoinColumn(name = "idDispositivo", referencedColumnName = "id") 
    @ManyToOne 
    private Dispositivo dispositivo; 
 
    @JoinColumn(name = "idUsuario", referencedColumnName = "id") 
    @ManyToOne 
    private Usuario usuario; 
 
    
}    
