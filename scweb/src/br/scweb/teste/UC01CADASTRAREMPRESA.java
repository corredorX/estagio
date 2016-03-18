package br.scweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.scweb.modelo.Empresa;
import br.scweb.modelo.EmpresaDAO;

public class UC01CADASTRAREMPRESA {
static EmpresaDAO empresaDAO;
static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	empresaDAO= new EmpresaDAO();
	empresa = new Empresa();
	empresa.setNomeDaEmpresa("empresa x");
	empresa.setCnpj("88998987144");
	empresa.setNomeFantasia("empresa x");
	empresa.setEndereço("rua taquari");
	empresa.setTelefone("222");
	}

	
	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals(1,empresaDAO.adiciona(empresa));
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
