package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BoardEx {

	public static void main(String[] args) {
		
		Board board1 = new Board("홍길동", "자바", "어렵다");
		Board board2 = new Board("이순신", "파이썬", "쉽다");
		Board board3 = new Board("홍길동", "넌파이", "아직안배웠다");
		Board board4 = new Board("홍길동", "넌파이", "아직안배웠다");
		Board board5 = new Board("이순신", "판다스", "아직안배웠다");
		
		Set<Board> boardSet = new HashSet<Board>();
		
		boardSet.add(board1);
		boardSet.add(board2);
		boardSet.add(board3);
		boardSet.add(board4);
		boardSet.add(board5);
		// 갯수?
		
		System.out.println(boardSet.size());
		Iterator<Board> iter = boardSet.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		

	}

	
	
}


class Board{
	String name;
	String title;
	String content;
	public Board(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board) {
			Board board = (Board) obj;
			if(name.equals(board.name)&&title.equals(board.title))
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return  name.hashCode();
	}
	
	@Override
	public String toString() {
		return name+" "+title+" "+content;
	}
	
}