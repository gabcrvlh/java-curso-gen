package com.gabcrvlh.gen.java.OrientacaoObjetos.paciente;

public class Paciente {
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private int planoDeSaude;
    private String numPlano;

    public Paciente(String nome,
                    String cpf,
                    String celular,
                    String email,
                    int planoDeSaude,
                    String numPlano) {

        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.planoDeSaude = planoDeSaude;
        this.numPlano = numPlano;
    }

    public Paciente() {
    }


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

    public int getPlanoDeSaude() {
        return planoDeSaude;
    }

    public String getNumPlano() {
        return numPlano;
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

    public void setPlanoDeSaude(int planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public void setNumPlano(String numPlano) {
        this.numPlano = numPlano;
    }


    public void agendarConsulta(int dia, int mes, int ano) {
        System.out.println("\n\n***Agendamento***");
        switch (planoDeSaude) {
            case 0 -> {
                System.out.println("Paciente: " + getNome());
                System.out.println("Modalidade: Particular");
                System.out.println("Data agendada: " + dia + "/" + mes + "/" + ano);
                System.out.println("Valor: 100,00");
            }
            case 1 -> {
                System.out.println("Paciente: " + getNome());
                System.out.println("Modalidade: MDC");
                System.out.println("Data agendada: " + dia + "/" + mes + "/" + ano);
                System.out.println("Valor: 20,00");
            }
            case 2 -> {
                System.out.println("Paciente: " + getNome());
                System.out.println("Modalidade: Santé");
                System.out.println("Data agendada: " + dia + "/" + mes + "/" + ano);
                System.out.println("Valor: 0,00");
            }
        }
    }

}

