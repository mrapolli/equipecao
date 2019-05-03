package com.equipecao.service;

import com.equipecao.model.Programa;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipecao.model.Product;

@Service
public class TipoProgramaService {

	private final KieContainer kieContainer;

	@Autowired
	public TipoProgramaService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Programa getProductDiscount(Programa programa) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(programa);
		kieSession.fireAllRules();
		kieSession.dispose();
		return programa;
	}
}