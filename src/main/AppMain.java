package main;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        /*Entrada de Dados com JOptionPane*/

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno: ");

        /*new aluno é uma instancia, ou criação de um objeto*/
        /*aluno1 é uma referencia para o objeto aluno*/
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(Integer.parseInt(idade));

        for( int pos=0; pos<4; pos++){

            String nomeDisciplina = JOptionPane.showInputDialog("Qual a disciplina: " + pos);
            String valorNota = JOptionPane.showInputDialog("Qual a nota: " + pos);

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(valorNota));

            aluno.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

        if(escolha == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
            aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
        }

        System.out.println(aluno);
        System.out.println("Calculo Média Nota: " + aluno.getMediaNota());
        System.out.println("Resultado da Aprovação: " + aluno.getAprovado());
    }
}
