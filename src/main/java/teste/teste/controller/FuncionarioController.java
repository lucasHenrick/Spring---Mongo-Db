package teste.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.teste.model.Funcionario;
import teste.teste.service.FuncionarioService;


@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping
	public List<Funcionario> obterTodos() {
		System.out.println("GET");
		return this.funcionarioService.obterTodos();
	}
	@PostMapping
	public Funcionario criar(@RequestBody Funcionario func) {
		System.out.println("POST");
		return this.funcionarioService.criar(func);	
	}
	@GetMapping("{id}")
	public Funcionario trazerPorId(@PathVariable String id) {
		System.out.println("Pesquisa por Id");
		return this.funcionarioService.ObterPorCodigo(id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		System.out.println("Delete");
		this.funcionarioService.delete(id);
	}
}
