package br.com.dio.desfio.thiago.domain;

import br.com.dio.desfio.thiago.domain.Bootcamp;
import br.com.dio.desfio.thiago.domain.Curso;
import br.com.dio.desfio.thiago.domain.Dev;
import br.com.dio.desfio.thiago.domain.Mentoria;

import java.time.LocalDate;

public class DesafioApplication {
    public static void main(String[] args) {
        Curso linguagem = new Curso();
        linguagem.setTitulo( " Java");
        linguagem.setDescricao( " Bootcamp Diome");
        linguagem.setCargaHoraria( 16 );
        System.out.println(linguagem);

        Curso linguagem2 = new Curso();
        linguagem2.setTitulo( " Spring Boot");
        linguagem2.setDescricao( " Bootcamp Diome");
        linguagem2.setCargaHoraria( 16 );
        System.out.println(linguagem2);

        Mentoria instrucao = new Mentoria();
        instrucao.setTitulo("Java ");
        instrucao.setDescricao("Bootcamp Diome");
        instrucao.setData(LocalDate.now());
        System.out.println(instrucao);

       // Conteudo conteudo = new Curso(); polimorfismo

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("aprendendo java");
        bootcamp.getConteudo().add(linguagem);
        bootcamp.getConteudo().add(linguagem2);
        bootcamp.getConteudo().add(instrucao);

        Dev dev1 = new Dev();
        dev1.setNome("Thiago Nascimento");
        dev1.inscrever(bootcamp);
        dev1.progrecao();

        System.out.println("Seu curso é " + dev1.getInscritos());
        System.out.println("Você concluiu " + dev1.getConcluido());
        System.out.println("Seu curso é " + dev1.getInscritos());
        System.out.println("Você concluiu " + dev1.getConcluido());
        System.out.println("O seu XP é "  + dev1.calcularUpXP());

        Dev dev = new Dev();
        dev.setNome("Romualdo");
        dev.inscrever(bootcamp);
        dev.progrecao();

        System.out.println("Seu curso é " + dev.getInscritos());
        System.out.println("Você concluiu "  + dev.getConcluido());
        System.out.println("Seu curso é " + dev.getInscritos());
        System.out.println("Você concluiu "  + dev.getConcluido());
        System.out.println("O seu XP é "  + dev.calcularUpXP());
    }
}
