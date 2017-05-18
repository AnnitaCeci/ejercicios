/**
 * Created by ana on 17/05/17.
 */
public class MazoCartas {

    private static Carta[] baraja;
    private int cartasTomadas = 0;

    public MazoCartas() {
        baraja = new Carta[52];
        int creadas = 0;
        for (int palo = 0; palo <= 3; palo++) {
            for (int valor = 1; valor <= 13; valor++) {
                baraja[creadas] = new Carta(palo, valor);
                creadas++;
            }
        }
        cartasTomadas = 0;
    }

    public void revolver() {
        for (int i = 51; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Carta temp = baraja[i];
            baraja[i] = baraja[rand];
            baraja[rand] = temp;
        }
        cartasTomadas = 0;
    }


    public Carta robar() {
        if (cartasTomadas == 52)
            revolver();
        cartasTomadas++;
        return baraja[cartasTomadas - 1];
    }
}
