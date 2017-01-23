package com.test.abstraction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Create , Serializable{
	ArrayList<String> createdQuestion;
	int width;
	int size;
	String answer;
	String hint;
	String bar;

	public Player(){
		this.createdQuestion = new ArrayList<String>();
		this.size = 0;
		this.answer = null;
		this.hint = null;
		this.bar = "─";
	}
	
	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String getAnswer() {
		return this.answer;
	}


	@Override
	public void setHint(String hint) {
		this.hint = hint;
	}


	@Override
	public String getHint() {
		return this.hint;
	}


	@Override
	public void setSize(int width) {
		this.size = width*width;
	}


	@Override
	public int getSize() {
		return this.size;
	}


	@Override
	public void addWord(String word) {
		this.createdQuestion.add(word);
	}
	
	@Override
	public ArrayList<String> getCreatedQuestion(){
		return this.createdQuestion;
	}
	
	

	public static void saveCreatedQuestion(Player createdQuestion, String filename){
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(createdQuestion);
			oos.flush(); oos.close(); fos.close();
		} catch(Exception e) {
//			e.printStackTrace();
		}
	}
	
	public static Player loadCreatedQuestion(String filename){
		Player loaded = null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			loaded = (Player) ois.readObject();
			ois.close(); fis.close();
		} catch(Exception e) {
//			e.printStackTrace();
		}
		return loaded;
	}

	@Override
	public void setBar(int width) {
		for(int i = 0; i < width*2; i++){
			this.bar += "─";
		}
	}

	@Override
	public String getBar() {
		return this.bar;
	}
	
	public void setInit(int width){
		setWidth(width);
		setSize(width);
		setBar(width);
	}

}
