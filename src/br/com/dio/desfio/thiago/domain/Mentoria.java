package br.com.dio.desfio.thiago.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDateTime data;

    public Mentoria() {
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = LocalDateTime.from(data);
    }

    @Override
    public String toString() {
        return "Mentoria " +
                "Titulo " + titulo +
                ", Descricao " + descricao +
                ", Data " + data ;
    }
}
