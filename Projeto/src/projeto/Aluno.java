package projeto;


public class Aluno {
    
    private String nome, turma, matricula;
    private byte foto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

    public Aluno(String nome, String turma, String matricula, byte foto) {
        this.nome = nome;
        this.turma = turma;
        this.matricula = matricula;
        this.foto = foto;
    }

    public void exibiralunos(){
        System.out.println("nome" +this.getNome());
        System.out.println("Turma"+ this.getTurma() );
        System.out.println("matricula"+ this.getMatricula());
        System.out.println("foto"+ this.getFoto());
        
        
    }
}
