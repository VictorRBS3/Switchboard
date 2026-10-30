public class Llamada {

    public static final int PRECIO_LOCAL = 15;
    public static final int PRECIO_BANDA_1 = 20;
    public static final int PRECIO_BANDA_2 = 25;
    public static final int PRECIO_BANDA_3 = 30;

    private String origen;
    private String destino;
    private int duracion;
    private int banda;
    private boolean local;

    public Llamada(String origen, String destino, int duracion, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.banda = banda;
        this.local = local;
    }

    @Override
    public String toString() {
        String tipo;
        if (local) {
            tipo = "local ";
        } else {
            tipo = "provincial";
        }
        return "Origen: " + origen + " Destino: " + destino + " Duración: " + duracion + " Banda: " + banda + " Tipo: " + tipo;
    }

    public int getCost() {
        if (local) {
            return PRECIO_LOCAL * duracion;
        } else {
            if (banda == 1) {
                return PRECIO_BANDA_1 * duracion;
            } else {
                if (banda == 2) {
                    return PRECIO_BANDA_2 * duracion;
                } else {
                    if (banda == 3) {
                        return PRECIO_BANDA_3 * duracion;
                    }
                }
            }
        }
        return PRECIO_LOCAL;
    }
}