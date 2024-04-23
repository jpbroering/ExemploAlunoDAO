
package dao;

import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO {
    private static ArrayList<Aluno> minhalista = new ArrayList<>();

    public static ArrayList<Aluno> getMinhalista() {
        return minhalista;
    }

    public static void setMinhalista(ArrayList<Aluno> minhalista) {
        AlunoDAO.minhalista = minhalista;
    }
    
}
