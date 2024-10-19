package br.com.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLançamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliações;
    private int totalDeAvaliações;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLançamento){
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliações() {
        return totalDeAvaliações;
    }

    public void setTotalDeAvaliações(int totalDeAvaliações) {
        this.totalDeAvaliações = totalDeAvaliações;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota){
        somaDasAvaliações += nota;
        totalDeAvaliações++;
    }

    public  double pegaMedia(){
        return somaDasAvaliações / totalDeAvaliações;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLançamento() + ")";
    }
}
