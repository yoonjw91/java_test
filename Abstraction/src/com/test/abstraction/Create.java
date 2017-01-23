package com.test.abstraction;

import java.util.List;

public interface Create {
	abstract void setWidth(int width);
	abstract int getWidth();
	abstract void setSize(int width);
	abstract int getSize();
	abstract void addWord(String word);
	abstract void setAnswer(String answer);
	abstract String getAnswer();
	abstract void setHint(String hint);
	abstract String getHint();
	abstract void setBar(int width);
	abstract String getBar();
	abstract List<String> getCreatedQuestion();
}
