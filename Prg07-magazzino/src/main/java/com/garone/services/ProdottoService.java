package com.garone.services;

import java.util.List;

import com.garone.entities.Prodotto;

public interface ProdottoService {
	void addProdotto(Prodotto p);
	void updateProdotto(Prodotto p);
	void deleteProdottoById(int id);
	
	Prodotto getProdottoById(int id);
	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByMinMax(int min, int max);
	
	
}
