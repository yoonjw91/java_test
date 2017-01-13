package com.test.helloword;

import java.util.Scanner;

public class HelloWord {
	public static void main(String args[]){
		System.out.println("Hello Word!");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문제 번호를 입력해주세요 : ");
		int input = scan.nextInt();
		int fix = input;
		String answer = "";
		
		if(input > 0 && input < 6){
			answer = Quiz(input);			
		}	
		else {		
			System.out.print("1에서 5까지의 숫자만 입력하세요");
			System.out.print("문제 번호를 입력해주세요 : ");
			input = scan.nextInt();
		}
		
		
		while(true){
			System.out.print("정답은? : ");
			String trial = scan.nextLine();
			
			if(answer.equals(trial)){
				System.out.println("짝짝짝 정답입니다!");	
				break;
			}
			else {
				System.out.println("다시 생각해보세요!");
				Quiz(fix);
			}
		}
		
		
	}
	
	public static String Quiz(int input){
		String[] matrix1 = {"┌─────────┐",
							"│ 육 두 쌍 칸 │",
							"│ 짜 까 치 곱 │",
							"│ 창 동 겹 파 │",
							"│ 자 뽕 면 발 │",
							"└─────────┘"};
		String[] matrix2 = {"┌─────────┐",
							"│ 지 원 주 명 │",
							"│ 우 수 동 환 │",
							"│ 박 성 연 인 │",
							"│ 진 정 이 롱 │",
							"└─────────┘"};
		String[] matrix3 = {"┌─────────┐",
							"│ 장 훈 용 찬 │",
							"│ 서 희 구 진 │",
							"│ 다 호 최 유 │",
							"│ 상 열 준 범 │",
							"└─────────┘"};
		String[] matrix4 = {"┌─────────┐",
							"│ 코 염 슴 치 │",
							"│ 호 끼 수 지 │",
							"│ 고 랑 원 린 │",
							"│ 가 릴 타 문 │",
							"└─────────┘"};
		String[] matrix5 = {"┌─────────┐",
							"│ 건 제 검 박 │",
							"│ 우 빈 공 부 │",
							"│ 유 잔 상 든 │",
							"│ 훤 이 만 호 │",
							"└─────────┘"};
		
		String answer = "";
		if(input == 1){
			System.out.println("문제 1");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix1[i]);
			}
			answer = "곱창";		
		}
		else if(input == 2){
			System.out.println("문제 2");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix2[i]);
			}
			answer = "이명우";
		}
		else if(input == 3){
			System.out.println("문제 3");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix3[i]);
			}
			answer = "유희상";
		}
		else if(input == 4){
			System.out.println("문제 4");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix4[i]);
			}
			answer = "치타";
		}
		else if(input == 5){
			System.out.println("문제 5");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix5[i]);
			}
			answer = "공유";
		}
		return answer;
	}
}
