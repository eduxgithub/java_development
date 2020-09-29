package cl.fbl.bkng.ffmm.fondos.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="valores_cuota")
public class ValorCuota {
	
	String idFondoSerie;
	String fechaValorCuota;
	String idMoneda;
	float valorCuota;
	boolean tieneReproceso;
	
	public ValorCuota() {

	}

	public ValorCuota(String idFondoSerie, String fechaValorCuota, String idMoneda, float valorCuota, boolean tieneReproceso) {
		
		this.idFondoSerie = idFondoSerie;
		this.fechaValorCuota = fechaValorCuota;
		this.idMoneda = idMoneda;
		this.valorCuota = valorCuota;
		this.tieneReproceso = tieneReproceso;
	}

	public String getIdFondoSerie() {
		return idFondoSerie;
	}
	
	public void setId(String idFondoSerie) {
		this.idFondoSerie = idFondoSerie;
	}
	
	public String getFechaValorCuota() {
		return fechaValorCuota;
	}
	
	public void setFechaValorCuota(String fechaValorCuota) {
		this.fechaValorCuota = fechaValorCuota;
	}
	
	public String getIdMoneda() {
		return idMoneda;
	}
	
	public void setIdMoneda(String idMoneda) {
		this.idMoneda = idMoneda;
	}
	
	public float getValorCuota() {
		return valorCuota;
	}
	
	public void setValorCuota(float valorCuota) {
		this.valorCuota = valorCuota;
	}
	
	public boolean isTieneReproceso() {
		return tieneReproceso;
	}
	
	public void setTieneReproceso(boolean tieneReproceso) {
		this.tieneReproceso = tieneReproceso;
	}

	@Override
	public String toString() {
		return "ValorCuota [id=" + idFondoSerie + ", fechaValorCuota=" + fechaValorCuota + ", idMoneda=" + idMoneda
				+ ", valorCuota=" + valorCuota + ", tieneReproceso=" + tieneReproceso + "]";
	}
	
}
