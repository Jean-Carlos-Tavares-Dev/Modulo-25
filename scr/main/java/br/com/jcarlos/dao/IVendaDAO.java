package br.com.jcarlos.dao;
import br.com.jcarlos.dao.generic.IGenericDAO;
import br.com.jcarlos.domain.Venda;
import br.com.jcarlos.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
