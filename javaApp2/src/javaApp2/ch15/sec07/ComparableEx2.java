package javaApp2.ch15.sec07;

import java.util.TreeSet;

public class ComparableEx2 {

	public static void main(String[] args) {
		Board board1 = new Board(1, "����1", "�ۼ���1");
		Board board2 = new Board(4, "����8", "�ۼ���7");
		Board board3 = new Board(3, "����0", "�ۼ���5");
		Board board4 = new Board(0, "����2", "�ۼ���3");
		
		TreeSet<Board> treeB = new TreeSet<Board>();
		treeB.add(board1);
		treeB.add(board2);
		treeB.add(board3);
		treeB.add(board4);
		
		//��ȣ �������
		for(Board b : treeB) {
			System.out.println(b);
		}
		

	}

}


class Board implements Comparable<Board>{
	Integer no;
	String title;
	String writer;
	public Board(Integer no, String title, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
	}
	
	@Override
	public String toString() { //�ּ� ���ý� ��� ������ �Է¾�
		
		return no + " "+ title + " "+ writer;
	}

//	@Override
//	public int compareTo(Board o) {
//		int result = this.no.compareTo(o.no);
//		return result;
//	}
	
@Override
	public int compareTo(Board o) {
		int result = this.writer.compareTo(o.writer);
		return result;
	}	
	
}