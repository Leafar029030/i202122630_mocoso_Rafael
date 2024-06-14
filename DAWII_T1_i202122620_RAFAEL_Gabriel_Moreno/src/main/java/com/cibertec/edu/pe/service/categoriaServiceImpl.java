package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.entity.categoria;
import com.cibertec.edu.pe.repository.CategoriaRepository;


@Service
public class categoriaServiceImpl implements categoriaService{

	private CategoriaRepository repositoryCate;
	
	@Override
	public categoria insertarCategoria(categoria obj) {
		return repositoryCate.save(obj);
	}

	@Override
	public List<categoria> listacategoria() {
		return repositoryCate.findAll();
	}

}