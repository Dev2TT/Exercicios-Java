package Desafios.Construtor;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;

    public ProdutoPerecivel(){
        super();
    }

    public ProdutoPerecivel(String nome, double preco, int dataValidade){
        super(nome,preco);
        this.dataValidade=dataValidade;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\n" +
                "Preco: " + this.getPreco() + "\n" +
                "Data de Validade: " + this.dataValidade;
    }



}
