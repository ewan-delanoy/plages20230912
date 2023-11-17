package fr.humanbooster.fx.plages.dao;

import java.util.List;

// import javax.persistence.ManyToOne;
// import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.humanbooster.fx.plages.business.ParasolEquipe;

public interface ParasolEquipeDao extends JpaRepository<ParasolEquipe, Long> {
	
	
	
}