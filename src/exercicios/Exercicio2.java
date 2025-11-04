package exercicios;
import estruturas.Pilha;


public class Exercicio2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(5);
        pilha.empilhar(8);
        pilha.empilhar(13);
        pilha.empilhar(21);
        pilha.empilhar(34);

        pilha.mostrar();

        pilha.desempilhar();
        pilha.mostrar();
    }
}
