package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try {
            ArrayList<String> fitsumArrayList = new ArrayList<String>();
            fitsumArrayList.addAtIndex(0, "hi");
            fitsumArrayList.addAtIndex(1, "hello");
            fitsumArrayList.addAtIndex(2, "I");
            fitsumArrayList.addAtIndex(3, "here");
            fitsumArrayList.addAtIndex(2, "resized");

            System.out.println(fitsumArrayList.getElement(2));
            System.out.println(fitsumArrayList.getSize());

            for (int i = 0; i < fitsumArrayList.getSize(); i++) {

                System.out.print(fitsumArrayList.getElement(i) + " ");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

