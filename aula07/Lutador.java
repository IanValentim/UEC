package aula07;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }

    public void apresentar() {

        System.out.println("Apresentamos " + this.getNome() + ", ");
        System.out.println("diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos de idade, ");
        System.out.println("pesando " + this.getPeso() + "kg com " + this.getAltura() + "m, ");
        System.out.println("o lutador conta com " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates\n");

    }

    public void status() {

        System.out.println("-------------");
        System.out.println(this.getNome());
        System.out.println("Peso " + getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("-------------\n");

    }

    public void ganharLuta() {

        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta() {

        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta() {

        this.setEmpates(this.getEmpates() + 1);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) { // menor que 52.2 é invalido

            categoria = "Inválido";

        } else if (this.peso <= 70.3) { //menor ou igual 70.3 é leve

            categoria = "Leve";

        } else if (this.peso <= 83.9) { //menor ou igual 83.9 é médio

            categoria = "Médio";

        } else if (this.peso <= 120.2) { //menor ou igual 120.2 é pesado

            categoria = "Pesado";

        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
