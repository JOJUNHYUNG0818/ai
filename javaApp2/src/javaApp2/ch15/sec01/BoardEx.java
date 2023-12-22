package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BoardEx {

	public static void main(String[] args) {
		
		Board board1 = new Board("ȫ�浿", "�ڹ�", "��ƴ�");
		Board board2 = new Board("�̼���", "���̽�", "����");
		Board board3 = new Board("ȫ�浿", "������", "�����ȹ����");
		Board board4 = new Board("ȫ�浿", "������", "�����ȹ����");
		Board board5 = new Board("�̼���", "�Ǵٽ�", "�����ȹ����");
		
		Set<Board> boardSet = new HashSet<Board>();
		
		boardSet.add(board1);
		boardSet.add(board2);
		boardSet.add(board3);
		boardSet.add(board4);
		boardSet.add(board5);
		// ����?
		
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