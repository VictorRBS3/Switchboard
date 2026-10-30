public class Exercise5 {
    public static void main(String[] args) {
        Central central = new Central(1000);
        central.registerCall(new Llamada("555-43679" , "555-43467" , 30, 1, false));
        central.registerCall(new Llamada("555-43666" , "555-43498" , 24, 2, false));
        central.registerCall(new Llamada("555-43006" , "555-43123" , 60, 3, false));
        System.out.println("Número total de llamadas: " + central.getNumCalls());
        System.out.println("Coste total de las llamadas: " + central.getTotalCost());
    }
}
