package javaApp2;

import java.time.LocalDateTime;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<Borad> boardList = new java.util.LinkedList<Borad>();
		Borad b1 =new Borad(112, "제목1", "내용1", "작성자1", LocalDateTime.now());
		Borad b2 =new Borad(113, "제목2", "내용2", "작성자2", LocalDateTime.now());
		Borad b3 =new Borad(114, "제목3", "내용3", "작성자3", LocalDateTime.now());
		
		boardList.add(b1);
		boardList.add(b2);
		boardList.add(b3);
		
		System.out.println(boardList.get(2).writer);
		
		Borad b4 =new Borad(0, "제목0", "내용0", "작성자0", LocalDateTime.now());
		
		boardList.add(0, b4);
		
		System.out.println(boardList.get(0).no);
		
		Borad findAdress = null; 
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).writer=="작성자2") {
				findAdress=boardList.get(i);
				System.out.println("있습니다");
				break;
			}
		}
		System.out.println();
		System.out.println("찾는 사람 작성자2가 작성한 게시글 내용은?: "+findAdress.content);	
		
		// 이순신을 삭제하기
		// 1단계 이순신 있는 주소를 찾기
		// 2단계 주소를 삭제하기
		for(int i=0; i<boardList.size(); i++) {
			if(boardList.get(i).writer=="작성자2") {
				findAdress=boardList.get(i);
			}
		}
		boardList.remove(findAdress);

		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
			//링크 출력시 자동으로 toString 생성 
			// toString은 Object 클래스 


		}
		
		
	}

}

class Borad extends Object{
	int no; // 게시판 번호
	String title; // 제목
	String content;// 내용
	String writer; // 작성자
	LocalDateTime writeDate; // 작성일
	
	
	
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
		return "번호 " + no + " 제목 "+title+" 내용 "+content+" 작성자 "+writer+" 작성일 "+writeDate;
	}
}
