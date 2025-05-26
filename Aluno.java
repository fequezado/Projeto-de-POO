public class Aluno extends Pessoa{
    //atributo
    private int matricula;

    /* Construtor para setar atributos da classe Pessoa */
    public Aluno(String nome, int idade, String cpf) {
        //Chama o construtor da classe Pessoa(Classe Pai)
        super(nome, idade, cpf);
    }

    /* Sobrecarga de construtor o que diferencia é quantidade de parâmetros */
    /* Esse construtor seta os atributos da classe Pessoa e o atributo matricula */
    public Aluno(String nome, int idade, String cpf, int matricula) {
        //Chama o construtor da classe Pessoa(Classe Pai)
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    //gets e sets
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    //métodos
    public void pagarMensalidade() {
        System.out.println("A mensalidade foi paga!");
    }

}