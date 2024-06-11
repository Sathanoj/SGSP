package com.sgspproject.sgsp.controller;

import com.sgspproject.sgsp.model.entity.Professor;
import com.sgspproject.sgsp.model.service.CRUDImplement;
import com.sgspproject.sgsp.model.service.CRUDService;

/**
 *
 * @author jonat
 */
public class CadastroController {
    
    private CRUDService service;
    
    public void cadastrarProfessor(Professor professor) {
        service = new CRUDService(new CRUDImplement());
        service.addProfessor(professor);
    }
}
