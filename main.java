package Mod7.ClassesMetodos;

import Mod7.ClassesMetodos.Coelho;

public class main {
    public static void main(String[] args) {
        Coelho coelho = new Coelho();

        coelho.setNome("Tutuia");
        coelho.setCor("Branca");
        coelho.setPeso(2);
        coelho.setGenero("Feminino");

        System.out.println("O nome do coelho é " + coelho.getNome() + ", " + "a cor dele é " + coelho.getCor() + "," + "O peso total é de " + coelho.getPeso() + "Kilos, " + "O genero dele é " + coelho.getGenero() + ".");
    }
}
