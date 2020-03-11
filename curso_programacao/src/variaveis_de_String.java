
public class variaveis_de_String {

	public static void main(String[] args) {
		String original = "SUDFHSDUFI asdff ASUHASUHAS AasdUH SUHAUH  ";
		
		//deixar_todas_as_letras_minusculas.
		String s01 = original.toLowerCase();
		
		//deixar_todas_as_letras_MAIUSCULAS.
		String s02 = original.toUpperCase();
		
		//remover_o_ultimo_espaco
		String s03 = original.trim();
		
		//imprimir_a_partir_de_(x).
		String s04 = original.substring(2);
		
		//imprimir_de_()_até_().
		String s05 = original.substring(2, 9);
		
		//substitui_a_letra_()_pela_letra_()
		String s06 = original.replace("S","a");
		
		//substitui_o_conjunto_de_letras_()_por_().
		String s07 = original.replace("as", "X");
		
		//mostra_a_primeira_posicao_da_letra_ou_conjunto
		int i = original.indexOf("as");
		
		//mostra_a_ultima_posicao_da_letra_ou_conjunto
		int j = original.lastIndexOf("as");
		
		//separa_as_palavras_em_vetores
		String[] vect = original.split(" ");
		
		
		
		System.out.println("original: " + original + "-");
		System.out.println("toLowerCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("trein: " + s03 + "-");
		System.out.println("substrin(2): " + s04 + "-");
		System.out.println("substrin(2,9): " + s05 + "-");
		System.out.println("replace: " + s06 + "-");
		System.out.println("replace_sequence: " + s07 + "-");
		System.out.println("indexOf " + s07 + "-");
		System.out.println("primeira_palavra: " + vect[0]);
		System.out.println("segunda_palavra: " + vect[1]);
		System.out.println("terceira_palavra: " + vect[2]);
		System.out.println("quarta_palavra: " + vect[3]);
		System.out.println("quinta_palavra: " + vect[4]);
		
	}

}
