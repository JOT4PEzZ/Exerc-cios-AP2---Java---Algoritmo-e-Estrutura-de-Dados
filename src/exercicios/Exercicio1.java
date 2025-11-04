package exercicios;
import estruturas.Lista;


public class Exercicio1 {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);

        lista.mostrar();
    }
}
