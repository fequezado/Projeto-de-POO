public class Bolsistas extends Aluno{
    /* Construtor seta os atributos da classe Aluno */
    public Bolsistas(String nome, int idade, String cpf, int matricula) {
        //Chama o construtor da classe Aluno(Classe Pai)
        super(nome, idade, cpf, matricula);

    }

    @Override
    public void pagarMensalidade () {
        System.out.println("Não precisa pagar mensalidade, pois é aluno bolsista");
    }
}

