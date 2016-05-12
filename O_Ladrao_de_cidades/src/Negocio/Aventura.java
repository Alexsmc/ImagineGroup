package Negocio;

import Referencias.R001;
import Referencias.R002;

import java.util.*;
public class Aventura {

	public static void ImprimirTexto(String texto){
		  System.out.println(texto);
		 }
		 public static void Escolha(int opcao){
		  int escolha = opcao;//fazer scanner dessa variavel
		  switch(escolha){
		   case 1:	R001 r001 = new R001();
		   			System.out.println(r001);
		   			Scanner r1 = new Scanner(System.in);
		   			escolha = r1.nextInt();
		   			r001.Escolha(escolha);
		   			//criar nova classe
		   			break;
		   case 2:  R002 r002 = new R002();
  					System.out.println(r002);
  					Scanner r2 = new Scanner(System.in);
  					escolha = r2.nextInt();
  					r002.Escolha(escolha);
  			//criar nova classe
  			break;
		   case 3:System.out.println("aqui"); 
		  }
		  
		 }
		 
		 public static void main(String[] args){
		  String texto, decisao;
		  int opcao;
		  texto="Introdução";
		  decisao="Para a casa 1 digite 1, para a casa dois dite dois, para a casa tres digite tres.";
		  ImprimirTexto(texto);
		  ImprimirTexto(decisao);
		  Scanner escolher = new Scanner(System.in);
	      opcao = escolher.nextInt();//scanner aqui
		  Escolha(opcao);
		 }
}
