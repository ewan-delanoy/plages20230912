package fr.humanbooster.fx.plages.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class ParasolEquipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private byte numEmplacement;

	@ManyToOne
	@NotNull(message="{parasol.file.manquante}")
	private File file;
	
	@ManyToOne
	@NotNull(message="{parasol.equipement.manquant}")
	private Equipement equipement;
	
	/*
	@ToString.Exclude
	@ManyToMany(mappedBy="parasolsequipes")
	@JsonIgnore
	private List<Reservation> reservations;
    */

	public ParasolEquipe(byte numEmplacement, File file) {
		super();
		this.numEmplacement = numEmplacement;
		this.file = file;
	}

	@JsonIgnore
	public String getNumeroDeLaFile() {
		return String.valueOf(file.getNumero());
	}
	
	public String getNumeroEmplacementEtNumeroDeFile() {
		return numEmplacement + " en file " + file.getNumero();
	}
}