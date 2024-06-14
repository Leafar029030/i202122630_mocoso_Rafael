package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.entity.categoria;

public interface categoriaService {
	public abstract categoria insertarCategoria(categoria obj);
	public abstract List<categoria> listacategoria();
}
