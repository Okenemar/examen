package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ParcelaModelo extends Conector {
	
	//select * from parcelas
	PreparedStatement prt;
	
	public ArrayList<Parcela> getParcelas(){
		ArrayList<Parcela> parcelas = new ArrayList<>();
		try {
			prt = conexion.prepareStatement("SELECT * FROM parcelas");
			ResultSet resultado = prt.executeQuery();
			while(resultado.next()) {
				Parcela parcela = new Parcela();
				parcela.setId(resultado.getInt("id"));
				parcela.setNumero(resultado.getString("numero"));
				parcela.setM_cuadrados(resultado.getInt("m_cuadrados"));
				parcela.setPrecio_dia(resultado.getDouble("precio_dia"));
				
				parcelas.add(parcela);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parcelas;
	}
	
	public Parcela getParcela(int id) {
		Parcela parcela = new Parcela();
		
		try {
			prt = conexion.prepareStatement("SELECT * FROM parcelas WHERE id=?");
			prt.setInt(1, id);
			ResultSet resultado = prt.executeQuery();
			while (resultado.next()) {
				parcela.setNumero(resultado.getString("numero"));
				parcela.setM_cuadrados(resultado.getInt("m_cuadrados"));
				parcela.setPrecio_dia(resultado.getDouble("precio_dia"));
				parcela.setId(resultado.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parcela;
	}
	
	public void modificarParcela(Parcela parcela) {
		
		try {
			prt = conexion.prepareStatement("UPDATE parcelas SET numero=?, m_cuadrados=?, precio_dia=? WHERE id=?" );
			prt.setString(1, parcela.getNumero());
			prt.setInt(2, parcela.getM_cuadrados());
			prt.setDouble(3, parcela.getPrecio_dia());
			prt.setInt(4, parcela.getId());
			
			
			prt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
