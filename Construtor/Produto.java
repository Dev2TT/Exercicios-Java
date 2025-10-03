package Desafios.Construtor;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){

    }

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }

    void setNome(String nome) { this.nome=nome;}
    void setPreco(double preco) { this.preco=preco;}
    void setQuantidade(int quantidade) { this.quantidade=quantidade;}

    String getNome(){
        return this.nome;
    }

    double getPreco(){
        return this.preco;
    }

    int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Preco: " + this.preco;
    }


}
