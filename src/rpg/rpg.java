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

    public static void main(String[] args) {

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
        Scanner input = new Scanner(System.in);
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
        
    }
}
