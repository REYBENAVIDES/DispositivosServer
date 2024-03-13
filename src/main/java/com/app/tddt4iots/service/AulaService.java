package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface AulaService {     
	 public Aula CrearAula(); 
 
	 public Aula ModificarAula(); 
 
	 public Aula EliminarAula(); 
 
    
}
