package Referencias;

import java.util.Scanner;

import Negocio.Aventura;

public class R001 extends Aventura {
	String texto;
	int opcao;
	
	public String toString(){
		texto = "Essa é a casa 1 Para ir para a casa 4 dige 4, para a casa 5 digite 5";
		return texto;
				
	}
	
	public static void Escolha(int opcao){
		  int escolha = opcao;//fazer scanner dessa variavel
		  switch(escolha){
		   case 1:	R002 r002 = new R002();
		   			System.out.println(r002);
		   			Scanner r = new Scanner(System.in);
		   			escolha = r.nextInt();
		   			r002.Escolha(escolha);
		   			//criar nova classe
		   			break;
		   case 2: 
		   case 3:System.out.println("aqui"); 
		  }
	}
}
