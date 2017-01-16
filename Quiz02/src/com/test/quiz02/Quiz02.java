package com.test.quiz02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요(1~4) / 종료(5)");
			int input = scan.nextInt();
			String star = "*";
			String blank = " ";
			
			if(input == 5){
				System.out.println("종료하였습니다.");
				break;
			}else if(input < 0 || input > 5){
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				continue;
			}
			else{
				if(input < 3){
					for(int i = 0, k = 4; i < 5; i++, k--){
						if(input == 2){
							for(int j = 0; j < k; j++){
								System.out.print(blank);
							}
						}					
						System.out.println(star);
						star = star + "*";
					}
				}
				else{
					for(int i = 0, k = 5; i < 5; i++, k--){
						if(input == 4){
							for(int j = 0; j < k; j++){
								System.out.print(star);
							}
							System.out.println(blank);
							blank = blank + " ";
						}else{
							for(int j = 0; j < k; j++){
								System.out.print(star);
							}
							System.out.println("");
						}
						
					}
				}
			}			
			
		}	

	}

}
