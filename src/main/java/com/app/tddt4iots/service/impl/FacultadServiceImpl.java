package com.app.tddt4iots.service.impl;

import com.app.tddt4iots.service.*;
import com.app.tddt4iots.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public class FacultadServiceImpl implements FacultadService {     
    @Autowired
    FacultadRepository facultadRepository;
    
	@Override 
	public Facultad AgregarFacultad() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Facultad response = null; 
	 	return response; 
	 } 
	@Override 
	public Facultad ModificarFacultad() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Facultad response = null; 
	 	return response; 
	 } 
	@Override 
	public Facultad EliminarFacultad() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Facultad response = null; 
	 	return response; 
	 } 
    
}
