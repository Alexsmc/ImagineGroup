package Negocio;

import java.util.*;



public class GerenciadorRef {

	private ArrayList <Referencia> refList = new ArrayList<Referencia>();
	private Scanner escolher;
	
	private Referencia decisao(int escolha, int opc1, int opc2, int opc3){
		
		switch (escolha) {
		case 1:
			return refList.get(opc1);
		case 2:
			return refList.get(opc2);
		default:
			return refList.get(opc3);
		}
	}
	
	public void loadRef(Personagem heroi){
			Referencia r000 = new Referencia();
			refList.add(r000);
			r000.setNumero(0);
			r000.setText("Voc� � um aventureiro em um mundo de monstros e magia, vivendo da rapidez de seu racioc�nio"
					+ "	e habilidade com a espada. Voc� ganha seu ouro como um guerreiro de aluguel, geralmente"
					+ "	empregado por nobres e bar�es ricos em miss�es perigosas ou dif�ceis demais para os pr�prios"
					+ "homens deles. Matar monstros e animais assombrosos na busca de algum tesouro fabuloso �"
					+ "coisa do cotidiano para voc�. Sendo um espadachim experimentado e altamente treinado, voc� n�o"
					+ "permite que nada se interponha em seu caminho nas suas miss�es. Seu sucesso nelas � sempre"
					+ "garantido, e sua reputa��o se espalhou pelas terras do pa�s. Sempre que voc� entra em uma aldeia"
					+ "ou cidade, a not�cia de sua chegada se propaga entre os cidad�os como fogo na floresta, j� que"
					+ "poucos deles tiveram antes a oportunidade de conhecer um matador de drag�es."
					+ "Uma noite, depois de uma longa caminhada por terras selvagens, voc� chega a Silverton, que fica"
					+ "na encruzilhada das principais estradas comerciais desta regi�o. Grandes carro��es de madeira"
					+ "puxados por juntas de bois s�o vistos freq�entemente se deslocando com lentid�o pela cidade,"
					+ "carregados de ervas, especiarias, sedas, artigos de metal e comidas ex�ticas de terras distantes."
					+ "Com o passar dos anos, Silverton havia prosperado, em conseq��ncia dos ricos mercadores e"
					+ "comerciantes que paravam l�, a caminho de mercados mais distantes. Sua riqueza � bastante"
					+ "aparente, com edif�cios ornamentados e um grande n�mero de pessoas ricamente vestidas. Mas,"
					+ "quando voc� atravessa os port�es da cidade, percebe que alguma coisa n�o est� normal. As pessoas"
					+ "parecem nervosas e desconfiadas. Em seguida, voc� nota que todas as janelas das constru��es possuem"
					+ "grandes grades de ferro fixadas sobre elas, e que as portas tamb�m foram refor�adas. Embora voc� prefira"
					+ "a sua pr�pria companhia � dos outros, decide ficar em Silverton para um pernoite, a fim de descobrir"
					+ "quem ou o qu� est� angustiando as pessoas. Quando voc� est� descendo pela rua principal, uma �nica nota"
					+ "soa, vinda de um sino em uma torre alta situada adiante. Em seguida, um homem grita, quase que"
					+ "desesperadamente: - A noite est� caindo! A noite est� caindo! Todo mundo para dentro! Voc� v� as"
					+ "pessoas correndo � sua volta com rostos ansiosos, parecendo surpresas ao verem voc�."
					+ "Do outro lado da rua, voc� v� uma taverna com as palavras - O Velho Sapo - pintadas no letreiro."
					+ "Ao entrar na taverna, voc� percebe que um sussurro percorre os presentes, pois os nativos do local o reconhecem."
					+ "Voc� fica um tanto surpreendido que nenhum deles venha at� voc� ouvir hist�rias de aventuras. Voc� anda at� o balc�o"
					+ "e pede ao velho estalajadeiro que consiga um quarto e um banho quente, mas ele ignora o que voc� disse e corre para"
					+ "a grande porta de carvalho, pondo seis trincos grandes de ferro em posi��o. S� depois ele volta-se para voc� e diz, calmamente:"
					+ "- O quarto custar� cinco pe�as de cobre e mais uma pelo banho, adiantado, por favor. "
					+ "Voc� abre uma pequena bolsa de couro presa a seu cinto e p�e as moedas no balc�o. Ele entrega a"
					+ "voc� uma chave de ferro, mas, justamente nesse momento, ouve-se algu�m batendo com for�a na "
					+ "porta, e em seguida uma voz que grita: - Abram! Abram! � Owen Carralif. O velho estalajadeiro "
					+ "desloca-se at� a porta de carvalho mais uma vez e empurra os trincos. Ent�o, um homem gordo e"
					+ "meio calvo, vestido em trajes ricos de cor escarlate, irrompe pela taverna, olhando � sua volta "
					+ "freneticamente. Ele o v� e anda rapidamente na sua dire��o, resmungando e bufando. Certamente "
					+ "n�o � um homem acostumado � pressa - voc� repara nas grandes gotas de suor em sua testa, sob a"
					+ "luz p�lida das velas do sal�o. Ao se aproximar de voc�, ele fala com urg�ncia: - Estrangeiro, preciso"
					+ "falar com voc�. Por favor, sente-se. � importante que eu fale com voc�. Quando ele se volta para o "
					+ "estalajadeiro para estalar os dedos, pedindo comida e bebida, voc� pode ver que obviamente ele � "
					+ "um homem de alguma posi��o na cidade, mas seu rosto est� cheio de ang�stia e sofrimento. Voc�, "
					+ "muito curioso, resolve ouvir o que homem tem a dizer. Ele puxa uma cadeira para voc� em uma mesa, "
					+ "pedindo que sente, enquanto o estalajadeiro traz solicitamente uma bandeja, contendo uma sopa quente,"
					+ " ganso assado e hidromel. O homem vestido de escarlate sentase � sua frente em sil�ncio, observando"
					+ " enquanto voc� come com gosto, como se o estivesse examinando com algum prop�sito seu. Finalmente,"
					+ " quando voc� afasta seu prato, o homem se inclina ligeiramente e diz, em voz baixa, mas ansiosamente:"
					+ " - Estrangeiro, eu sei tudo a seu respeito e estou querendo a sua ajuda. Meu nome � Owen Carralif,"
					+ " e sou o prefeito de Silverton. Estamos em grandes dificuldades e perigos. Vivemos sob uma maldi��o, "
					+ "e sou eu quem tem que nos livrar dela. H� dez dias atr�s, dois mensageiros do mal entraram na cidade,"
					+ " montando enormes garanh�es negros. Os animais tinham olhos ardentes e vermelhos! Era imposs�vel ver"
					+ " os rostos dos cavaleiros, pois eles usavam longas capas negras com capuzes puxados sobre seus rostos."
					+ " Suas vozes eram frias, e cada palavra dita terminava com um silvo aterrorizante. Eles perguntaram por"
					+ " mim pelo nome e, quando vim para cumpriment�-los, quiseram levar minha amada filha Mirelle para ficar "
					+ "com o senhor deles, Zanbar Bone! Sem d�vida voc� sabe que ele � o Pr�ncipe da Noite. � claro que eu "
					+ "recusei, e eles, sem dizer mais uma palavra, fizeram meia volta e sa�ram da cidade lentamente, "
					+ "com as cabe�as baixas e os ombros encolhidos. Eu entendi ent�o que, sob as capas, se escondiam os"
					+ " corpos esquel�ticos e sem alma dos Ca�adores de Esp�ritos. Zanbar Bone sempre os usa como mensageiros,"
					+ " j� que eles completam a miss�o ou morrem tentando - e n�o � muito f�cil mat�los. Somente uma flecha"
					+ " de prata no cora��o liberta estes seres do mal de sua exist�ncia eterna entre a vida e a morte. "
					+ "Quem sabe o que seria necess�rio para matar Zanbar Bone! De qualquer maneira, na mesma noite em que"
					+ "os Ca�adores de Esp�ritos partiram, nossos problemas come�aram. O Pr�ncipe da Noite ficou furioso e "
					+ "determinado a nos fazer mal. Vieram seis Cachorros da Lua, cada um deles mais forte do que quatro "
					+ "homens, cada um deles com caninos afiados como navalhas. Eles rondaram a cidade, entrando em casas "
					+ "pelas janelas abertas e matando as pobres pessoas que estavam dentro."
					+ "De manh�, n�s contamos vinte e tr�s mortos. Por isso, n�s colocamos grades nas janelas e trincos"
					+ "nas portas, mas, ainda assim, os Cachorros da Lua retomam a cada noite, e n�o conseguimos dormir"
					+ "de medo que eles encontrem um jeito de entrar nas nossas casas. Algumas pessoas agora est�o falando "
					+ "em enviar Mirelle para Zanbar Bone. Esses traidores lamurientos, eu devia mandar a�oit�los! "
					+ "Mas o que isso adiantaria? S� existe uma esperan�a, e ela reside em voc�, estrangeiro. H� um "
					+ "homem chamado Nicodemus que, por raz�es que jamais compreenderei, mora em Port Blacksand. "
					+ "O lugar � comumente chamado de Cidade dos Ladr�es, pois � o lar de todo pirata, bandido, assassino, "
					+ "ladr�o e causador de males num raio de centenas de milhas. Acho que ele mora l� justamente para se livrar de gente como n�s."
					+ "Ele � um velho e s�bio m�gico e provavelmente n�o sofre grande perigo, mesmo em Port Blacksand, pois seus poderes m�gicos s�o muito grandes."
					+ "Somente ele � capaz de derrotar Zanbar Bone. Antigamente ele era meu amigo, isso h� muitos anos."
					+ "Precisamos dele, e eu imploro a voc� que o traga at� n�s - ningu�m aqui ousa entrar em Port Blacksand. "
					+ "Voc� ser� recompensado regiamente se nos ajudar, estrangeiro. Leve estas 30 Pe�as de Ouro para a sua jornada e tome esta espada para usar e ficar para voc�. "
					+ "Quando Owen Carralif se levanta, abre a sua vestimenta escarlate, revelando a melhor espada de l�mina larga que voc� j� viu na vida. "
					+ "Ele a entrega a voc� e, ao tocar o fio da l�mina, voc� fica surpreso ao ver uma pequena gota de sangue pingar de seu dedo."
					+ "Em seguida, voc� examina as serpentes douradas maravilhosamente trabalhadas que se enroscam em torno do cabo. "
					+ "Voc� jamais quis tanto alguma coisa em sua vida antes. Voc� levanta e estende a m�o direita para Owen. "
					+ "Ele a aperta ansiosamente, dizendo: - Voc� deve partir com a primeira luz da aurora - os Cachorros da Lua j� ter�o ido embora ent�o. "
					+ "Serei for�ado a passar a noite aqui tamb�m, por isso vamos beber ao nosso destino, e que os deuses estejam conosco. "
					+ "Durante a hora que se segue, Owen fala sobre a jornada diante de voc�, explicando em detalhes como chegar Port Blacksand. "
					+ "Depois, voc� pega a sua mochila e sua peles de agasalho, sobe as escadas de madeira e vai para seu quarto. "
					+ "Voc� dorme sobressaltado, apesar da seguran�a que a sua espada nova traz, pois voc� � acordado mais de uma vez pelos uivos, "
					+ "fungadas e arranhadas nas janelas dos Cachorros da Lua que perambulam l� fora. Quando o dia nasce, voc� j� est� acordado e"
					+ "vestido, determinado a chegar a Port Blacksand rapidamente para encontrar este homem, Nicodemus. "
					+ "Ao sair da taverna, um gato preto passa correndo pelos seus p�s e voc� quase trope�a; talvez um mau press�gio!.");
			r000.setBattle(false);
			r000.setItenfound(false);
			r000.setShop(false);
			heroi.setOuro(heroi.getOuro()+30);
			System.out.println(r000.toString());
			
						
			Referencia r001 = new Referencia();
			refList.add(r001);
			r001.setNumero(1);
			r001.setText("A caminhada para Port Blacksand o leva na dire��o do oeste por uns 80 quil�metros,"
					+ "atravessando	plan�cies e subindo serras. Felizmente, n�o acontece nenhum encontro perigoso. Finalmente, voc�"
					+ "chega � costa e v� a alta muralha que circunda Port Blacksand e o aglomerado de constru��es"
					+ "que se projeta para o mar como uma feia mancha negra. H� navios ancorados no porto e fuma�a"
					+ "subindo suavemente de chamin�s. Parece suficientemente pac�fico, e somente quando o vento muda,"
					+ "trazendo o cheiro de podrid�o na brisa, voc� se lembrada natureza cruel deste lugar not�rio."
					+ "Seguindo a estrada empoeirada para o norte ao longo da costa, na dire��o dos port�es da cidade,"
					+ "voc� come�a a notar alguns sinais assustadores - cr�nios em espetos de madeira, homens"
					+ "morrendo	de fome em jaulas suspensas nas muralhas da cidade e bandeiras negras em toda parte. Ao se"
					+ "aproximar do port�o principal, um frio corre pela sua espinha, e voc� instintivamente segura o"
					+ "cabo	de sua espada para se reanimar. No port�o, voc� se depara com um guarda alto, usando uma"
					+ "cota de malha de a�o e um elmo de ferro. Ele avan�a, barrando a sua passagem com a lan�a, e diz:"
					+ "- Quem quer entrar em Port Blacksand sem ser convidado? Explique o qu� est� fazendo aqui ou volte pelo"
					+ "caminho que veio. Voc�:");
			r001.setDecisao1("Dir� a ele que quer ser levado a Nicodemus?(digite 1)");
			r001.setDecisao2("Dir� a ele que quer vender alguns objetos roubados?(digite 2)");
			r001.setDecisao3("Atacar� o guarda rapidamente com sua espada?(digite 3)");
			r001.setBattle(false);
			r001.setItenfound(false);
			r001.setShop(false);
			System.out.println(r001.toString());
			System.out.println("O que voc� far�?");
			escolher = new Scanner(System.in);
			int escolha = escolher.nextInt();
			System.out.println(decisao(escolha, 202, 33, 49).toString());
			
			Referencia r002 = new Referencia();
			refList.add(r002);
			r002.setNumero(2);
			r002.setText("Voc� retira a pulseira do seu bra�o e a joga no monstro que se aproxima. Ela cai sobre a sua"
					+ "carapa�a, semelhante a uma armadura, e gruda nela como se estivesse colada. Voc� fica ent�o"
					+ "observando enquanto a pulseira come�a a queimar, penetrando na carapa�a, o corpo da Centop�ia "
					+ "Gigante. A fuma�a sai do orif�cio exatamente redondo e, � medida em que a pulseira queima, "
					+ "penetrando cada vez mais, voc� pode ver que os movimentos fren�ticos da Centop�ia s�o os "
					+ "estertores da morte. Finalmente, ela fica im�vel, e voc� consegue se esgueirar entre seu corpo e o"
					+ "teto do t�nel. Voc� continua andando pelo t�nel, que termina em uma grade de ferro, atrav�s da "
					+ "qual passa o esgoto.");
			r002.setDecisao1("Se quiser retirar a grade, digite 1");
			r002.setDecisao2("Se preferir caminhar de volta para o buraco de entrada, digite 2");
			do{
				System.out.println("O que voc� far�?");
				escolha = escolher.nextInt();
			}while((escolha>2)||(escolha<1));;
			System.out.println(decisao(escolha, 377, 174, 0).toString());
			
			Referencia r003 = new Referencia();
			refList.add(r003);
			r003.setNumero(3);
			r003.setText("O homem p�ra de jogar e diz que ele pode lhe trazer boa sorte. Pela soma de tr�s Pe�as de Ouro,"
					+ "ele cantar� uma can��o para voc� que lhe trar� boa sorte.");
			r003.setDecisao1("Se quiser pagar o m�sico, digite 1");
			r003.setDecisao2("Se n�o acreditar nele, poder� seguir em frente para a pr�xima barraca (digite 2).");
			do{
				System.out.println("O que voc� far�?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			if(escolha == 1){
			heroi.setOuro(heroi.getOuro()-3);
			}
			System.out.println(decisao(escolha, 37, 398, 0).toString());
			
			Referencia r004 = new Referencia();
			refList.add(r004);
			r004.setNumero(4);
			r004.setText("Voc� ouve uma campainha tocar do outro lado da porta e, poucos minutos depois, ela � aberta por"
					+ "um homem magro de pele p�lida, com olhos fundos e escuros, usando um uniforme de servente."
					+ "Com uma voz fria e sibilante, ele diz: - Sim?");
			r004.setDecisao1("Se quiser dizer a ele que voc� � um via jante perdido, digite 1.");
			r004.setDecisao2("Se quiser atacar o homem com sua espada, digite 2.");
			do{
				System.out.println("O que voc� far�?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			System.out.println(decisao(escolha, 399, 35, 0).toString());
			
			Referencia r005 = new Referencia();
			refList.add(r005);
			r005.setNumero(5);
			r005.setText("Desembainhando sua espada, voc� salta por cima do balc�o para atacar o HOMEM-ORCA, que"
					+ "rapidamente pega a sua acha de m�o. Voc� logo se d� conta de que o Homem-Orca tem pr�tica"
					+ "no uso da arma dele.");
			Npc monstro005 = new Npc();
			monstro005.setNomeMonstro("Homem-Orca");
			monstro005.setMonstroEner(5);
			monstro005.setMonstroHab(8);
			System.out.println(monstro005);
			
			r005.isBattle(heroi, monstro005);
			if(r005.isBattle(heroi, monstro005)==true){
				System.out.println(r371.toString());
			}
			
			
		}
	}