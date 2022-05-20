package com.mycompany.adimimoveis;
import java.util.*;
public class Metodos {
	private int decisao[];
	private int x;
	private int c;
	private String nome_dono;
	private int idade;
	private int idade_cliente[];
	private String nome_cliente[];
	private String rua[];
	private String bairro[];
	private String cep[];
	private int numero[];
	
	private double valor[];
	private Scanner leia =new Scanner(System.in);
	
	
	public String cadastrar() {
		System.out.println("Digite seu nome : ");
		setNome_dono(getLeia().next());
		System.out.println("Digite sua idade:: ");
		setIdade(getLeia().nextInt());
		System.out.println("Quantos imoveis você possui ? ");
		setX(getLeia().nextInt());
		setRua(new String[getX()]);
		setCep(new String[getX()]);
		setNumero(new int[getX()]);
		setBairro(new String[getX()]);
		setValor(new double[getX()]);
		for (int i = 0; i < getX(); i++) {
			System.out.println("Digite o nome da "+(i+1)+ "° rua do seu imovel: ");
			getRua()[i] =getLeia().next();
			System.out.println("Digite o nome do "+(i+1)+"° bairro: ");
			getBairro()[i]=getLeia().next();
			System.out.println("Digite o seu "+(i+1)+"° cep: ");
			getCep()[i]=getLeia().next();
			System.out.println("Digite o numero do "+(i+1)+ "° endereco: ");
			getNumero()[i]=getLeia().nextInt();
			System.out.println("Digite o valor do "+(i+1)+ "° imovel: ");
			getValor()[i]=getLeia().nextDouble();
			System.out.println("------------------///---------------------");
		}
		return getNome_dono();
		
	}
	public String cadastrar_cliente() {
		
		System.out.println("Quantos clientes estão interessado? ");
                this.setC(getLeia().nextInt());
	        setDecisao(new int[getC()]);
			setNome_cliente(new String[getC()]);
		    setIdade_cliente(new int[getC()]);
		for (int i = 0; i < this.getC(); i++) {	
			
			System.out.println("Digite o nome: ");
                        this.getNome_cliente()[i]=getLeia().next()	;
			System.out.println("Digite a idade: ");
                        this.getIdade_cliente()[i]=getLeia().nextInt();
			System.out.println("Qual imovel sentiu interesse? ");
                        this.getDecisao()[i]=getLeia().nextInt();
			if(getDecisao()[i]<=getValor().length) {
			while(this.getDecisao()[i]<=getValor().length) {
				System.out.println("Cadastrado com sucesso!!");
				System.out.println("------------------///---------------------");
				break;
			}
			}else 
			{
			System.out.println("Imovel não encontrado!!");
			}
			}
		return getNome_dono();
	}
	public void exibir_cliente() {
		System.out.println("Clientes cadastrados: ");
		System.out.println("");
		for (int i = 0; i < this.getNome_cliente().length; i++) {
			System.out.println((i+1)+"° "+this.getNome_cliente()[i]+" sentiu interesse no imovel: "+this.getDecisao()[i]);
			System.out.println("------------------------------------------------------------------");
		}
	}
	public int exibir_imoveis() {
		for (int i = 0; i < this.getX(); i++) {
			System.out.println("Informações do "+(i+1)+"° imovel: ");
			System.out.println("Rua: "+this.getRua()[i]);
			System.out.println("Bairro: "+this.getBairro()[i]);
			System.out.println("Cep: "+this.getCep()[i]);
			System.out.println("Endereco: "+this.getNumero()[i]);
			System.out.println("Valor: R$ "+getValor()[i]);
			System.out.println("------------------///---------------------");
			
		}
		return this.getX();
	}

        public int[] getDecisao() {
            return decisao;
        }

        public void setDecisao(int[] decisao) {
            this.decisao = decisao;
        }

        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public String getNome_dono() {
            return nome_dono;
        }

        public void setNome_dono(String nome_dono) {
            this.nome_dono = nome_dono;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int[] getIdade_cliente() {
            return idade_cliente;
        }

        public void setIdade_cliente(int[] idade_cliente) {
            this.idade_cliente = idade_cliente;
        }

        public String[] getNome_cliente() {
            return nome_cliente;
        }

        public void setNome_cliente(String[] nome_cliente) {
            this.nome_cliente = nome_cliente;
        }

        public String[] getRua() {
            return rua;
        }

        public void setRua(String[] rua) {
            this.rua = rua;
        }

        public String[] getBairro() {
            return bairro;
        }

        public void setBairro(String[] bairro) {
            this.bairro = bairro;
        }

        public String[] getCep() {
            return cep;
        }

        public void setCep(String[] cep) {
            this.cep = cep;
        }

        public int[] getNumero() {
            return numero;
        }

        public void setNumero(int[] numero) {
            this.numero = numero;
        }

        public double[] getValor() {
            return valor;
        }

        public void setValor(double[] valor) {
            this.valor = valor;
        }

        public Scanner getLeia() {
            return leia;
        }

        public void setLeia(Scanner leia) {
            this.leia = leia;
        }
	
	
}

