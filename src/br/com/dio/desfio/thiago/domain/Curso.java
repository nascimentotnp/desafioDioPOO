package br.com.dio.desfio.thiago.domain;

public class Curso extends Conteudo{
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP*cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso " +
                "Titulo " + titulo +
                ", Descricao " + descricao +
                ", Carga Horaria de " + cargaHoraria +
                " horas";
    }

}
