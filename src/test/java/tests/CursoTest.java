/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.CRUDImplement;
import java.util.List;
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
    
    
}
