package main;

import classes.Aluno;
import classes.Disciplina;
import constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe login: ");
        String senha = JOptionPane.showInputDialog("Informe senha: ");

        if (login.equals("admin") && senha.equals("admin")) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            for (int qtd = 1; qtd <= 1; qtd++) {

                String nome = JOptionPane.showInputDialog("Nome do aluno: " + qtd);
                String idade = JOptionPane.showInputDialog("Idade do aluno: " + qtd);

                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setIdade(Integer.parseInt(idade));

                for (int pos = 1; pos <= 4; pos++) {

                    String nomeDisciplina = JOptionPane.showInputDialog("Disciplina do aluno: " + pos);
                    String valorNota = JOptionPane.showInputDialog("Nota do aluno: " + pos);

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.parseDouble(valorNota));

                    aluno.getDisciplinas().add(disciplina);
                }

                int escolha = JOptionPane.showConfirmDialog(null, "Quer remover alguma disciplina ?");

                if (escolha == 0) {

                    int posicao = 1;
                    int continuarRemover = 0;
                    while (continuarRemover == 0) {

                        String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4?");
                        aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                        posicao += 1;

                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                        escolha = continuarRemover;
                    }
                }
                alunos.add(aluno);
            }

            maps.put(StatusAluno.APROVADO_NOTA_MAXIMA, new ArrayList<Aluno>());
            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                System.out.println(aluno);
                System.out.println("Calculo Média Nota: " + aluno.getMediaNota());
                System.out.println("Resultado da Aprovação: " + aluno.getAprovado());

                System.out.println("------------------------------------------------------------------");

                if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.APROVADO_NOTA_MAXIMA)) {
                    maps.get(StatusAluno.APROVADO_NOTA_MAXIMA).add(aluno);
                } else if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("---------------------APROVADO COM NOTA MAXIMA---------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO_NOTA_MAXIMA)) {
                System.out.println("Resultado = " + aluno.getAprovado() + " com média de = " + aluno.getMediaNota());
            }
            System.out.println("---------------------APROVADO-------------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = " + aluno.getAprovado() + " com média de = " + aluno.getMediaNota());
            }
            System.out.println("---------------------RECUPERACAO----------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + aluno.getAprovado() + " com média de = " + aluno.getMediaNota());
            }

            System.out.println("---------------------REPROVADO------------------------------------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = " + aluno.getAprovado() + " com média de = " + aluno.getMediaNota());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login ou/ Senha Incorreta");
        }
    }
}