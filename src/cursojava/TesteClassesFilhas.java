package cursojava;

import cursojava.classes.*;

import javax.swing.*;

public class TesteClassesFilhas {
    public static void main(String[] args) {

        double[] notas = {8.8, 9.7, 7.6, 6.8};
        double[] notasLogica = {7.1, 5.7, 9.6, 7.8};

        Aluno aluno = new Aluno();
        aluno.setNome("diogo");
        aluno.setNomeEscola("jdevTreinamentos");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("php");
        disciplina.setNota(notas);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("logica de programacao");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("diogo");
        aluno1.setNomeEscola("jdevTreinamentos");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("php");
        disciplina1.setNota(notas);
        aluno1.getDisciplinas().add(disciplina1);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("logica de programacao");
        disciplina3.setNota(notasLogica);
        aluno1.getDisciplinas().add(disciplina3);
    //---------------------------------------------------------------------

    Aluno[] arrayAlunos = new Aluno[2];
    arrayAlunos[0] = aluno;
    arrayAlunos[1] = aluno1;


    for(int pos = 0; pos < arrayAlunos.length; pos++){
        System.out.println("nome do aluno e = "+arrayAlunos[pos].getNome());
        for (Disciplina d : arrayAlunos[pos].getDisciplinas()){
            System.out.println("nome da disciplia e = "+d.getDisciplina());
            for(int posNota = 0 ; posNota < d.getNota().length; posNota ++){
                System.out.println("Nota = "+((posNota)+1) +" e igual = "+d.getNota()[posNota]);
            }
        }
    }




/*
        System.out.println("nome do aluno = "+aluno.getNome()+ " inscrito no curso : "+aluno.getNomeEscola());

        for(Disciplina d : aluno.getDisciplinas()){
            System.out.println("------------------------------disciplinas do aluno------------------------------");
            System.out.println("Disciplina = "+d.getDisciplina());
            System.out.println("as notas da disciplina são : ");

            //maior nota
            double notaMax = 0.0;
            for (int pos = 0; pos < d.getNota().length; pos ++){
                System.out.println("Nota = "+((pos)+1) +" e igual = "+d.getNota()[pos]);
                if(pos == 0){
                  notaMax = d.getNota()[pos];
                }
                else{
                    if(d.getNota()[pos] > notaMax ){
                        notaMax = d.getNota()[pos];
                    }
                }
            }
            System.out.println("a maior nota da disciplina e = "+d.getDisciplina()+ " e igual a "+notaMax);
            double notaMin = 0.0;
            for (int pos = 0; pos < d.getNota().length; pos ++){
                System.out.println("Nota = "+((pos)+1) +" e igual = "+d.getNota()[pos]);
                if(pos == 0){
                    notaMin = d.getNota()[pos];
                }
                else{
                    if(d.getNota()[pos] < notaMin ){
                        notaMin = d.getNota()[pos];
                    }
                }
            }
            System.out.println("a menor nota da disciplina e = "+d.getDisciplina()+ " e igual a "+notaMin);
        }

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
