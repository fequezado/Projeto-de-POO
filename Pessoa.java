public abstract class  Pessoa {
    //atributos
    protected String cpf;
    protected int idade;
    protected String nome;

    //Construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //método para incrementar um ano na idade da pessoa
    public void fazerAniversario(){
        int aniversario = idade + 1;
    }

    //gets e sets
    public String getCpf(){
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }


    /* Faz sobrecarga no método toString */
    @Override
    public String toString() {
        return "Pessoa { " +
                "nome = " + nome +
                ", idade = " + idade +
                ", cpf = " + cpf +
                '}';
    }
}