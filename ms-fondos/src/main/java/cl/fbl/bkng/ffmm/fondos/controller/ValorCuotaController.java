package cl.fbl.bkng.ffmm.fondos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.fbl.bkng.ffmm.fondos.domain.ValorCuota;
import cl.fbl.bkng.ffmm.fondos.service.ValorCuotaService;

@RestController
@RequestMapping(path="/valorcuota")
public class ValorCuotaController {
	
	@Autowired
	private ValorCuotaService valorCuotaService;
	
	@GetMapping("/getAll")
	public List<ValorCuota> getAll(){
		return valorCuotaService.getAll();
	}
	
	@GetMapping("/getById/{idFondoSerie}")
	public Optional<ValorCuota> getValorCuotaById(@PathVariable("idFondoSerie") String idFondoSerie){
		return valorCuotaService.getValorCuotaByIdFondoSerie(idFondoSerie);
	}
	
	@PostMapping("/saveValorCuota")
	public ValorCuota createValorCuota(@RequestBody ValorCuota valorcuota) {
		return valorCuotaService.createValorCuota(valorcuota);
	}
	
	

}
