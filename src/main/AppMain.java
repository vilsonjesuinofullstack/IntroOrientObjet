package main;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 1; qtd++) {

            String nome = JOptionPane.showInputDialog("Qual o nome do aluno: " + qtd);
            String idade = JOptionPane.showInputDialog("Qual a idade do aluno: " + qtd);

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setIdade(Integer.parseInt(idade));

            for (int pos = 1; pos <= 4; pos++) {

                String nomeDisciplina = JOptionPane.showInputDialog("Qual a disciplina: " + pos);
                String valorNota = JOptionPane.showInputDialog("Qual a nota: " + pos);

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.parseDouble(valorNota));

                aluno.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

            if (escolha == 0) {

                int posicao = 1;
                int continuarRemover = 0;
                while (continuarRemover == 0) {

                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
                    aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                    posicao += 1;

                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                    escolha = continuarRemover;
                }
            }

            alunos.add(aluno);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("Calculo Média Nota: " + aluno.getMediaNota());
            System.out.println("Resultado da Aprovação: " + aluno.getAprovado());
            System.out.println("------------------------------------------------------------------");
        }
    }
}