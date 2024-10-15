package br.com.pedrinhodev.screenmatch.modelos.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public String getNome()
    {
        return nome;
    }

    public int getAnoDeLancamento()
    {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano()
    {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos()
    {
        return duracaoEmMinutos;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento)
    {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano)
    {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica()
    {
        System.out.println("Nome deste filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
    }


    public void avalia(double nota)
    {
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia()
    {
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }
}
