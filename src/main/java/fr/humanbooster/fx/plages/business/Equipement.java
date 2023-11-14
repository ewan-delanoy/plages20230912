package fr.humanbooster.fx.plages.business;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Equipement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private byte nbDeLits;
	private byte nbDeFauteuils;
	
	public Equipement(byte nbDeLits, byte nbDeFauteuils) {
		super();
		this.nbDeLits = nbDeLits;
		this.nbDeFauteuils = nbDeFauteuils;
	}
	
}
