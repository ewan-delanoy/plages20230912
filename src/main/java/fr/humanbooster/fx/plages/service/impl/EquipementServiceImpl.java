package fr.humanbooster.fx.plages.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.plages.business.Equipement;
import fr.humanbooster.fx.plages.dao.EquipementDao;
import fr.humanbooster.fx.plages.service.EquipementService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements EquipementService {

	private EquipementDao equipementDao;
	
	@Override
	public List<Equipement> recupererEquipements() {
		return equipementDao.findAll();
	}

}
