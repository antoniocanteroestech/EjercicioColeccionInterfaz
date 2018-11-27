package es.estech.acantero;

public class Main {

    public static void rellenar(Pila pila){
        for (int i = 1; i < 11; i++){
            pila.anadir(i);
        }

        for (Object o: pila.getObjects()) {
            System.out.println(o);
        }
    }

    public static void imprimirYVaciar(Pila pila){
        for (Object o: pila.getObjects()) {
            System.out.println(pila.getObjects()[0]);
            pila.extraer();
        }
    }

    public static void main(String[] args) {

        Pila pilaTest = new Pila (new Object[10], 0);
        rellenar(pilaTest);
        imprimirYVaciar(pilaTest);

        /*for (Object o: pilaTest.getObjects()) {
            System.out.println(o);
        }*/
    }
}
