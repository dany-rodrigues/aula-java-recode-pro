package aulaRecode;

import java.util.Scanner; //importa��o da classe para leitura

@SuppressWarnings("unused")
public class principal {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);	
	float nota1, nota2, media,contmedia = 0, contmediageral;
	int outroAluno,cont = 0;
	
 
	
	
	
	do {
	System.out.print("Digite a primeira nota: ");
	nota1 = teclado.nextFloat();// teclado entrada de dados
	
	System.out.print("Digite a segunda nota: ");
	nota2 = teclado.nextFloat();
	
	media = (nota1 + nota2) / 2;
	cont ++;
	contmedia = contmedia + media;

	
	System.out.println("Sua m�dia foi: " + media);
	
	
	if (media >= 7) {
	System.out.println("PARAB�NS, voc� foi APROVADO!");	
	}
	else {
		System.out.println("Sua m�dia ficou abaixo de 7. Por favor realizar terceira avalia��o.");
	}
     /**Altere o programa para que leia as duas notas de n alunos (n�o sabemos a quantidade) 
	 * e pergunte ao usu�rio se ele deseja ou n�o inserir as notas de outro aluno.*/
	
	System.out.println("Deseja cadastrar outra nota? Digite[1] SIM [2]N�O ");
	outroAluno = teclado.nextInt();
	
	
	if(outroAluno != 1 && outroAluno != 2) {
		
		System.out.println("Op��o invalida.");
		System.out.println("Deseja cadastrar outra nota? Digite[1] SIM [2]N�O ");
		outroAluno = teclado.nextInt();
		}
	    
	
	
	}while(outroAluno == 1);
	
	
	
	if(outroAluno == 2) {
		contmediageral = contmedia/cont;
	   
		System.out.println("Programa Finalizado! A m�dia da turma �: " + contmediageral);
		
	}
	
	/**Altere a estrutura do programa para que possamos calcular e imprimir a m�dias 
	 * das m�dias de todos os alunos digitados.*/
	

	
	
	}
	

}
