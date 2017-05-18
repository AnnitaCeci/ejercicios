public class Main {

    public static void main(String[] args) {

        int numeroJugadores = 2;
        Juego juegos[];

        juegos = new Juego[numeroJugadores];
        for (int j = 0; j < numeroJugadores; j++) {
            juegos[j] = new Juego();
        }

         jugar(numeroJugadores, juegos);

    }


    static void jugar(int numeroJugadores, Juego[] juegos) {
        MazoCartas mazoCartas;
        Juego juegoBanca;

        boolean fin = false;


        mazoCartas = new MazoCartas();
        mazoCartas.revolver();

        juegoBanca = new Juego();

        do {
            juegoBanca.tomarCarta(mazoCartas.robar());


            for (int i = 0; i < numeroJugadores; i++) {
                juegos[i].tomarCarta(mazoCartas.robar());

                if (juegos[i].getBlackjackValor() == 21) {
                    fin = true;
                    System.out.println("ha ganado jugador : " + (i+1));
                    System.out.println("----------------------------");
                }

                if (juegos[i].getBlackjackValor() > 21) {
                    fin = true;
                    System.out.println("Se ha pasado de 21 el jugador " + (i + 1));
                    System.out.println("----------------------------");
                }
                if (fin) break;
            }

            if (juegoBanca.getBlackjackValor() == 21 && fin != true) {
                System.out.println("La Banca gana.");
                System.out.println("----------------------------");
                fin = true;
            }
            if (juegoBanca.getBlackjackValor() > 21 && fin != true) {
                fin = true;
                System.out.println("La Banca se ha pasado de 21");
                System.out.println("----------------------------");
            }

            System.out.println("Juegos ");

            System.out.println("Banca     : " + juegoBanca.toString());
            System.out.println("Jugador 1 : " + juegos[0].toString());
            System.out.println("Jugador 2 : " + juegos[1].toString());

        }
        while(fin!=true);


        System.out.println("Puntos Banca     = " + juegoBanca.getBlackjackValor());
        for (int i = 0; i < numeroJugadores; i++) {
            System.out.println("Puntos Jugador " + (i+1) + " = " + juegos[i].getBlackjackValor());
        }

    }

}
