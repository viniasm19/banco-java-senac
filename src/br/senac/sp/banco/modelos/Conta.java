package br.senac.sp.banco;

public class Conta {
    public String numero;
    public String agencia;
    private double saldo;
    public Cliente cliente;

    public String infoConta() {
        String info = "Agencia: " + agencia;
        info += "\nNº: " + numero;
        info += "\nCliente: " + cliente.nome;
        info += "\nSaldo: " + saldo;
        return info;
    }

    public void transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
        }
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}