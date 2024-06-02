package tests;

import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.CRUDImplement;
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
    @Test
    public void testGetAllCursos() {
        CRUDImplement select = new CRUDImplement();
        List<Curso> cursosTest = select.getAllCursos();
        System.out.println(cursosTest.toString());
    }
    
    @Test
    public void testCadastrarProfessor() {
        Professor professor = new Professor("Alice", "alice@gomes.com", 4321);
        CRUDImplement insert = new CRUDImplement();
        try {
            insert.addProfessor(professor);
        } catch (SQLException ex) {
            Logger.getLogger(CursoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(professor.toString());
    }
}
