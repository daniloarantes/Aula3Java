/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3java;

/**
 *
 * @author danilo
 */
public class Aluno {
    String nome;
    int idade;
    String turma;
    int inicioCurso;
    int anoNascimento;
    
    public String formataNome(){
        return nome.toUpperCase();
    }
    
    public void boasVindas(){
        System.out.println("Bem-vindo ao Senac " + nome.toUpperCase());
    }
    
    public void calculaIdade(){
        idade = 2021 - anoNascimento;
    }
    
    public void checaMatricula(boolean mat){
        if (mat) {
            System.out.println("Aluno matriculado");
        } else {
            System.out.println("Aluno não matriculado");
        }
    }
}
