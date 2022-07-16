package classes;

public class Aluno {

    /*Atributos da classe aluno*/
    public String nome;
    public int idade;
    public String dataNascimento;
    public String registroGeral;
    public String numeroCpf;
    public String nomeMae;
    public String nomePai;
    public String dataMatricula;
    public String nomeEscola;
    public String serieMatriculado;

    /*Construtores*/
    public Aluno() {

    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }
}
