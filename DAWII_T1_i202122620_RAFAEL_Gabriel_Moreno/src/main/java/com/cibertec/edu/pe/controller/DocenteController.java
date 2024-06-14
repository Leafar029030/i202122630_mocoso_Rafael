package com.cibertec.edu.pe.controller;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.edu.pe.entity.docente;
import com.cibertec.edu.pe.service.docenteService;


@RestController
@RequestMapping("/url/docente")
public class DocenteController {
	@Autowired
private docenteService doce;
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> insertarDocente(@RequestBody docente obj)
	{
		HashMap<String, Object> salida = new HashMap<>();
		
		docente objSalida = doce.docenteRegistro(obj);
		if(objSalida == null)
		{
			salida.put("mensaje","Error en el registro");
			
		}else {
			salida.put("mensaje", "se registro ");
		}
		return ResponseEntity.ok(salida);
	}
}
