package Desafios.Construtor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>(4);

        Produto produto1= new Produto("Shampoo", 12.5);
        Produto produto2= new Produto("Vassoura", 30.4);
        Produto produto3= new Produto("Creme", 45.89);
        Produto produtoPerecivel = new ProdutoPerecivel("Macarrão", 35.87, 2020);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produtoPerecivel);

        for (Produto produto: produtos){
            System.out.println(produto + "\n-=-=-=-=-=-=-=-=--=-=");
        }

    }
}
