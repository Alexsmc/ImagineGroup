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
			r000.setText("Você é um aventureiro em um mundo de monstros e magia, vivendo da rapidez de seu raciocínio\n"
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
			r000.setBattle(false);
			r000.setItenfound(false);
			r000.setShop(false);
			heroi.setOuro(heroi.getOuro()+30);
			System.out.println(r000.toString());
			
						
			Referencia r001 = new Referencia();
			refList.add(r001);
			r001.setNumero(1);
			r001.setText("A caminhada para Port Blacksand o leva na direção do oeste por uns 80 quilômetros,"
					+ "atravessando	planícies e subindo serras. Felizmente, não acontece nenhum encontro perigoso. Finalmente, você"
					+ "chega à costa e vê a alta muralha que circunda Port Blacksand e o aglomerado de construções"
					+ "que se projeta para o mar como uma feia mancha negra. Há navios ancorados no porto e fumaça"
					+ "subindo suavemente de chaminés. Parece suficientemente pacífico, e somente quando o vento muda,"
					+ "trazendo o cheiro de podridão na brisa, você se lembrada natureza cruel deste lugar notório."
					+ "Seguindo a estrada empoeirada para o norte ao longo da costa, na direção dos portões da cidade,"
					+ "você começa a notar alguns sinais assustadores - crânios em espetos de madeira, homens"
					+ "morrendo	de fome em jaulas suspensas nas muralhas da cidade e bandeiras negras em toda parte. Ao se"
					+ "aproximar do portão principal, um frio corre pela sua espinha, e você instintivamente segura o"
					+ "cabo	de sua espada para se reanimar. No portão, você se depara com um guarda alto, usando uma"
					+ "cota de malha de aço e um elmo de ferro. Ele avança, barrando a sua passagem com a lança, e diz:"
					+ "- Quem quer entrar em Port Blacksand sem ser convidado? Explique o quê está fazendo aqui ou volte pelo"
					+ "caminho que veio. Você:");
			r001.setDecisao1("Dirá a ele que quer ser levado a Nicodemus?(digite 1)");
			r001.setDecisao2("Dirá a ele que quer vender alguns objetos roubados?(digite 2)");
			r001.setDecisao3("Atacará o guarda rapidamente com sua espada?(digite 3)");
			r001.setBattle(false);
			r001.setItenfound(false);
			r001.setShop(false);
			System.out.println(r001.toString());
			System.out.println("O que você fará?");
			escolher = new Scanner(System.in);
			int escolha = escolher.nextInt();
			System.out.println(decisao(escolha, 202, 33, 49).toString());
			
			Referencia r002 = new Referencia();
			refList.add(r002);
			r002.setNumero(2);
			r002.setText("Você retira a pulseira do seu braço e a joga no monstro que se aproxima. Ela cai sobre a sua"
					+ "carapaça, semelhante a uma armadura, e gruda nela como se estivesse colada. Você fica então"
					+ "observando enquanto a pulseira começa a queimar, penetrando na carapaça, o corpo da Centopéia "
					+ "Gigante. A fumaça sai do orifício exatamente redondo e, à medida em que a pulseira queima, "
					+ "penetrando cada vez mais, você pode ver que os movimentos frenéticos da Centopéia são os "
					+ "estertores da morte. Finalmente, ela fica imóvel, e você consegue se esgueirar entre seu corpo e o"
					+ "teto do túnel. Você continua andando pelo túnel, que termina em uma grade de ferro, através da "
					+ "qual passa o esgoto.");
			r002.setDecisao1("Se quiser retirar a grade, digite 1");
			r002.setDecisao2("Se preferir caminhar de volta para o buraco de entrada, digite 2");
			do{
				System.out.println("O que você fará?");
				escolha = escolher.nextInt();
			}while((escolha>2)||(escolha<1));;
			System.out.println(decisao(escolha, 377, 174, 0).toString());
			
			Referencia r003 = new Referencia();
			refList.add(r003);
			r003.setNumero(3);
			r003.setText("O homem pára de jogar e diz que ele pode lhe trazer boa sorte. Pela soma de três Peças de Ouro,"
					+ "ele cantará uma canção para você que lhe trará boa sorte.");
			r003.setDecisao1("Se quiser pagar o músico, digite 1");
			r003.setDecisao2("Se não acreditar nele, poderá seguir em frente para a próxima barraca (digite 2).");
			do{
				System.out.println("O que você fará?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			if(escolha == 1){
			heroi.setOuro(heroi.getOuro()-3);
			}
			System.out.println(decisao(escolha, 37, 398, 0).toString());
			
			Referencia r004 = new Referencia();
			refList.add(r004);
			r004.setNumero(4);
			r004.setText("Você ouve uma campainha tocar do outro lado da porta e, poucos minutos depois, ela é aberta por"
					+ "um homem magro de pele pálida, com olhos fundos e escuros, usando um uniforme de servente."
					+ "Com uma voz fria e sibilante, ele diz: - Sim?");
			r004.setDecisao1("Se quiser dizer a ele que você é um via jante perdido, digite 1.");
			r004.setDecisao2("Se quiser atacar o homem com sua espada, digite 2.");
			do{
				System.out.println("O que você fará?");
				escolha = escolher.nextInt();
				}while((escolha>2)||(escolha<1));
			System.out.println(decisao(escolha, 399, 35, 0).toString());
			
			Referencia r005 = new Referencia();
			refList.add(r005);
			r005.setNumero(5);
			r005.setText("Desembainhando sua espada, você salta por cima do balcão para atacar o HOMEM-ORCA, que"
					+ "rapidamente pega a sua acha de mão. Você logo se dá conta de que o Homem-Orca tem prática"
					+ "no uso da arma dele.");
			Npc monstro005 = new Npc();
			monstro005.setNomeMonstro("Homem-Orca");
			monstro005.setMonstroEner(5);
			monstro005.setMonstroHab(8);
			System.out.println(monstro005);
			
			r005.isBattle(heroi, monstro005);
			if(r005.isBattle(heroi, monstro005)==true){
				//System.out.println(r371.toString());
			}else{
				//System.out.println(r401.toString);
			}
			
			Referencia r006 = new Referencia();
			refList.add(r006);
			r006.setNumero(6);
			r006.setText("Seu tom de voz se torna desagradável, e ela diz para você sair da casa dela, "
					+ "porque certamente não há trapos lá, nem, falando nisso, qualquer outro tipo de rebotalho.");
			
			
		}
	}
