import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		/*
		
		int numero = 0;
		
	
		do {
			if(numero > 10) {
			System.out.println("Valor errado, entre com uma nota entre 1 e 10");
			}
			System.out.println("Me informe um numero entre 1 e 10: ");
	        numero = leia.nextInt();
		}while(numero > 10);
		System.out.println("Nota valida:" + numero); */
		
		/*
		String senha;
		String nome;
		
		System.out.println("Entre com um nome: ");
		nome = leia.nextLine();
		System.out.println("Entre com a senha: ");
		senha = leia.nextLine();
		
		while(nome.equals(senha)) {
			System.out.println("A senha não pode ser igual o seu nome!");
			System.out.println("Digite a novamente a senha:");
		senha = leia.nextLine();
		
		}
		System.out.println("Senha aceita!"); */
		
		/*
		String nome;
		
		System.out.println("Qual seu nome ?: ");
		nome = leia.nextLine();
	
		if(nome.length() < 3 ) {
			System.out.println("Nome digitado foi" + nome);
		}else if(nome.length() >3 ) {
		System.out.println("Nome é valido!");
		} else {
		System.out.println("Seu nome é invalido!");
		}
		*/
		
		/*
		int numero;
		System.out.println("Entre com a sua idade: ");
		numero = leia.nextInt();
		
		if (numero == 0 ) {
			System.out.println("Sua idade é" + numero);
		}else if(numero < 150) {
			System.out.println("A sua idade é valida");
		} else {
			System.out.println("Você não é normal");
		} */
			
		
		/*
		double salario;
		
		System.out.println("Qual o seu salário ?: ");
		salario = leia.nextDouble();
		
		if (salario > 0) {
		System.out.printf("Você recebe: %.2f" , salario); 	
		}else if(salario < 0) {
			System.out.println("Você é um trabalhador");
		}else {
			System.out.println("Ai amigo, você trabalha de graça");
		} */
		
		/*
		char sexo;
		System.out.println("Qual o seu sexo ?: ");
		sexo = leia.next().charAt(0);
		
		if(sexo == 'm' || sexo == 'M') {
			System.out.println("Seu sexo é Masculino");
		}else if(sexo == 'f' || sexo == 'F') {
			System.out.println("Seu sexo é Feminino");
		}else {
			System.out.println("A informação dada não é valida");
		}
		*/
		
		char estado;
		System.out.println("Qual o seu estado cívil ?: ");
		estado = leia.next().charAt(0);
		
		while(estado == 's' || estado == 'c' || estado == 'v' || estado == 'd'); {
		System.out.println("Você é" + estado);
		
		}
		System.out.println("Esse estado não existe!");
		
		leia.close(); 
		
		
		

	}

}
