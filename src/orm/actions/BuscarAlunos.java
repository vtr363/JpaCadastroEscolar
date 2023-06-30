package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class BuscarAlunos {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        // 
        String sql = "select a from Tarefa as a where a.finalizado = paramFinalizado";

        Query query = manager.createQuery(sql);
        query.setParameter("paramFinalizado", true);

        @SuppressWarnings("unchecked")
        List<Aluno> lista = query.getResultList();
        
    }
}
