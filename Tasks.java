package basic_syntax;

import java.util.Arrays;

public class Tasks {
	
	public static int secoundMax(int[] arr) {
		int mini = 0, max = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				mini = max;
				max = arr[i];
			}
		}
		return mini;
	}
	
	public static void frequency(int[] arr) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			int y = 0;
			for (int j = 0 ; j < arr.length ; j++) {
				if (arr[i] == arr[j]) {
					y++;
				}
			}
			System.out.println("Element in arr "+arr[i] + " Frequency of the element in the array "+y);
		}
	}
	public static void oneAndZerosSorted(int[] ones) {
		
		int i = 0 , j = ones.length-1;
		
		while (i <= j) {
			if (ones[i] == 0) {
				i++;
			}
			else if(ones[j] == 1) {
				j--;
			}
			else {
				int temp = ones[i];
				ones[i] = ones[j];
				ones[j] = temp;
			}
		}
		
		for (int num : ones) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
	
	public static void copyingArrays(int[] arr,int[] ones) {
		for (int i = 0 ; i < arr.length ; i++) {
			ones[i] = arr[i];
		}
		for (int num : ones) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
	public static int[] duplicatesElements(int[] arr, int[] ones) {
		int[] result = new int[Math.min(arr.length, ones.length)];
		int index = 0;
		boolean present = false;
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < ones.length ; j++) {
				if (arr[i] == ones[j]) {
					present = false;
					for (int k = 0 ; k < result.length ; k ++){
						if (result[k] == arr[i]) {
							present = true;
							break;
						}
					}
					if (!present) {
						result[index++] = arr[i];
					}
				}
			}
		}
		for (int num : result) {
			System.out.print(num+" ");
		}
		
		int[] temp = new int[index];
		for (int i = 0 ; i < index ; i++) {
			temp[i] = result[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = {3,5,6,2,6,6};
		int ans = Tasks.secoundMax(arr);
		Tasks.frequency(arr);

		int ones[] = {1,1,0,1,0,0,1,0,0};
		Tasks.oneAndZerosSorted(ones);
		Tasks.copyingArrays(arr,ones);
		
		int[] result = Tasks.duplicatesElements(arr, ones);
		System.out.println(Arrays.toString(result));
		System.out.println(ans);
	}
}
