package utez.edu.mx.U3_PerezAntonio_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import utez.edu.mx.U3_PerezAntonio_API.entity.PersonaEntity;
import utez.edu.mx.U3_PerezAntonio_API.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<PersonaEntity> getAll(){
		return personaRepository.findAll();
	}
	
	public PersonaEntity get(long id) {
		return personaRepository.findById(id).get();
	}
	
	public void save(PersonaEntity persona) {
		personaRepository.save(persona);
	}
	
	public void delete(long id) {
		personaRepository.deleteById(id);
	}
}
