package teste.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.teste.model.Funcionario;
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository repositori;
	
	@Override
	public List<Funcionario> obterTodos() {
		return this.repositori.findAll();
	}

	@Override
	public Funcionario criar(Funcionario funcionario) {
		return this.repositori.save(funcionario);
	}

	@Override
	public Funcionario ObterPorCodigo(String codigo) {
		return this.repositori
				.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Funcionario não existe"));
	}

	@Override
	public void delete(String codigo) {
		this.repositori.deleteById(codigo);
		}
	
	 
	
}
