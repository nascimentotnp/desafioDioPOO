import br.com.dio.desfio.thiago.domain.Curso;
import br.com.dio.desfio.thiago.domain.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DesafioApplication {
    public static void main(String[] args) {
        Curso linguagem = new Curso();
        linguagem.setTitulo( " Java");
        linguagem.setDescricao( " Bootcamp Diome");
        linguagem.setCargaHoraria( 6 );
        System.out.println(linguagem);

        Curso linguagem2 = new Curso();
        linguagem2.setTitulo( " Spring Boot");
        linguagem2.setDescricao( " Bootcamp Diome");
        linguagem2.setCargaHoraria( 16 );
        System.out.println(linguagem2);

        Mentoria instrucao = new Mentoria();
        instrucao.setTitulo("Java ");
        instrucao.setDescricao("Bootcamp Diome");
        instrucao.setData(LocalDateTime.now());
        System.out.println(instrucao);
    }
}
