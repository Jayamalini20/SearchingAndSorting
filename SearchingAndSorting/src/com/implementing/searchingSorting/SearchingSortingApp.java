package com.implementing.searchingSorting;

import java.util.Scanner;

public class SearchingSortingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the "+arr.length+" elements of the array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		SearchingSorting ss=new SearchingSorting();
		System.out.println("Do you want to sort the array?\nIf yes, type 'true' else type 'false'");
		boolean flag=false;
		flag=sc.nextBoolean();
		if(flag) {
			System.out.print("Which Sorting method do you want to use? \n1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n");
			switch (sc.nextInt()) {
			case 1:
				int[] bsres=ss.bubbleSort(arr);
				for(int x: bsres)
				{
					System.out.print(x+" ");
				}
				System.out.println();
				break;
			case 2:
				int[] ssres=ss.selectionSort(arr);
				for(int x: ssres)
				{
					System.out.print(x+" ");
				}
				System.out.println();
				break;
			case 3:
				int[] isres=ss.insertionSort(arr);
				for(int x: isres)
				{
					System.out.print(x+" ");
				}
				System.out.println();
				break;
			}
		}
		System.out.print("What type of searching do you want to perform? \n1.Linear Search\n2.Binary Search\n");
		int k=sc.nextInt();
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		switch (k) {
		case 1:
			ss.linearSearch(arr,key);
			break;
		case 2:
			if(flag)
			{
				ss.binarySearch(arr,key);
				break;
			}
			else
				System.out.println("Perform Sorting before using Binary Search");
		}
		
		sc.close();
	}

}
