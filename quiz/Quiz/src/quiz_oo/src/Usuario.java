class Usuario {

    private int points = 0;

    public void acerto() {
        points++;
    }

    public void fimDeJogo(String[] perguntas) {
        System.out.println("Você acertou " + points + " de " + perguntas.length);

        if (points > ( perguntas.length/2+2) ) {
            System.out.println("Você foi aprovado");
        } else  {
            System.out.println("Você foi reprovado");
        };
    }

}
