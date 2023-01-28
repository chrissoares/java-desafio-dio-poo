import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso cursoJava = new Curso("Curso Java", "Descrição do curso Java", 8);
        Curso cursoJs = new Curso("Curso JS", "Descrição do curso JS", 4);
      
        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());

        System.out.println(cursoJava);
    }
}
