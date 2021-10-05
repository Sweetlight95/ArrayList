package dataStructure;

public interface List {
    boolean isEmpty();
    
    void add(int element);

    void remove(int element);

    void size(int element);

    int get(int position);

    int getIndexOf(int element);

    int getCapacity();
}

