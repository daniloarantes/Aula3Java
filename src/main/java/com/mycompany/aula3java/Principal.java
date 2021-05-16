/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3java;

import java.util.Scanner;

/**
 *
 * @author danilo
 */
public class Principal {

    public static void main(String[] args) {
        
        
        Aluno a = new Aluno();
        Scanner scan = new Scanner(System.in);
        boolean mat = false;

        System.out.println("Nome do Aluno: ");
        a.nome = scan.nextLine();

        System.out.println("Ano de nascimento: ");
        a.anoNascimento = scan.nextInt();

        System.out.println("Turma: ");
        a.turma = scan.next();

        System.out.println("Ano de início: ");
        a.inicioCurso = scan.nextInt();

        a.calculaIdade();

        System.out.println(a.formataNome());
        System.out.println(a.idade);
        System.out.println(a.turma);
        System.out.println(a.inicioCurso);
        a.checaMatricula(mat);

        a.boasVindas();

        
        

    }
}
