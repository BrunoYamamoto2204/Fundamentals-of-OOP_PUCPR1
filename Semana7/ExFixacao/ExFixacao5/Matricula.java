package Semana7.ExFixacao.ExFixacao5;

public class Matricula {
    public void matricularAluno(String aluno, String curso) throws AlunoJaMatriculadoException, CursoLotadoException{
        if (aluno == "alunoA") {
            throw new AlunoJaMatriculadoException("Este aluno já está matriculado.");
        }
        if(curso == "cursoA"){
            throw new CursoLotadoException("O curso A está cheio");
        }

        System.out.println("Matrícula efetuada com sucesso.");
    }

    public static void main(String[] args) {
        System.out.println("-".repeat(40));
        Matricula matricula = new Matricula();

        try{
            matricula.matricularAluno("alunoB", "cursoB");
        } catch (AlunoJaMatriculadoException|CursoLotadoException e){
            e.printStackTrace();
        }
        System.out.println("-".repeat(40));
    }
}
