package com.gabcrvlh.gen.java.OrientacaoObjetos.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private int idCliente;
    private int fidelidade = 0;

    public Cliente(String nome,
                   String cpf,
                   String celular,
                   String email,
                   int idCliente,
                   int fidelidade) {

        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.idCliente = idCliente;
        this.fidelidade = fidelidade;
    }

    public Cliente() {}

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getFidelidade() {
        return fidelidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFidelidade(int fidelidade) {
        this.fidelidade = fidelidade;
    }


    public void comprar(double valor){
        if (valor >= 20.0){
            fidelidade++;
            System.out.println("\nCliente: " + idCliente);
            System.out.println("Compra no valor de " +  valor + " aprovada.");
            System.out.println("Ganhou 1 ponto de fidelidade.");
            System.out.println("Você possui " + fidelidade + " pontos.");
        } else {
            System.out.println("\nCliente: " + idCliente);
            System.out.println("Compra no valor de " +  valor + " aprovada.");
        }
    }


    public void usarFidelidade(int valor){
        if (fidelidade >= valor){
            fidelidade -= valor;

            double desconto = valor * 10.0;

            System.out.println("\nCliente: " + idCliente);
            System.out.println("Desconto de " + desconto + " utilizado.");
            System.out.println("Pontos atuais: " + fidelidade);
        } else {
            System.out.println("\nCliente: " + idCliente);
            System.out.println("Pontos insuficientes.");
            System.out.println("Pontos atuais: " + fidelidade);
        }
    }

}
