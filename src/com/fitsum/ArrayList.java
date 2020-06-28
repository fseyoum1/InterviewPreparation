package com.fitsum;

public class ArrayList<T> implements ArrayListInterface{

    private T[] backingArray;
    private int size;


    /*
    constructor
    since it is generic means we do not know the type we are just initializing using
    object and then cast it to the generic array
    */
    public ArrayList() {
        backingArray = (T[]) (new Object[INITIAL_CAPACITY]);
    }


    public void addAtIndex(int index, T data) {
        if (index < 0 || index > size) {
            String message = "Please provide a valid index";
            throw new IndexOutOfBoundsException(message);
        }
        if (data == null) {
            throw new IllegalArgumentException("Cannot add null to the data structure.");
        }
        // if it is full resize it to twice its size 
        if (size == backingArray.length) {
            // resize it to 2*size
            T[] newArr = (T[])(new Object[2*INITIAL_CAPACITY]);

            for (int i = 0; i < index; i++) {
                newArr[i] = backingArray[i];
            }
            newArr[index] = data;
            size++;
            //  we could add the new element anywhere so we have to make space first for the new element

            for (int i = index; i < backingArray.length ; i++) {
                newArr[i+1] = backingArray[i];
            }
            backingArray = newArr;

        } else {
            for (int i = size; i > index; i--) {

                backingArray[i] = backingArray[i - 1];

            }
            backingArray[index] = data;
            size++;
        }
      
    }

    public T getElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("provide valid index");
        } else {

            return backingArray[index];
        }

    }
    public int getSize() {
        return size;
    }

}
