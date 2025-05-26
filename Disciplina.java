public class Disciplina {
    private String nome;
    private int codigo;
    private int semestre;

    //Construtor para setar atributos da classe.
    public Disciplina (String nome, int codigo, int semestre){
        this.nome = nome;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    //métodos

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getCodigo () {
        return codigo;
    }

    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre () {
        return semestre;
    }

    public void setSemestre (int semestre) {
        this.semestre = semestre;
    }


    /* Faz sobrecarga do método toString */
    public String toString() {
        return "Disciplina {" +
                " nome = " + nome +
                ", código = " + codigo +
                ", semestre = " + semestre +
                '}';
    }
}