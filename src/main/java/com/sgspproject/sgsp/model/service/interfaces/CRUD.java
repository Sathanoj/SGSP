package com.sgspproject.sgsp.model.service.interfaces;

import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface CRUD {
    public List<Curso> getAllCursos();
    public void addProfessor(Professor professor) throws SQLException;
}
