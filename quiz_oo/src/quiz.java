import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String divisao = "\n---------------------------------------------\n";
        int resposta;

        String[] perguntas = {
                "Qual é o país mais rico do mundo? (de acordo com o pib)\n",
                "Qual é o país mais pobre do mundo? (de acordo com o pib)\n",
                "Qual é o país mais populoso do mundo?\n",
                "Qual é o país com mais poder militar do mundo?\n",
                "Qual é o maior páis do mundo geográficamente?\n",
                "Qual é o páis mais poluido do mundo?\n",
                "Qual foi o primeiro país a ser independente no mundo?\n",
                "Qual é o país com menor população do mundo?\n",
                "Qual é o país com com mais corrupção do mundo?\n",
                "Qual é o menor país do mundo?\n",
        };

        String[] alternativa = {
                "1 - Catar \n2 - China \n3 - Estados Unidos \n4 - Luxemburgo\n",
                "1 - Burundi \n2 - Serra Leoa \n3 - Somália \n4 - Níger\n",
                "1 - Estados Unidos \n2 - China \n3 - Japão \n4 - Rússia\n",
                "1 - Índia \n2 - Rússia \n3 - China \n4 - Estados Unidos\n",
                "1 - Canadá \n2 - Estados Unidos \n3 - China \n4 - Rússia\n",
                "1 - Paquistão \n2 - Bangladesh \n3 - Saara \n4 - China\n",
                "1 - Japão \n2 - Israel \n3 - Egito \n4 - China\n",
                "1 - Honduras \n2 - San Marino \n3 - Vaticano \n4 - Cuiabá\n",
                "1 - Somália \n2 - Afeganistão \n3 - Angola \n4 - Singapura\n",
                "1 - Vaticano \n2 - Tuvalu \n3 - Holanda \n4 - San Marino\n",
        };

        int[] corretas = {3, 1, 2, 4, 4, 2, 1, 3, 1, 1};

        Usuario usuario = new Usuario();

        for (int i = 0; i < perguntas.length; i++) {

            System.out.println("Pergunta " + (i + 1) + ": \n");
            System.out.println(perguntas[i]);
            System.out.println(alternativa[i]);

            resposta = sc.nextInt();

            if ( resposta == corretas[i] ) {
                System.out.println("Você acertou!");
                System.out.println(divisao);

                usuario.acerto();
            } else {
                System.out.println("Você errou!\n");
                System.out.println(divisao);
            }
        }

        usuario.fimDeJogo(perguntas);
    }
}