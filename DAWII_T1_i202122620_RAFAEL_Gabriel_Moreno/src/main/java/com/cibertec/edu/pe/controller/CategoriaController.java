package com.cibertec.edu.pe.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.edu.pe.entity.categoria;
import com.cibertec.edu.pe.service.categoriaService;



@RestController
@RequestMapping("/url/categoria")
public class CategoriaController {
	@Autowired
	private categoriaService cate;
	
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<categoria>> listaCategoria(){
		List<categoria> lista = cate.listacategoria();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> inserta(@RequestBody categoria obj)
	{
		HashMap<String, Object> salida = new HashMap<>();
		
		categoria objSalida = cate.insertarCategoria(obj);
		if(objSalida == null)
		{
			salida.put("mensaje","Error en el registro");
		}else {
			salida.put("mensaje","Se registró la ejemplo con el id");
		}
		return ResponseEntity.ok(salida);
 		}
	
}
