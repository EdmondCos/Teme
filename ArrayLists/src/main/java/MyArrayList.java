import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {
    private int size;
    private Object[] arr;

    MyArrayList() {
        arr = new Object[3];
        size = 0;
    }

    MyArrayList(int size) {
        arr = new Object[size];
        this.size = 0;
    }

    public boolean add(T t) {
        if (size < arr.length) {
            arr[size++] = t;
        } else {
            Object[] temp = new Object[size + size / 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;

            arr[size++] = t;
        }
        return true;
    }

    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        for (Object obj : arr) {
            if (o.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public T remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[index] = arr[index + 1];
        }
        arr[size--] = null;
        return null;
    }

//    ================================================================================

    public boolean isEmpty() {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {

    }

    public boolean remove(Object o) {
        return true;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}