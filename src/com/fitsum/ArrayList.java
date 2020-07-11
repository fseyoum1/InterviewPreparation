package com.fitsum;


/*
This is an arrayList implementation of mine
 */
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

    // This is sample 
    // implement add to the front
    public void addToFront(T data) {

        if(data == null) {
            throw new IllegalArgumentException("You cannot add null to the data structure.");

        }
        if (size == backingArray.length) {
            // resize
            T[] arr = (T[]) new Object[2*INITIAL_CAPACITY];

            arr[0] = data;
            size++;
            for (int i = 0; i < backingArray.length; i++) {

                arr[i+1] = backingArray[i];
            }

            backingArray = arr;

        }  else {
            for (int i = size; i > 0; i--) {

                backingArray[i] = backingArray[i-1];
            }
            backingArray[0] = data;
            size++;

        }
    }
    // add to back
    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("No null");
        }
        if (size == backingArray.length) {
            T[] arr = (T[]) (new Object[INITIAL_CAPACITY*2]);

            for (int i = 0; i < size; i++) {
                arr[i] = backingArray[i];
            }
            arr[size] = data;
            size++;
            backingArray = arr;
        } else {
            backingArray[size] = data;
            size++;
        }
    }

    public T removeAtIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("incorrect index");
        }
        T result = null;
        if (index == size-1) {
            result = backingArray[index];
            backingArray[index] = null;
            size--;
            return result;
        } else {

            result = backingArray[index];
            for (int i = index+1; i < size; i++) {
                backingArray[i-1] = backingArray[i];
            }
            backingArray[size-1] = null;
            size--;
            return  result;

        }

    }

    public T removeFromFront() {
        if (backingArray.length == 0) {
            throw new IllegalArgumentException("No element in the data structure, empty");
        }

        T result = backingArray[0];

        for (int i = 0; i < backingArray.length-1; i++) {
            backingArray[i] = backingArray[i+1];
        }
        backingArray[size-1] = null;
        size--;

        return result;

    }

    public T removeFromBack() {
        if (backingArray.length == 0) {
            throw new IllegalArgumentException("No element in the data structure, empty");
        }
        T back = backingArray[size-1];
        backingArray[size-1] = null;
        size--;

        return back;

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


    public void clear() {
        // clears the array and elements will be removed

        T[] arr = (T[]) new Object[INITIAL_CAPACITY];

        backingArray = arr;
        size = 0;


    }

}
