package TesteFuncao;

public class testeDeFuncao {
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
		
    	String texto = "\r\n"
    			+ "Em um mundo onde o cinza dominava, a Fantástica Fábrica de Chocolates do Sr. Wonka brilhava como um oásis doce.\nPortas douradas abriam caminho para um universo de encantos, onde rios de chocolate dançavam e balões de chiclete flutuavam. Cinco sortudos exploradores, guiados por Wonka, enfrentaram desafios açucarados, aprendendo que a verdadeira riqueza está na alegria simples.\nNo fim, Charlie Bucket, o coração puro, tornou-se o herdeiro, voando com Wonka em um elevador de vidro para perpetuar o encanto de sua fábrica mágica.";
	
    	aguardarAtraso(30);
    	exibirTextoGradual(texto, 30);
    	
    }

	
	

}