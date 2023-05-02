package Beajoon;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		/* 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
		 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 
		 * 구하는 프로그램을 작성하시오.
		 * 
		 * 	3 23 85 34 17 74 25 52 65
			10 7 39 42 88 52 14 72 63
			87 42 18 78 53 45 18 84 53
			34 28 64 85 12 16 75 36 55
			21 77 45 35 28 75 90 76 1
			25 87 65 15 28 11 37 28 74
			65 27 75 41 7 89 78 64 39
			47 47 70 45 23 65 3 41 44
			87 13 82 38 31 12 29 29 80
		 * */
		
		Scanner sc = new Scanner(System.in);
		int arr [][]= new int[9][3];
		int max = -1;
		int x=0;
		int y=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max) {
					
					max=arr[i][j];
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " " +y);
		
	}

}
