package modelo;

import java.util.ArrayList;
/**
 * 
 * @author Eñaut
 * Esta clase DTO representa la entidad
 * PARCELA de la BBDD
 *
 */
public class Parcela {
	private int id;
	private String numero;
	private int m_cuadrados;
	private Double precio_dia;
	
	
	public Parcela(int id, String numero, int m_cuadrados, Double precio_dia) {
		super();
		this.id = id;
		this.numero = numero;
		this.m_cuadrados = m_cuadrados;
		this.precio_dia = precio_dia;
	}
	
	public Parcela() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getM_cuadrados() {
		return m_cuadrados;
	}

	public void setM_cuadrados(int m_cuadrados) {
		this.m_cuadrados = m_cuadrados;
	}

	public Double getPrecio_dia() {
		return precio_dia;
	}

	public void setPrecio_dia(Double precio_dia) {
		this.precio_dia = precio_dia;
	}

	@Override
	public String toString() {
		return "Parcela [id=" + id + ", numero=" + numero + ", m_cuadrados=" + m_cuadrados + ", precio_dia="
				+ precio_dia + "]";
	}
	
	
}
