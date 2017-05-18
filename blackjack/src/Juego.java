
import java.util.Vector;

/**
 * Created by ana on 17/05/17.
 */
public class Juego {

    private Vector mano;

    public Juego() {
        mano = new Vector();
    }


    public void tomarCarta(Carta carta) {
        if (carta != null) {
            mano.addElement(carta);
        }
    }


    public int contar() {
        return mano.size();
    }


    public Carta obtenerCarta(int pos) {
        if (pos >= 0 && pos < mano.size())
            return (Carta) mano.elementAt(pos);
        else
            return null;
    }
    public int getBlackjackValor() {
        int val;
        boolean as;
        int cartas;
        val = 0;
        as = false;
        cartas = contar();
        for (int i = 0; i < cartas; i++) {
            Carta carta;
            int cartaVal;
            carta = obtenerCarta(i);
            cartaVal = carta.getValor();
            if (cartaVal == 1) {
                as = true;
            }
            val = val + cartaVal;
        }

        if (as == true && val + 10 <= 21)
            val = val + 10;
        return val;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "mano=" + mano +
                '}';
    }
}
