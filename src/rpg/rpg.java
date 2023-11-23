/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.*;
import java.util.List;

/**
 *
 * @author Juliane Da Silva
 */
public class rpg {
public static void exibirTextoGradual(String texto, int atraso) {
	        for (int i = 0; i < texto.length(); i++) {
	            System.out.print(texto.charAt(i));
	            aguardarAtraso(atraso);
	        }
	    }

	    public static void aguardarAtraso(int milissegundos) {
	        try {
	            Thread.sleep(milissegundos);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
        }
            
            public static void perguntas() {	
        Scanner scanner = new Scanner(System.in);
        int tentativasMaximas = 3; //Variável para definir o limite de tentativas que o jogador terá durante os dois desafios

        // Desafio 1
        int tentativas1 = 0;
        boolean desafio1Concluido = false;
        while (tentativas1 < tentativasMaximas && !desafio1Concluido) {
            List<String> alternativas1 = new ArrayList<>();
            alternativas1.add("Reduzir o número de horas de trabalho dos oompa loompas para aliviar o estresse e melhorar a qualidade de vida, de acordo com a teoria das relações humanas.");
            alternativas1.add("Introduzir um sistema de competição entre os grupos de oompa loompas, onde o grupo mais produtivo recebe prêmios adicionais, incentivando a rivalidade entre eles.");
            alternativas1.add("Implementar um sistema de recompensas com base no desempenho de cada oompa loompa, seguindo a administração científica"); // Alternativa correta
            alternativas1.add("Implementar uma jornada de trabalho mais extensa para os oompa loompas, alegando que isso aumentará a produção ao longo do tempo, mesmo que contrarie a ideia de qualidade de vida.");
            alternativas1.add("Contratar novos oompa loompas para aumentar a força de trabalho, sem considerar os desafios de integração e treinamento que isso pode acarretar.");

            // Embaralhar as alternativas
            Collections.shuffle(alternativas1);

            exibirPerguntaEAlternativas("Willy Wonka pede sua opinião sobre como aumentar a produtividade na linha de produção.", alternativas1);

            String resposta1 = obterResposta(scanner);
            int posicaoCorreta1 = alternativas1.indexOf("Implementar um sistema de recompensas com base no desempenho de cada oompa loompa, seguindo a administração científica");
            
         // Caso o jogador acerte, ele poderá prosseguir para o próximo desafio
            if (resposta1.equals(obterLetraCorrespondente(posicaoCorreta1))) {
                System.out.println("Resposta correta! Vamos seguir para o próximo desafio!! \n");
                desafio1Concluido = true;
            } else {
              	//Caso ele erre, poderá tentar novamente, tendo em vista que ele terá apenas 3 tentativas
                System.out.println("Incorreto. Você tem " + (tentativasMaximas - tentativas1) + " tentativas restantes.\n");
                tentativas1++;
            }
            //Caso o limiete de tentativas seja atingido, o jogo terminará
            if (tentativas1 == tentativasMaximas) {
                System.out.println("Infelizmente sua caminhada dourada terminou...\n");
                return;
            }
        }

        // Desafio 2
        int tentativas2 = 0;
        boolean desafio2Concluido = false;
        while (tentativas2 < tentativasMaximas && !desafio2Concluido) {
        	
        	//Criação da primeira lista
            List<String> alternativas2 = new ArrayList<>();
            
          //adicionando as alternativas na lista
            alternativas2.add("Implementaria reuniões regulares para resolver conflitos e incentivar a comunicação entre os oompa loompas, de acordo com a teoria das relações humanas."); // Alternativa correta
            alternativas2.add("Ignoraria o problema, acreditando que a produção é a prioridade, conforme a administração científica.");
            alternativas2.add("Implementar um programa de recompensas individual baseado no desempenho, visando motivar cada oompa loompa por meio de incentivos financeiros.");
            alternativas2.add("Aumentar a carga de trabalho dos oompa loompas durante as pausas, alegando que a produtividade aumentará se eles continuarem trabalhando durante esses momentos.");
            alternativas2.add("Contratar um consultor externo para impor soluções e melhorias sem envolver diretamente os oompa loompas, seguindo uma abordagem autocrática.");

            // Embaralhar as alternativas
            Collections.shuffle(alternativas2);

            exibirPerguntaEAlternativas("Durante uma pausa, alguns oompa loompas começam a discutir e parecem desmotivados. O que você faria para melhorar a situação?", alternativas2);

            String resposta2 = obterResposta(scanner);
            
            int posicaoCorreta2 = alternativas2.indexOf("Implementaria reuniões regulares para resolver conflitos e incentivar a comunicação entre os oompa loompas, de acordo com a teoria das relações humanas.");

            // Caso o jogador acerte, ele poderá prosseguir para o próximo desafio
            if (resposta2.equals(obterLetraCorrespondente(posicaoCorreta2))) {
                System.out.println("Resposta correta! Parabéns, você concluiu o desafio dourado e poderá seguir para a próxima etapa do processo.\n");
                desafio2Concluido = true;
            } else {
              	//Caso ele erre, poderá tentar novamente, tendo em vista que ele terá apenas 3 tentativas
                System.out.println("Incorreto! Você tem " + (tentativasMaximas - tentativas2) + " tentativas restantes.\n");
                tentativas2++;
            }
            //Caso o limiete de tentativas seja atingido, o jogo terminará
            if (tentativas2 == tentativasMaximas) {
                System.out.println("Infelizmente sua caminhada dourada terminou...\n");
            }
        }
    }
            // Função para apresentar as perguntas e alternativas ao jogador
    public static void exibirPerguntaEAlternativas(String pergunta, List<String> alternativas) {
        System.out.println("\n" + pergunta + "\n");
        char opcao = 'A';
        for (String alternativa : alternativas) {
            System.out.println(opcao + ") " + alternativa);
            opcao++;
        }
    }
    // Função para solicitar a entrada do usuário
    public static String obterResposta(Scanner scanner) {
        System.out.print("Escolha sua resposta: ");
        return scanner.nextLine().trim().toUpperCase();
    }
    // Função para fazer com que a alternativa escolhida seja lincada com a alternativa correta
    public static String obterLetraCorrespondente(int posicao) {
        return String.valueOf((char) ('A' + posicao));
    
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		int opcao = 0;
		
		System.out.println("SEJA BEM-VINDO À CAMINHADA DOURADA!\n");
		String nom = "aa";
		do {
			
			System.out.println("1 - INSTRUÇÕES");
			System.out.println("2 - CRÉDITOS");
			System.out.println("3 - JOGAR");
			System.out.println("4 - SAIR\n");
			
			opcao = input.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("\n** INSTRUÇÕES **\n1 – Para iniciar o jogo o jogador deve escolher a opção 3 no menu. Assim poderá iniciar sua jornada no processo seletivo para trabalhar na fábrica do Sr Wonka.\n"
                                        + "2 – Ao longo da jornada o jogador precisará solucionar diversos desafios (perguntas selecionadas) para continuar no processo\n"
                                        + "3 – Em cada desafio o jogador terá até três chances para responder corretamente as perguntas. Boa sorte!\n");
				break;
			case 2:
				System.out.println("\n** CRÉDITOS **\nEsse jogo foi composto por:\nIsabela Dupre,\nJuliane Santana,\nMaria Eduarda,\nUllysses Dutra.\n");
				break;
			case 3:
				
				String texto = "\nLadies and gentlemen,\nInfelizmente, problemas internos aconteceram em nossa fábrica."
                                        + "\nPortanto, teremos que contratar mais um Oompa Loompa para compor o nosso time que irá atuar"
                                        + "\nno nosso salão de chocolate, onde você encontrará deliciosos chocolates e guloseimas.\n"
                                        + "Devido a isso, estamos à procura de indivíduos talentosos e apaixonados para se juntarem \n"
                                        + "à nossa equipe e ajudar a tornar o mundo mais doce um chocolate de cada vez.";				
				exibirTextoGradual(texto, 30);
				texto="\nDigite seu nome, por gentileza: ";
                                exibirTextoGradual(texto, 30);
				nom = input.next();
				nom = nom.toUpperCase();
				
				System.out.println("SEJA BEM-VINDO À CAMINHADA DOURADA, " + nom + "!🤎🍫🍬\n");
				
                texto = nom + ", O senhor Willy Wonka sempre foi bastante criterioso com os funcionários de sua fábrica. \nManter a ordem, organização e, acima de tudo, a transparência do serviço sempre foi o objetivo máximo da sua gerência.\n"
                        + "Entretanto, por mais que o Willy Wonka prese por tais valores, um de seus Oompa Loompa foi pego tendo um desvio de caráter,\no que entristeceu muito o senhor Wonka. Após muito pensar, o Wily Wonka seguiu o pensamento de que “depois de quebrada,\na confiança nunca mais é a mesma”, portanto, com muita tristeza, decide demitir o Oompa Loompa,\n"
                        + "o que fez surgir uma nova oportunidade de trabalho na mais famosa fábrica de chocolates do mundo.\n"
                        + "O processo seletivo da fábrica sempre foi rigoroso, testes onde são cobrados conhecimentos sobre o meio administrativos\nsão aplicados para que assim os melhores funcionários possam ser selecionados."
                        + "Ao estar caminhando nas redondezas da fábrica, você se depara com o anúncio da vaga vigente,\nse interessa e se candidata. Logo você é chamado para participar do processo seletivo, onde a primeira fase se dá pela realização de um desafio para testar suas habilidades nos conceitos da administração. Você logo se sente ansioso com a situação,\npois é uma grande oportunidade de atuar na fábrica mais importante de todos os tempos, mesmo assim você entra no campo de chocolate e inicia o teste:\n";
                exibirTextoGradual(texto, 30);


				ArrayList <String> listaAlt1 = new ArrayList <>();
				ArrayList <String> listaAlt2 = new ArrayList <>();
				
				
				listaAlt1.add("a) O nome Administração Científica deve-se à tentativa de aplicação dos métodos da ciência aos problemas da administração a fim de aumentar a eficiência industrial.\n");
				listaAlt1.add("b) Escola da Administração Científica foi iniciada no começo do século XX pelo engenheiro americano Henry Ford, considerado o fundador da moderna Teoria Geral da Administração.\n");
				listaAlt1.add("c) A preocupação original foi eliminar o desperdício e perdas sofridas pelas indústrias e elevar os níveis de produtividade por meio da aplicação de métodos e técnicas da engenharia industrial.\n");
				listaAlt1.add("d) O estudo de tempos e movimentos proposto por Taylor permite a racionalização do método de trabalho e a fixação do tempo-padrão para sua execução.\n");
				listaAlt1.add("e) Taylor verificou que os operários aprendiam a maneira de executar as tarefas do trabalho por meio da observação dos outros operários levando a diferentes métodos para fazer a mesma tarefa e uma grande variedade de instrumentos e ferramentas diferentes em cada operação.");
				
				listaAlt2.add("a) Fayol, com ênfase no sistema, e Taylor, com ênfase na estrutura.\n");
				listaAlt2.add("b) Fayol, com ênfase na estrutura, e Taylor, com ênfase nas tarefas.\n");
				listaAlt2.add("c) Fayol, com ênfase nas tarefas, e Taylor, com ênfase na estrutura.\n");
				listaAlt2.add("d) Fayol, com ênfase nas tarefas, e Taylor, com ênfase nas pessoas.\n");
				listaAlt2.add("e) Fayol, com ênfase nas pessoas, e Taylor, com ênfase nos sistemas.\n");
			
				
				int tent = 0;
				
				char escolha1;
				char escolha2;
					
			do {
				
				tent++;
				
				System.out.println("No início do século XX, surgiu a administração como ciência.\nSua primeira abordagem é conhecida como Escola da Administração Científica.\nReferindo-se a Administração Científica, é INCORRETO:");
				System.out.println(listaAlt1);
				Collections.shuffle(listaAlt1);
				
				escolha1 = input.next().charAt(0);
				escolha1 = Character.toLowerCase(escolha1);
				
				switch (escolha1) {
				
				case 'a':
				case 'c':
				case 'd':
				case 'e':
				
					System.out.println("Poxa... infelizmente a resposta está incorreta. Mas não desista!\n");
					break;
					
				case 'b':
					
					System.out.println("Uhuuull!!! Você acertou ;) Mas ainda temos um outro desafio.\n");
					break;
					
				default:
					
					System.out.println("Digite um opção válida!\n");
					break;
				}
			} while (tent <= 3 && escolha1 != 'b');
			
				
				texto="Preparado(a) para o próximo desafio? Sinta-se preparado(a),\npois a nossa fábrica precisa de você e esse desafio não pode te vencer. Vamos lá!!!\n";
                                exibirTextoGradual(texto, 30);
				
				
				do {
					
					tent++;
					
					System.out.println("Enquanto a Teoria Clássica buscava aumentar a eficiência por meio da forma e disposição dos órgãos componentes da organização, \na Administração Científica tinha como objetivo aumentar a eficiência da organização por meio do aumento da eficiência no nível operacional. Nesse sentido, os autores e a ênfase da Teoria Clássica e da Administração Científica, são, respectivamente: ");
					System.out.println(listaAlt2);
					Collections.shuffle(listaAlt2);
					
					escolha2 = input.next().charAt(0);
					escolha2 = Character.toLowerCase(escolha2);
					
					
					switch (escolha2) {
					
					case 'a':
					case 'c':
					case 'd':
					case 'e':
						
						System.out.println("Poxa... infelizmente a resposta está incorreta. Mas não desista!");
						break;
						
					case 'b':
						
						System.out.println("Uhuuull!!! Você acertou ;) Mas ainda temos um outro desafio.");
						break;
							
					default:
						
						System.out.println("Digite um opção válida!");
						break;

					}
			}  while (tent <= 3 && escolha2 != 'b');
                                //Fim código Ully
                                //Início código Duda
                                texto = "Ao finalizar o desafio da etapa anterior do processo, você e todos os candidatos são contemplados com alguns doces deliciosos para adoçarem sua jornada na Fantástica Fábrica! "
    			+ "\nApós a degustação, vocês são conduzidos a uma nova sala onde são apresentados ao coração da fábrica de chocolates mais famosa do mundo."
    			+ "\nNeste local, vocês encontram alguns dos muitos oompa loompas que desempenham papéis estratégicos em cada etapa da produção ao longo da gigantesca linha de fabricação."
    			+ "\nAo observar esses trabalhadores, percebe que, no momento de pausa que tiveram, eles se dividiram em grupos.\n"
    			+ "\nAlguns estavam animados e felizes com a visita, enquanto outros pareciam desanimados e apenas observavam."
    			+ "\nWilly Wonka, o excêntrico dono da fábrica, surge e anuncia:\n"
    			+ "\n\"Senhoras e senhores, estamos em uma nova etapa do processo!\n"
    			+ "\nPara ter sucesso aqui, é fundamental compreender a dinâmica de nossa fábrica e, baseando-se nas teorias das relações humanas,"
    			+ "\ntrazer à tona o que considera essencial para manter a Fantástica Fábrica de Chocolate como um lugar harmonioso e agradável para todos que aqui trabalham e um dos melhores locais para se trabalhar.\"\n"
    			+ "\nAgora, cabe a você fazer uma análise do que viu ao entrar na sala e do que já testemunhou nos desafios anteriores.\n";
    	exibirTextoGradual(texto, 30);

        perguntas();
//Inicio código Juliane
        int correta1, correta2;
        do {
        //Inicialização variáveis de verificação de acerto e de tentativas
        correta1 = 0;
        correta2 = 0;
        int tentativas = 3;
        /*Introdução/ambientação do quarto desafio*/
        texto = "Para o próximo desafio o Oompa Loompa o leva até uma pequena sala, onde tudo o que \n"
                + "consegue visualizar é a porta por onde veio que está atrás de você e uma porta a sua frente que é semelhante \n"
                + "a de um elevador comum, mas completamente translúcida. Então o Oompa Loompa dá um leve empurrão na sua perna \n"
                + "e faz um gesto para que você adentre ao elevador. Assim que entra você vê uma pequena luz piscando no painel \n"
                + "ao lado está escrito \"Labirinto de chocolate\" isso lhe desperta curiosidade.\n"
                + "O elevador sobe de forma brusca causando um tranco, mas logo a viagem segue sem turbulações...\n"
                + "Até que... Uma voz surge do alto falante...\n\n\"Olá, " + nom +"!\nA próxima fase da seleção está prestes a começar "
                + "na próxima fase avaliaremos como você funciona sob pressão.\nPara isso, você terá de atravessar o labirinto de "
                + "chocolate, mas cuidado... \n"
                + "Hoje a temperatura ambiente é de 36° o que significa que você terá apenas 1 hora para atravessar o \n"
                + "labirinto antes do chocolate derreter completamente.\nBoa sorte!\"\n\nAssim que a voz finaliza as instruções o "
                + "elevador para e abre as portas mostrando a entrada do labirinto.\nVocê respira fundo para sentir o aroma do delicioso chocolate ao leite mais famoso do mundo quando ouve um barulho...\nTic...\nTac...\nÉ melhor se apressar pois o desafio já começou.\n"
                + ".\n.\n.\nApós alguns minutos caminhando sem rumo dentro do labirinto você avista um Oompa Loompa.\n"
                + "Ao lado dele há uma placa que diz \"Responda a pergunta para obter ajuda\"\n \n";
        exibirTextoGradual(texto, 30);
        
        //Criação lista com as alternativas da primeira pergunta
        List<String> alternativa1 = new ArrayList<>();
        //Adição das alternativas na lista
        alternativa1.add("Um grupo que é criado pela gerência da empresa.");
        alternativa1.add("Um grupo que é criado para criar uma tarefa específica.");
        alternativa1.add("Um grupo criado por afinidade e/ou interesses em comum.");
        alternativa1.add("Um grupo criado para competir com outros grupos");
        alternativa1.add("Um grupo criado para realizar atividades recreativas.");
        //Inicialização da variável resp que será utilizada para comparar com a resposta que o usuário digitar
        String resp = "xx";
        
        //Início laço primeira pergunta
        do {
            /*A variável posicaoCorreta é para pegar em que posição da lista está a resposta correta, já que ela não vai
        ficar sempre na mesma posição por conta do embaralhamento.
             */
            int posicaoCorreta = 0;
            /*Esse laço abaixo roda até o limite da lista e vai pegar o índice da posição correta. Como? comparando o TEXTO (String)
        com o texto correto (fornecido entre aspas).
             */
            for (int i = 0; i < alternativa1.size(); i++) {
                if (alternativa1.get(i).equals("Um grupo criado por afinidade e/ou interesses em comum.")) {
                    //Se o texto da lista for igual ao texto que passamos acima ele guarda o índice de onde está a resposta correta na variável posicaoCorreta
                    posicaoCorreta = i;
                }
            }
            //Aqui no switch ele vai pegar o índice da posição que tá a resposta certa e falar que se o índice for 0, por exemplo, a resposta correta é A. Se o índice da resposta correta for 1 vai ser B e etc.
            switch (posicaoCorreta) {
                case 0:
                    resp = "A";
                    break;
                case 1:
                    resp = "B";
                    break;
                case 2:
                    resp = "C";
                    break;
                case 3:
                    resp = "D";
                    break;
                case 4:
                    resp = "E";
                    break;
            }
//Aqui é inserida a pergunta
            System.out.println("\nVocê notou que os Oompa Loompas se organizam em grupos. Esses grupos são \n"
                    + "denominados \"Grupos informais\". Qual a definição de grupo informal?\n");
            //Aqui é exibida as alternativas com a ordem de A, B, C, D e E sempre iguais, mas com as alternativas vindas da lista que podem ser embaralhadas
            System.out.println("A)" + alternativa1.get(0));
            System.out.println("B)" + alternativa1.get(1));
            System.out.println("C)" + alternativa1.get(2));
            System.out.println("D)" + alternativa1.get(3));
            System.out.println("E)" + alternativa1.get(4));
            //Aqui pegamos o que o usuário responde
            String alt = input.next();
//Aqui transformamos o que o usuário responder em maiúsculo para que não haja erro caso ele digite em minúsculo
            alt = alt.toUpperCase();
//Abaixo testamos se o que o usuário digitou corresponde a resposta correta (que foi convertida acima do índice para letra e a letra é comparada com a letra digitada
            if (alt.equals(resp)) {
                //Utilizamos a variável correta1 para verificar se o usuário acertou. Caso tenha acertado ela passa a valer 1 para usarmos na condição do loop
                correta1 = 1;
                //Também é impresso na tela do usuário que ele acertou a resposta
                System.out.println("Resposta correta!");
            } else {
                //O número de tentativas é diminuído aqui
                tentativas--;
                //Caso o usuário não acerte é mostrado que a resposta foi incorreta e a quantidade de tentativas restantes
                System.out.println("Incorreto. Você tem " + tentativas + " tentativas");
            }
            //Aqui a lista de alternativas é embaralhada. Assim, na próxima ver que aparecer as alternativas estarão em posições diferentes
            Collections.shuffle(alternativa1);
//Condição para sair do loop da pergunta é ter acertado a resposta e não ter zerado as tentativas
        } while (correta1 != 1 && tentativas != 0);
//História
        if (tentativas>0){
        String texto1 = "\nAssim que você acerta a questão o Oompa Loompa prontamente o puxa pela \n"
                + "barra da calça guiando-o pelos corredores de chocolate que derretiam cada vez mais rápido.\n"
                + "O Oompa Loompa para na frente de uma TV e o encara por alguns segundos antes de sair correndo \n"
                + "e rindo baixinho. Ao lado da TV há uma mesa com um controle cuidadosamente posicionado acima de um \n"
                + "bilhete que diz \"Para desbloquear o canal premiado você deve responder mais um desafio.\"\n";
        exibirTextoGradual(texto1, 30);
//Criação da lista da outra alternativa
        List<String> alternativa2 = new ArrayList<>();
//Adição das alternativas na lista
        alternativa2.add("Não são relevantes para a empresa.");
        alternativa2.add("São obstáculos para a produtividade.");
        alternativa2.add("São um meio da gerência controlar os colaboradores.");
        alternativa2.add("Ajudam a melhorar a comunicação, a produtividade e a satisfação dos trabalhadores.");
        alternativa2.add("São feitos para os colaboradores competirem entre si.");

        do {
            int posicaoCorreta = 0;
            for (int i = 0; i < alternativa2.size(); i++) {
                if (alternativa2.get(i).equals("Ajudam a melhorar a comunicação, a produtividade e a satisfação dos trabalhadores.")) {
                    posicaoCorreta = i;
                }
            }
            switch (posicaoCorreta) {
                case 0:
                    resp = "A";
                    break;
                case 1:
                    resp = "B";
                    break;
                case 2:
                    resp = "C";
                    break;
                case 3:
                    resp = "D";
                    break;
                case 4:
                    resp = "E";
                    break;
            }

            System.out.println("\nQual a importância dos grupos informais para a empresa?\n");
            System.out.println("A)" + alternativa2.get(0));
            System.out.println("B)" + alternativa2.get(1));
            System.out.println("C)" + alternativa2.get(2));
            System.out.println("D)" + alternativa2.get(3));
            System.out.println("E)" + alternativa2.get(4));
            String alt = input.next();
            alt = alt.toUpperCase();
            if (alt.equals(resp)) {
                correta2 = 1;
                System.out.println("Resposta correta!");
            } else {
               //O número de tentativas é diminuído aqui
                tentativas--;
               //Caso o usuário não acerte é mostrado que a resposta foi incorreta e a quantidade de tentativas restantes
                System.out.println("Incorreto. Você tem " + tentativas + " tentativas");
            }
            Collections.shuffle(alternativa2);

        } while (correta2 != 1 && tentativas != 0);
        }
        } while (correta1==0 || correta2==0);
        texto = "Ao responder a pergunta corretamente o canal na TV é desbloqueado e você consegue visualizar um \n"
                + "baú com uma placa em cima que diz:\n\"Abra-me\"\nEntão você lembra que o Sr Wonka estava desenvolvendo uma \n"
                + "tecnologia que permite que o telespectador pegue coisas de dentro da televisão, por isso, decide arriscar \n"
                + "pegar o baú...\n"
                + "Quando sua mão entra na TV você sente a energia estática que costumava arrepiar seu cabelo quando era criança... \n"
                + "Você sente sua mão alcançar o baú e o puxa para fora e o abre...\n"
                + "Dentro há um GPS que o guia para fora do labirinto.\n"
                + "\n \n \n"
                + "Ao sair você é direcionado ao auditório onde os Oompa Loompas estão todos organizados no palco. De repente, uma \n"
                + "música começa a tocar.\n \n"
                + "Bem-vindo à fábrica de chocolate,\n"
                + "Onde a diversão nunca acaba.\n"
                + "Você é o novo contratado,\n"
                + "E estamos felizes em tê-lo aqui.\n \n"
                + "Você vai ver coisas que nunca imaginou,\n"
                + "E provar doces que nunca experimentou.\n"
                + "Você vai trabalhar duro todos os dias,\n"
                + "Mas a recompensa será doce, de muitas maneiras.\n \n"
                + "Surge uma chuva de confete e então um Oompa Loompa o leva até a sala do RH para que você possa fornecer \n"
                + "os documentos da sua admissão.\n"
                + "Parabéns pela contratação!!!\n\n\n";
        exibirTextoGradual(texto, 30);

        //Colocar o código do jogo antes dessa chave
	    }
        
        
        
} while (opcao != 4) ;
    }
}
