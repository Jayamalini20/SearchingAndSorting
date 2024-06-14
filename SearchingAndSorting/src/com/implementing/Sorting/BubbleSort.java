package com.implementing.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
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

        bubbleSort(arr);

        System.out.println("After Sorting!");
        System.out.println(Arrays.toString(arr));
    }


	
	public static int[] bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
