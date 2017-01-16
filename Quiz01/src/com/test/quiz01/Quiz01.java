package com.test.quiz01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input, num;
		String trial;
		String ans = "";
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      M E N U     │");
		System.out.println("│ 1.게임시작     	   │");
		System.out.println("│ 2.게임종료     	   │");
		System.out.println("└──────────────────┘");
		input = scan.nextInt();
		num = 1;
		if (input == 1) {
			while(true){
				ans = quiz(num);
				
				Scanner scan2 = new Scanner(System.in);
				while(true){
					System.out.print("정답은? : ");
					trial = scan2.nextLine();
					if(trial.equals(ans)){
						break;
					}else{
						System.out.println("틀렸습니다. 정답을 입력하세요.");
					}
				}
				System.out.println("정답입니다!");
				System.out.print("계속하시겠습니까?(y/n) : ");
				trial = scan2.nextLine();
				if(trial.equals("n")){
					System.out.println("<<문제풀이 종료>>");
					break;
				}
				else if(num >= 8){
					System.out.println("모든 문제를 다 푸셨습니다. 수고하셨습니다!");
					break;
				}
				else{
					num++;
				}
			}
			
		} else if (input == 2) {
			System.out.println("게임을 종료합니다.");
		} else {
			System.out.println("잘못 입력했습니다. 게임을 종료합니다.");
		}
	}
	
	static String quiz(int input){
		String answer = "";
		
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
		String[] matrix6 = {"┌─────────┐",
							"│ 마 스 콜 두 │",
							"│ 용 테 고 링 │",
							"│ 축 역 프 수 │",
							"│ 양 야 말 승 │",
							"└─────────┘"};
		String[] matrix7 = {"┌─────────┐",
							"│ 이 플 동 에 │",
							"│ 두 수 성 나 │",
							"│ 글 한 케 다 │",
							"│ 디 레 엘 티 │",
							"└─────────┘"};
		String[] matrix8 = {"┌─────────┐",
							"│ 환 티 아 봉 │",
							"│ 마 콜 운 레 │",
							"│ 사 스 밀 다 │",
							"│ 수 붕 제 비 │",
							"└─────────┘"};
		if(input == 1){
			System.out.println("문제 1 : 음식");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix1[i]);
			}
			answer = "곱창";		
		}
		else if(input == 2){
			System.out.println("문제 2 : 우리반 사람들 중에 한명");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix2[i]);
			}
			answer = "이명우";
		}
		else if(input == 3){
			System.out.println("문제 3 : 우리반 사람들 중에 한명");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix3[i]);
			}
			answer = "유희상";
		}
		else if(input == 4){
			System.out.println("문제 4 : 동물");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix4[i]);
			}
			answer = "치타";
		}
		else if(input == 5){
			System.out.println("문제 5 : 남자배우");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix5[i]);
			}
			answer = "공유";
		}
		else if(input == 6){
			System.out.println("문제 6 : 스포츠");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix6[i]);
			}
			answer = "승마";
		}
		else if(input == 7){
			System.out.println("문제 7 : 기업");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix7[i]);
			}
			answer = "케이티";
		}
		else if(input == 8){
			System.out.println("문제 8 : 음료수");
			for(int i = 0; i < 6; i++){
				System.out.println(matrix8[i]);
			}
			answer = "제티";
		}
		return answer;
	}
	
}
