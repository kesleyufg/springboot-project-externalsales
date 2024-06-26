package br.ufg.inf.bsi.externalsales.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.inf.bsi.externalsales.domain.Contato;
import br.ufg.inf.bsi.externalsales.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repo;

	public Contato buscar(Integer id) {
		Optional<Contato> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
