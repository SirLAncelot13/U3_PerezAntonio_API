package utez.edu.mx.U3_PerezAntonio_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import utez.edu.mx.U3_PerezAntonio_API.entity.PersonaEntity;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long>{

}
