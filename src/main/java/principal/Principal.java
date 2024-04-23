/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package principal;


import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author 10724112106
 */
public class Principal {
    Aluno objetoaluno = new Aluno();
    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de aluno\n" + "1 - inserir (Create)\n" + "2 - Consultar(Retrive)\n" + "3 - Atualizar (Update)\n" + "4 - Apagar(Delete)\n" + "5 - Classificar(Sort)\n" + "6 - Listar tudo\n" + "9 - Sair"));
            switch (opcao) {
                case 1:
                    Aluno novo = new Aluno();
                    novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno")));
                    novo.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                    novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o idade do aluno")));
                    novo.setCurso(JOptionPane.showInputDialog("Digite o curso do aluno"));
                    novo.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite o fase do aluno")));
                    objetoaluno.inserirAlunoBD(novo);
                    System.out.println("Aluno inserido");
                    break;
                case 2:
                    int idAConsulta = Integer.parseInt(JOptionPane.showInputDialog("Digite um Id de aluno a ser consultado"));
                    int posicaoConsulta = -1;
                    for (int i = 0; i < listasimples.size(); i++) {
                        if (listasimples.get(i).getId() == idAConsulta) {
                            posicaoConsulta = i;
                        }
                    }
                    if (posicaoConsulta != -1) {
                        System.out.println(listasimples.get(posicaoConsulta).toString());
                    } else {
                        System.out.println("Id de Aluno não encontrado");
                    }
                    break;
                case 3:
                    int idAtualizar = Integer.parseInt(JOptionPane.showInputDialog("Digite um Id de aluno a ser consultado"));
                    int posicaoAtualizar = -1;
                    for (int i = 0; i < listasimples.size(); i++) {
                        if (listasimples.get(i).getId() == idAtualizar) {
                            posicaoAtualizar = i;
                        }
                    }
                    if (posicaoAtualizar != -1) {
                        Aluno novoAtualizado = new Aluno();
                        novoAtualizado.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno")));
                        novoAtualizado.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                        novoAtualizado.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o idade do aluno")));
                        novoAtualizado.setCurso(JOptionPane.showInputDialog("Digite o curso do aluno"));
                        novoAtualizado.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite o fase do aluno")));
                        listasimples.set(posicaoAtualizar, novoAtualizado);
                        System.out.println("Aluno atualizado");
                    } else {
                        System.out.println("Id de Aluno não encontrado");
                    }
                    break;
                case 4:
                    int idApagar = Integer.parseInt(JOptionPane.showInputDialog("Digite um Id de aluno a ser apagado"));
                    int posicaoExcluir = -1;
                    for (int i = 0; i < listasimples.size(); i++) {
                        if (listasimples.get(i).getId() == idApagar) {
                            posicaoExcluir = i;
                        }
                    }
                    if (posicaoExcluir != -1) {
                        listasimples.remove(posicaoExcluir);
                    } else {
                        System.out.println("Id de Aluno não encontrado");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Listagem iniciada");
                    for (int i = 0; i < listasimples.size(); i++) {
                        System.out.println("i: " + i);
                        System.out.println(listasimples.get(i).toString());
                    }
                    break;
                case 9:
                    System.out.println("Saindo do Sistema!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
