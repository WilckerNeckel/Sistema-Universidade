package trabalhofinal.sistemauniversidade;

import trabalhofinal.sistemauniversidade.Curso.Curso;
import trabalhofinal.sistemauniversidade.disciplinas.Disciplina;
import trabalhofinal.sistemauniversidade.disciplinas.DisciplinaEletiva;
import trabalhofinal.sistemauniversidade.disciplinas.DisciplinaRegular;
import trabalhofinal.sistemauniversidade.pessoas.Aluno;
import trabalhofinal.sistemauniversidade.pessoas.Professor;
import trabalhofinal.sistemauniversidade.Curso.Matricula;
import trabalhofinal.sistemauniversidade.Relatorios.RelatorioCurso;
import trabalhofinal.sistemauniversidade.Relatorios.RelatorioDisciplina;
import trabalhofinal.sistemauniversidade.Relatorios.RelatorioProfessor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Curso> cursos = new ArrayList<Curso>();

    public static void main(String[] args) {
        int opcao = -1;
        Scanner scan = new Scanner(System.in);
        while (opcao != 0) {
            System.out.println("\n\n-----Sistema de Universidade----\n");
            System.out.println("Escolha uma opção: ");
            System.out.println("Dica: faça o cadastro na ordem: curso, disciplina, professor, aluno");
            mainMenu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de cadastro");
                    cadastros(scan);
                    break;
                case 2:
                    relatorios(scan);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }

    public static void mainMenu() {
        System.out.println("1 - Cadastros");
        System.out.println("2 - Relatórios");
        System.out.println("0 - Sair");
    }

    public static void cadastrosMenu() {
        System.out.println("1 - Curso");
        System.out.println("2 - Disciplina");
        System.out.println("3 - Professor");
        System.out.println("4 - Matricula de aluno");

        System.out.println("0 - Voltar");
    }

    public static void relatoriosMenu() {
        System.out.println("1 - NOTAS");
        System.out.println("2 - Todos os cursos");
        System.out.println("3 - Todas as disciplinas");
        System.out.println("4 - Todos os professores");
        System.out.println("0 - Voltar");
    }

    public static void cadastros(Scanner scan) {
        int opcao = -1;
        while (opcao != 0) {
            cadastrosMenu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de curso");
                    System.out.println("Nome: ");
                    String nomeCurso = scan.next();
                    System.out.println("Coordenador: ");
                    String coordenador = scan.next();
                    System.out.println("Faculdade: ");
                    String faculdade = scan.next();
                    Curso curso = new Curso(nomeCurso, coordenador, faculdade);
                    cursos.add(curso);
                    System.out.println("Curso cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Cadastro de disciplina");
                    System.out.println("1 - Disciplina Regular");
                    System.out.println("2 - Disciplina Eletiva");
                    int tipoDisciplina = scan.nextInt();

                    System.out.println("Nome: ");
                    String nomeDisciplina = scan.next();

                    Curso cursoSelecionado = selecionarCurso(scan);
                    cadastroDisciplina(scan, tipoDisciplina, nomeDisciplina, cursoSelecionado);

                    break;
                case 3:
                    System.out.println("Cadastro de professor");
                    System.out.println("Nome: ");
                    String nomeProfessor = scan.next();
                    System.out.println("CPF: ");
                    String cpfProfessor = scan.next();
                    System.out.println("Telefone: ");
                    String telefoneProfessor = scan.next();
                    System.out.println("Salário: ");
                    double salario = scan.nextDouble();
                    Professor professor = new Professor(nomeProfessor, cpfProfessor, telefoneProfessor, salario);
                    System.out.println("Seleciona uma disciplina para o professor: ");
                    Curso cursoProfessor = selecionarCurso(scan);
                    Disciplina disciplinaProfessor = selecionaDisciplina(scan, cursoProfessor);
                    professor.addDisciplina(disciplinaProfessor);
                    System.out.println("Professor cadastrado com sucesso!");

                    break;

                case 4:
                    System.out.println("Matricula de aluno");
                    System.out.println("Número da matrícula: ");
                    int numeroMatricula = scan.nextInt();
                    System.out.println("Nome: ");
                    String nomeAluno = scan.next();
                    System.out.println("CPF: ");
                    String cpf = scan.next();
                    System.out.println("Telefone: ");
                    String telefone = scan.next();
                    Curso cursoAluno = selecionarCurso(scan);
                    ArrayList<Disciplina> disciplinas = matriculaDisciplinas(scan, cursoAluno);
                    Matricula matricula = new Matricula(numeroMatricula, cursoAluno, disciplinas);
                    Aluno aluno = new Aluno(nomeAluno, cpf, telefone, matricula);
                    matricula.setAluno(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void cadastroDisciplina(Scanner scan, int tipoDisciplina, String nomeDisciplina, Curso curso) {

        switch (tipoDisciplina) {
            case 1:
                Disciplina disciplina = new DisciplinaRegular(nomeDisciplina, curso);
                curso.addDisciplina(disciplina);

                System.out.println("Disciplina regular cadastrada com sucesso!");
                break;
            case 2:
                System.out.println("Área: ");
                String area = scan.next();
                Disciplina disciplinaEletiva = new DisciplinaEletiva(nomeDisciplina, curso, area);
                curso.addDisciplina(disciplinaEletiva);
                System.out.println("Disciplina eletiva cadastrada com sucesso!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static Curso selecionarCurso(Scanner scan) {
        System.out.println("Selecione um curso: ");
        listaCursos();
        int index = scan.nextInt();
        return cursos.get(index);
    }

    public static void relatorios(Scanner scan) {

        int opcao = -1;
        while (opcao != 0) {
            relatoriosMenu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    relatorioNotas(scan);
                    break;
                case 2:
                    RelatorioCurso.todosCursos(cursos);
                    break;
                case 3:
                    RelatorioDisciplina.todasDisciplinas(cursos);
                    break;
                case 4:
                    RelatorioProfessor.todosProfessores(cursos);
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void relatorioNotas(Scanner scan) {
        System.out.println("Selecione um curso: ");
        Curso curso = selecionarCurso(scan);
        System.out.println("Selecione uma disciplina: ");
        Disciplina disciplina = selecionaDisciplina(scan, curso);
        System.out.println("Selecione o tipo de relatório: ");
        System.out.println("1 - Relatório parcial");
        System.out.println("2 - Relatório final");
        int tipoRelatorio = scan.nextInt();
        switch (tipoRelatorio) {
            case 1:
                RelatorioDisciplina.relatorioParcial(disciplina);
                break;
            case 2:
                RelatorioDisciplina.relatorioFinal(disciplina);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static void listaCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " - " + cursos.get(i).getNome());
        }
    }

    public static void listaDisciplinas() {
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getNome());
            for (int i = 0; i < curso.getDisciplinas().size(); i++) {
                System.out.println(i + " - " + curso.getDisciplinas().get(i).getNome());
            }
        }
    }

    public static Disciplina selecionaDisciplina(Scanner scan, Curso curso) {
        System.out.println("Selecione uma disciplina: ");
        listaDisciplinas();
        int index = scan.nextInt();
        Disciplina disciplina = curso.getDisciplinas().get(index);
        return disciplina;
    }

    public static ArrayList<Disciplina> matriculaDisciplinas(Scanner scan, Curso curso) {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Selecione uma disciplina: ");
            listaDisciplinas();
            int index = scan.nextInt();
            disciplinas.add(curso.getDisciplinas().get(index));
            System.out.println("Deseja adicionar mais disciplinas? (1 - sim, 0 - não)");
            opcao = scan.nextInt();
        }
        return disciplinas;
    }

}
