package br.com.jcarlos.services;
import br.com.jcarlos.dao.IProdutoDAO;
import br.com.jcarlos.domain.Produto;
import br.com.jcarlos.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}