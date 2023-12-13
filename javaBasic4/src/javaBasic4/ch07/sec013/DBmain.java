package javaBasic4.ch07.sec013;

public class DBmain {

	public static void main(String[] args) {
	
	Connect co = new Connect();
	
	co.db = new Oracle();
	co.dbRun();
	
	}
}


class Connect {
	
	// 필드 부모 타입 필드
	
	DB db;
	public void dbRun() {
		db.runDb();
	}
	
}