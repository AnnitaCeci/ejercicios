/**
 * Created by ana on 16/05/17.
 */
public class Carta {

    /**
     * PALO
     */

    public final static int CORAZONES = 0;
    public final static int DIAMANTES = 1;
    public final static int TREBOL = 2;
    public final static int ESPADAS = 3;

    /**
     * VALOR
     */
    public final static int AS = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;


    private final int palo;
    private final int valor;


    public Carta(int palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public int getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    public int getValorPlus(int cartaVal) {

    }




    public String getPaloString() {
        switch (palo) {
            case CORAZONES:
                return "Corazones";
            case DIAMANTES:
                return "Diamantes";
            case TREBOL:
                return "Trebol";
            case ESPADAS:
                return "Espadas";
            default:
                return "";
        }
    }




    public String getValorString() {
        switch (valor) {
            case 1:
                return "A";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        return "(" + this.getPaloString() + " , " + this.getValorString()+  ")";
    }
}
