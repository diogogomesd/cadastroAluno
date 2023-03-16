package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno() {

    }
    public Aluno(String nomePadrao, int idadePadrao) {
        super.nome = nomePadrao;
        idade = idadePadrao;
    }

    @Override
    public double salario() {
        return 1500.80;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNacimento() {
        return dataNascimento;
    }
    public void setDataNacimento(String dataNacimento) {
        this.dataNascimento = dataNacimento;
    }
    public String getRegistroGeral() {
        return registroGeral;
    }
    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }
    public String getNumeroCpf() {
        return numeroCpf;
    }
    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public String getNomeEscola() {
        return nomeEscola;
    }
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    public String getSerieMatriculado() {
        return serieMatriculado;
    }
    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }


    //método de calculo de nota
    public double getMediaNota() {
        double somaNotas = 0.0;
        for(Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNotas();
        }

        return somaNotas / disciplinas.size();
    }

    //método que retorna se foi aprovado ou não
    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if(media >= 70) {
            return true;
        }
        else {
            return false;
        }
    }
    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if(media >= 50) {
            if(media >= 70) {
                return StatusAluno.APROVADO;
            }
            else {
                return StatusAluno.RECUPERACAO;
            }
        }
        else {
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNacimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
                + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
                + serieMatriculado + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(nome, other.nome);
    }

    //identifica metodo sobreescrito da superclasse
    @Override
    public boolean pessoaMaiorIdade() {
        return super.pessoaMaiorIdade();
    }
    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "oba aluno maior de idade" : "vixe aluno menor de idade";
    }


}
