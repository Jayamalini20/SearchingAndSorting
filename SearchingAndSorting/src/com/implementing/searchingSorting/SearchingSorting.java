package com.implementing.searchingSorting;

public class SearchingSorting {
	public int[] bubbleSort(int arr[])
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
	public int[] selectionSort(int arr[])
	{
		int min;
		int pos;
		int temp;
		for(int i=0; i<arr.length-1;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1; j<arr.length-1; j++)
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
	public int[] insertionSort(int arr[])
	{
		for(int i=1; i<arr.length-1;i++)
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
	public void linearSearch(int arr[], int key)
	{
		boolean flag=false;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key found at "+i+" position");
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Key not found");
		
	}
	public void binarySearch(int arr[], int key)
	{
		boolean flag=false;
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println("Key found at "+mid+" position");
				flag=true;
				break;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(!flag)
			System.out.println("Key not found");
			
	}

}
