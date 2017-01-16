package com.test.quiz01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input, num;
		String trial;
		String ans = "";
		
		System.out.println("┌─────────────────┐");
		System.out.println("│     M E N U     │");
		System.out.println("│ 1.게임시작             │");
		System.out.println("│ 2.게임종료             │");
		System.out.println("└─────────────────┘");
		input = scan.nextInt();
		num = 0;
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
				else if(num >= 7){
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
		String[][] matrix = new String[8][4];
		String[] ans = {"곱창","이명우","유희상","치타","공유","승마","케이티","제티"}; 
		matrix[0][0] = "│ 육 두 쌍 칸 │";
		matrix[0][1] = "│ 짜 까 치 곱 │";
		matrix[0][2] = "│ 창 동 겹 파 │";
		matrix[0][3] = "│ 자 뽕 면 발 │";
		matrix[1][0] = "│ 지 원 주 명 │";
		matrix[1][1] = "│ 우 수 동 환 │";
		matrix[1][2] = "│ 박 성 연 인 │";
		matrix[1][3] = "│ 진 정 이 롱 │";
		matrix[2][0] = "│ 장 훈 용 찬 │";
		matrix[2][1] = "│ 서 희 구 진 │";
		matrix[2][2] = "│ 다 호 최 유 │";
		matrix[2][3] = "│ 상 열 준 범 │";
		matrix[3][0] = "│ 코 염 슴 치 │";
		matrix[3][1] = "│ 호 끼 수 지 │";
		matrix[3][2] = "│ 고 랑 원 린 │";
		matrix[3][3] = "│ 가 릴 타 문 │";
		matrix[4][0] = "│ 건 제 검 박 │";
		matrix[4][1] = "│ 우 빈 공 부 │";
		matrix[4][2] = "│ 유 잔 상 든 │";
		matrix[4][3] = "│ 훤 이 만 호 │";
		matrix[5][0] = "│ 마 스 콜 두 │";
		matrix[5][1] = "│ 용 테 고 링 │";
		matrix[5][2] = "│ 축 역 프 수 │";
		matrix[5][3] = "│ 양 야 말 승 │";
		matrix[6][0] = "│ 이 플 동 에 │";
		matrix[6][1] = "│ 두 수 성 나 │";
		matrix[6][2] = "│ 글 한 케 다 │";
		matrix[6][3] = "│ 디 레 엘 티 │";
		matrix[7][0] = "│ 환 티 아 봉 │";
		matrix[7][1] = "│ 마 콜 운 레 │";
		matrix[7][2] = "│ 사 스 밀 다 │";
		matrix[7][3] = "│ 수 붕 제 비 │";

		System.out.println("┌─────────┐");
		
		for(int i = 0; i < 4; i++){
			System.out.println(matrix[input][i]);
		}
		System.out.println("└─────────┘");
		answer = ans[input];
		return answer;
	}
	
}
