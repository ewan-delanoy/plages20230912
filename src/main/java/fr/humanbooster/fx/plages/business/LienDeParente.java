package fr.humanbooster.fx.plages.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class LienDeParente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long lienDeParenteId;
	
	private String nom;

	private float coefficient;

	public LienDeParente(String nom, float coefficient) {
		this.nom = nom;
		this.coefficient = coefficient;
	}
	
}