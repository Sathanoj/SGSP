package com.sgspproject.sgsp;

import com.sgspproject.sgsp.model.entity.Professor;

public class Sgsp {

    public static void main(String[] args) {
        
        Professor pf = new Professor("jorge", "maria@maria.com.br", 2222);
        System.out.println("O professor cadastrado foi: " + pf.getNome());
        System.out.println("Com o email: " + pf.getEmail());
        
//        JFrame jf = new JFrame();
//        Login login = new Login();
//        jf.add(login);
//        jf.setSize(700, 500);
//        jf.setLocationRelativeTo(null);
//        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        jf.setVisible(true);
    }
}