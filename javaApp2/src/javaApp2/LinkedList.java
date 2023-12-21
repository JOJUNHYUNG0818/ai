package javaApp2;

import java.time.LocalDateTime;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<Borad> boardList = new java.util.LinkedList<Borad>();
		Borad b1 =new Borad(112, "����1", "����1", "�ۼ���1", LocalDateTime.now());
		Borad b2 =new Borad(113, "����2", "����2", "�ۼ���2", LocalDateTime.now());
		Borad b3 =new Borad(114, "����3", "����3", "�ۼ���3", LocalDateTime.now());
		
		boardList.add(b1);
		boardList.add(b2);
		boardList.add(b3);
		
		System.out.println(boardList.get(2).writer);
		
		Borad b4 =new Borad(0, "����0", "����0", "�ۼ���0", LocalDateTime.now());
		
		boardList.add(0, b4);
		
		System.out.println(boardList.get(0).no);
		
		Borad findAdress = null; 
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).writer=="�ۼ���2") {
				findAdress=boardList.get(i);
				System.out.println("�ֽ��ϴ�");
				break;
			}
		}
		System.out.println();
		System.out.println("ã�� ��� �ۼ���2�� �ۼ��� �Խñ� ������?: "+findAdress.content);	
		
		// �̼����� �����ϱ�
		// 1�ܰ� �̼��� �ִ� �ּҸ� ã��
		// 2�ܰ� �ּҸ� �����ϱ�
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).writer=="�ۼ���2") {
				findAdress=boardList.get(i);
			}
		}
		boardList.remove(findAdress);

		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
			//��ũ ��½� �ڵ����� toString ���� 
			// toString�� Object Ŭ���� 


		}
		
		
	}

}

class Borad extends Object{
	int no; // �Խ��� ��ȣ
	String title; // ����
	String content;// ����
	String writer; // �ۼ���
	LocalDateTime writeDate; // �ۼ���
	
	
	
	public Borad(int no, String title, String content, String writer, LocalDateTime writeDate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		
	}
	@Override
	public String toString() {
		return "��ȣ " + no + " ���� "+title+" ���� "+content+" �ۼ��� "+writer+" �ۼ��� "+writeDate;
	}
}
