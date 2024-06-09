package tests;

import com.sgspproject.sgsp.model.entity.DayTable;
import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.CRUDImplement;
import com.sgspproject.sgsp.model.service.CRUDService;
import java.util.List;
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
    public void testGetAllProfessores() {
        service = new CRUDService(new CRUDImplement());
        List<Professor> professores = service.getAllProfessores();
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(professores.get(i));
        }
        System.out.println(professores.toString());
    }
    
    @Test
    public void testCadastrarProfessor() {
        Professor professor = new Professor("Emilio", "logia@blabla.com.br", 244);
        service = new CRUDService(new CRUDImplement());
        service.addProfessor(professor);
        System.out.println(professor.toString());
    }
    
    @Test
    public void showTableDay() {
        service = new CRUDService(new CRUDImplement());
        List<DayTable> dayTables = service.showDayTable();
        for (int i = 0; i < dayTables.size(); i++) {
            System.out.println(dayTables.get(i));
            
            
        }
    }
}
