package Desafio2;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

    	String texto = "Ao finalizar o desafio da etapa anterior do processo, você e todos os candidatos são contemplados com alguns doces deliciosos para adoçarem sua jornada na Fantástica Fábrica! "
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
    } 
     //Função para criação das perguntas
    public static void perguntas() {	
        Scanner scanner = new Scanner(System.in);
        
        int tentativasMaximas = 3; //Variável para definir o limite de tentativas que o jogador terá durante os dois desafios

        // Desafio 1
        
        int tentativas1 = 0;
        boolean desafio1Concluido = false;
        while (tentativas1 < tentativasMaximas && !desafio1Concluido) {
        	
        	//Criação da primeira lista
            List<String> alternativas1 = new ArrayList<>();
            
            //adicionando as alternatovas na lista
            alternativas1.add("Reduzir o número de horas de trabalho dos oompa loompas para aliviar o estresse e melhorar a qualidade de vida, de acordo com a teoria das relações humanas.");
            alternativas1.add("Introduzir um sistema de competição entre os grupos de oompa loompas, onde o grupo mais produtivo recebe prêmios adicionais, incentivando a rivalidade entre eles.");
            alternativas1.add("Implementar um sistema de recompensas com base no desempenho de cada oompa loompa, seguindo a administração científica"); // Alternativa correta
            alternativas1.add("Implementar uma jornada de trabalho mais extensa para os oompa loompas, alegando que isso aumentará a produção ao longo do tempo, mesmo que contrarie a ideia de qualidade de vida.");
            alternativas1.add("Contratar novos oompa loompas para aumentar a força de trabalho, sem considerar os desafios de integração e treinamento que isso pode acarretar.");

            // Embaralhar as alternativas
            Collections.shuffle(alternativas1);

            exibirPerguntaEAlternativas("Willy Wonka pede sua opinião sobre como aumentar a produtividade na linha de produção.", alternativas1);

            String resposta1 = obterResposta(scanner); //obter entrada do usuário
            
            //Implementando a alternativa correta na variavel 
            int posicaoCorreta1 = alternativas1.indexOf("Implementar um sistema de recompensas com base no desempenho de cada oompa loompa, seguindo a administração científica");

            if (resposta1.equals(obterLetraCorrespondente(posicaoCorreta1))) {
            	// Caso o jogador acerte, ele poderá prosseguir para o próximo desafio
                System.out.println("Resposta correta! Vamos seguir para o próximo desafio!! \n");
                desafio1Concluido = true;
            } else {
            	//Caso ele erre, poderá tentar novamente, tendo em vista que ele terá apenas 3 tentativas
                System.out.println("Incorreto. Você tem " + (tentativasMaximas - tentativas1) + " tentativas restantes.\n");
                //Aqui o numero de tentativas é diminuido
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
        	// Criação da nova lista
            List<String> alternativas2 = new ArrayList<>();
            alternativas2.add("Implementaria reuniões regulares para resolver conflitos e incentivar a comunicação entre os oompa loompas, de acordo com a teoria das relações humanas."); // Alternativa correta
            alternativas2.add("Ignoraria o problema, acreditando que a produção é a prioridade, conforme a administração científica.");
            alternativas2.add("Implementar um programa de recompensas individual baseado no desempenho, visando motivar cada oompa loompa por meio de incentivos financeiros.");
            alternativas2.add("Aumentar a carga de trabalho dos oompa loompas durante as pausas, alegando que a produtividade aumentará se eles continuarem trabalhando durante esses momentos.");
            alternativas2.add("Con	tratar um consultor externo para impor soluções e melhorias sem envolver diretamente os oompa loompas, seguindo uma abordagem autocrática.");

            // Embaralhar as alternativas
            Collections.shuffle(alternativas2);

            exibirPerguntaEAlternativas("Durante uma pausa, alguns oompa loompas começam a discutir e parecem desmotivados. O que você faria para melhorar a situação?", alternativas2);

            String resposta2 = obterResposta(scanner);
            int posicaoCorreta2 = alternativas2.indexOf("Implementaria reuniões regulares para resolver conflitos e incentivar a comunicação entre os oompa loompas, de acordo com a teoria das relações humanas.");

            if (resposta2.equals(obterLetraCorrespondente(posicaoCorreta2))) {
                System.out.println("Resposta correta! Parabéns, você concluiu o desafio dourado e poderá seguir para a próxima etapa do processo.\n");
                desafio2Concluido = true;
            } else {
            	//Caso ele erre, poderá tentar novamente, tendo em vista que ele terá apenas 3 tentativas novamente
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

    //Função para fazer com que o texto no início do jogo apareça gradualmente 
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
}