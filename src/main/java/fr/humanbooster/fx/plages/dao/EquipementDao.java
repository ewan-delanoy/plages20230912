package fr.humanbooster.fx.plages.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.humanbooster.fx.plages.business.Equipement;


@RepositoryRestResource
public interface EquipementDao extends JpaRepository<Equipement, Long> {
	List<Equipement> findByNbDeLitsAndNbDeFauteuils(byte nbDeLits, byte nbDeFauteuils);
}
