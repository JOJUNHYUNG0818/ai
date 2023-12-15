package javaBasic5.ch08.pro07;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB에서 선택");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		
	}

	
	
}
