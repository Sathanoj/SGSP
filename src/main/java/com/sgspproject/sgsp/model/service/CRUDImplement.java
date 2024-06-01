package com.sgspproject.sgsp.model.service;

import com.sgspproject.sgsp.database.ConnectionToApp;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.interfaces.CRUD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class CRUDImplement implements CRUD {

    @Override
    public List<Curso> getAllCursos() {
        ConnectionToApp cApp = new ConnectionToApp();
        List<Curso> cursos = new ArrayList<>();
        ResultSet resultSet = cApp.executQuery("select * from curso");
        try {
            while(resultSet.next()) {
                String stringData = resultSet.getString("nome_curso");
                String intData = resultSet.getString("disciplina_id");
                Curso cursoData = new Curso();
                cursoData.setNome(stringData);
                cursoData.setCursoId(Integer.parseInt(intData));
                cursos.add(cursoData);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return cursos;
    }
}
