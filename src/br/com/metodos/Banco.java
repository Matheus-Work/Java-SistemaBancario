package br.com.metodos;

import java.text.DecimalFormat;

public class Banco {
    DecimalFormat df = new DecimalFormat();
    private int agencia;
    private int numeroConta;
    private double saldo;
    private double depositar;
    private double sacar;
    private double limite;
    private String tipoConta;


    public Banco(String tipoConta,int numeroConta,int agencia){
            this.agencia = agencia;
            this.saldo = saldo = 0;
            this.sacar = sacar;
            this.depositar = depositar;
            this.limite = limite = -1000;
            this.numeroConta = numeroConta;
            this.tipoConta = tipoConta;
    }

    public void saldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }
    public void getDepositar(double valorDepositado){
        this.saldo = this.saldo + valorDepositado;
    }
    public void getSacar(double valorSacado){
        if((this.saldo-valorSacado)<this.limite){
            System.out.println("Operação bloqueada");
        }else{
            this.saldo = this.saldo - valorSacado;
        }
    }
    public void Emprestimo(double valorEmprestimo, int meses){

            this.saldo = this.saldo + valorEmprestimo;
            double valor = valorEmprestimo/meses;
            double porMes=(valorEmprestimo*0.05)+valor; //5% ao mes de juros
            double total = porMes*meses;
            System.out.println("Você pegou " + valorEmprestimo + " reais de empréstimo");
            System.out.println("Você íra pagar " + df.format(porMes) + " reais por mês");
            System.out.println("Voce íra pagar no final de " + meses + " meses: " + df.format(total) + " reais");

    }
    public void info(){
        System.out.println("-----------------");
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agencia: " + agencia);
        System.out.println("Seu saldo é: " + this.saldo);
    }

}
