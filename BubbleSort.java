package basic_syntax;

import java.util.Scanner;
public class BubbleSort {
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubbleSort(int[] arr) {
		for (int i = arr.length-1 ; i >= 0 ; i--) {
			for (int j = 0; j < i ; j++) {
				if (arr[j] > arr[j+1]) {
					BubbleSort.swap(arr, j, j+1);
				}
			}
		}
	}
	public static void selectionSort(int[] arr) {
		int mini = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			mini = i;
			for (int j = i ; j < arr.length ; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			BubbleSort.swap(arr, mini, i);
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {7,6,5,4,3,2,1};
//		BubbleSort.bubbleSort(arr);
		BubbleSort.selectionSort(arr);
		for (int num : arr) System.out.println(num);
		sc.close();
	}

}
