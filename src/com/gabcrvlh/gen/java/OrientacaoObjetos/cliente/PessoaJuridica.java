package com.gabcrvlh.gen.java.OrientacaoObjetos.cliente;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome,
                          String celular,
                          String email,
                          int idCliente,
                          int fidelidade,
                          String cnpj) {
        super(nome, celular, email, idCliente, fidelidade);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(){}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + getCnpj());
    }
}
