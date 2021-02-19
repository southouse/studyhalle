package datastructure;

/**
 * Created by southouse
 * Created on 2/19/2021.
 **/
public class ArrayList {

    private int size = 0;
    private Object[] elementData = new Object[100];

    public void add(Object element) {
        elementData[size] = element;
        size++;
    }

    public void add(int index, Object element) {
        for (int i = size; i >= index; i--)
            elementData[i] = elementData[i-1];

        elementData[index] = element;
        size++;
    }

    public void remove() {
        elementData[size-1] = null;
        size--;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++)
            elementData[i] = elementData[i+1];
        size--;
    }

    public String toString() {
        String content = "";
        for (int i = 0; i < size; i++)
            content += "ArrayList[" + i + "] = " + elementData[i] + "\n";

        return content;
    }

}
