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
	
	public GerenciadorRef(Personagem heroi, Mochila mochila){
		this.creatRef();
		this.heroi = heroi;
		this.mochila = mochila;
	}
	public void creatRef(){
			Referencia r000 = new Referencia();
			r000.setNumero(0);
			//System.out.println("Provisõe: "+ mochila.getProvisao());
			//System.out.println("Você pode usar provisões a qualquer momento do jogo, exceto durante as batalhas\n"
			//		+ "usar provisões recuper 4 de sua energia. \nPs. Você não pode ter mais que sua energia maxima.");
			r000.setText("\nVocê é um aventureiro em um mundo de monstros e magia, vivendo da rapidez de seu raciocínio\n"
					+ "	e habilidade com a espada. Você ganha seu ouro como um guerreiro de aluguel, geralmente\n"
					+ "	empregado por nobres e barões ricos em missões perigosas ou difíceis demais para os próprios\n"
					+ "homens deles. Matar monstros e animais assombrosos na busca de algum tesouro fabuloso é\n"
					+ "coisa do cotidiano para você. Sendo um espadachim experimentado e altamente treinado, você não\n"
					+ "permite que nada se interponha em seu caminho nas suas missões. Seu sucesso nelas é sempre\n"
					+ "garantido, e sua reputação se espalhou pelas terras do país. Sempre que você entra em uma aldeia\n"
					+ "ou cidade, a notícia de sua chegada se propaga entre os cidadãos como fogo na floresta, já que\n"
					+ "poucos deles tiveram antes a oportunidade de conhecer um matador de dragões.\n"
					+ "Uma noite, depois de uma longa caminhada por terras selvagens, você chega a Silverton, que fica\n"
					+ "na encruzilhada das principais estradas comerciais desta região. Grandes carroções de madeira\n"
					+ "puxados por juntas de bois são vistos freqüentemente se deslocando com lentidão pela cidade,\n"
					+ "carregados de ervas, especiarias, sedas, artigos de metal e comidas exóticas de terras distantes.\n"
					+ "Com o passar dos anos, Silverton havia prosperado, em conseqüência dos ricos mercadores e\n"
					+ "comerciantes que paravam lá, a caminho de mercados mais distantes. Sua riqueza é bastante\n"
					+ "aparente, com edifícios ornamentados e um grande número de pessoas ricamente vestidas. Mas,\n"
					+ "quando você atravessa os portões da cidade, percebe que alguma coisa não está normal. As pessoas\n"
					+ "parecem nervosas e desconfiadas. Em seguida, você nota que todas as janelas das construções possuem\n"
					+ "grandes grades de ferro fixadas sobre elas, e que as portas também foram reforçadas. Embora você prefira\n"
					+ "a sua própria companhia à dos outros, decide ficar em Silverton para um pernoite, a fim de descobrir\n"
					+ "quem ou o quê está angustiando as pessoas. Quando você está descendo pela rua principal, uma única nota\n"
					+ "soa, vinda de um sino em uma torre alta situada adiante. Em seguida, um homem grita, quase que\n"
					+ "desesperadamente: - A noite está caindo! A noite está caindo! Todo mundo para dentro! Você vê as\n"
					+ "pessoas correndo à sua volta com rostos ansiosos, parecendo surpresas ao verem você.\n"
					+ "Do outro lado da rua, você vê uma taverna com as palavras - O Velho Sapo - pintadas no letreiro.\n"
					+ "Ao entrar na taverna, você percebe que um sussurro percorre os presentes, pois os nativos do local o reconhecem.\n"
					+ "Você fica um tanto surpreendido que nenhum deles venha até você ouvir histórias de aventuras. Você anda até o balcão\n"
					+ "e pede ao velho estalajadeiro que consiga um quarto e um banho quente, mas ele ignora o que você disse e corre para\n"
					+ "a grande porta de carvalho, pondo seis trincos grandes de ferro em posição. Só depois ele volta-se para você e diz, calmamente:\n"
					+ "- O quarto custará cinco peças de cobre e mais uma pelo banho, adiantado, por favor. \n"
					+ "Você abre uma pequena bolsa de couro presa a seu cinto e põe as moedas no balcão. Ele entrega a\n"
					+ "você uma chave de ferro, mas, justamente nesse momento, ouve-se alguém batendo com força na \n"
					+ "porta, e em seguida uma voz que grita: - Abram! Abram! É Owen Carralif. O velho estalajadeiro \n"
					+ "desloca-se até a porta de carvalho mais uma vez e empurra os trincos. Então, um homem gordo e\n"
					+ "meio calvo, vestido em trajes ricos de cor escarlate, irrompe pela taverna, olhando à sua volta\n "
					+ "freneticamente. Ele o vê e anda rapidamente na sua direção, resmungando e bufando. Certamente \n"
					+ "não é um homem acostumado à pressa - você repara nas grandes gotas de suor em sua testa, sob a\n"
					+ "luz pálida das velas do salão. Ao se aproximar de você, ele fala com urgência: - Estrangeiro, preciso\n"
					+ "falar com você. Por favor, sente-se. É importante que eu fale com você. Quando ele se volta para o \n"
					+ "estalajadeiro para estalar os dedos, pedindo comida e bebida, você pode ver que obviamente ele é \n"
					+ "um homem de alguma posição na cidade, mas seu rosto está cheio de angústia e sofrimento. Você, \n"
					+ "muito curioso, resolve ouvir o que homem tem a dizer. Ele puxa uma cadeira para você em uma mesa, \n"
					+ "pedindo que sente, enquanto o estalajadeiro traz solicitamente uma bandeja, contendo uma sopa quente,\n"
					+ " ganso assado e hidromel. O homem vestido de escarlate sentase à sua frente em silêncio, observando\n"
					+ " enquanto você come com gosto, como se o estivesse examinando com algum propósito seu. Finalmente,\n"
					+ " quando você afasta seu prato, o homem se inclina ligeiramente e diz, em voz baixa, mas ansiosamente:\n"
					+ " - Estrangeiro, eu sei tudo a seu respeito e estou querendo a sua ajuda. Meu nome é Owen Carralif,\n"
					+ " e sou o prefeito de Silverton. Estamos em grandes dificuldades e perigos. Vivemos sob uma maldição,\n "
					+ "e sou eu quem tem que nos livrar dela. Há dez dias atrás, dois mensageiros do mal entraram na cidade,\n"
					+ " montando enormes garanhões negros. Os animais tinham olhos ardentes e vermelhos! Era impossível ver\n"
					+ " os rostos dos cavaleiros, pois eles usavam longas capas negras com capuzes puxados sobre seus rostos.\n"
					+ " Suas vozes eram frias, e cada palavra dita terminava com um silvo aterrorizante. Eles perguntaram por\n"
					+ " mim pelo nome e, quando vim para cumprimentá-los, quiseram levar minha amada filha Mirelle para ficar \n"
					+ "com o senhor deles, Zanbar Bone! Sem dúvida você sabe que ele é o Príncipe da Noite. É claro que eu \n"
					+ "recusei, e eles, sem dizer mais uma palavra, fizeram meia volta e saíram da cidade lentamente, \n"
					+ "com as cabeças baixas e os ombros encolhidos. Eu entendi então que, sob as capas, se escondiam os\n"
					+ " corpos esqueléticos e sem alma dos Caçadores de Espíritos. Zanbar Bone sempre os usa como mensageiros,\n"
					+ " já que eles completam a missão ou morrem tentando - e não é muito fácil matálos. Somente uma flecha\n"
					+ " de prata no coração liberta estes seres do mal de sua existência eterna entre a vida e a morte. \n"
					+ "Quem sabe o que seria necessário para matar Zanbar Bone! De qualquer maneira, na mesma noite em que\n"
					+ "os Caçadores de Espíritos partiram, nossos problemas começaram. O Príncipe da Noite ficou furioso e \n"
					+ "determinado a nos fazer mal. Vieram seis Cachorros da Lua, cada um deles mais forte do que quatro \n"
					+ "homens, cada um deles com caninos afiados como navalhas. Eles rondaram a cidade, entrando em casas \n"
					+ "pelas janelas abertas e matando as pobres pessoas que estavam dentro.\n"
					+ "De manhã, nós contamos vinte e três mortos. Por isso, nós colocamos grades nas janelas e trincos\n"
					+ "nas portas, mas, ainda assim, os Cachorros da Lua retomam a cada noite, e não conseguimos dormir\n"
					+ "de medo que eles encontrem um jeito de entrar nas nossas casas. Algumas pessoas agora estão falando\n "
					+ "em enviar Mirelle para Zanbar Bone. Esses traidores lamurientos, eu devia mandar açoitálos! \n"
					+ "Mas o que isso adiantaria? Só existe uma esperança, e ela reside em você, estrangeiro. Há um \n"
					+ "homem chamado Nicodemus que, por razões que jamais compreenderei, mora em Port Blacksand. \n"
					+ "O lugar é comumente chamado de Cidade dos Ladrões, pois é o lar de todo pirata, bandido, assassino, \n"
					+ "ladrão e causador de males num raio de centenas de milhas. Acho que ele mora lá justamente para se livrar de gente como nós.\n"
					+ "Ele é um velho e sábio mágico e provavelmente não sofre grande perigo, mesmo em Port Blacksand, pois seus poderes mágicos são muito grandes.\n"
					+ "Somente ele é capaz de derrotar Zanbar Bone. Antigamente ele era meu amigo, isso há muitos anos.\n"
					+ "Precisamos dele, e eu imploro a você que o traga até nós - ninguém aqui ousa entrar em Port Blacksand. \n"
					+ "Você será recompensado regiamente se nos ajudar, estrangeiro. Leve estas 30 Peças de Ouro para a sua jornada e tome esta espada para usar e ficar para você. \n"
					+ "Quando Owen Carralif se levanta, abre a sua vestimenta escarlate, revelando a melhor espada de lâmina larga que você já viu na vida. \n"
					+ "Ele a entrega a você e, ao tocar o fio da lâmina, você fica surpreso ao ver uma pequena gota de sangue pingar de seu dedo.\n"
					+ "Em seguida, você examina as serpentes douradas maravilhosamente trabalhadas que se enroscam em torno do cabo. \n"
					+ "Você jamais quis tanto alguma coisa em sua vida antes. Você levanta e estende a mão direita para Owen. \n"
					+ "Ele a aperta ansiosamente, dizendo: - Você deve partir com a primeira luz da aurora - os Cachorros da Lua já terão ido embora então. \n"
					+ "Serei forçado a passar a noite aqui também, por isso vamos beber ao nosso destino, e que os deuses estejam conosco. \n"
					+ "Durante a hora que se segue, Owen fala sobre a jornada diante de você, explicando em detalhes como chegar Port Blacksand. \n"
					+ "Depois, você pega a sua mochila e sua peles de agasalho, sobe as escadas de madeira e vai para seu quarto. \n"
					+ "Você dorme sobressaltado, apesar da segurança que a sua espada nova traz, pois você é acordado mais de uma vez pelos uivos, \n"
					+ "fungadas e arranhadas nas janelas dos Cachorros da Lua que perambulam lá fora. Quando o dia nasce, você já está acordado e\n"
					+ "vestido, determinado a chegar a Port Blacksand rapidamente para encontrar este homem, Nicodemus. \n"
					+ "Ao sair da taverna, um gato preto passa correndo pelos seus pés e você quase tropeça; talvez um mau presságio!.");
			this.refList[0] = r000;
			
						
			Referencia r001 = new Referencia();
			this.refList[1] = r001;
			r001.setNumero(1);
			r001.setText("A caminhada para Port Blacksand o leva na direção do oeste por uns 80 quilômetros,\n"
					+ "atravessando	planícies e subindo serras. Felizmente, não acontece nenhum encontro perigoso.\n Finalmente, você"
					+ "chega à costa e vê a alta muralha que circunda Port Blacksand e o aglomerado de construções\n"
					+ "que se projeta para o mar como uma feia mancha negra. Há navios ancorados no porto e fumaça\n"
					+ "subindo suavemente de chaminés. Parece suficientemente pacífico, e somente quando o vento muda,\n"
					+ "trazendo o cheiro de podridão na brisa, você se lembrada natureza cruel deste lugar notório.\n"
					+ "Seguindo a estrada empoeirada para o norte ao longo da costa, na direção dos portões da cidade,\n"
					+ "você começa a notar alguns sinais assustadores - crânios em espetos de madeira, homens\n"
					+ "morrendo	de fome em jaulas suspensas nas muralhas da cidade e bandeiras negras em toda parte.\n Ao se"
					+ "aproximar do portão principal, um frio corre pela sua espinha, e você instintivamente segura o\n"
					+ "cabo	de sua espada para se reanimar. No portão, você se depara com um guarda alto, usando uma\n"
					+ "cota de malha de aço e um elmo de ferro. Ele avança, barrando a sua passagem com a lança, e diz:\n"
					+ "- Quem quer entrar em Port Blacksand sem ser convidado? Explique o quê está fazendo aqui ou volte pelo\n"
					+ "caminho que veio. Você:\n"
					+ "Dirá a ele que quer ser levado a Nicodemus?(digite 1)\n"
					+ "Dirá a ele que quer vender alguns objetos roubados?(digite 2)\n"
					+ "Atacará o guarda rapidamente com sua espada?(digite 3)");
			
			Referencia r002 = new Referencia();
			this.refList[2] = (r002);
			r002.setNumero(2);
			r002.setText("Você retira a pulseira do seu braço e a joga no monstro que se aproxima. Ela cai sobre a sua\n"
					+ "carapaça, semelhante a uma armadura, e gruda nela como se estivesse colada. Você fica então\n"
					+ "observando enquanto a pulseira começa a queimar, penetrando na carapaça, o corpo da Centopéia\n "
					+ "Gigante. A fumaça sai do orifício exatamente redondo e, à medida em que a pulseira queima, \n"
					+ "penetrando cada vez mais, você pode ver que os movimentos frenéticos da Centopéia são os \n"
					+ "estertores da morte. Finalmente, ela fica imóvel, e você consegue se esgueirar entre seu corpo e o\n"
					+ "teto do túnel. Você continua andando pelo túnel, que termina em uma grade de ferro, através da\n "
					+ "qual passa o esgoto.\n"
					+ "Se quiser retirar a grade, (Digite 1)\n"
					+ "Se preferir caminhar de volta para o buraco de entrada, (Digite 2)");
						
			Referencia r003 = new Referencia();
			this.refList[3] = (r003);
			r003.setNumero(3);
			r003.setText("O homem pára de jogar e diz que ele pode lhe trazer boa sorte. Pela soma de três Peças de Ouro,\n"
					+ "ele cantará uma canção para você que lhe trará boa sorte.\n"
					+ "Se quiser pagar o músico, (digite 1).\n"
					+ "Se não acreditar nele, poderá seguir em frente para a próxima barraca (digite 2).");
						
			Referencia r004 = new Referencia();
			this.refList[4] = (r004);
			r004.setNumero(4);
			r004.setText("Você ouve uma campainha tocar do outro lado da porta e, poucos minutos depois, ela é aberta por\n"
					+ "um homem magro de pele pálida, com olhos fundos e escuros, usando um uniforme de servente.\n"
					+ "Com uma voz fria e sibilante, ele diz: - Sim?\n"
					+ "Se quiser dizer a ele que você é um viajante perdido, (Digite 1).\n"
					+ "Se quiser atacar o homem com sua espada, (Digite 2).\n");
						
			Referencia r005 = new Referencia();
			this.refList[5] = (r005);
			r005.setNumero(5);
			Npc monstro005 = new Npc();
			r005.setMonstro(monstro005);
			monstro005.setNomeMonstro("Homem-Orca");
			monstro005.setMonstroEner(5);
			monstro005.setMonstroHab(8);
			r005.setText("Desembainhando sua espada, você salta por cima do balcão para atacar o HOMEM-ORCA, que\n"
					+ "rapidamente pega a sua acha de mão. Você logo se dá conta de que o Homem-Orca tem prática\n"
					+ "no uso da arma dele.\n" + monstro005.toString());
				
			Referencia r006 = new Referencia();
			this.refList[6] = (r006);
			r006.setNumero(6);
			r006.setText("Seu tom de voz se torna desagradável, e ela diz para você sair da casa dela, "
					+ "porque certamente não há trapos lá, nem, falando nisso, qualquer outro tipo de rebotalho.\nSe quiser obedecê-ela, saia da"
					+ "casa e siga adiante para o norte, ao longo da Rua do Estábulo.(Digite 1) 333.\nSe quiser atravessar as"
					+ "cortinas e ver quem está sendo tão rude com você, (Digite 2) vá para 88.");
			
			
			Referencia r007 = new Referencia();
			this.refList[7] = (r007);
			r007.setNumero(7);
			r007.setText("Você sai do aposento na ponta dos pés e fecha a porta. No corredor, você abre a bolsa e encontra\n"
					+ "seis pérolas negras. Some 2 pontos de SORTE. \nSe você ainda não o tiver feito, poderá abrir a outra\n"
					+ "porta (Digite 1)\n ou sair do navio para continuar a sua busca em Port Blacksand, caminhando\n"
					+ "para o norte pela Rua do Porto (Digite 2).");
						
			Referencia r008 = new Referencia();
			this.refList[8] = (r008);
			r008.setNumero(8);
			r008.setText("A criatura põe o broche dourado na sua túnica de couro, e você paga o preço pedido.\n Você comprou"
					+ "um amuleto da sorte - some 2 pontos de SORTE ao seu total. \nFeliz com a sua aquisição, você sai da"
					+ "casa e segue para o norte.");
						
			Referencia r009 = new Referencia();
			this.refList[9] = (r009);
			r009.setNumero(10);
			r009.setText("Você se afasta do corpo vil de Zanbar Bone, esperando que ele comece a se decompor. Porém, você"
					+ "escolheu errado!\nEle tira a flecha de seu peito e esfrega os olhos, retirando o composto. Ele vê você"
					+ "e ri.\nVocê está hipnotizado pelo seu poder e incapaz de se mexer. Ele caminha até você e toca seu"
					+ "rosto com seus dedos de esqueleto.\nSua vida está sendo rapidamente sugada e logo você iniciará sua"
					+ "existência de morto-vivo a serviço de Zanbar Bone. (Game Over)");
			
			Referencia r010 = new Referencia();
			this.refList[10] = (r010);
			r010.setNumero(10);
			Npc monstro010 = new Npc();
			r010.setMonstro(monstro010);
			monstro010.setNomeMonstro("GUARDA DA CIDADE");
			monstro010.setMonstroHab(7);
			monstro010.setMonstroEner(8);
			r010.setText("O GUARDA está realmente aborrecido e o ataca com sua lança.\n"+ monstro010.toString());
			
			/*int round=0;
			do{
        		Random d = new Random();
        		int dado1 = d.nextInt(12)+2;
       		System.out.println(monstro010.getNomeMonstro() + "Ataca com: " + (dado1 + monstro010.getMonstroHab()) + "de Força");
        		int dado2 = d.nextInt(12)+2;
        		System.out.println(heroi.getNome() + "Ataca com " + (dado2 + heroi.getHabilidade()) + "de Força");
        			
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
	        	System.out.println("Você derrotou a criatura");
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
			r011.setText("Os Trolls vêem o que você está fazendo e correm na direção da árvore. Você é forçado a deixar seu\n"
					+ "escudo para trás. Perde, com isso, 1 ponto de HABILIDADE. Depois de subir rapidamente na\n"
					+ "árvore, você se dá conta de que terá que pular uma distância de dois metros entre o galho e o topo\n"
					+ "da muralha. Se estiver usando uma cota de malha de aço, você terá que tirá-la para pular com\n"
					+ "segurança sobre a muralha (você perde 2 pontos de HABILIDADE). Abaixo, você vê os dois Trolls\n"
					+ "correndo em volta da árvore, agitando as espadas na sua direção. Não há alternativa, a não ser pular.");
			
			Referencia r012 = new Referencia();
			this.refList[12] = (r012);
			r012.setNumero(12);
			r012.setText("Passados alguns minutos, você ouve passos que vêm descendo o corredor. A porta se abre, e um\n"
					+ " homem entra no aposento, usando como única vestimenta uma toalha enrolada em volta de seu\n"
					+ " estômago gordo. Você observa enquanto ele deixa cair a toalha e se abaixa lentamente na banheira\n"
					+ "com um suspiro alto.\n Se quiser surpreendê-lo, desembainhando a espada e falando - Ahá! bem alto,"
					+ "(Digite 1). \nSe preferir se esgueirar para fora do aposento de volta para o corredor enquanto ele\n"
					+ "submerge, (Digite 2).");
						
			Referencia r013 = new Referencia();
			this.refList[13] = (r013);
			r013.setNumero(13);
			r013.setText("Ao inspecionar o escorpião, você vê que é um broche. Você decide pô-lo na sua túnica de couro. O"
					+ "broche possui propriedades curativas mágicas: depois de qualquer batalha, o broche imediatamente"
					+ "recuperará 1 ponto de ENERGIA para o seu total. O que você fará em seguida?"
					+ "Você pode, se ainda não o tiver feito, pegar o escorpião dourado (Digite 1)."
					+ "Se preferir ignorá-lo, poderá subir as escadas (Digite 2), "
					+ "ou sair da casa e seguir para o norte (Digite 3).");
						
			Referencia r014 = new Referencia();
			this.refList[14] = (r014);
			r014.setNumero(14);
			r014.setText("Logo que você pega uma das flores, ouve o barulho de folhas em movimento. Três das cercas\n"
					+ " vegetais com forma de animais se desenraizaram e estão se aproximando de você.");
						
			Referencia r015 = new Referencia();
			this.refList[15] = (r015);
			r010.setNumero(15);
			r015.setText("Você salta por cima das serpentes e corre para a porta. Teste sua Sorte!");
			/*boolean lucky = heroi.usarSorte(heroi.getSorteAtual());
			if(lucky == true){
				System.out.println("Você teve sorte e chega até a porta em segurança!");
				System.out.println(r075.toString());
			}else{
				System.out.println("Você não teve sorte e uma das serpentes dá um bote e "
					+ "morde a sua perna");
				System.out.println(r298.toString());
			}*/
			
			Referencia r016 = new Referencia();
			this.refList[16] = (r016);
			r016.setNumero(16);
			r016.setText("A bolsa contém 12 Peças de Ouro. Some 1 ponto de SORTE. Você sai da casa rapidamente, antes "
					+ "que o proprietário descubra que você não é quem você diz ser. Você então segue adiante para o "
					+ "norte, ao longo da Rua do Estábulo.");
						
			Referencia r017 = new Referencia();
			this.refList[17] = (r017);
			r017.setNumero(17);
			r017.setText("Caminhando pela rua estreita, você vê um homem usando trapos esfarrapados sentado na sarjeta.\n "
					+ "Tem a cabeça enfiada nas mãos e a aparência totalmente miserável.\nSe quiser parar para falar com "
					+ "ele, (Digite 1). \nSe preferir continuar a caminhar para o oeste, (Digite 2).");
			
			
			Referencia r018 = new Referencia();
			this.refList[18] = (r018);
			r010.setNumero(18);
			r018.setText("Você mira cuidadosamente e lança a faca no vagabundo da frente.");
			
			/*Random d = new Random();
			int testeForca = d.nextInt(12)+2;
			if(testeForca<=heroi.getHabilidade()){
				System.out.println("a faca penetra profundamente no "
					+ "peito do vagabundo, fazendo com que ele interrompa seus passos e caia morto.");
				System.out.println(r102.toString());
			}else{
				System.out.println("a faca passa voando pelo alvo, e você terá "
					+ "que lutar contra os três vagabundos com sua espada.");
				System.out.println(r225.toString());
			}*/
			
			Referencia r019 = new Referencia();
			this.refList[19] = (r019);
			r019.setNumero(19);
			r019.setText("Os dardos têm a ponta envenenada. Você perde 4 pontos de ENERGIA e 1 ponto de "
					+ "HABILIDADE.");
			
			/*heroi.setHabilidade(heroi.getHabilidade()-1);
			heroi.setEnergiaAtual(heroi.getEnergiaAtual()-4);
			if(heroi.getEnergiaAtual()<=0){
				System.out.println(r401.toString());
			}
			System.out.println("Se você ainda estiver vivo e quiser continuar a tentar abrir a fecha dura, vá para "
					+ "340. \nSe você preferir sair do aposento e subir as escadas para o andar de cima, vá para 60.");
			do{
				System.out.println("O que você fará?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			System.out.println(decisao(escolha, 340, 60, 0).toString());*/
			
			Referencia r020 = new Referencia();
			this.refList[20] = (r020);
			r020.setNumero(20);
			r020.setText("Os bolsos do pirata contêm apenas um pedaço de pão azedo. Você o larga para começar a "
					+ "examinaras caixas de madeira e os barris no convés do navio (vá para 84).");
			
			Referencia r021 = new Referencia();
			this.refList[21] = (r021);
			r021.setNumero(21);
			r021.setText("Olhando para cima, você vê que a escada continua direto até o topo da torre. Você pára no primeiro\n"
					+ " andar e anda pelo patamar até uma porta. A porta abre para um aposento grande, onde há uma cama\n "
					+ "feita bem confortável. Se quiser trancar a porta e dormir essa noite ali, vá para 288(Digite 1). Se quiser\n "
					+ "explorar a torre mais adiante, vá para 77(Digite 2).");
			
			Referencia r022 = new Referencia();
			this.refList[22] = (r022);
			r022.setNumero(22);
			Npc monstro22um = new Npc();
			Npc monstro22dois = new Npc();
			Npc[] monstro22 = new Npc[2];
			monstro22[0] = (monstro22um);
			monstro22[1] = (monstro22dois);
			monstro22[0].setNomeMonstro("Goblin um");
			monstro22[0].setMonstroHab(4);
			monstro22[0].setMonstroEner(5);
			monstro22[1].setNomeMonstro("Goblin dois");
			monstro22[1].setMonstroHab(4);
			monstro22[1].setMonstroEner(5);
			r022.setText("Quando você se senta à mesa, os GOBLINS param de discutir e olham friamente para você. \nVocê "
					+ "vê o ódio em seus rostos pardos cheios de verrugas. De repente, eles se levantam e desembainham "
					+ "suas espadas.\n Você terá que lutar com um de cada vez.\n"+ monstro22[0].toString() + monstro22[1].toString()
					+ "Se você vencer, vá para 198.");
			

			Referencia r023 = new Referencia();
			this.refList[23] = (r023);
			r023.setNumero(23);
			Npc monstro023 = new Npc();
			r023.setMonstro(monstro023);
			monstro023.setNomeMonstro("OURIVERES DE PRATA");
			monstro023.setMonstroHab(4);
			monstro023.setMonstroEner(8);
			r023.setText("O homem pega uma clava de madeira atrás de uma cadeira e se prepara para lutar contra você.\n"
					+ "Ele é forte, mas não é bom de luta.\n"+monstro023.toString()+"\nSe você vencer, vá para 146.");
			
			Referencia r024 = new Referencia();
			this.refList[24] = (r024);
			r024.setNumero(24);
			r024.setText("Há uma outra loja do lado esquerdo da rua. Uma grade de ferro na janela impede que você veja "
					+ "que tipo de loja é. \nVocê tenta a maçaneta da porta e ela gira. \nSe quiser entrar na loja, vá para 336.(Digite 1) "
					+ "\nSe quiser continuar para o oeste, sem olhar para a loja, vá para 196.(Digite 2)");
			
			
			Referencia r025 = new Referencia();
			this.refList[25] = (r025);
			r025.setNumero(25);
			r025.setText("Você logo se dá conta de que está em um estábulo ao ver um homem grande, de peito nu, usando\n "
					+ "um avental branco imundo, trabalhando junto a um fogo. Ele pega uma barra de ferro incandescente\n "
					+ "do fogo com sua mão protegida por luva e principia a martelá-la para que pegue a forma de uma\n "
					+ "ferradura na sua bigorna. O suor se derrama da sua testa enquanto ele labuta com o martelo.Você:\n"
					+ "Começa a conversar com o ferreiro? Vá para 169(Digite 1)\n"
					+ "Ataca-o com sua espada? Vá para 323(Digite 2)\n"
					+ "Deixa-o com suas ocupações e continua para o norte?Vá para 115(Digite 3)\n");
			
			Referencia r026 = new Referencia();
			this.refList[26] = (r026);
			r026.setNumero(26);
			r026.setText("Você embainha a sua espada e olha à sua volta para o círculo de espectadores. Tendo"
					+ "testemunhado sua excelente técnica de espadachim, cada um deles volta em silêncio para sua mesa, não"
					+ "querendo provocá-lo mais. O estalajadeiro se desculpa por sua falta de amabilidade e convida você a se"
					+ "sentar no bar e desfrutar de uma bebida por conta dele. Você pergunta se ele sabe do paradeiro de "
					+ "Nicodemus. O estalajadeiro franze a testa e olha para você de forma inquisitiva. Depois, diz: -Não "
					+ "sei o que você quer com aquele velho mágico manhoso. Ele não quer conversa com ninguém e mora "
					+ "sozinho em uma cabana pequena embaixo da Ponte Cantora. Vá andando sempre para o norte pela "
					+ "Rua do Mercado, atravesse a área do mercado e você chegará a uma ponte que liga as margens do "
					+ "Rio Peixe-Gato e leva à parte velha da cidade e ao porto. Nicodemus não vai falar com você e ele"
					+ "conhece mágica suficiente para manter longe de sua porta mesmo os mais valentes. Você diz ao"
					+ "estalajadeiro para não ser tão descortês com estranhos da próxima vez, e sai da taverna para se"
					+ "dirigir ao norte (vá para 296).");
			
			Referencia r027 = new Referencia();
			this.refList[27] = (r027);
			r027.setNumero(27);
			r027.setText("Você entra em um pequeno aposento iluminado à luz de vela e sem janelas. Ele está vazio, a não ser\n"
					+ "por uma mesa e duas cadeiras. Um homem usando um capuz-apertado e roupas pretas está de pé em\n"
					+ "um dos cantos. Ele sorri e pede que você se sente à mesa. Ele se senta à sua frente e, depois de pôr\n"
					+ "seis pílulas sobre seis caveiras na mesa, olha para você e diz: - Uma das pílulas à sua frente é\n"
					+ "veneno mortal, as outras são inofensivas. Engula uma à sua escolha. Se você viver, eu lhe darei 20 \n"
					+ "Peças de Ouro. Se você morrer, eu ficarei com todas as suas posses. \nSe você quiser participar deste "
					+ "jogo fatal, vá para 223.(Digite 01) \nSe preferir sair do aposento e andar de volta pela alameda para a Rua da "
					+ "Vela, vá para 165.(Digite 2)");
			
			Referencia r028 = new Referencia();
			this.refList[28] = (r028);
			r028.setNumero(28);
			r028.setText("Enquanto você estava lutando com as Ratazanas Gigantes, teve a impressão de ter visto alguém ou \n"
					+ "alguma coisa esgueirar-se nas sombras à sua frente. \nSe quiser continuar na direção norte pelo túnel,"
					+ "vá para 265.(Digite 2) \nSe preferir dar meia volta e caminhar de novo para o bueiro de entrada, vá para 104.(Digite 2)");
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r029.setNumero(29);
			r029.setText("Você se acocora no colchão e pensa no que fazer em seguida. \nSe quiser fingir que está doente e "
					+ "jogar o balde de ferro de encontro às barras da cela para atrair \na atenção dos guardas, vá para 143.(Digite 1)"
					+ "\nSe quiser inspecionar a cela em detalhe, na esperança de encontrar um caminho de fuga secreto, vá para 230.(Digite 2)");
			
			Referencia r030 = new Referencia();
			this.refList[30] = (r030);
			r030.setNumero(30);
			r030.setText("A Rua da Torre logo termina em um cruzamento, onde encontra a Rua do Estábulo, pela qual você \n"
					+ "pode ir para o norte ou para o sul. Você resolve ir para o norte (vá para 76).");
			
			Referencia r031 = new Referencia();
			this.refList[31] = (r031);
			r031.setNumero(31);
			r031.setText("À sua frente, há uma ponte de madeira que se estende sobre um rio sujo. Muito lixo desce flutuando \n"
					+ "na direção do mar sobre sua superfície escura, e você fica chocado ao ver uma mão humana \n"
					+ "passando à sua frente. As colunas de sustentação da ponte se erguem bem acima dela, e você vê \n"
					+ "caveiras, humanas e não humanas, amarradas nelas. O vento faz um barulho lúgubre, assobiando \n"
					+ "entre as estruturas da ponte, lembrando almas torturadas que gritassem por ajuda. Quase encoberto \n"
					+ "no campo visual, há um pequeno lance de escadas que desce para baixo da ponte a partir do lugar \n"
					+ "onde você está. Um homem de uma perna só, carregando um saco, está atravessando a ponte, vindo \n"
					+ "da margem norte. \nSe quiser descer as escadas, vá para 329.(Digite 1) \nSe quiser esperar para falar com o "
					+ "homem, vá para 364.(Digite 1)");
			
			Referencia r032 = new Referencia();
			this.refList[32] = (r032);
			r032.setNumero(32);
			r032.setText("Antes de você chegar à porta, a Rainha Serpente estica o corpo e morde você no pescoço, causando "
					+ "a perda de 4 pontos de ENERGIA e 1 ponto de HABILIDADE. Se você ainda estiver vivo, puxa a "
					+ "espada para atacar a Rainha Serpente (vá para 249).");
			
			Referencia r033 = new Referencia();
			this.refList[33] = (r033);
			r033.setNumero(33);
			r033.setText("Você diz ao guarda que gostaria de vender uns cálices de Prata que roubou de uma taverna em \n"
					+ "Silverton, e que você pagará uma Peça de Ouro pela informação de onde vender pelo melhor preço. \n"
					+ "O guarda olha para você desconfiado, dizendo: “Deixe-me ver estes cálices na sua mochila antes de \n"
					+ "deixar você entrar.” Você: \nDirá que você sabe que os cálices são Amaldiçoados e que só devem ser examinados por um mago?"
					+ "Vá para 381(Digite 1). \nTentará passar correndo pelo guarda e chegar à rua principal? Vá para 291 (Digite 2). \n"
					+ "Atacará o guarda rapidamente com sua espada? Vá para 49\n");
			
			Referencia r034 = new Referencia();
			this.refList[34] = (r034);
			r034.setNumero(34);
			r034.setText("A carruagem passa com estrondo, e você vê que o cocheiro está forçando os cavalos a correr, \n"
					+ "como se a sua própria vida dependesse disso. Quando o ruído da carruagem vai sumindo na distância, \n"
					+ "você sai para a rua e continua na direção oeste (vá para 171).");
			
			Referencia r035 = new Referencia();
			this.refList[35] = (r035);
			r035.setNumero(35);
			r035.setText("Você empurra o homem pela porta e crava a espada nele. Para sua grande surpresa, ele não \n"
					+ "parece afetado com o ferimento. Lentamente, ele avança na sua direção, tentando tocar a sua pele com \n"
					+ "suas mãos de esqueleto decompostas. Ele agarra seu braço, mas você consegue chutá-lo para longe. \n"
					+ "Fica no seu braço uma marca, como se fosse uma queimadura, mas que solta um cheiro nauseabundo \n"
					+ "de carne podre. Você perde 2 pontos de ENERGIA. Então, você compreende que está diante de um \n"
					+ "Caçador de Espíritos, um dos servidores fiéis de Zanbar Bone. Enquanto ele avança novamente na \n"
					+ "sua direção com os braços estendidos, você tenta se lembrar do que deve fazer. Você:\n"
					+ "Disparará a seta de prata nele? Vá para 189(Digite 1).\n"
					+ "Refletirá seu olhar em um espelho (se você tiver um)? Vá para 305(Digite 2).\n"
					+ "Disparará seu Anel de Gelo nele (se você tiver um)? Vá para 382(Digite 3).");
			
			Referencia r036 = new Referencia();
			this.refList[36] = (r036);
			r036.setNumero(36);
			r036.setText("O homem se debruça sobre o balcão e lhe diz que um Anel de Invisibilidade custa 10 Peças de\n "
					+ "Ouro, um Anel de Fogo custa 8 Peças de Ouro, e um Anel de Gelo custa 7 Peças de Ouro. Se você \n"
					+ "quiser comprar um dos anéis, faça o necessário desconto na sua Folha de Aventuras. Dizendo adeus \n"
					+ "ao homem, você põe o anel no dedo e sai da loja para se dirigir para o oeste (vá para 196).");
			
			Referencia r037 = new Referencia();
			this.refList[37] = (r037);
			r037.setNumero(37);
			r037.setText("O homem dedilha sua lira e canta uma canção alegre, toda sobre você e a sua sorte - ele realmente"
					+ "tem o poder de fazê-lo ter sorte. \nAcrescente 2 pontos de SORTE e siga adiante para a próxima barraca (vá para 398).");
			
			Referencia r038 = new Referencia();
			this.refList[38] = (r038);
			r038.setNumero(38);
			r038.setText("Um dos homens põe a mão no bolso interno de seu casaco verde e tira uma fina pulseira de prata.\n"
					+ "Ele a entrega a você, que repara no perfil de um inseto gravado na sua superfície. O homem \n"
					+ "explica que a pulseira do inseto tem o poder de matar mesmo insetos gigantes. Depois de colocar a\n"
					+ "pulseira no pulso, você sai da taverna e se dirige de novo para o norte (vá para 296).");
			
			Referencia r039 = new Referencia();
			this.refList[39] = (r039);
			r039.setNumero(39);
			r039.setText("Você abre sua mochila e finge procurar o objeto de prata. A Rainha Serpente começa a ficar \n"
					+ "inquieta, e você nota que sua impaciência aumenta cada vez mais. Você não consegue pensar em "
					+ "um bom plano e começa a entrar em pânico. \nSe quiser correr para a porta da frente, volte para 32.(Digite 1)\n"
					+ "Se quiser desembainhar a espada para atacar a Rainha Serpente, vá para 249.(Digite 2)");
			
			Referencia r040 = new Referencia();
			this.refList[40] = (r040);
			r040.setNumero(40);
			r040.setText("Do alto da muralha, você vê que ela circunda um grupo de criaturas de cor marrom, jogando algum\n"
					+ "tipo de jogo com um taco de madeira e uma pequena bola de couro. Uma das criaturas acabou de \n"
					+ "bater na bola e está correndo na direção de uma criatura que tem o pé em um saco de couro e \n"
					+ "pertence ao outro time. Você se dá conta de que estas criaturas são Beises jogando seu jogo "
					+ "favorito, Beisebol.\nSe quiser pedir para entrar no jogo, vá para 168.(Digite 1) \nSe preferir descer a muralha de"
					+ "volta, retornar ao cruzamento e se dirigir para o oeste, descendo a Rua do Porto, vá para 91.(Digite 2)");
			
			Referencia r041 = new Referencia();
			this.refList[41] = (r041);
			r041.setNumero(41);
			r041.setText("Os dois guardas que estão segurando você se entreolham e depois consultam o outro guarda para \n"
					+ "chegar a uma decisão. Ele faz um sinal com a cabeça e eles soltam você. Quando você paga a ele as\n"
					+ "15 Peças de Ouro, ele olha para você de modo penetrante, dizendo: - Se Lord Azzur descobrir que \n"
					+ "você está na cidade sem um passe, vai se arrepender de ter nascido. Se eu fosse você, arrumaria um.\n"
					+ "E quanto a Nicodemus, ache-o sozinho. \nReprimindo seu impulso de puxar a espada, você se vira e "
					+ "caminha para o interior da cidade (vá para 74).");
			
			Referencia r042 = new Referencia();
			this.refList[42] = (r042);
			r042.setNumero(42);
			r042.setText("Você diz ao homem que não pode pagar o preço que ele está pedindo. Ele sacode os ombros e diz:\n"
					+ "- Bom, você tem alguma comida? Você abre sua mochila, e ele leva todas as Provisões que lhe \n"
					+ "restam. Ele então começa a fundir a sua flecha de prata, e você espera pacientemente que ele a faça.\n"
					+ "Finalmente, ele a entrega a você e assegura que ela será precisa no disparo. Você agradece pelo \n"
					+ "trabalho que ele teve e sai da loja. Do lado de fora, você parte novamente na direção leste (vá para 100).");
			
			Referencia r043 = new Referencia();
			this.refList[43] = (r043);
			r043.setNumero(43);
			r043.setText("Você grita de dor quando a taça se transforma em um carvão incandescente na sua mão, e fica \n"
					+ "seriamente queimado, perdendo 2 pontos de HABILIDADE e 2 pontos de SORTE. \nSe ainda não o "
					+ "tiver feito, poderá erguer a taça A (vá para 115)(Digite 1) ou a taça B (vá para 209)(Digite 2). \nSe não estiver"
					+ "interessado nas taças, você poderá caminhar pela passagem em arco (vá para 107)(Digite 3), \nou subir as escadas (vá para 60)(Digite 4).");
			
			Referencia r044 = new Referencia();
			this.refList[44] = (r044);
			r044.setNumero(44);
			r044.setText("De pé, em linha perpendicular à rua, há três homens, cada um deles armado com uma clava de \n"
					+ "ponta afiada. Você repara que os três possuem uma estrela vermelha tatuada na testa. \n"
					+ "São vagabundos cuja intenção é roubar você. \nSe você tiver uma Faca de Lançamento, poderá se livrar de "
					+ "um deles antes que eles cheguem a você (volte para 18). \nSe não tiver, você terá que enfrentar todos três com sua espada (vá para 225).");
			
			Referencia r045 = new Referencia();
			this.refList[45] = (r045);
			r045.setNumero(45);
			r045.setText("A bola de vidro se parte com o impacto na rua calçada de pedra. Em contato com o ar, a fumaça \n"
					+ "passa a ter uma coloração dourada e começa a tomar a forma de um elmo com asas. \nO elmo se "
					+ "solidifica e pousa na rua, faiscando sob a luz do sol. É o elmo mais fantástico que você "
					+ "já viu em sua vida. \nSe quiser colocá-lo em sua cabeça, vá para 376(Digite 1). \nSe preferir deixá-lo onde está e partir"
					+ "para o leste de novo, vá para 161.(Digite 2)");
			
			Referencia r046 = new Referencia();
			this.refList[46] = (r046);
			r046.setNumero(46);
			r046.setText("O ferreiro pega o seu dinheiro e caminha na direção de uns fardos de feno no canto. Ele levanta um \n"
					+ "deles e, embaixo disso, você vê a cota de malha de aço. Ele se vira para você e diz: - É preciso esconder \n"
					+ "tudo neste lugar. Não se pode confiar em ninguém. A cota serve perfeitamente em você, e a qualidade do \n"
					+ "trabalho é excelente. Acrescente 2 pontos de HABILIDADE. Você sai dos estábulos com sua armadura nova e \n"
					+ "continua para o norte (vá para 115).");
			
			Referencia r047 = new Referencia();
			this.refList[47] = (r047);
			r047.setNumero(47);
			r047.setText("O dardo-relâmpago estoura em seu peito e atira você ao chão. Você perde 3 pontos de ENERGIA.\n"
					+ "Se ainda estiver vivo, você verá o homem gordo às gargalhadas. Talvez ele não esteja em guarda?\n"
					+ "Você resolve jogar sua espada nele da posição tombada em que se encontra. Jogue dois dados. \nSe o "
					+ "número obtido for menor ou igual a seu índice de HABILIDADE, a espada rasga o peito do homem \n"
					+ "e o mata (vá para 313). Se o número for maior do que o seu índice de HABILIDADE, a espada voa, \n"
					+ "passando por ele, e retine ao cair no chão de mármore (vá para 81).");
			
			Referencia r048 = new Referencia();
			this.refList[48] = (r048);
			r048.setNumero(48);
			r048.setText("Há uma escada de ferro presa à borda de um bueiro de entrada que desce para o túnel lá embaixo."
					+ "Está escuro, e um cheiro muito desagradável sobe do fundo. Se quiser descer pela escada, vá para"
					+ "321. Se quiser repor a tampa do bueiro no lugar e continuar para o leste, vá para 205.");
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			Referencia r029 = new Referencia();
			this.refList[29] = (r029);
			r028.setNumero(29);
			
			
			
			
			
			
			
			
			
			
			
			
			//-------------------------------------------------------------------------------------------------------------------------------		
			Referencia r201 = new Referencia();
			this.refList[201] = (r201);
			r201.setNumero(201);
			r201.setText("Seguindo o mapa de Nicodemus, você começa a sua longa caminhada para o norte, na direção\n "
					+ "da torre guarnecida de Zanbar Bone, o Príncipe da Noite. Você caminha através de bosques e campos.\n"
					+"Você consegue relaxar um pouco no agradável ambiente do campo, respirando ar fresco com seus\n"
					+"odores maravilhosos. Quando a luz vai sumindo, você resolve acampar sob um enorme olmo.\n"
					+"Você cozinha uma refeição de coelho guisado e cogumelos antes de se deitar para um sono longo e\n"
					+"profundo (some 2 pontos de ENERGIA). De manhã, você procura um teixo e corta um galho\n"
					+"comprido para fazer um arco, a fim de disparar a flecha de prata. Ao testar a precisão do arco,\n"
					+"você nota repentinamente a presença de uma pomba branca pousada em um galho baixo ali perto. \n"
					+ "Há um pequeno pedaço de papel preso a uma de suas patas, o qual a pomba permite que você retire sem\n"
					+"voar para longe. Há uma mensagem no papel que diz:\n"
					
					+"\n"
					+ "'Caro Amigo \n:"
					+"Temo que esteja ficando velho demais para ser útil a alguém.\n"
					+"Lamento dizer que as informações que lhe dei sobre o\n"
					+"composto necessário para matar Zanbar Bone não estão\n"
					+"corretas. Você tem que usar apenas dois dos três\n"
					+"ingredientes que eu disse a você, mas não consigo me\n"
					+"lembrar que dois. Só posso sugerir que você tente cabelo de\n"
					+"Bruxa com pérolas negras, ou cabelo de Bruxa com flor de\n"
					+"1ótus, ou pérolas negras com flor de 1ótus. Minhas\n"
					+"desculpas.\n"
					+"Boa sorte,'\n"
					+"\n 'N'.\n"
					
					+"\nVocê joga a mensagem no chão e solta uma maldição. Você muda de idéia uma dúzia de vezes\n"
					+"antes de chegar a uma decisão. Finalmente, você faz sua escolha e amassa os dois ingredientes\n"
					+"em uma pedra chata, misturando-os. Você coloca o composto em uma pequena bolsa de couro,\n"
					+"esperando ter tomado a decisão certa. Você parte de novo, mas não demora muito para que a\n"
					+"vizinhança se torne menos acolhedora. As árvores são retorcidas ou atrofiadas e não se ouvem\n"
					+"pássaros – você deve estar se aproximando do domínio do Príncipe da Noite. De repente, à sua\n"
					+"esquerda, você ouve movimentos e grunhidos no mato. É um monstro que vagueia, atraído pelo\n"
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
			r202.setText("O guarda responde que pedirá uma escolta para levá-lo até Nicodemus.\n" 
						+"Ele estica o braço até uma pequena sineta na parede da guarita e a faz soar\n"
						+"três vezes. Quase que imediatamente, dois outros guardas vêm correndo da casa,\n" 
						+"e você fica surpreso quando cada um deles segura um de seus\n"
						+"braços. O guarda com a lança levanta a cabeça e ri, dizendo: \n"
						+"Então você quer ver Nicodemus, não é? \n"
						+"Que tal ver o interior de uma masmorra ao invés disso?\n" 
						+"Guardas, levem este estúpido embora e ponham-no atrás das grades,\n"
						+"depois joguem fora a chave.\n" 
						+"Você:\n"
						+"Permitirá que eles o levem?\n"
						+"Digite 1\n"
						+"Tentará lutar contra os guardas?\n"
						+"Digite 2\n"
						+"Tentará subornar os guardas?\n"
						+"Digite 3\n");
					System.out.println("O que você fará?\n");
					escolher = new Scanner(System.in);
					escolha = escolher.nextInt();
					System.out.println(decisao(escolha, 51, 69, 276,0).toString());
					
			Referencia r203 = new Referencia();
			this.refList[203] = (r203);
			r203.setNumero(203);
			r203.setText("\nZanbar Bone caminha na sua direção, tentando tocar a sua pele exposta.\n" 
						+"Você joga a espada de lado e coloca a flecha de prata no arco.\n" 
						+"Você só tem uma chance. Teste sua Sorte. Se você Tiver sorte,\n" 
						+"a flecha atinge seu alvo e atravessa as vestes e o peito do Príncipe da Noite\n" 
						+"Se você Não tiver sorte, a flecha não acerta no Príncipe da Noite,\n" 
						+"e ele avança para tocar o seu braço. Seus dedos de esqueleto estão sugando a sua vida.\n" 
						+"Você é agora um de seus servos mortos-vivos.\n");
					boolean resultSorte = (heroi.usarSorte(heroi.getSorte()));
					if(resultSorte == true){
						//System.out.println(r244.toString());
        			}else{
        				//System.out.println(r401.toString());
		}
					
		
			Referencia r204 = new Referencia();
			this.refList[204] = (r204);
			r204.setNumero(204);
			r204.setText("Você larga a taça e tira a mão para longe.\n" 
						+"O escorpião corre por mais ou menos um metro pelo chão,\n" 
						+"até que você pisa nele com sua bota. Se ainda não o tiver feito,\n" 
						+"você poderá levantar a taça B ou a taça C .\n" 
						+"Se você tiver perdido o interesse nas taças, poderá ou\n" 
						+"caminhar até a passagem em arco , ou subir as escadas.\n"
						+"Levantar taça B\n"
						+"Digite 1\n"
						+"Levantar taça C\n"
						+"Digite 2\n"
						+"Caminhar até a passagem do arco\n"
						+"Digite 3\n"
						+"Subir as escadas\n"
						+"Digite4\n");
		System.out.println("O que você fará?\n");
		escolher = new Scanner(System.in);
		escolha = escolher.nextInt();
		System.out.println(decisao(escolha, 209, 43, 107, 60).toString());
		
		Referencia r205 = new Referencia();
		this.refList[205] = (r205);
		r205.setNumero(205);
		r205.setText("Depois de recolocar a tampa do bueiro, você parte novamente para o leste." 
					+"Tudo parece estar quieto demais, e você começa a se sentir nervoso." 
					+"À sua frente, você vê que a Rua do Estábulo faz uma curva fechada para a esquerda." 
					+"Se você quiser continuar depois da curva." 
					+"Digite 1\n"
					+"Se quiser andar de volta para o cruzamento e virar à direita na Rua da Torre." 
					+"Digite 2\n");		
		System.out.println("O que você fará?\n");
		escolher = new Scanner(System.in);
		escolha = escolher.nextInt();
		System.out.println(decisao(escolha, 44, 127, 0, 0).toString());
		
		Referencia r206 = new Referencia();
		this.refList[206] = (r206);
		r206.setNumero(206);
		r206.setText("O Anão explica que eles estão jogando um simples jogo de quem-ganha-leva." 
					+"A aposta é de 2 Peças de Ouro. Cada pessoa põe 2 Peças de Ouro na mesa e joga 2 dados." 
					+"A pessoa que tirar o número mais alto fica com as 8 Peças de Ouro." 
					+"Para jogar, jogue 2 dados 3 vezes para os 3 Anões e anote cada um dos totais." 
					+"Em seguida, jogue 2 dados para você. Se seu próprio total for maior do que os"
					+"outros 3 totais, você ganha 6 Peças de Ouro dos Anões. "
					+ "Se o total for menor do que qualquer dos"
					+"outros 3 totais, você perde 2 Peças de Ouro. Você pode jogar 4 vezes, se você quiser," 
					+"antes que os Anões fiquem enfastiados e saiam da taverna." 
					+"Você irá jogar?(1=sim/2=não)");
					escolha = 1;
					System.out.println(decisao(escolha, 296, 0, 0, 0).toString());
		
		Referencia r207 = new Referencia();
		this.refList[207] = (r207);
		r207.setNumero(207);
		r207.setText("A escadaria termina em uma porta. Você gira a maçaneta lentamente, e a porta se abre," 
					+"para sua grande surpresa dando para o ar livre. Você sai para o telhado plano da torre." 
					+"Subitamente, você toma consciência de que há movimentos no céu e, ao olhar para cima," 
					+"vê duas aves grandes à luz da lua, com bicos e garras longas, que descem velozmente" 
					+"sobre você. Não há tempo para correr para um abrigo, e você terá que lutar contra os" 
					+"GAVIÕES ASSASSINOS.");
		  Npc monstro207um = new Npc();
		  Npc monstro207dois = new Npc();
		  Npc[] monstro207 = new Npc[2];
		  	monstro207[0] = (monstro207um);
		  	monstro207[1] = (monstro207dois);
		  	monstro207[0].setNomeMonstro("GAVIÃO ASSASSINO 1");
		  	monstro207[0].setMonstroHab(4);
		  	monstro207[0].setMonstroEner(5);
		  	monstro207[1].setNomeMonstro("GAVIÃO ASSASSINO 2");
		  	monstro207[1].setMonstroHab(4);
		  	monstro207[1].setMonstroEner(4);
		escolha = 1;
		System.out.println(decisao(escolha, 314, 0, 0, 0).toString());
		
		Referencia r208 = new Referencia();
		this.refList[208] = (r208);
		r208.setNumero(208);
		r208.setText("Os bolsos do Goblin contêm 2 Peças de Ouro, um dente de alho e alguns ossos velhos" 
		+"de articulações. Pegue o que você quiser e dirija-se outra vez para o leste pela Rua do Tamanco");
		escolha = 1;
		System.out.println(decisao(escolha, 317, 0, 0, 0).toString());
		}
	}
}
			