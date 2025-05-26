import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instancia disciplinas
        Disciplina programacaoOrientadaAObjetos = new Disciplina("Programação Orientada a Objetos", 685, 1);
        Disciplina matematicaParaComputacao = new Disciplina("Matemática para computação", 680, 1);
        Disciplina raciocinioLogicoAlgoritmico = new Disciplina("Raciocínio lógico algorítmico", 683, 1);

        //Instancia os 3 alunos conforme foi pedido no escopo do trabalho.
        Bolsistas bolsista1 = new Bolsistas("Francisca", 22, "89623491477", 2115908);
        Regulares regulares1 = new Regulares("João", 21, "86530265455", 2115274);
        Regulares regulares2 = new Regulares("Rafael", 35, "56743289765", 2514908);

        //Instancia 1 professor de acordo com o escopo do trabalho.
        Professor professor1 = new Professor("Cláudio", 33, "98764253487");

        //Instancia 2 visitantes de acordo com o escopo do trabalho.
        Visitantes visitantes1 = new Visitantes("Fábricio", 44, "12345678910");
        Visitantes visitantes2 = new Visitantes("Claudemir", 59, "65497238401");

        //instanciando as 3 Turmas de acordo com o escopo do trabalho.
        Turma turma1 = new Turma("N685", programacaoOrientadaAObjetos, professor1);
        Turma turma2 = new Turma("N680", matematicaParaComputacao, professor1);
        Turma turma3 = new Turma("N683", raciocinioLogicoAlgoritmico, professor1);

        /* Adiciona todos alunos nas 3 turmas, conforme requerido no escopo do trabalho */
        turma1.adicionarAluno(regulares1);
        turma1.adicionarAluno(bolsista1);
        turma1.adicionarAluno(regulares2);

        turma2.adicionarAluno(regulares1);
        turma2.adicionarAluno(bolsista1);
        turma2.adicionarAluno(regulares2);

        turma3.adicionarAluno(regulares1);
        turma3.adicionarAluno(bolsista1);
        turma3.adicionarAluno(regulares2);

        //Saídas do resultado da execução.
        System.out.println("\n"); //so pulando uma linha por questão de organização na saída.
        System.out.println("Alunos da Turma 1: " + turma1);
        System.out.println("\n"); //so pulando uma linha por questão de organização na saída.
        System.out.println("Alunos da Turma 2: " + turma2);
        System.out.println("\n"); //so pulando uma linha por questão de organização na saída.
        System.out.println("Alunos da Turma 3: " + turma3);

    }

} //Fim do Main