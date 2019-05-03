package com.equipecao.controller;

import com.equipecao.model.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.equipecao.model.Product;
import com.equipecao.service.TipoProgramaService;

@RestController
public class TipoProgramaController {

	private final TipoProgramaService tipoProgramaService;

	@Autowired
	public TipoProgramaController(TipoProgramaService tipoProgramaService) {
		this.tipoProgramaService = tipoProgramaService;
	}

	@RequestMapping(value = "/getTipo", method = RequestMethod.POST, produces = "application/json")
	public Programa getQuestions(@RequestBody Programa programa) {

		tipoProgramaService.getProductDiscount(programa);

		return programa;
	}

}
