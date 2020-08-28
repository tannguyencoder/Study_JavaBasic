/**
 * Viết chương trình nhập n dòng và m cột,
 * Các phần từ >0 và <100
 * a. Tìm phần tử lớn nhất và chỉ số
 * b. Tìm in ra ma trận nếu không thì bằng 0
 * c. Sắp xất tất cả các cột của ma trận theo thứ tự tăng dần
 * d. Tìm cột có nhiều số nguyên tố nhất.
 */
package practice;

import java.util.Scanner;

public class baitap3 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int row,column;
		System.out.println("Input Row: ");
		row = scanner.nextInt();
		System.out.println("Input Column: ");
		column = scanner.nextInt();
		
		
		int[][] arr = new int[row][column];
		arr = InputArr(arr, row, column);
		scanner.close();
		ShowArr(arr,row,column);
		
		System.out.println("a. Find max and position: ");
		FindMax(arr, row, column);
		System.out.println("b. Find and print matrix only snt: ");
		EditMatrix(arr, row, column);
		System.out.println("c. Arrangment column Matrix");
		SoftbyColum(arr, row, column);
		System.out.println("d. find Colum the most So Nguyen To:");
		FindColumn(arr, row, column);
	}
	public static void FindColumn(int[][] arr,int row,int column) {
		int[][] arredit = new int[row][column];
		int[] arrKQ = new int[column];
		int count=0;
		int temp=0,index=0;
		CopyMatrix(arr, arredit,row, column);
		for(int j=0;j<column;j++) {
			for(int i=0;i<row;i++) {
				for(int k=2;k<=arredit[i][j];k++) {
					if(arredit[i][j]%k==0) {
						count++;
					}
				}
				if(count==1) {
					temp++;
				}
				count=0;
			}
			arrKQ[j]=temp;
			temp=0;
		}
		temp=arrKQ[0];
		for(int i=0;i<column;i++) {
			if(temp<arrKQ[i]) {
				temp = arrKQ[i];
				index=i;
			}
		}
		for(int i=0;i<row;i++) {
			System.out.print(arr[i][index]+"\t");
		}
	}
	public static void CopyMatrix(int[][] arrIn, int[][] arrOut,int a,int b) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arrOut[i][j]=arrIn[i][j];
			}
		}
	}
	public static void SoftbyColum(int[][] arr,int row,int column) {
		int[][] arredit = new int[row][column];
		CopyMatrix(arr, arredit,row, column);
		for(int j=0;j<column;j++) {
			for(int i=0;i<row-1;i++) {
				for(int k=0;k<row-i-1;k++) {
					if(arredit[k][j]>arredit[k+1][j]) {
						int temp =arredit[k][j];
						arredit[k][j]=arredit[k+1][j];
						arredit[k+1][j] = temp;
					}
				}
			}
		}
		ShowArr(arredit, row, column);
	}
	public static void EditMatrix(int[][] arr,int row,int column) {
		int[][] arredit = new int[row][column];
		int count=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				for(int k=2;k<=arr[i][j];k++) {
					if(arr[i][j]%k==0) {
						count ++;
					}
				}
				if(count==1) {
					arredit[i][j]=arr[i][j];
				}
				else {
					arredit[i][j]=0;
				}
				count=0;
			}
		}
		ShowArr(arredit, row, column);
	}
	
	public static void FindMax(int[][] arr,int row,int column) {
		int[] a = new int[3];
		a[0] = arr[0][0];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(a[0]<arr[i][j]) {
					a[0] = arr[i][j];
					a[1]=i;
					a[2]=j;
				}
			}
		}
		System.out.println("Max is: A["+a[1]+"]["+a[2]+"]"+"="+a[0]);
	}
	
	public static int[][] InputArr(int[][] arr,int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				do{
					System.out.println("Input [" + i + "," + j +"]:");
					arr[i][j]=scanner.nextInt();
				}while(arr[i][j]<0 || arr[i][j]>100);
				
			}
		}
		return arr;
	}
	
	public static void ShowArr(int[][] arr,int row,int column){
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
