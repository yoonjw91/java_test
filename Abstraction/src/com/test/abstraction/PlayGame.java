package com.test.abstraction;

import java.util.Scanner;


public class PlayGame {
	public static void main(String[] args){
		int flag = 0;
		Questions question = new Questions();
		String select;	

		while(true){
			Player loaded = Player.loadCreatedQuestion("createdQuestion");
			Scanner scan = new Scanner(System.in);
			
			if(flag == 0) {
				System.out.println(question.getMenu());
				select = scan.nextLine();
			}
			else {
				select = "1";
				loaded = null;
				flag = 0;
			}
			if(select.equals("1")){
				if(loaded != null){
					System.out.println("<<플레이어가 작성한 문제를 불러옵니다>>");
					System.out.println("HINT : " + loaded.getHint());
					while(true){
						System.out.println("┌"+ loaded.getBar() + "┐");
						for(int i = 0; i < loaded.getCreatedQuestion().size(); i++){
							if(i % loaded.getWidth() == 0) System.out.print("│ ");
							System.out.print(loaded.getCreatedQuestion().get(i) + " ");
							if(i % loaded.getWidth() == loaded.getWidth() - 1) System.out.print(" │\n");
						}
						System.out.println("└"+ loaded.getBar() + "┘");
						System.out.print("정답은? : ");
						select = scan.nextLine();
						if(select.equals(loaded.getAnswer())){
							System.out.println("정답입니다!");
							System.out.println("계속하시겠습니까?(y/n)");
							select = scan.nextLine();
							if(select.equals("y")){
								flag = 1;
								break;
							}else if(select.equals("n")){
								System.out.println("<<메뉴로 이동합니다>>");
								break;
							}
							else {
								System.out.println("잘못 입력하셨습니다. 메뉴로 이동합니다.");
								break;
							}
						}
					}
				}else{
					System.out.println("<<기본문제를 불러옵니다>>");
					while(true){
						System.out.println("Hint : " + question.getHint());
						System.out.println("┌─────────┐");
						for(int i = 0; i < question.getQuestion().size(); i++){
							if(i % 4 == 0) System.out.print("│ ");
							System.out.print(question.getQuestion().get(i) + " ");
							if(i % 4 == 3) System.out.print(" │\n");
						}
						System.out.println("└─────────┘");
						System.out.print("정답은? : ");
						select = scan.nextLine();
						if(select.equals(question.getAnswer())){
							System.out.println("정답입니다!");
							System.out.print("계속하시겠습니까? (y/n) : ");
							select = scan.nextLine();
							if(select.equals("y")){
								question = new Questions();
								continue;
							}
							else if(select.equals("n")){
								System.out.println("<<메뉴로 이동합니다>>");
								break;
							}
							else {
								System.out.println("잘못 입력하셨습니다. 메뉴로 이동합니다.");
								break;
							}
						}
					}
				}
			}
			else if(select.equals("2")){
				while(true){
					System.out.println(question.getHowTo());		
					System.out.println("게임방법을 숙지하셨습니까?(y/n)");
					select = scan.nextLine();
					if(select.equals("y")){
						System.out.println("<<메뉴로 이동합니다>>");
						break;
					}else if(select.equals("n")){
						System.out.println("<<한 번 더 확인하세요>>");
						continue;
					}else{
						System.out.println("잘못 입력하셨습니다. 메뉴로 이동합니다.");
						break;
					}
				}
				
			}
			else if(select.equals("3")){
				Player createdQuestion = new Player();
				System.out.println("정답을 입력하세요");
				String answer = scan.nextLine();
				createdQuestion.setAnswer(answer);
				System.out.println("힌트를 입력하세요");
				String hint = scan.nextLine();
				createdQuestion.setHint(hint);
				while(true){
					System.out.println("문제의 크기를 입력하세요. 예) 2x2를 원하시면 2를 입력해주세요.");
					int width = scan.nextInt();
					if(width > 1){
						Scanner scan2 = new Scanner(System.in);
						createdQuestion.setInit(width);						
						for(int i = 0; i < createdQuestion.getSize(); i++){
							System.out.println((i+1) + "번째 문제를 입력해주세요(한글자씩)");
							String word = scan2.nextLine();
							if(word.length() == 1) createdQuestion.addWord(word);
							else i--;
						}
						break;
					}else{
						System.out.println("2 이상의 정수를 입력해주세요.");
					}
				}
				Player.saveCreatedQuestion(createdQuestion, "createdQuestion");
			}
			else if(select.equals("4")){
				System.out.println("<<게임종료>>");
//				scan.close();
				break;
			}else{
				System.out.println("잘못 입력하셨습니다. 게임을 종료합니다.");
//				scan.close();
				break;
			}
		}
	}
}
