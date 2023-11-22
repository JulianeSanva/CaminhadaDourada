/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Juliane Da Silva
 */
public class rpg {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		int opcao = 0;
		
		System.out.println("SEJA BEM-VINDO À CAMINHADA DOURADA!\n");
		
		do {
			
			System.out.println("1 - INSTRUÇÕES");
			System.out.println("2 - CRÉDITOS");
			System.out.println("3 - JOGAR");
			System.out.println("4 - SAIR\n");
			
			opcao = input.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("1 – O candidato irá iniciar a corrida dourada e terá a escolha de uma cor (verde ou azul). \nCada cor o levará para um contexto de história diferente. \nAssim, o jogador terá uma maior interatividade com o nosso jogo.\n");
				System.out.println("2 – Ao iniciar a corrida dourada, o jogador encontrará a primeira fase do processo seletivo da caminhada dourada, \nonde será necessário resolver desafios (perguntas selecionadas) para que se vá para o próximo desafio. \nO jogo é composto por 3 desafios em sequência.\n");
				System.out.println("3 – Em cada fase, o jogador terá até três chances para realizá-las. \nCaso não consiga realizá-las, o jogador retorna para o início do jogo e terá de recomeçar todo o jogo.\n");
				break;
			case 2:
				System.out.println("Esse jogo foi composto por:\n Isabela Dupre,\n Juliane Santana,\n Maria Eduarda,\n Ullysses Dutra.");
				break;
			case 3:
				
				System.out.println("Ladies and gentlemen,\n");
				System.out.println("Infelizmente, problemas internos aconteceram em nossa fábrica. \nPortanto, teremos que contratar mais um Oompa Loompa para compor o nosso time que irá atuar \nno nosso salão de chocolate, onde você encontrará deliciosos chocolates e guloseimas.\n");
				System.out.println("Devido a isso, estamos à procura de indivíduos talentosos e apaixonados para se juntarem \nà nossa equipe e ajudar a tornar o mundo mais doce um chocolate de cada vez.");				
				
				System.out.println("\nDigite seu nome, por gentileza: ");
				String nom = input.next();
				nom = nom.toUpperCase();
				
				System.out.println("SEJA BEM-VINDO À CAMINHADA DOURADA, " + nom + "!🤎🍫🍬\n");
				
                System.out.println(nom + ", O senhor Willy Wonka sempre foi bastante criterioso com os funcionários de sua fábrica. \nManter a ordem, organização e, acima de tudo, a transparência do serviço sempre foi o objetivo máximo da sua gerência.\n");
				System.out.println("Entretanto, por mais que o Willy Wonka prese por tais valores, um de seus Oompa Loompa foi pego tendo um desvio de caráter,\no que entristeceu muito o senhor Wonka. Após muito pensar, o Wily Wonka seguiu o pensamento de que “depois de quebrada,\na confiança nunca mais é a mesma”, portanto, com muita tristeza, decide demitir o Oompa Loompa,\no que fez surgir uma nova oportunidade de trabalho na mais famosa fábrica de chocolates do mundo.\n");
				System.out.println("O processo seletivo da fábrica sempre foi rigoroso, testes onde são cobrados conhecimentos sobre o meio administrativos\nsão aplicados para que assim os melhores funcionários possam ser selecionados.");
                System.out.println("Ao estar caminhando nas redondezas da fábrica, você se depara com o anúncio da vaga vigente,\nse interessa e se candidata. Logo você é chamado para participar do processo seletivo, onde a primeira fase se dá pela realização de um desafio para testar suas habilidades nos conceitos da administração. Você logo se sente ansioso com a situação,\npois é uma grande oportunidade de atuar na fábrica mais importante de todos os tempos, mesmo assim você entra no campo de chocolate e inicia o teste:\n");


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
				
				System.out.println("No início do século XX, surgiu a administração como ciência.\nSua primeira abordagem é conhecida como Escola da Administração Científica.\nReferindo-se a Administração Científica, é iNCORRETO:");
				System.out.println(listaAlt1);
				Collections.shuffle(listaAlt1);
				
				escolha1 = input.next().charAt(0);
				escolha1 = Character.toLowerCase(escolha1);
				
				switch (escolha1) {
				
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
			} while (tent <= 3 && escolha1 != 'b');
			
				
				System.out.println("Preparado(a) para o próximo desafio? Sinta-se preparado(a),\npois a nossa fábrica precisa de você e esse desafio não pode te vencer. Vamos lá!!!\n");
				
				
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


        System.out.println("Para o próximo desafio o Oompa Loompa o leva até uma pequena sala, onde tudo o que \n"
                + "consegue visualizar é a porta por onde veio que está atrás de você e uma porta a sua frente que é semelhante \n"
                + "a de um elevador comum, mas completamente translúcida. Então o Oompa Loompa dá um leve empurrão na sua perna \n"
                + "e faz um gesto para que você adentre ao elevador. Assim que entra você vê uma pequena luz piscando no painel \n"
                + "ao lado está escrito \"Labirinto de chocolate\" isso lhe desperta curiosidade.\n"
                + "O elevador sobe de forma brusca causando um tranco, mas logo a viagem segue sem turbulações...\n"
                + "Até que... Uma voz surge do alto falante...\n\n\"Olá, querid@ cadidat@!\nA próxima fase da seleção está prestes a começar "
                + "na próxima fase avaliaremos como você funciona sob pressão.\nPara isso, você terá de atravessar o labirinto de "
                + "chocolate, mas cuidado... \n"
                + "Hoje a temperatura ambiente é de 36° o que significa que você terá apenas 1 hora para atravessar o \n"
                + "labirinto antes do chocolate derreter completamente.\nBoa sorte!\"\n\nAssim que a voz finaliza as instruções o "
                + "elevador para e abre as portas mostrando a entrada do labirinto.\nVocê respira fundo para sentir o aroma do delicioso chocolate ao leite mais famoso do mundo quando ouve um barulho...\nTic...\nTac...\nÉ melhor se apressar pois o desafio já começou.\n"
                + ".\n.\n.\nApós alguns minutos caminhando sem rumo dentro do labirinto você avista um Oompa Loompa.\n"
                + "Ao lado dele há uma placa que diz \"Responda a pergunta para obter ajuda\"\n \n");
  
        List<String> alternativa1 = new ArrayList<>();

        alternativa1.add("Um grupo que é criado pela gerência da empresa.");
        alternativa1.add("Um grupo que é criado para criar uma tarefa específica.");
        alternativa1.add("Um grupo criado por afinidade e/ou interesses em comum.");
        alternativa1.add("Um grupo criado para competir com outros grupos");
        alternativa1.add("Um grupo criado para realizar atividades recreativas.");

        String resp = "xx";
        int correta1 = 0, correta2 = 0, tentativas = 1;
        do {
            int posicaoCorreta = 0;
            for (int i = 0; i < alternativa1.size(); i++) {
                if (alternativa1.get(i).equals("Um grupo criado por afinidade e/ou interesses em comum.")) {
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

            System.out.println("\nVocê notou que os Oompa Loompas se organizam em grupos. Esses grupos são \n"
                    + "denominados \"Grupos informais\". Qual a definição de grupo informal?\n");
            System.out.println("A)" + alternativa1.get(0));
            System.out.println("B)" + alternativa1.get(1));
            System.out.println("C)" + alternativa1.get(2));
            System.out.println("D)" + alternativa1.get(3));
            System.out.println("E)" + alternativa1.get(4));
            String alt = input.next();

            alt = alt.toUpperCase();

            if (alt.equals(resp)) {
                correta1 = 1;
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Incorreto. Você tem " + tentativas + " tentativas");
                tentativas++;
            }
            Collections.shuffle(alternativa1);

        } while (correta1 != 1 && tentativas < 4);

        System.out.println("\nAssim que você acerta a questão o Oompa Loompa prontamente o puxa pela \n"
                + "barra da calça guiando-o pelos corredores de chocolate que derretiam cada vez mais rápido.\n"
                + "O Oompa Loompa para na frente de uma TV e o encara por alguns segundos antes de sair correndo \n"
                + "e rindo baixinho. Ao lado da TV há uma mesa com um controle cuidadosamente posicionado acima de um \n"
                + "bilhete que diz \"Para desbloquear o canal premiado você deve responder mais um desafio.\"\n");

        List<String> alternativa2 = new ArrayList<>();

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

            System.out.println("Qual a importância dos grupos informais para a empresa?");
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
                System.out.println("Incorreto. Você tem " + tentativas + " tentativas");
                tentativas++;
            }
            Collections.shuffle(alternativa2);

        } while (correta2 != 1 && tentativas < 4);

        System.out.println("Ao responder a pergunta corretamente o canal na TV é desbloqueado e você consegue visualizar um \n"
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
                + "os documentos da sua admissão.");

                				
			case 4:
				
				System.out.println("Ops! Infelizmente, você foi deslogado(a) do jogo.");
				break;
				
			default:
				System.out.println("Escolha uma opção válida!");
                break;
    }

} while (opcao != 4) ;
}
}



        
    