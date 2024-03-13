package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface DispositivoService {     
	 public Dispositivo AgregarDispositivo(); 
 
	 public Dispositivo ModificarDispositivo(); 
 
	 public Dispositivo EliminarDispositivo(); 
 
	 public Dispositivo EncenderDispositivo(); 
 
	 public Dispositivo ApagarDispositivo(); 
 
	 public Dispositivo DeshabilitarDispositivo(); 
 
	 public Dispositivo BloquearDispositivo(); 
 
	 public Dispositivo VerHistorialDispositivo(); 
 
    
}
