package com.implementing.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
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

        selectionSort(arr);

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }

	
	public static int[] selectionSort(int arr[])
	{
		int min;
		int pos;
		int temp;
		for(int i=0; i<arr.length-1; i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr;
	}

}
