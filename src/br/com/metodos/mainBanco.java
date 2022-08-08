package br.com.metodos;

public class mainBanco {
    public static void main(String[] args) {
        Banco c1 = new Banco("Corrente", 10000, 003);
        c1.getSacar(999);
        c1.getDepositar(999);
        c1.Emprestimo(500,18);
        c1.info();
    }
}
