package com.sgspproject.sgsp;

import com.sgspproject.sgsp.view.LoginPage;

public class Sgsp {

    public static void main(String[] args) {
        
//        Professor pf = new Professor("jorge", "maria@maria.com.br", 2222);
//        System.out.println("O professor cadastrado foi: " + pf.getNome());
//        System.out.println("Com o email: " + pf.getEmail());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}