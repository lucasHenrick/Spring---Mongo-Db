package teste.teste.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import teste.teste.model.Funcionario;

@Repository
public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}
