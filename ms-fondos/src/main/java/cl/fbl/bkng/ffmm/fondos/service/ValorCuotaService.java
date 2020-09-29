package cl.fbl.bkng.ffmm.fondos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fbl.bkng.ffmm.fondos.domain.ValorCuota;
import cl.fbl.bkng.ffmm.fondos.infrastructure.ValorCuotaRepository;

@Service
public class ValorCuotaService {
	
	@Autowired
	ValorCuotaRepository valorCuotaRepository;
	
	//Obtener valores cuota
	public List<ValorCuota> getAll(){
		return valorCuotaRepository.findAll();
	}
	
	public Optional<ValorCuota> getValorCuotaByIdFondoSerie(String idFondoSerie) {
		return valorCuotaRepository.findByIdFondoSerie(idFondoSerie);
	}
	
	//Crear valores cuota
	public ValorCuota createValorCuota(ValorCuota valorCuota) {
		return valorCuotaRepository.save(valorCuota);
		
		
	}

}
