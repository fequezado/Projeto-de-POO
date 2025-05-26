public class Professor extends Pessoa{
    //atributo
    private String centro;

    //Construtor
    public Professor(String nome, int idade, String cpf) {
        //Chama o construtor da classe Pessoa(Classe Pai)
        super(nome, idade, cpf);
    }

    //gets e sets
    public String getCentro() {
        return centro;
    }

    public void setCentro (String centro) {
        this.centro = centro;
    }

    //métodos
    public void darAula() {
        System.out.println("O professor dar aula!");
    }

}