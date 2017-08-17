package Day1;

import java.util.Arrays;

public class BubbleSort {
public static void main(String args[]){
	int arr[]= {4,6,2,8,5};
	int temp=0;
	for (int i=0;i<4;i++){
		for (int j=0; j<4-i;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	
}
}
