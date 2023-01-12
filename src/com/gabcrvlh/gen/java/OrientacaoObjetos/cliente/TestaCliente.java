package com.gabcrvlh.gen.java.OrientacaoObjetos.cliente;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriela",
                "552199999-9999",
                "teste@teste.com",
                1001,
                0);

        Cliente cliente2 = new Cliente("Victória",
                "552198888-8888",
                "teste2@teste.com",
                1002,
                0);


        System.out.println("Nome do cliente: " + cliente1.getNome());
        // System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Celular: " + cliente1.getCelular());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Id Cliente: " + cliente1.getIdCliente());
        System.out.println("Pontos acumulados de fidelidade: " + cliente1.getFidelidade());


        cliente1.comprar(10.0);
        cliente1.usarFidelidade(1);

        System.out.println(" ");
        cliente2.comprar(30.0);
        cliente2.comprar(20.0);
        cliente2.comprar(40.0);
        cliente2.usarFidelidade(3);


        PessoaFisica cliente3 = new PessoaFisica("Carmen",
                "552199999-9999",
                "teste@teste.com",
                1003,
                0,
                "333.333.333-33");

        PessoaFisica cliente4 = new PessoaFisica("Dante",
                "552198888-8888",
                "teste2@teste.com",
                1004,
                0,
                "444.444.444-44");

        PessoaJuridica cliente5 = new PessoaJuridica("Emilia",
                "552199999-9999",
                "teste@teste.com",
                1005,
                0,
                "XX.XXX.XXX/0001-XX");

        PessoaJuridica cliente6 = new PessoaJuridica("Fabio",
                "552198888-8888",
                "teste2@teste.com",
                1006,
                0,
                "XX.XXX.XXX/0001-XX");


        cliente3.visualizar();
        cliente4.visualizar();
        cliente5.visualizar();
        cliente6.visualizar();


    }
}