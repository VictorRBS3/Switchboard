public class Central {
    private Llamada[] llamadas;
    private int numCalls;

    public Central(int numMaxCalls) {
        numCalls = 0;
        llamadas = new Llamada[numMaxCalls];
        for (int i = 0; i < llamadas.length; i++) {
            llamadas[i] = null;
        }
    }

    public void registerCall(Llamada llamada) {
        llamadas[numCalls] = llamada;
        numCalls++;
    }

    public int getNumCalls() {
        return numCalls;
    }

    public int getTotalCost() {
        int total = 0;
        for(int i = 0; i < numCalls; i++) {
            total = total + llamadas[i].getCost();
        }
        return total;
    }
}
