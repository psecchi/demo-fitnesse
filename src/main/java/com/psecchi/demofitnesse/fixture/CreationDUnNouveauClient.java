package com.psecchi.demofitnesse.fixture;

import com.psecchi.demofitnesse.model.Client;
import com.psecchi.demofitnesse.service.ClientService;

public class CreationDUnNouveauClient {

	Client client;

	private ClientService clientService = new ClientService();

	public CreationDUnNouveauClient() {
		client = new Client();
	}

	public void setNom(String nom) {
		client.setNom(nom);
	}

	public void setPrenom(String prenom) {
		client.setPrenom(prenom);
	}

	public void setAge(String age) {
		if(age != null) {
			client.setAge(Integer.valueOf(age));
		}
	}
	
	public String creation() {
		try {
			clientService.saveClient(client);
		}
		catch (IllegalArgumentException e) {
			return "KO";
		}
		return "OK";
	}
}
