package com.cibertec.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.entity.docente;
import com.cibertec.edu.pe.repository.DocenteRepository;



@Service
public class docenteServiceImpl implements docenteService{

	@Autowired
	private DocenteRepository repositoryDoce;
	

	@Override
	public docente docenteRegistro(docente obj) {
		return repositoryDoce.save(obj);
	}

}