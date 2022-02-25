package br.com.dio.desfio.thiago.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }
    @Override
    public double calcularXP() {
        return XP + 25;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = LocalDate.from(data);
    }

    @Override
    public String toString() {
        return "Mentoria " +
                "Titulo " + getTitulo() +
                ", Descricao " + getDescricao() +
                ", Data " + getData();
    }


}
