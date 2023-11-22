package perguntas;
import java.util.Scanner;

public class fase3 {

	private static final int MAX_TENTATIVAS = 3;

	 public static void main(String[] args) {
	        String texto = "Parabéns por realizar mais uma etapa!\n" +
	                  "Por seu grande esforço e pensamento rápido, você e os demais finalistas se encontram na área dos Sinos de Nozes.\n" +
	                  "Nessa área, você está no setor administrativo e o RH da empresa.\n" +
	                  "Vocês receberam uma agradável recepção dos colaboradores.\n\n" +
	                  "Continuando sua jornada pela área dos Sinos de Nozes,você percebe que o setor é muito organizado.\n" +
	                  "Os chamados Oompa Estrelas douradas supervisionam e garantem a eficiência, qualidade e a divisão correta de tarefas.\n" +
	                  "Os colaboradores, por sua vez, parecem ser amigáveis. Você consegue perceber um ambiente agradável de se trabalhar.\n" +
	                  "Além disso, existe uma caixa de melhorias, críticas e comentários sobre a empresa, das quais são recebidas pelos Oompas Estrelas douradas.\n\n" +
	                  "A fim de provar a sua capacidade e a dos demais competidores, o dono da fábrica, o senhor Willy Wonka, está acompanhando em pessoa o \n"
	                  + "desenvolvimento do processo seletivo.\n" +
	                  "Ele pede a atenção de todos para anunciar o desafio da próxima etapa:\n\n" +
	                  "\"Gostaria de dizer que é um prestígio anunciar que chegamos a mais uma etapa.\n" +
	                  "Espero que a sensação de conhecer mais um setor seja doce!\n" +
	                  "Para provar que merece continuar no nosso processo e provar o seu talento, é imprescindível que consigam entender os Mecanismos de defesa e \n"
	                  + "a Teoria da Administração Clássica.\n" +
	                  "Estar em um ambiente como a nossa fábrica requer que você consiga lidar com os desafios diários que ela demanda.\n" +
	                  "Sendo assim, ter a capacidade de lidar com os conflitos e continuar mantendo ela Fantástica.\"\n\n" +
	                  "Para continuar trilhando o seu caminho nessa jornada açucarada, você precisará utilizar os seus conhecimentos sobre Os Mecanismos de Defesa \n"
	                  + "e a Teoria da Administração Clássica responder corretamente às questões. Boa sorte!\n\n";
	        exibirTextoGradual(texto, 30); // 30 milissegundos de atraso entre caracteres

	        if (realizarPergunta1()) {
	            if (realizarPergunta2()) {
	                System.out.println("Parabéns Doce Aventureiro! Você agora irá avançar para a fase final!");
	            }
	        }
	    }

	    public static boolean realizarPergunta1() {
	        Scanner scanner = new Scanner(System.in);

	        for (int tentativas = 0; tentativas < MAX_TENTATIVAS; tentativas++) {
	            System.out.println("Pergunta 1. \n\"Um Oompa Loompa ao receber uma discordância de opinião entre ele e os outros colaboradores sobre o novo sabor de chocolate, \n"
	            		+ "ele decidiu não realizar mais o seu trabalho o dia todo e nem enviar os relatórios necessários dos colegas que discordaram com ele.\"\n"
	            		+ "Determine qual grupo dentro dos Mecanismos de Defesa se enquadra essa situação");
	            System.out.println("A) Sociológico, pois ele teve um problema social");
	            System.out.println("B) Psicológica, pois ele utilizou o mecanismo de defesa conhecido como regressão.");
	            System.out.println("C) Tecnológico, pois o mecanismo de defesa ultilizado pelo Oompa Loompa foi relacionado a tecnologia");

	            char resposta1 = scanner.next().charAt(0);

	            switch (resposta1) {
	                case 'B':
	                case 'b':	
	                    System.out.println("Resposta correta!\n");
	                    return true; // 
	                default:
	                    System.out.println("\nSua resposta está incorreta, você tem: " + (MAX_TENTATIVAS - tentativas - 1 + " tentativas!\n"));
	            }
	        }

	        System.out.println("Infelizmente você não vai poder continuar na nossa Caminhada Dourada. Se desejar pode se inscrever \n"
	        		+ "novamente!.");
	        return false; // jogador falhou.
	    }

	    public static boolean realizarPergunta2() {
	        Scanner scanner = new Scanner(System.in);

	        for (int tentativas = 0; tentativas < MAX_TENTATIVAS; tentativas++) {
	            System.out.println("Pergunta 2.\r\n"
	            		+ "Os Oompas Estrelas Douradas desempenham um papel de liderança importante no setor administrativo\n"
	            		+ "e RH dentro de suas funções, para manter o funcionamento eficiente e a qualidade da empresa, eles\n"
	            		+ "seguem as \"funções do administrador\"que são representadas pelas siglas POCCC, determine qual das\n"
	            		+ "alternativas a seguir representa corretamente essas Siglas:\r\n"
	            		+ "\r\n"
	            		+ "");
	            System.out.println("A) Problematizar, Organizar, Comandar, Controlar, Coordenar");
	            System.out.println("B) Priorizar, Organizar, Comandar, Criar, Controlar");
	            System.out.println("C) Prever, Organizar, Comandar, Coordenar, Controlar");
	            System.out.println("D) Prever, Organizar, Criar, Controlar, Citar");

	            char resposta2 = scanner.next().charAt(0);

	            switch (resposta2) {
	                case 'C':
	                case 'c':	
	                    System.out.println("Resposta correta!");
	                    return true; 
	                default:
	                    System.out.println("Sua resposta está incorreta, você tem: " + (MAX_TENTATIVAS - tentativas - 1 + " tentativas!\n"));
	            }
	        }

	        System.out.println("\"Infelizmente você não vai poder continuar na nossa Caminhada Dourada. Se desejar pode se inscrever\n"
	        		+ "novamente!.");
	        return false; //jogador falhou.
	    }

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

	

