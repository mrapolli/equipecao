 package com.equipecao.controller;

import com.equipecao.model.Kibana;
import com.equipecao.model.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.equipecao.service.TipoProgramaService;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.UUID;

@RestController
public class TipoProgramaController {

	private final TipoProgramaService tipoProgramaService;

	@Autowired
	public TipoProgramaController(TipoProgramaService tipoProgramaService) {
		this.tipoProgramaService = tipoProgramaService;
	}

	@CrossOrigin()
	@RequestMapping(value = "/getTipo", method = RequestMethod.POST, produces = "application/json")
	public Programa getQuestions(@RequestBody Programa programa) {

		tipoProgramaService.getProductDiscount(programa);

		RestTemplate template =  new RestTemplate();

		String uuid = UUID.randomUUID().toString();
		String url = "https://search-equipecao-6fvhhjpmsimcthxyhnvhfueifa.us-east-" +
				"1.es.amazonaws.com/equipecao/experimentando/" + uuid;


		Kibana kibana = new Kibana();
		kibana.setAcomodacao(programa.getAcomodacao().isEmpty() ? null : programa.getAcomodacao().get(0));
		kibana.setEmail("bidonmegale@gmail.com");
		kibana.setIdade(programa.getFaixaEtaria());
		kibana.setNome("Abdon Megale");
		kibana.setNivel(programa.getNivel().isEmpty() ? null : programa.getNivel().get(0));
		kibana.setPais(programa.getDestinos().isEmpty() ? null : programa.getDestinos().get(0));
		kibana.setPrograma(programa.getCurso());
		kibana.setTempo(programa.getDuracao());
		kibana.setEscolaridade(programa.getEscolaridade().isEmpty() ? null : programa.getEscolaridade().get(0));
		kibana.setSexo(programa.getSexo());

		template.postForEntity(url, programa, Map.class);

		return programa;
	}

}
