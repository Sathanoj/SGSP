package com.sgspproject.sgsp.model.service;

import com.sgspproject.sgsp.model.entity.DayTable;
import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.interfaces.CRUD;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class CRUDService {
    
    private CRUD crud;
    
    public CRUDService(CRUD crud) {
        this.crud = crud;
    }
    
    public List<Curso> getAllCursos() {
        return crud.getAllCursos();
    }
    
    public List<Professor> getAllProfessores() {
        return crud.getAllProfessores();
    }
    
    public void addProfessor(Professor professor) {
        try {
            crud.addProfessor(professor);
        } catch (SQLException ex) {
            Logger.getLogger(CRUDService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<DayTable> showDayTable() {
        return crud.showDayTable();
    }
        
}
