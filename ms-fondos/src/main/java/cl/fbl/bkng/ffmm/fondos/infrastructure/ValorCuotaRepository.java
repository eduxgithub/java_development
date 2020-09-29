package cl.fbl.bkng.ffmm.fondos.infrastructure;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cl.fbl.bkng.ffmm.fondos.domain.ValorCuota;

@Repository
public interface ValorCuotaRepository extends MongoRepository<ValorCuota,String> {
	
	public Optional<ValorCuota> findByIdFondoSerie(String idFondoSerie);
}
