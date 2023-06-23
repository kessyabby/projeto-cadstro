

package projeto;

import java.util.ArrayList;
import java.util.List;


public class CadastroAluno {
private List<Aluno> listaAlunos;

public CadastroAluno(){
    listaAlunos = new ArrayList<>();
}
}

public void criarAluno (String matricula, String nome, String turma, String foto){
Aluno novoAluno = new Aluno (matricula, nome, turma, foto);
listaAlunos.add (novoAluno);
 System.out.println ("Aluno crfiado com sucesso");
} 

