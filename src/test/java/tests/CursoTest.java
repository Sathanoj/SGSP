package tests;

import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.CRUDImplement;
import com.sgspproject.sgsp.model.service.CRUDService;
import com.sgspproject.sgsp.model.service.interfaces.CRUD;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author jonat
 */
public class CursoTest {
        private CRUDService service;
        
    @Test
    public void testGetAllCursos() {
        service = new CRUDService(new CRUDImplement());
        List<Curso> cursosTest = service.getAllCursos();
        System.out.println(cursosTest.toString());
    }
    
    @Test
    public void testCadastrarProfessor() {
        Professor professor = new Professor("Humberto", "Comum@dinheiro.br", 663434);
        service = new CRUDService(new CRUDImplement());
        service.addProfessor(professor);
        System.out.println(professor.toString());
    }
}
