package testes;

import dao.CidadeDao;
import dao.EstadoDao;
import entidades.Cidade;
import entidades.Estado;

public class TesteCidade {
	public static void main(String[] args) {
		Cidade cidade = new Cidade();
		cidade.setNome("Vitoria da Conquista");
		EstadoDao estadoDao = new EstadoDao();
		
		Estado e = estadoDao.porId("BA");
		
		cidade.setEstado(e);
		
		CidadeDao dao = new CidadeDao();
		
		dao.adiciona(cidade);
	}

}
