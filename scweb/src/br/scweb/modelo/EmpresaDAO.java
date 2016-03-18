package br.scweb.modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

import br.scweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
		Logger logger = Logger.getLogger(EmpresaDAO.class);
		public int adiciona(Empresa empresa) {
			try (Connection conn = new FabricaDeConexoes().getConnection()){
			}catch (SQLException e){
					throw new RuntimeException(e);		
				}
				
				return 1;
			
			
		} 
	
	
/*	public int adiciona(Empresa empresa){
		PreparedStatement ps;
		int codigoRetorno = 0;
		
		try (Connection conn = new FabricaDeConexoes().getConnection()){
			
			ps =  conn.prepareStatement("insert into empresa (cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) values(?,?,?,?,?) ");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
		    ps.setString(3, empresa.getNomeFantasia());
		    ps.setString(4, empresa.getEndereço());
		    ps.setString(5,empresa.getTelefone());
		    codigoRetorno = ps.executeUpdate();
		    ps.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
			
		}
		return codigoRetorno;
	*/	
		public int exclui (String cnpj){
			PreparedStatement ps;
			int codigoRetorno = 0;
			try (Connection conn = new FabricaDeConexoes().getConnection())
			{
				ps = conn.prepareStatement("delete from empesa where cnpj = ?");
				ps.setString(1,  cnpj);
				codigoRetorno = ps.executeUpdate();
			}catch (SQLException e){
				throw new RuntimeException(e);
				}
			
		
		return codigoRetorno;
	}
}

