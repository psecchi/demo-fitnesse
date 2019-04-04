package com.psecchi.demofitnesse.service;

import org.apache.commons.lang.StringUtils;

import com.psecchi.demofitnesse.model.Client;

public class ClientService {

	
	public void saveClient(Client client) {
		if(StringUtils.isEmpty(client.getPrenom())) {
			throw new IllegalArgumentException("prenom obligatoire");
		}
		if(client.getAge() < 18) {
			throw new IllegalArgumentException("le client doit etre majeur");
		}
		// save ok
	}
	
}
