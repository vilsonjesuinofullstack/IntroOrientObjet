package classes;

public class Aluno {

    /*Atributos da classe aluno*/
   public String nome;
   public int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    /*Construtores*/
    public Aluno(){

    }
    public Aluno(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }
}
