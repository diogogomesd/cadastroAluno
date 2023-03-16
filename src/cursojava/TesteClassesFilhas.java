package cursojava;

import cursojava.classes.*;

import javax.swing.*;

public class TesteClassesFilhas {
    public static void main(String[] args) {

        double[] notas = {8.8, 9.7, 7.6, 6.8};

        Aluno aluno = new Aluno();
        aluno.setNome("diogo");
        aluno.setNomeEscola("jdevTreinamentos");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("php");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        System.out.println(aluno.getMediaNota());




        /*
        double[] valores = {9.5, 8.9, 5.8};
        for(int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        //arrays podem ser de todos os tipos de dados inclusive objetos
        //array sempre deve ter a quantidade de posições definidas
        double[] notas = new double[4];
        notas[0] = 9.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

       for (int pos = 0; pos < notas.length; pos++){
           //System.out.println("nota "+(pos + 1)+" e = "+notas[pos]);
       }

        int posicoes = Integer.parseInt(JOptionPane.showInputDialog("quantas posicoes o array deve conter"));
        double[] nota = new double[posicoes];

        for(int i = 0; i < nota.length; i++){
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor inserir na posicao "+i));
            nota[i] = valor;
        }


        for (int pos = 0; pos < nota.length; pos++){
            System.out.println("nota "+(pos + 1)+" e = "+ nota[pos]);
        }

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

         */
    }

}
