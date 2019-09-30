import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<E> implements Set<E> {

    //Después de que falle el segundo test, hay que implementar el método add(), pero hay que almacenar en algún lado
    // las cosas.
    private Object[] internal = {};

    public int size() {
        return internal.length;
    }

    /*
    Esta es la primera  versión que se hace. Como el test falla, hay que cambiar el tipo de retorno.
    public boolean isEmpty() {
        return false;
    }
    */

    /*
    Esta es la segunda versión que se hace. Como el test falla en cuanto tiene un elemento, porque siempre devuelve
    el mismo valor, hay que meter más condiciones.
    public boolean isEmpty() {
        return true;
    }
    */

    /*
    En esta tercera versión, ya pasa los tests, pero hay que hacer el tercer paso del TDD, que es la refactorización.
     Por eso se hace una nueva versión.
    public boolean isEmpty() {
        if(internal.length != 0) {
            return false;
        } else {
            return true;
        }
    }
     */

    public boolean isEmpty() {
        return internal.length == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    //La primera implementación de este método es para sustituir el internal por un array compuesto únicamente por el
    // elemento que se le pasa por parámetro.
    public boolean add(E e) {
        Object[] aux = Arrays.copyOf(internal,internal.length+1);
        aux[internal.length] = e;
        internal = aux;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }
}
