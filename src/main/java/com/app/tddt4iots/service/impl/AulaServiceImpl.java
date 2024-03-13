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
public class AulaServiceImpl implements AulaService {     
    @Autowired
    AulaRepository aulaRepository;
    
	@Override 
	public Aula CrearAula() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Aula response = null; 
	 	return response; 
	 } 
	@Override 
	public Aula ModificarAula() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Aula response = null; 
	 	return response; 
	 } 
	@Override 
	public Aula EliminarAula() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Aula response = null; 
	 	return response; 
	 } 
    
}
