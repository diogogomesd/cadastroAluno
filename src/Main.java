import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("informe o login");
        String senha = JOptionPane.showInputDialog("informe a senha");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);


        if(permitirAcesso.autenticar()) { //se for verdadeiro acessar
            List<Aluno> alunos = new ArrayList<Aluno>();

            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            for(int qtd = 1; qtd <= 5; qtd++) {

                Aluno aluno1 = new Aluno();

                aluno1.setNome(JOptionPane.showInputDialog("Qual é o seu nome "+qtd+"?"));
				/*aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Qual e sua idade?")));
				aluno1.setDataNacimento(JOptionPane.showInputDialog("Qual sua data de nascimento?"));
				aluno1.setRegistroGeral(JOptionPane.showInputDialog("Qual é o numero do seu RG?"));
				aluno1.setNumeroCpf(JOptionPane.showInputDialog("Qual é o numero do seu CPF?"));
				aluno1.setNomeMae(JOptionPane.showInputDialog("Qual é o nome da sua mae?"));
				aluno1.setNomePai(JOptionPane.showInputDialog("Qual é o nome do seu pai?"));
				aluno1.setDataMatricula(JOptionPane.showInputDialog("Qual é a data da sua matricula?"));
				aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Qual é a serie matriculado?"));
				aluno1.setNomeEscola(JOptionPane.showInputDialog("Qual é o nome da sua escola?"));*/


                for(int pos = 1; pos <= 1; pos ++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Qual a disciplina "+pos+" ?");
                    double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Qual a noata da disciplina "+pos+" ?"));
                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(notaDisciplina);

                    aluno1.getDisciplinas().add(disciplina);
                }
                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

                if(escolha == 0) {

                    int continuarRemover = 0;
                    int posicao = 1;

                    while (continuarRemover == 0) {

                        int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("qual a disciplina a ser removida 1, 2, 3, ou 4?"));
                        aluno1.getDisciplinas().remove((disciplinaRemover)-posicao);
                        posicao ++;
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover Disciplina?");
                    }
                }
                alunos.add(aluno1);
            }

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for(Aluno aluno : alunos) {
                if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                }
                else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                }
                else {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("------------------------Lista do Aprovados-----------------------------------");
            for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = "+aluno.getAlunoAprovado2()+ " com media = "+aluno.getMediaNota());
            }
            System.out.println("------------------------Lista do Recuperacao-----------------------------------");
            for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = "+aluno.getAlunoAprovado2()+ " com media = "+aluno.getMediaNota());
            }
            System.out.println("------------------------Lista do Reprovados-----------------------------------");
            for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = "+aluno.getAlunoAprovado2()+ " com media = "+aluno.getMediaNota());
            }





			/*
			for(int pos = 0; pos<alunos.size();pos++) {
				Aluno aluno = alunos.get(pos);
				if(aluno.getNome().equalsIgnoreCase("Diogo")) {
					Aluno trocar = new Aluno();
					trocar.setNome("Aluno Trocado");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina("Matematica");
					disciplina.setNota(90);

					trocar.getDisciplinas().add(disciplina);

					alunos.set(pos, trocar);
					aluno = alunos.get(pos);


				}
					System.out.println(aluno);
					System.out.println("Media do aluno e ="+aluno.getMediaNota());
					System.out.println("Resultado e ="+aluno.getAlunoAprovado2());
					System.out.println("-------------------------------------------------------------------------------------");
				for(int posd = 0; posd< aluno.getDisciplinas().size();posd++) {
					Disciplina disc = aluno.getDisciplinas().get(posd);
					System.out.println("Materia = "+disc.getDisciplina()+" Nota = "+disc.getNota());
				}

			}

			for(Aluno aluno : alunos) {

				if(aluno.getNome().equalsIgnoreCase("diogo")) {
					alunos.remove(aluno);
					break;
				}
				else {
					System.out.println(aluno);
					System.out.println("Media do aluno e ="+aluno.getMediaNota());
					System.out.println("Resultado e ="+aluno.getAlunoAprovado2());
					System.out.println("-------------------------------------------------------------------------------------");
				}
			}
			for(Aluno aluno: alunos) {
				System.out.println("Alunos que sobraram na lista");
				System.out.println(aluno.getNome());
				System.out.println("suas materias sao");
				for(Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println(disciplina.getDisciplina());
				}
			}


			//Aluno aluno4 = new Aluno("Maria", 40);


			//System.out.println("nome e = "+aluno1.getNome());
			//System.out.println("idade e = "+aluno1.getIdade());
			//System.out.println("Nascimento e = "+aluno1.getDataNacimento());
			//System.out.println("a media das notas do aluno e = "+aluno1.getMediaNota());

			//System.out.println("Resultado = "+(aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));
			//System.out.println("Resultado 2 "+aluno1.getAlunoAprovado2());

			//imprimindo o to String
			//System.out.println(aluno4.toString());

			//imprimindo equals e hashcode

			Aluno aluno2 = new Aluno();
			aluno2.setNome("joao");

			Aluno aluno3 = new Aluno();
			aluno3.setNome("joao");

			if(aluno2.equals(aluno3)) {
				System.out.println("alunos sao iguais");
			}
			else {
				System.out.println("alunos nao sao iguais");
			}
			*/
        }
        else {
            JOptionPane.showMessageDialog(null, "acesso nao permitido");
        }
    }


}