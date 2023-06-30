package orm.actions;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class AtualizarAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setId(null);
		
		aluno.setCPF(null);
		aluno.setNome(null);
		aluno.setEmail(null);
		aluno.setEndereco(null);
		aluno.setNaturalidade(null);
		aluno.setDataNascimento(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		aluno = manager.find(Aluno.class, aluno.getId());

		
		manager.getTransaction().begin();
		manager.merge(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno Atualizado");
		
		manager.close();
		factory.close();
	}
}
