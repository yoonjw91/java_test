package com.test.abstraction;

import java.util.Arrays;
import java.util.List;

public class Questions {
	 String[] question1 = {"육","두","쌍","칸","짜","까","치","곱","창","동","겹","파","자","뽕","면","발"};
	 String[] question2 = {"건","제","검","박","우","빈","공","부","유","잔","상","든","훤","이","만","호"};
	 String[] question3 = {"지","원","주","명","우","수","동","환","박","성","연","인","진","정","이","롱"};
	 String[] question4 = {"코","염","슴","치","호","끼","수","지","고","랑","원","린","가","릴","타","문"};
	 String[] question5 = {"장","훈","용","찬","서","희","구","진","다","호","최","유","상","열","준","범"};
	 String[] question6 = {"마","스","콜","두","용","테","고","링","축","역","프","수","양","야","말","승"};
	 String[] question7 = {"이","플","동","에","두","수","성","나","글","한","케","다","니","레","엘","티"};
	 String[] question8 = {"환","티","아","봉","마","콜","운","레","사","스","밀","다","수","붕","제","비"};
	 private String[] answerList;
	 private String[] hintList;
	 private String[][] questionList = new String[8][16];
	 private int index;
	 private List<String> question;
	 private String menu;
	 private String hint;
	 private String answer;
	 private String howto;
	 public Questions(){
		questionList[0] = question1;
		questionList[1] = question2;
		questionList[2] = question3;
		questionList[3] = question4;
		questionList[4] = question5;
		questionList[5] = question6;
		questionList[6] = question7;
		questionList[7] = question8;
		this.hintList = new String[] {"음식", "남자배우", "우리 반 친구", "동물","우리 반 친구","스포츠","기업","음료수"};
		this.answerList = new String[] {"곱창", "공유", "이명우", "치타", "유희상", "승마", "케이티", "제티"};
		this.menu = "┌──────────────────┐\n│      M E N U     │\n│ 1.게임시작     	   │\n│ 2.게임방법     	   │\n│ 3.게임작성     	   │\n│ 4.게임종료     	   │\n└──────────────────┘";
		this.howto = "┌──────────────────┐\n│     H O W T O    │\n│ 힌트를 통해     	   │\n│ 정답을 유추하여   	   │\n│ 맞추는 게임입니다	   │\n└──────────────────┘";
		setInitial();
	 }
	 
	 public void setIndex(){
		 this.index = (int)(Math.random()*8);
	 }
	 
	 public void setHint(int index){
		 this.hint = this.hintList[index];
	 }
	 
	 public String getHint(){
		 return this.hint;
	 }
	 
	 public void setAnswer(int index){
		 this.answer = this.answerList[index];
	 }
	 
	 public String getAnswer(){
		 return this.answer;
	 }
	 
	 public void setQuestion(int index){
		 this.question = Arrays.asList(this.questionList[index]);
	 }
	 
	 public List<String> getQuestion(){
		 return this.question;
	 }
	 
	 public String getMenu(){
		 return this.menu;
	 }
	 
	 public String getHowTo(){
		 return this.howto;
	 }
	 
	 public void setInitial(){
		 setIndex();
		 setHint(this.index);
		 setAnswer(this.index);
		 setQuestion(this.index);
	 }
	 
	 
}
