package Desafios.ArrayList;
import java.util.ArrayList;



public class Principal {
    public static void main(String[] args){
        Pessoa pessoaUm = new Pessoa("victtor", 23);
        Pessoa pessoaDois = new Pessoa("Pedro", 21);
        Pessoa pessoaTres = new Pessoa("Bruna", 24);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoaUm);
        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaTres);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("-=-=-=--=");
        System.out.println("Primeira Pessoa: " + listaDePessoas.getFirst());
        System.out.println("-=-=-=--=");

        for(Pessoa pessoa:listaDePessoas){
            System.out.println(pessoa);
            System.out.println("-=-=-=--=");
        }


    }
}
