package com.gabcrvlh.gen.java.OrientacaoObjetos.cliente;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriela",
                "111.111.111-11",
                "552199999-9999",
                "teste@teste.com",
                1001,
                0);

        Cliente cliente2 = new Cliente("Victória",
                "222.222.222-22",
                "552198888-8888",
                "teste2@teste.com",
                1002,
                0);


        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
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
    }
}
