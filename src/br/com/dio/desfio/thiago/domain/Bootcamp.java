package br.com.dio.desfio.thiago.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate iniciado = LocalDate.now();
    private final LocalDate finalizado = iniciado.plusDays(45);
    private Set<Dev> devInscrito = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getIniciado() {
        return iniciado;
    }

    public LocalDate getFinalizado() {
        return finalizado;
    }

    public Set<Dev> getDevInscrito() {
        return devInscrito;
    }

    public void setDevInscrito(Set<Dev> devInscrito) {
        this.devInscrito = devInscrito;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getIniciado(), bootcamp.getIniciado()) && Objects.equals(getFinalizado(), bootcamp.getFinalizado()) && Objects.equals(getDevInscrito(), bootcamp.getDevInscrito()) && Objects.equals(getConteudo(), bootcamp.getConteudo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getIniciado(), getFinalizado(), getDevInscrito(), getConteudo());
    }
}
