/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.AlunoDAO;
import java.util.ArrayList;

/**
 *
 * @author 10724112106
 */
public class Aluno extends Pessoa {

    private String curso;
    private int fase;

    public Aluno() {
        this("", 0, 0, "", 0);
    }

    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Curso: " + this.getCurso()
                + "\n Fase: " + this.getFase()
                + "\n -----------";
    }

    public ArrayList<Aluno> getMinhaLista() {
        return AlunoDAO.getMinhalista();
    }

    public boolean inserirAlunoBD(Aluno objeto) {
        AlunoDAO.getMinhalista().add(objeto);
        return true;
    }

    public boolean deleteAlunoBD(int id) {
        int indice = procuraIndice(id);
        if (indice != -1) {
            AlunoDAO.getMinhalista().remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public boolean UpdateAlunoDB(int id, Aluno objeto) {
        int indice = procuraIndice(id);
        if (indice != -1) {
            AlunoDAO.getMinhalista().set(indice, objeto);
            return true;
        } else {
            return false;
        }
    }

    public int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AlunoDAO.getMinhalista().size(); i++) {
            if (AlunoDAO.getMinhalista().get(i).getId() == id) {
                indice = i;
            }
        }
    }
}
