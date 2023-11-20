package fr.humanbooster.fx.plages.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
public class Equipement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipement;

	private byte nbDeLits;
	private byte nbDeFauteuils;

	@OneToMany(mappedBy = "equipement")
	@ToString.Exclude
	@JsonIgnore
	private List<ParasolEquipe> parasolsequipes;

	public Equipement(byte nbDeLits, byte nbDeFauteuils) {
		super();
		this.nbDeLits = nbDeLits;
		this.nbDeFauteuils = nbDeFauteuils;
	}

	public String getDescription() {
		String lit = this.nbDeLits==0?"":(this.nbDeLits)+" lits";
		String virgule = ( this.nbDeLits!=0 && this.nbDeFauteuils!=0)?"":",";
		String fauteuil = this.nbDeFauteuils==0?"":(this.nbDeFauteuils)+" fauteuils";
		return lit + virgule  + fauteuil;
	}
}
