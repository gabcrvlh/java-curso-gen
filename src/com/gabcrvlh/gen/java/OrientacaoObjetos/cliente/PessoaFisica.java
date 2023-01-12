package com.gabcrvlh.gen.java.OrientacaoObjetos.cliente;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome,
                        String celular,
                        String email,
                        int idCliente,
                        int fidelidade,
                        String cpf) {
        super(nome, celular, email, idCliente, fidelidade);
        this.cpf = cpf;
    }

    public PessoaFisica(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + getCpf());
    }
}
