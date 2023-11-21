/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.List;
import java.util.*;

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

    public static void main(String[] args) {
        int correta1, correta2;
        do {
        //Inicialização variáveis de verificação de acerto e de tentativas
        correta1 = 0;
        correta2 = 0;
        int tentativas = 5;
        /*Introdução/ambientação do quarto desafio*/
        String texto = "Para o próximo desafio o Oompa Loompa o leva até uma pequena sala, onde tudo o que \n"
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
                + "Ao lado dele há uma placa que diz \"Responda a pergunta para obter ajuda\"\n \n";
        exibirTextoGradual(texto, 30);
        //Criação scanner
        Scanner input = new Scanner(System.in);
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
        String texto = "Ao responder a pergunta corretamente o canal na TV é desbloqueado e você consegue visualizar um \n"
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
                + "os documentos da sua admissão.";
        exibirTextoGradual(texto, 30);
        
        }
    }
