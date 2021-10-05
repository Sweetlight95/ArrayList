package dataStructure;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int[] elements;
//    private int element;
    private int size;

    public ArrayList() {
        elements = new int[3];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
        public void add(int element){
        boolean isFull = getCapacity() == size;
        if(isFull){
            int[] newArray = new int[elements.length * 2]; //create new array , copy content of old into new, swap old for new, add new elemnet
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[size++] = element;

    }
    public void add(int element, int position){
        elements[position] = element;
    }
//        public void remove(int element){
//        size--;
//    }
    public int size() {
        return size;
    }

    public void remove(int element) {
        if (isEmpty()) throw new IllegalArgumentException("Arrayliist is empty");
            size --;
    }
    public int get(int position){
        return elements[position];
    }
    public int getIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element){
                return  i;
            }
        }
        return 0;
    }

    @Override
    public int getCapacity() {
        return elements.length;
    }
}
