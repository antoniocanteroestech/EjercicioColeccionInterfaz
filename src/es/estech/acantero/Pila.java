package es.estech.acantero;

public class Pila implements ColeccionInterfaz {

    private Object[] objects;
    private int counter;

    public Pila(Object[] objects, int counter) {
        this.objects = objects;
        this.counter = counter;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean estaVacia() {
        if (objects[0] == null) return true;
        return false;
    }

    @Override
    public Object extraer() {
        Object object = objects[0];
        for (int i = 1; i < objects.length; i++){
            /*if (i < objects.length-2)*/ objects[i-1] = objects [i];
            if (i == objects.length-1) objects[i] = null;
        }
        return object;
    }

    @Override
    public Object primero() {
        return objects[0];
    }

    @Override
    public boolean anadir(Object object) {
        for (int i = 0; i < objects.length; i++){
            if (null == objects[i]){
                objects[i] = object;
                return true;
            }
        }
        return false;
    }
}
