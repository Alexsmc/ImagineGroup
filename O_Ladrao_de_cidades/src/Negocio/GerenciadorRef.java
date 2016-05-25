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