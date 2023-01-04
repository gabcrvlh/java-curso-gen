package com.gabcrvlh.gen.java.OrientacaoObjetos.paciente;

public class TestaPaciente {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(
                "Bruno",
                "111.111.111-11",
                "77777777",
                "teste@teste.com",
                0,
                "n/a");

        Paciente paciente2 = new Paciente();

        System.out.println("Informações do paciente:");
        System.out.println("Nome do paciente: " + paciente1.getNome());
        System.out.println("CPF: " + paciente1.getCpf());
        System.out.println("Celular: " + paciente1.getCelular());
        System.out.println("Email: " + paciente1.getEmail());
        System.out.println("Plano: " + paciente1.getPlanoDeSaude());
        System.out.println("Número plano: " + paciente1.getNumPlano());

        paciente2.setNome("Ana");
        paciente2.setCpf("222.222.222-22");
        paciente2.setCelular("552198888-8888");
        paciente2.setEmail("teste2@teste.com");
        paciente2.setPlanoDeSaude(2);
        paciente2.setNumPlano("278239326");

        System.out.println(" ");
        modalidade();

        paciente1.agendarConsulta(04, 01, 2023);

        paciente2.agendarConsulta(10, 02, 2023);

    }

    public static void modalidade(){
        System.out.println("""
                \nModalidades aceitas:
                0 - Particular: 100,00
                1 - Plano MDC: 20,00
                2 - Plano Santé: 0,00""");}
}


