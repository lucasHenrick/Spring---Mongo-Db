package teste.teste.service;
import java.util.List;

import org.springframework.stereotype.Service;

import teste.teste.model.*;

@Service
public interface FuncionarioService {
	
	public List<Funcionario> obterTodos();
	public Funcionario criar(Funcionario funcionario);
	public Funcionario ObterPorCodigo (String codigo);
	public void delete(String codigo);
}
