package com.sgspproject.sgsp.model.service;

import com.sgspproject.sgsp.database.ConnectionToApp;
import com.sgspproject.sgsp.model.entity.DayTable;
import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.entity.adminentity.Curso;
import com.sgspproject.sgsp.model.service.interfaces.CRUD;
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
    
    @Override
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

    @Override
    public List<Professor> getAllProfessores() {
        ConnectionToApp cApp = new ConnectionToApp();
        List<Professor> professores = new ArrayList<>();
        
        ResultSet resultSet = cApp.selectQuery("select * from professor");
        try {
            while(resultSet.next()) {
                Professor professor = new Professor();
                professor.setNome(resultSet.getString("nome"));
                professor.setMatricula(Integer.parseInt(resultSet.getString("matricula")));
                professor.setEmail(resultSet.getString("email"));
                professores.add(professor);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return professores;
    }

    @Override
    public List<DayTable> showDayTable() {
        List<DayTable> dayTables = new ArrayList<>();
        ConnectionToApp cApp = new ConnectionToApp();
        ResultSet rs = cApp.selectQuery(
            "SELECT DISTINCT\n" +
            "  curso.nome_curso AS nome_curso,\n" +
            "  turma.tipo_turma AS tipo_turma,\n" +
            "  professor.nome AS nome\n" +
            "FROM curso\n" +
            "LEFT JOIN turma ON curso.disciplina_id = turma.turma_id\n" +
            "LEFT JOIN professor ON turma.turma_id = professor.matricula\n" +
            "GROUP BY curso.nome_curso;");
        try {
            while (rs.next()) {
                String nomeCurso = rs.getString("nome_curso");
                String tipoTurma = rs.getString("tipo_turma");
                String nomeProfessor = rs.getString("nome");
                
                if (nomeCurso != null && tipoTurma != null && nomeProfessor != null) {
                    DayTable dayTable = new DayTable();
                    dayTable.setNomeCurso(nomeCurso);
                    dayTable.setIdTurma(tipoTurma);
                    dayTable.setNomeProfessor(nomeProfessor);
                    dayTables.add(dayTable);
                }
            }
            
            // Fechar recursos
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dayTables;
    }
}