package com.test.quiz02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���(1~4) / ����(5)");
			int input = scan.nextInt();
			String star = "*";
			String blank = " ";
			
			if(input == 5){
				System.out.println("�����Ͽ����ϴ�.");
				break;
			}else if(input < 0 || input > 5){
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
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
