/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsselectsort;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class DSSelectSort {

    static Scanner scn;
    public static void main(String[] args) {
    long startTime = System.currentTimeMillis(); 
    try
    {
        scn = new Scanner(new File("test/words.txt"));
    }
    catch(FileNotFoundException ex)
    {
        System.out.println(ex.getMessage());
    }
    System.out.println("Items loaded into the Array: ");
    
    String[] array = scn.next().split(",");
    System.out.println(array.length);
        
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        //Selection Sort
        String [] select = new String[array.length]; //create new select array to make a copy of original array
        System.arraycopy(array, 0, select, 0, array.length);
        
        String temp;
        for (int i = 0; i < select.length; i++) 
        {
            for (int j = i + 1; j < select.length; j++) 
            {
                if (select[i].compareTo(select[j])>0) 
                {
                    temp = select[i];
                    select[i] = select[j];
                    select[j] = temp;
                }
            }
        }
        
        System.out.print("\n");
        System.out.println("Unique Items in Selection Sorted Array Order:");
        String s = select[0];
        System.out.print(s);
        for (int i = 1; i < select.length; i++)
        {
            if (!select[i].equals(s))
            {
                s = select[i];
                System.out.print(", " + select[i]);
            }
            
        }
        long endTime = System.currentTimeMillis();
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Selection Sort Took " + (endTime - startTime) + " milliseconds");
    }
    
}
