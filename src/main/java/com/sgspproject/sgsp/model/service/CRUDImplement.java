package com.sgspproject.sgsp.model.service;

import com.sgspproject.sgsp.database.ConnectionToApp;
import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.interfaces.CRUD;
import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class CRUDImplement implements CRUD {

    @Override
    public List<Curso> getAllCursos() {
        ConnectionToApp cApp = new ConnectionToApp();
        List<Curso> cursos = new ArrayList<>();
        ResultSet resultSet = cApp.selectQuery("select * from curso");
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
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUDImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return cursos;
    }
    
    public void addProfessor(Professor professor) throws SQLException {
        ConnectionToApp cApp = new ConnectionToApp();
        PreparedStatement preparedStatement = cApp.insertQuery(
                "INSERT INTO Professor(nome, email, senha) values (?, ?, ?)");
        try {
            preparedStatement.setString(1, professor.getNome());
            preparedStatement.setString(2, professor.getEmail());
            preparedStatement.setInt(3, professor.getSenha());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
        }
    
    }
}
