package com.implementing.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the "+arr.length+" elements of the array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
        sc.close();
        System.out.println("Before Sorting!");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }

	
	public static int[] insertionSort(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int j=i-1;
			int item=arr[i];
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		return arr;
	}
	
}
