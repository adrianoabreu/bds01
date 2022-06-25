package com.devsuperior.bds01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.services.DepartmentService;

//Esta classe representa o controlador REST API
@RestController
@RequestMapping(value = "/departments") //annotation que determina a rota do controlador REST
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	//ResponseEntity encapsula respostas HTTP
	@GetMapping  //Determina o Endpoint do controlador REST
	public ResponseEntity<List<DepartmentDTO>> findAll(){		
		List<DepartmentDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}

}
