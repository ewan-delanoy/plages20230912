package fr.humanbooster.fx.plages.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class ParasolEquipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@NotNull(message="{parasolequipe.parasol.manquant}")
	private Parasol parasol;
	
	@ManyToOne
	@NotNull(message="{parasol.equipement.manquant}")
	private Equipement equipement;
	
	/*
	@ToString.Exclude
	@ManyToMany(mappedBy="parasolsequipes")
	@JsonIgnore
	private List<Reservation> reservations;
    */

	public ParasolEquipe(Parasol parasol, Equipement equipement) {
		super();
		this.parasol = parasol;
		this.equipement = equipement;
	}

	/*
	@JsonIgnore
	public String getNumeroDeLaFile() {
		return String.valueOf(file.getNumero());
	}
	
	public String getNumeroEmplacementEtNumeroDeFile() {
		return numEmplacement + " en file " + file.getNumero();
	}
	*/
}