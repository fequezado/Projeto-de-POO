import java.util.ArrayList;
public class Turma {
    //Associação e Composição
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    //Construtores
    public  Turma (String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }


    //gets e sets
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina (Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor () {
        return professor;
    }

    public void setProfessor (Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos (ArrayList<Aluno> alunos) {

        this.alunos = alunos;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //métodos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Todos os alunos da turma " + codigo + " : ");
        for (Aluno aluno : alunos) {
            System.out.println (" * " + aluno.getNome());
        }
    }

    @Override
    public String toString() {
        return "Turma" + "\n" +"{ " +
                "código = " + codigo + "\n" +
                "disciplina = " + disciplina + "\n" +
                "professor = " + professor + "\n" +
                "alunos = " + alunos +
                " } ";
    }
}

