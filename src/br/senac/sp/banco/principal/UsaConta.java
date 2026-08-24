package br.senac.sp;

import br.senac.sp.banco.Cliente;
import br.senac.sp.banco.Conta;

public class UsaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = "1234";
        c1.agencia = "567-8";
        Cliente cli1 = new Cliente();
        cli1.nome = "Dom Pedro II";
        cli1.cpf = "000.000.001-00";
        c1.cliente = cli1;
        c1.depositar(1000);
        c1.sacar(100);
        System.out.println(c1.infoConta());
        Conta c2 = new Conta();
        c2.agencia = "4567";
        c2.numero = "123-4";
        c2.cliente = new Cliente("João", "123456789-00");
        c1.transferir(200, c2);
        System.out.println(c1.infoConta());
        System.out.println(c2.infoConta());
    }
}