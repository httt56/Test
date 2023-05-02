package Beajoon;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		/*예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		 *     	*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		 * */
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		System.out.println("홀수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for (int i=0;i<num;i++){
				for (int j=0; j<num;j++)
				{
		     if (i<=num/2)// 위쪽 영역
		     {
		        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *찍기
		     }
		     else if (i>num/2) //아래쪽 영역
		     {
		        if (i-j>=num/2+1) //왼쪽 밑 공백
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *찍기
		     }
		  }
		  System.out.println();//줄바꿈
		}
	}

}
