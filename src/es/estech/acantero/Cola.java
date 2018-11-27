package es.estech.acantero;

import java.util.ArrayList;
import java.util.List;

public class Cola implements ColeccionInterfaz {

    private List<Object> lista;

    public Cola(ArrayList<Object> lista) {
        this.lista = lista;
    }

    public List<Object> getLista() {
        return lista;
    }

    @Override
    public boolean estaVacia() {
        if (this.lista.isEmpty()) return true;
        return false;
    }

    @Override
    public Object extraer() {
        Object object = this.lista.get(0);
        this.lista.remove(0);
        return object;
    }

    @Override
    public Object primero() {
        return this.lista.get(0);
    }

    @Override
    public boolean anadir(Object object) {
        return this.lista.add(object);
    }
}
