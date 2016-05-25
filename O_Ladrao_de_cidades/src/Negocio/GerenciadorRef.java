package Negocio;

import java.util.*;



public class GerenciadorRef { 

	private Referencia[] refList = new Referencia[400];
	private Scanner escolher;
	private Personagem heroi;
	private Mochila mochila;
	private int escolha;
	
	private Referencia decisao(int escolha, int opc1, int opc2, int opc3, int opc4){
		
		switch (escolha) {
		case 1:
			return this.refList[opc1];
		case 2:
			return this.refList[opc2];
		case 3:
			return this.refList[opc3];
		default:
			return this.refList[opc4];
		}
	}
	
	private void loadRef(Personagem heroi, Mochila mochila){
		this.creatRef();
		this.heroi = heroi;
		this.mochila = mochila;
	}
	public void creatRef(){
			Referencia r000 = new Referencia();
			r000.setNumero(0);
			//System.out.println("Provis�e: "+ mochila.getProvisao());
			//System.out.println("Voc� pode usar provis�es a qualquer momento do jogo, exceto durante as batalhas\n"
			//		+ "usar provis�es recuper 4 de sua energia. \nPs. Voc� n�o pode ter mais que sua energia maxima.");
			r000.setText("\nVoc� � um aventureiro em um mundo de monstros e magia, vivendo da rapidez de seu racioc�nio\n"
					+ "	e habilidade com a espada. Voc� ganha seu ouro como um guerreiro de aluguel, geralmente\n"
					+ "	empregado por nobres e bar�es ricos em miss�es perigosas ou dif�ceis demais para os pr�prios\n"
					+ "homens deles. Matar monstros e animais assombrosos na busca de algum tesouro fabuloso �\n"
					+ "coisa do cotidiano para voc�. Sendo um espadachim experimentado e altamente treinado, voc� n�o\n"
					+ "permite que nada se interponha em seu caminho nas suas miss�es. Seu sucesso nelas � sempre\n"
					+ "garantido, e sua reputa��o se espalhou pelas terras do pa�s. Sempre que voc� entra em uma aldeia\n"
					+ "ou cidade, a not�cia de sua chegada se propaga entre os cidad�os como fogo na floresta, j� que\n"
					+ "poucos deles tiveram antes a oportunidade de conhecer um matador de drag�es.\n"
					+ "Uma noite, depois de uma longa caminhada por terras selvagens, voc� chega a Silverton, que fica\n"
					+ "na encruzilhada das principais estradas comerciais desta regi�o. Grandes carro��es de madeira\n"
					+ "puxados por juntas de bois s�o vistos freq�entemente se deslocando com lentid�o pela cidade,\n"
					+ "carregados de ervas, especiarias, sedas, artigos de metal e comidas ex�ticas de terras distantes.\n"
					+ "Com o passar dos anos, Silverton havia prosperado, em conseq��ncia dos ricos mercadores e\n"
					+ "comerciantes que paravam l�, a caminho de mercados mais distantes. Sua riqueza � bastante\n"
					+ "aparente, com edif�cios ornamentados e um grande n�mero de pessoas ricamente vestidas. Mas,\n"
					+ "quando voc� atravessa os port�es da cidade, percebe que alguma coisa n�o est� normal. As pessoas\n"
					+ "parecem nervosas e desconfiadas. Em seguida, voc� nota que todas as janelas das constru��es possuem\n"
					+ "grandes grades de ferro fixadas sobre elas, e que as portas tamb�m foram refor�adas. Embora voc� prefira\n"
					+ "a sua pr�pria companhia � dos outros, decide ficar em Silverton para um pernoite, a fim de descobrir\n"
					+ "quem ou o qu� est� angustiando as pessoas. Quando voc� est� descendo pela rua principal, uma �nica nota\n"
					+ "soa, vinda de um sino em uma torre alta situada adiante. Em seguida, um homem grita, quase que\n"
					+ "desesperadamente: - A noite est� caindo! A noite est� caindo! Todo mundo para dentro! Voc� v� as\n"
					+ "pessoas correndo � sua volta com rostos ansiosos, parecendo surpresas ao verem voc�.\n"
					+ "Do outro lado da rua, voc� v� uma taverna com as palavras - O Velho Sapo - pintadas no letreiro.\n"
					+ "Ao entrar na taverna, voc� percebe que um sussurro percorre os presentes, pois os nativos do local o reconhecem.\n"
					+ "Voc� fica um tanto surpreendido que nenhum deles venha at� voc� ouvir hist�rias de aventuras. Voc� anda at� o balc�o\n"
					+ "e pede ao velho estalajadeiro que consiga um quarto e um banho quente, mas ele ignora o que voc� disse e corre para\n"
					+ "a grande porta de carvalho, pondo seis trincos grandes de ferro em posi��o. S� depois ele volta-se para voc� e diz, calmamente:\n"
					+ "- O quarto custar� cinco pe�as de cobre e mais uma pelo banho, adiantado, por favor. \n"
					+ "Voc� abre uma pequena bolsa de couro presa a seu cinto e p�e as moedas no balc�o. Ele entrega a\n"
					+ "voc� uma chave de ferro, mas, justamente nesse momento, ouve-se algu�m batendo com for�a na \n"
					+ "porta, e em seguida uma voz que grita: - Abram! Abram! � Owen Carralif. O velho estalajadeiro \n"
					+ "desloca-se at� a porta de carvalho mais uma vez e empurra os trincos. Ent�o, um homem gordo e\n"
					+ "meio calvo, vestido em trajes ricos de cor escarlate, irrompe pela taverna, olhando � sua volta\n "
					+ "freneticamente. Ele o v� e anda rapidamente na sua dire��o, resmungando e bufando. Certamente \n"
					+ "n�o � um homem acostumado � pressa - voc� repara nas grandes gotas de suor em sua testa, sob a\n"
					+ "luz p�lida das velas do sal�o. Ao se aproximar de voc�, ele fala com urg�ncia: - Estrangeiro, preciso\n"
					+ "falar com voc�. Por favor, sente-se. � importante que eu fale com voc�. Quando ele se volta para o \n"
					+ "estalajadeiro para estalar os dedos, pedindo comida e bebida, voc� pode ver que obviamente ele � \n"
					+ "um homem de alguma posi��o na cidade, mas seu rosto est� cheio de ang�stia e sofrimento. Voc�, \n"
					+ "muito curioso, resolve ouvir o que homem tem a dizer. Ele puxa uma cadeira para voc� em uma mesa, \n"
					+ "pedindo que sente, enquanto o estalajadeiro traz solicitamente uma bandeja, contendo uma sopa quente,\n"
					+ " ganso assado e hidromel. O homem vestido de escarlate sentase � sua frente em sil�ncio, observando\n"
					+ " enquanto voc� come com gosto, como se o estivesse examinando com algum prop�sito seu. Finalmente,\n"
					+ " quando voc� afasta seu prato, o homem se inclina ligeiramente e diz, em voz baixa, mas ansiosamente:\n"
					+ " - Estrangeiro, eu sei tudo a seu respeito e estou querendo a sua ajuda. Meu nome � Owen Carralif,\n"
					+ " e sou o prefeito de Silverton. Estamos em grandes dificuldades e perigos. Vivemos sob uma maldi��o,\n "
					+ "e sou eu quem tem que nos livrar dela. H� dez dias atr�s, dois mensageiros do mal entraram na cidade,\n"
					+ " montando enormes garanh�es negros. Os animais tinham olhos ardentes e vermelhos! Era imposs�vel ver\n"
					+ " os rostos dos cavaleiros, pois eles usavam longas capas negras com capuzes puxados sobre seus rostos.\n"
					+ " Suas vozes eram frias, e cada palavra dita terminava com um silvo aterrorizante. Eles perguntaram por\n"
					+ " mim pelo nome e, quando vim para cumpriment�-los, quiseram levar minha amada filha Mirelle para ficar \n"
					+ "com o senhor deles, Zanbar Bone! Sem d�vida voc� sabe que ele � o Pr�ncipe da Noite. � claro que eu \n"
					+ "recusei, e eles, sem dizer mais uma palavra, fizeram meia volta e sa�ram da cidade lentamente, \n"
					+ "com as cabe�as baixas e os ombros encolhidos. Eu entendi ent�o que, sob as capas, se escondiam os\n"
					+ " corpos esquel�ticos e sem alma dos Ca�adores de Esp�ritos. Zanbar Bone sempre os usa como mensageiros,\n"
					+ " j� que eles completam a miss�o ou morrem tentando - e n�o � muito f�cil mat�los. Somente uma flecha\n"
					+ " de prata no cora��o liberta estes seres do mal de sua exist�ncia eterna entre a vida e a morte. \n"
					+ "Quem sabe o que seria necess�rio para matar Zanbar Bone! De qualquer maneira, na mesma noite em que\n"
					+ "os Ca�adores de Esp�ritos partiram, nossos problemas come�aram. O Pr�ncipe da Noite ficou furioso e \n"
					+ "determinado a nos fazer mal. Vieram seis Cachorros da Lua, cada um deles mais forte do que quatro \n"
					+ "homens, cada um deles com caninos afiados como navalhas. Eles rondaram a cidade, entrando em casas \n"
					+ "pelas janelas abertas e matando as pobres pessoas que estavam dentro.\n"
					+ "De manh�, n�s contamos vinte e tr�s mortos. Por isso, n�s colocamos grades nas janelas e trincos\n"
					+ "nas portas, mas, ainda assim, os Cachorros da Lua retomam a cada noite, e n�o conseguimos dormir\n"
					+ "de medo que eles encontrem um jeito de entrar nas nossas casas. Algumas pessoas agora est�o falando\n "
					+ "em enviar Mirelle para Zanbar Bone. Esses traidores lamurientos, eu devia mandar a�oit�los! \n"
					+ "Mas o que isso adiantaria? S� existe uma esperan�a, e ela reside em voc�, estrangeiro. H� um \n"
					+ "homem chamado Nicodemus que, por raz�es que jamais compreenderei, mora em Port Blacksand. \n"
					+ "O lugar � comumente chamado de Cidade dos Ladr�es, pois � o lar de todo pirata, bandido, assassino, \n"
					+ "ladr�o e causador de males num raio de centenas de milhas. Acho que ele mora l� justamente para se livrar de gente como n�s.\n"
					+ "Ele � um velho e s�bio m�gico e provavelmente n�o sofre grande perigo, mesmo em Port Blacksand, pois seus poderes m�gicos s�o muito grandes.\n"
					+ "Somente ele � capaz de derrotar Zanbar Bone. Antigamente ele era meu amigo, isso h� muitos anos.\n"
					+ "Precisamos dele, e eu imploro a voc� que o traga at� n�s - ningu�m aqui ousa entrar em Port Blacksand. \n"
					+ "Voc� ser� recompensado regiamente se nos ajudar, estrangeiro. Leve estas 30 Pe�as de Ouro para a sua jornada e tome esta espada para usar e ficar para voc�. \n"
					+ "Quando Owen Carralif se levanta, abre a sua vestimenta escarlate, revelando a melhor espada de l�mina larga que voc� j� viu na vida. \n"
					+ "Ele a entrega a voc� e, ao tocar o fio da l�mina, voc� fica surpreso ao ver uma pequena gota de sangue pingar de seu dedo.\n"
					+ "Em seguida, voc� examina as serpentes douradas maravilhosamente trabalhadas que se enroscam em torno do cabo. \n"
					+ "Voc� jamais quis tanto alguma coisa em sua vida antes. Voc� levanta e estende a m�o direita para Owen. \n"
					+ "Ele a aperta ansiosamente, dizendo: - Voc� deve partir com a primeira luz da aurora - os Cachorros da Lua j� ter�o ido embora ent�o. \n"
					+ "Serei for�ado a passar a noite aqui tamb�m, por isso vamos beber ao nosso destino, e que os deuses estejam conosco. \n"
					+ "Durante a hora que se segue, Owen fala sobre a jornada diante de voc�, explicando em detalhes como chegar Port Blacksand. \n"
					+ "Depois, voc� pega a sua mochila e sua peles de agasalho, sobe as escadas de madeira e vai para seu quarto. \n"
					+ "Voc� dorme sobressaltado, apesar da seguran�a que a sua espada nova traz, pois voc� � acordado mais de uma vez pelos uivos, \n"
					+ "fungadas e arranhadas nas janelas dos Cachorros da Lua que perambulam l� fora. Quando o dia nasce, voc� j� est� acordado e\n"
					+ "vestido, determinado a chegar a Port Blacksand rapidamente para encontrar este homem, Nicodemus. \n"
					+ "Ao sair da taverna, um gato preto passa correndo pelos seus p�s e voc� quase trope�a; talvez um mau press�gio!.");
			this.refList[0] = r000;
			
						
			Referencia r001 = new Referencia();
			this.refList[1] = r001;
			r001.setNumero(1);
			r001.setText("A caminhada para Port Blacksand o leva na dire��o do oeste por uns 80 quil�metros,\n"
					+ "atravessando	plan�cies e subindo serras. Felizmente, n�o acontece nenhum encontro perigoso.\n Finalmente, voc�"
					+ "chega � costa e v� a alta muralha que circunda Port Blacksand e o aglomerado de constru��es\n"
					+ "que se projeta para o mar como uma feia mancha negra. H� navios ancorados no porto e fuma�a\n"
					+ "subindo suavemente de chamin�s. Parece suficientemente pac�fico, e somente quando o vento muda,\n"
					+ "trazendo o cheiro de podrid�o na brisa, voc� se lembrada natureza cruel deste lugar not�rio.\n"
					+ "Seguindo a estrada empoeirada para o norte ao longo da costa, na dire��o dos port�es da cidade,\n"
					+ "voc� come�a a notar alguns sinais assustadores - cr�nios em espetos de madeira, homens\n"
					+ "morrendo	de fome em jaulas suspensas nas muralhas da cidade e bandeiras negras em toda parte.\n Ao se"
					+ "aproximar do port�o principal, um frio corre pela sua espinha, e voc� instintivamente segura o\n"
					+ "cabo	de sua espada para se reanimar. No port�o, voc� se depara com um guarda alto, usando uma\n"
					+ "cota de malha de a�o e um elmo de ferro. Ele avan�a, barrando a sua passagem com a lan�a, e diz:\n"
					+ "- Quem quer entrar em Port Blacksand sem ser convidado? Explique o qu� est� fazendo aqui ou volte pelo\n"
					+ "caminho que veio. Voc�:\n"
					+ "Dir� a ele que quer ser levado a Nicodemus?(digite 1)\n"
					+ "Dir� a ele que quer vender alguns objetos roubados?(digite 2)\n"
					+ "Atacar� o guarda rapidamente com sua espada?(digite 3)");
			
			Referencia r002 = new Referencia();
			this.refList[2] = (r002);
			r002.setNumero(2);
			r002.setText("Voc� retira a pulseira do seu bra�o e a joga no monstro que se aproxima. Ela cai sobre a sua\n"
					+ "carapa�a, semelhante a uma armadura, e gruda nela como se estivesse colada. Voc� fica ent�o\n"
					+ "observando enquanto a pulseira come�a a queimar, penetrando na carapa�a, o corpo da Centop�ia\n "
					+ "Gigante. A fuma�a sai do orif�cio exatamente redondo e, � medida em que a pulseira queima, \n"
					+ "penetrando cada vez mais, voc� pode ver que os movimentos fren�ticos da Centop�ia s�o os \n"
					+ "estertores da morte. Finalmente, ela fica im�vel, e voc� consegue se esgueirar entre seu corpo e o\n"
					+ "teto do t�nel. Voc� continua andando pelo t�nel, que termina em uma grade de ferro, atrav�s da\n "
					+ "qual passa o esgoto.\n"
					+ "Se quiser retirar a grade, (Digite 1)\n"
					+ "Se preferir caminhar de volta para o buraco de entrada, (Digite 2)");
						
			Referencia r003 = new Referencia();
			this.refList[3] = (r003);
			r003.setNumero(3);
			r003.setText("O homem p�ra de jogar e diz que ele pode lhe trazer boa sorte. Pela soma de tr�s Pe�as de Ouro,\n"
					+ "ele cantar� uma can��o para voc� que lhe trar� boa sorte.\n"
					+ "Se quiser pagar o m�sico, (digite 1).\n"
					+ "Se n�o acreditar nele, poder� seguir em frente para a pr�xima barraca (digite 2).");
						
			Referencia r004 = new Referencia();
			this.refList[4] = (r004);
			r004.setNumero(4);
			r004.setText("Voc� ouve uma campainha tocar do outro lado da porta e, poucos minutos depois, ela � aberta por\n"
					+ "um homem magro de pele p�lida, com olhos fundos e escuros, usando um uniforme de servente.\n"
					+ "Com uma voz fria e sibilante, ele diz: - Sim?\n"
					+ "Se quiser dizer a ele que voc� � um viajante perdido, (Digite 1).\n"
					+ "Se quiser atacar o homem com sua espada, (Digite 2).\n");
						
			Referencia r005 = new Referencia();
			this.refList[5] = (r005);
			r005.setNumero(5);
			Npc monstro005 = new Npc();
			r005.setMonstro(monstro005);
			monstro005.setNomeMonstro("Homem-Orca");
			monstro005.setMonstroEner(5);
			monstro005.setMonstroHab(8);
			r005.setText("Desembainhando sua espada, voc� salta por cima do balc�o para atacar o HOMEM-ORCA, que\n"
					+ "rapidamente pega a sua acha de m�o. Voc� logo se d� conta de que o Homem-Orca tem pr�tica\n"
					+ "no uso da arma dele.\n" + monstro005.toString());
				
			Referencia r006 = new Referencia();
			this.refList[6] = (r006);
			r006.setNumero(6);
			r006.setText("Seu tom de voz se torna desagrad�vel, e ela diz para voc� sair da casa dela, "
					+ "porque certamente n�o h� trapos l�, nem, falando nisso, qualquer outro tipo de rebotalho.\nSe quiser obedec�-ela, saia da"
					+ "casa e siga adiante para o norte, ao longo da Rua do Est�bulo.(Digite 1) 333.\nSe quiser atravessar as"
					+ "cortinas e ver quem est� sendo t�o rude com voc�, (Digite 2) v� para 88.");
			
			
			Referencia r007 = new Referencia();
			this.refList[7] = (r007);
			r007.setNumero(7);
			r007.setText("Voc� sai do aposento na ponta dos p�s e fecha a porta. No corredor, voc� abre a bolsa e encontra\n"
					+ "seis p�rolas negras. Some 2 pontos de SORTE. \nSe voc� ainda n�o o tiver feito, poder� abrir a outra\n"
					+ "porta (Digite 1)\n ou sair do navio para continuar a sua busca em Port Blacksand, caminhando\n"
					+ "para o norte pela Rua do Porto (Digite 2).");
						
			Referencia r008 = new Referencia();
			this.refList[8] = (r008);
			r008.setNumero(8);
			r008.setText("A criatura p�e o broche dourado na sua t�nica de couro, e voc� paga o pre�o pedido.\n Voc� comprou"
					+ "um amuleto da sorte - some 2 pontos de SORTE ao seu total. \nFeliz com a sua aquisi��o, voc� sai da"
					+ "casa e segue para o norte.");
						
			Referencia r009 = new Referencia();
			this.refList[9] = (r009);
			r009.setNumero(10);
			r009.setText("Voc� se afasta do corpo vil de Zanbar Bone, esperando que ele comece a se decompor. Por�m, voc�"
					+ "escolheu errado!\nEle tira a flecha de seu peito e esfrega os olhos, retirando o composto. Ele v� voc�"
					+ "e ri.\nVoc� est� hipnotizado pelo seu poder e incapaz de se mexer. Ele caminha at� voc� e toca seu"
					+ "rosto com seus dedos de esqueleto.\nSua vida est� sendo rapidamente sugada e logo voc� iniciar� sua"
					+ "exist�ncia de morto-vivo a servi�o de Zanbar Bone. (Game Over)");
			
			Referencia r010 = new Referencia();
			this.refList[10] = (r010);
			r010.setNumero(10);
			Npc monstro010 = new Npc();
			r010.setMonstro(monstro010);
			monstro010.setNomeMonstro("GUARDA DA CIDADE");
			monstro010.setMonstroHab(7);
			monstro010.setMonstroEner(8);
			r010.setText("O GUARDA est� realmente aborrecido e o ataca com sua lan�a.\n"+ monstro010.toString());
			
			/*int round=0;
			do{
        		Random d = new Random();
        		int dado1 = d.nextInt(12)+2;
       		System.out.println(monstro010.getNomeMonstro() + "Ataca com: " + (dado1 + monstro010.getMonstroHab()) + "de For�a");
        		int dado2 = d.nextInt(12)+2;
        		System.out.println(heroi.getNome() + "Ataca com " + (dado2 + heroi.getHabilidade()) + "de For�a");
        			
        if((heroi.getHabilidade()+dado2)>monstro010.getMonstroHab()+dado1){
            		System.out.println("Heroi fere o monstro! "
            			+ "Deseja usar sorte? (y/n)");
            		Scanner escolher = new Scanner(System.in);
            		String lucky = escolher.nextLine();
            		if((lucky=="y")||(lucky=="Y")){
            			boolean resultSorte = (heroi.usarSorte(heroi.getSorte()));
            			if(resultSorte == true){
            				monstro010.setMonstroEner(monstro010.getMonstroEner()-4);
            			}else{
            				monstro010.setMonstroEner(monstro010.getMonstroEner()-1);
				}
           			}else{
				monstro010.setMonstroEner(monstro010.getMonstroEner()-2);	
			}
		}else {
            		System.out.println("Heroi ferido! "
            			+ "Deseja usar sorte? (y/n)");
            		Scanner escolher = new Scanner(System.in);
            		String lucky = escolher.nextLine();
            		if((lucky=="y")||(lucky=="Y")){
            			boolean resultSorte = (heroi.usarSorte(heroi.getSorte()));
            			if(resultSorte == true){
            				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-1);
            			}else{
            				heroi.setEnergiaAtual(heroi.getEnergiaAtual()-3);
				}
           			}else{
				heroi.setEnergia(heroi.getEnergia()-2);	
			}
		}
        round++;
     }while((heroi.getEnergiaAtual()>=0) || (monstro010.getMonstroEner()>=0));
	
			if(heroi.getEnergiaAtual()>monstro010.getMonstroEner()){
	        	System.out.println("Voc� derrotou a criatura");
	        	if(round<=6){
	        		System.out.println(r212.toString());
	        	}else{
	        		System.out.println(r130.toString());
	        	}
	        	
	        }
	         else{
	             System.out.println(r401.toString());
	             
	         }*/
			
        	Referencia r011 = new Referencia();
    		this.refList[11] = (r011);
    		r011.setNumero(11);
			r011.setText("Os Trolls v�em o que voc� est� fazendo e correm na dire��o da �rvore. Voc� � for�ado a deixar seu\n"
					+ "escudo para tr�s. Perde, com isso, 1 ponto de HABILIDADE. Depois de subir rapidamente na\n"
					+ "�rvore, voc� se d� conta de que ter� que pular uma dist�ncia de dois metros entre o galho e o topo\n"
					+ "da muralha. Se estiver usando uma cota de malha de a�o, voc� ter� que tir�-la para pular com\n"
					+ "seguran�a sobre a muralha (voc� perde 2 pontos de HABILIDADE). Abaixo, voc� v� os dois Trolls\n"
					+ "correndo em volta da �rvore, agitando as espadas na sua dire��o. N�o h� alternativa, a n�o ser pular.");
			
			Referencia r012 = new Referencia();
			this.refList[12] = (r012);
			r012.setNumero(12);
			r012.setText("Passados alguns minutos, voc� ouve passos que v�m descendo o corredor. A porta se abre, e um\n"
					+ " homem entra no aposento, usando como �nica vestimenta uma toalha enrolada em volta de seu\n"
					+ " est�mago gordo. Voc� observa enquanto ele deixa cair a toalha e se abaixa lentamente na banheira\n"
					+ "com um suspiro alto.\n Se quiser surpreend�-lo, desembainhando a espada e falando - Ah�! bem alto,"
					+ "(Digite 1). \nSe preferir se esgueirar para fora do aposento de volta para o corredor enquanto ele\n"
					+ "submerge, (Digite 2).");
						
			Referencia r013 = new Referencia();
			this.refList[13] = (r013);
			r013.setNumero(13);
			r013.setText("Ao inspecionar o escorpi�o, voc� v� que � um broche. Voc� decide p�-lo na sua t�nica de couro. O"
					+ "broche possui propriedades curativas m�gicas: depois de qualquer batalha, o broche imediatamente"
					+ "recuperar� 1 ponto de ENERGIA para o seu total. O que voc� far� em seguida?"
					+ "Voc� pode, se ainda n�o o tiver feito, pegar o escorpi�o dourado (Digite 1)."
					+ "Se preferir ignor�-lo, poder� subir as escadas (Digite 2), "
					+ "ou sair da casa e seguir para o norte (Digite 3).");
						
			Referencia r014 = new Referencia();
			this.refList[14] = (r014);
			r014.setNumero(14);
			r014.setText("Logo que voc� pega uma das flores, ouve o barulho de folhas em movimento. Tr�s das cercas\n"
					+ " vegetais com forma de animais se desenraizaram e est�o se aproximando de voc�.");
						
			Referencia r015 = new Referencia();
			this.refList[15] = (r015);
			r010.setNumero(15);
			r015.setText("Voc� salta por cima das serpentes e corre para a porta. Teste sua Sorte!");
			/*boolean lucky = heroi.usarSorte(heroi.getSorteAtual());
			if(lucky == true){
				System.out.println("Voc� teve sorte e chega at� a porta em seguran�a!");
				System.out.println(r075.toString());
			}else{
				System.out.println("Voc� n�o teve sorte e uma das serpentes d� um bote e "
					+ "morde a sua perna");
				System.out.println(r298.toString());
			}*/
			
			Referencia r016 = new Referencia();
			this.refList[16] = (r016);
			r016.setNumero(16);
			r016.setText("A bolsa cont�m 12 Pe�as de Ouro. Some 1 ponto de SORTE. Voc� sai da casa rapidamente, antes "
					+ "que o propriet�rio descubra que voc� n�o � quem voc� diz ser. Voc� ent�o segue adiante para o "
					+ "norte, ao longo da Rua do Est�bulo.");
						
			Referencia r017 = new Referencia();
			this.refList[17] = (r017);
			r017.setNumero(17);
			r017.setText("Caminhando pela rua estreita, voc� v� um homem usando trapos esfarrapados sentado na sarjeta.\n "
					+ "Tem a cabe�a enfiada nas m�os e a apar�ncia totalmente miser�vel.\nSe quiser parar para falar com "
					+ "ele, (Digite 1). \nSe preferir continuar a caminhar para o oeste, (Digite 2).");
			
			
			Referencia r018 = new Referencia();
			this.refList[18] = (r018);
			r010.setNumero(18);
			r018.setText("Voc� mira cuidadosamente e lan�a a faca no vagabundo da frente.");
			
			/*Random d = new Random();
			int testeForca = d.nextInt(12)+2;
			if(testeForca<=heroi.getHabilidade()){
				System.out.println("a faca penetra profundamente no "
					+ "peito do vagabundo, fazendo com que ele interrompa seus passos e caia morto.");
				System.out.println(r102.toString());
			}else{
				System.out.println("a faca passa voando pelo alvo, e voc� ter� "
					+ "que lutar contra os tr�s vagabundos com sua espada.");
				System.out.println(r225.toString());
			}*/
			
			Referencia r019 = new Referencia();
			this.refList[19] = (r019);
			r019.setNumero(19);
			r019.setText("Os dardos t�m a ponta envenenada. Voc� perde 4 pontos de ENERGIA e 1 ponto de "
					+ "HABILIDADE.");
			
			/*heroi.setHabilidade(heroi.getHabilidade()-1);
			heroi.setEnergiaAtual(heroi.getEnergiaAtual()-4);
			if(heroi.getEnergiaAtual()<=0){
				System.out.println(r401.toString());
			}
			System.out.println("Se voc� ainda estiver vivo e quiser continuar a tentar abrir a fecha dura, v� para "
					+ "340. \nSe voc� preferir sair do aposento e subir as escadas para o andar de cima, v� para 60.");
			do{
				System.out.println("O que voc� far�?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			System.out.println(decisao(escolha, 340, 60, 0).toString());*/
			
					
    		
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//-------------------------------------------------------------------------------------------------------------------------------		
			Referencia r201 = new Referencia();
			this.refList[201] = (r201);
			r201.setNumero(201);
			r201.setText("Seguindo o mapa de Nicodemus, voc� come�a a sua longa caminhada para o norte, na dire��o\n "
					+ "da torre guarnecida de Zanbar Bone, o Pr�ncipe da Noite. Voc� caminha atrav�s de bosques e campos.\n"
					+"Voc� consegue relaxar um pouco no agrad�vel ambiente do campo, respirando ar fresco com seus\n"
					+"odores maravilhosos. Quando a luz vai sumindo, voc� resolve acampar sob um enorme olmo.\n"
					+"Voc� cozinha uma refei��o de coelho guisado e cogumelos antes de se deitar para um sono longo e\n"
					+"profundo (some 2 pontos de ENERGIA). De manh�, voc� procura um teixo e corta um galho\n"
					+"comprido para fazer um arco, a fim de disparar a flecha de prata. Ao testar a precis�o do arco,\n"
					+"voc� nota repentinamente a presen�a de uma pomba branca pousada em um galho baixo ali perto. \n"
					+ "H� um pequeno peda�o de papel preso a uma de suas patas, o qual a pomba permite que voc� retire sem\n"
					+"voar para longe. H� uma mensagem no papel que diz:\n"
					
					+"\n"
					+ "'Caro Amigo \n:"
					+"Temo que esteja ficando velho demais para ser �til a algu�m.\n"
					+"Lamento dizer que as informa��es que lhe dei sobre o\n"
					+"composto necess�rio para matar Zanbar Bone n�o est�o\n"
					+"corretas. Voc� tem que usar apenas dois dos tr�s\n"
					+"ingredientes que eu disse a voc�, mas n�o consigo me\n"
					+"lembrar que dois. S� posso sugerir que voc� tente cabelo de\n"
					+"Bruxa com p�rolas negras, ou cabelo de Bruxa com flor de\n"
					+"1�tus, ou p�rolas negras com flor de 1�tus. Minhas\n"
					+"desculpas.\n"
					+"Boa sorte,'\n"
					+"\n 'N'.\n"
					
					+"\nVoc� joga a mensagem no ch�o e solta uma maldi��o. Voc� muda de id�ia uma d�zia de vezes\n"
					+"antes de chegar a uma decis�o. Finalmente, voc� faz sua escolha e amassa os dois ingredientes\n"
					+"em uma pedra chata, misturando-os. Voc� coloca o composto em uma pequena bolsa de couro,\n"
					+"esperando ter tomado a decis�o certa. Voc� parte de novo, mas n�o demora muito para que a\n"
					+"vizinhan�a se torne menos acolhedora. As �rvores s�o retorcidas ou atrofiadas e n�o se ouvem\n"
					+"p�ssaros � voc� deve estar se aproximando do dom�nio do Pr�ncipe da Noite. De repente, � sua\n"
					+"esquerda, voc� ouve movimentos e grunhidos no mato. � um monstro que vagueia, atra�do pelo\n"
					+"seu cheiro. Jogue um dado e consulte a tabela abaixo para saber que criatura apareceu. Lute contra\n"
					+"ela normalmente.\n"
					);
					Random dado = new Random();
					int numero;
					numero = dado.nextInt(6)+1;
					
					switch(numero){
					case 1:Npc monstro201 = new Npc();
					monstro201.setNomeMonstro("Orca");
					monstro201.setMonstroEner(4);
					monstro201.setMonstroHab(5);
					System.out.println(monstro201);
				
					
					case 2:Npc monstro202 = new Npc();
					monstro202.setNomeMonstro("Cobra Gigante");
					monstro202.setMonstroEner(6);
					monstro202.setMonstroHab(6);
					System.out.println(monstro202);
					
					
					case 3:Npc monstro203 = new Npc();
					monstro203.setNomeMonstro("Lobo");
					monstro203.setMonstroEner(5);
					monstro203.setMonstroHab(5);
					System.out.println(monstro203);
					
				
					
					case 4:Npc monstro204 = new Npc();
					monstro204.setNomeMonstro("Pigmeu");
					monstro204.setMonstroEner(4);
					monstro204.setMonstroHab(4);
					System.out.println(monstro204);
					
					
					case 5:Npc monstro205 = new Npc();
					monstro205.setNomeMonstro("Homem-Macaco");
					monstro205.setMonstroEner(6);
					monstro205.setMonstroHab(7);
					System.out.println(monstro205);
					
					
					case 6:Npc monstro206 = new Npc();
					monstro206.setNomeMonstro("Troll da Caverna");
					monstro206.setMonstroEner(7);
					monstro206.setMonstroHab(8);
					System.out.println(monstro206);
					
					
			Referencia r202 = new Referencia();
			this.refList[202] = (r202);
			r202.setNumero(202);
			r202.setText("O guarda responde que pedir� uma escolta para lev�-lo at� Nicodemus.\n" 
						+"Ele estica o bra�o at� uma pequena sineta na parede da guarita e a faz soar\n"
						+"tr�s vezes. Quase que imediatamente, dois outros guardas v�m correndo da casa,\n" 
						+"e voc� fica surpreso quando cada um deles segura um de seus\n"
						+"bra�os. O guarda com a lan�a levanta a cabe�a e ri, dizendo: \n"
						+"Ent�o voc� quer ver Nicodemus, n�o �? \n"
						+"Que tal ver o interior de uma masmorra ao inv�s disso?\n" 
						+"Guardas, levem este est�pido embora e ponham-no atr�s das grades,\n"
						+"depois joguem fora a chave.\n" 
						+"Voc�:\n"
						+"Permitir� que eles o levem?\n"
						+"Digite 1\n"
						+"Tentar� lutar contra os guardas?\n"
						+"Digite 2\n"
						+"Tentar� subornar os guardas?\n"
						+"Digite 3\n");
					System.out.println("O que voc� far�?\n");
					escolher = new Scanner(System.in);
					escolha = escolher.nextInt();
					System.out.println(decisao(escolha, 51, 69, 276,0).toString());
					
			Referencia r203 = new Referencia();
			this.refList[203] = (r203);
			r203.setNumero(203);
			r203.setText("\nZanbar Bone caminha na sua dire��o, tentando tocar a sua pele exposta.\n" 
						+"Voc� joga a espada de lado e coloca a flecha de prata no arco.\n" 
						+"Voc� s� tem uma chance. Teste sua Sorte. Se voc� Tiver sorte,\n" 
						+"a flecha atinge seu alvo e atravessa as vestes e o peito do Pr�ncipe da Noite\n" 
						+"Se voc� N�o tiver sorte, a flecha n�o acerta no Pr�ncipe da Noite,\n" 
						+"e ele avan�a para tocar o seu bra�o. Seus dedos de esqueleto est�o sugando a sua vida.\n" 
						+"Voc� � agora um de seus servos mortos-vivos.\n");
					boolean resultSorte = (heroi.usarSorte(heroi.getSorte()));
					if(resultSorte == true){
						//System.out.println(r244.toString());
        			}else{
        				//System.out.println(r401.toString());
		}
					
		
			Referencia r204 = new Referencia();
			this.refList[204] = (r204);
			r204.setNumero(204);
			r204.setText("Voc� larga a ta�a e tira a m�o para longe.\n" 
						+"O escorpi�o corre por mais ou menos um metro pelo ch�o,\n" 
						+"at� que voc� pisa nele com sua bota. Se ainda n�o o tiver feito,\n" 
						+"voc� poder� levantar a ta�a B ou a ta�a C .\n" 
						+"Se voc� tiver perdido o interesse nas ta�as, poder� ou\n" 
						+"caminhar at� a passagem em arco , ou subir as escadas.\n"
						+"Levantar ta�a B\n"
						+"Digite 1\n"
						+"Levantar ta�a C\n"
						+"Digite 2\n"
						+"Caminhar at� a passagem do arco\n"
						+"Digite 3\n"
						+"Subir as escadas\n"
						+"Digite4\n");
		System.out.println("O que voc� far�?\n");
		escolher = new Scanner(System.in);
		escolha = escolher.nextInt();
		System.out.println(decisao(escolha, 209, 43, 107, 60).toString());
		
		Referencia r205 = new Referencia();
		this.refList[205] = (r205);
		r205.setNumero(205);
		r205.setText("Depois de recolocar a tampa do bueiro, voc� parte novamente para o leste." 
					+"Tudo parece estar quieto demais, e voc� come�a a se sentir nervoso." 
					+"� sua frente, voc� v� que a Rua do Est�bulo faz uma curva fechada para a esquerda." 
					+"Se voc� quiser continuar depois da curva." 
					+"Digite 1\n"
					+"Se quiser andar de volta para o cruzamento e virar � direita na Rua da Torre." 
					+"Digite 2\n");		
		System.out.println("O que voc� far�?\n");
		escolher = new Scanner(System.in);
		escolha = escolher.nextInt();
		System.out.println(decisao(escolha, 44, 127, 0, 0).toString());
		
		Referencia r206 = new Referencia();
		this.refList[206] = (r206);
		r206.setNumero(206);
		r206.setText("O An�o explica que eles est�o jogando um simples jogo de quem-ganha-leva." 
					+"A aposta � de 2 Pe�as de Ouro. Cada pessoa p�e 2 Pe�as de Ouro na mesa e joga 2 dados." 
					+"A pessoa que tirar o n�mero mais alto fica com as 8 Pe�as de Ouro." 
					+"Para jogar, jogue 2 dados 3 vezes para os 3 An�es e anote cada um dos totais." 
					+"Em seguida, jogue 2 dados para voc�. Se seu pr�prio total for maior do que os"
					+"outros 3 totais, voc� ganha 6 Pe�as de Ouro dos An�es. "
					+ "Se o total for menor do que qualquer dos"
					+"outros 3 totais, voc� perde 2 Pe�as de Ouro. Voc� pode jogar 4 vezes, se voc� quiser," 
					+"antes que os An�es fiquem enfastiados e saiam da taverna." 
					+"Voc� ir� jogar?(1=sim/2=n�o)");
					escolha = 1;
					System.out.println(decisao(escolha, 296, 0, 0, 0).toString());
		
		Referencia r207 = new Referencia();
		this.refList[207] = (r207);
		r207.setNumero(207);
		r207.setText("A escadaria termina em uma porta. Voc� gira a ma�aneta lentamente, e a porta se abre," 
					+"para sua grande surpresa dando para o ar livre. Voc� sai para o telhado plano da torre." 
					+"Subitamente, voc� toma consci�ncia de que h� movimentos no c�u e, ao olhar para cima," 
					+"v� duas aves grandes � luz da lua, com bicos e garras longas, que descem velozmente" 
					+"sobre voc�. N�o h� tempo para correr para um abrigo, e voc� ter� que lutar contra os" 
					+"GAVI�ES ASSASSINOS.");
		  Npc monstro207um = new Npc();
		  Npc monstro207dois = new Npc();
		  Npc[] monstro207 = new Npc[2];
		  	monstro207[0] = (monstro207um);
		  	monstro207[1] = (monstro207dois);
		  	monstro207[0].setNomeMonstro("GAVI�O ASSASSINO 1");
		  	monstro207[0].setMonstroHab(4);
		  	monstro207[0].setMonstroEner(5);
		  	monstro207[1].setNomeMonstro("GAVI�O ASSASSINO 2");
		  	monstro207[1].setMonstroHab(4);
		  	monstro207[1].setMonstroEner(4);
		escolha = 1;
		System.out.println(decisao(escolha, 314, 0, 0, 0).toString());
		
		Referencia r208 = new Referencia();
		this.refList[208] = (r208);
		r208.setNumero(208);
		r208.setText("Os bolsos do Goblin cont�m 2 Pe�as de Ouro, um dente de alho e alguns ossos velhos" 
		+"de articula��es. Pegue o que voc� quiser e dirija-se outra vez para o leste pela Rua do Tamanco");
		escolha = 1;
		System.out.println(decisao(escolha, 317, 0, 0, 0).toString());
		}
	}
}