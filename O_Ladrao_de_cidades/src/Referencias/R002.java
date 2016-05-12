package Referencias;

import java.util.Scanner;

public class R002 {
	String texto;
	int opcao;
	
	public String toString(){
		texto = "Essa é a casa 2 Para ir para a casa 4 dige 4, para a casa 5 digite 5";
		return texto;
				
	}
	
	public static void Escolha(int opcao){
		  int escolha = opcao;//fazer scanner dessa variavel
		  switch(escolha){
		   case 1:	R001 r001 = new R001();
		   			System.out.println(r001);
		   			Scanner r = new Scanner(System.in);
		   			escolha = r.nextInt();
		   			r001.Escolha(escolha);
		   			//criar nova classe
		   			break;
		   case 2:System.out.println("ali");
		   case 3:System.out.println("aqui"); 
		  }
	}
}
