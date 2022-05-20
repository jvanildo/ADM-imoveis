package com.mycompany.adimimoveis;
public class Adimimoveis {

    public static void main(String[] args) {
                System.out.println("ADMINISTRAÇÃO DE IMOVEIS: ");
		System.out.println("");
		Metodos dono =new Metodos();
		dono.cadastrar();
		dono.exibir_imoveis();
		dono.cadastrar_cliente();
		dono.exibir_cliente();
    }
}
