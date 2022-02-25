package br.com.dio.desfio.thiago.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev { //MÉTODOS
    private String nome;
    private Set<Conteudo> inscritos = new LinkedHashSet<>();
    private Set<Conteudo> concluido = new LinkedHashSet<>();

    public void inscrever(Bootcamp bootcamp){
        this.inscritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevInscrito().add(this);
    }

    public void progrecao(){
        Optional<Conteudo> conteudo = this.inscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.concluido.add(conteudo.get());
            this.inscritos.remove(conteudo.get());
        } else{
            System.err.println("Não há inscrição para esse usuário");
        }
    }

    public double calcularUpXP(){
        return this.concluido
                .stream()
                .mapToDouble(Conteudo::calcularXP)
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Conteudo> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConcluido() {
        return concluido;
    }

    public void setConcluido(Set<Conteudo> concluido) {
        this.concluido = concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getInscritos(), dev.getInscritos()) && Objects.equals(getConcluido(), dev.getConcluido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getInscritos(), getConcluido());
    }
}
