package cursojava;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Secretario secretario = new Secretario();
        Aluno aluno = new Aluno();

        aluno.setIdade(19);
        aluno.setNome("maria");
        System.out.println("aluno e maior = "+aluno.pessoaMaiorIdade()+ " - "+aluno.msgMaiorIdade());
        System.out.println(aluno.salario() );

        secretario.setIdade(21);
        secretario.setNome("jose");
        System.out.println("secretario e maior = "+secretario.pessoaMaiorIdade());
        System.out.println(secretario.salario());

        diretor.setIdade(40);
        diretor.setNome("augusto");
        System.out.println("diretor e maior = "+diretor.pessoaMaiorIdade());
        System.out.println(diretor.salario());

        teste(aluno);
        teste(secretario);
        teste(diretor);

    }
    public static void teste(Pessoa pessoa){
        System.out.println("essa pessoa e demais "+pessoa.getNome()+" e o salario e de "+pessoa.salario());
    }

}
