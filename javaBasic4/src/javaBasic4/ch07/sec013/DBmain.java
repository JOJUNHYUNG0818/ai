package javaBasic4.ch07.sec013;

public class DBmain {

	public static void main(String[] args) {
	
	Connect co = new Connect();
	
	co.db = new Oracle();
	co.dbRun();
	
	}
}


class Connect {
	
	// �ʵ� �θ� Ÿ�� �ʵ�
	
	DB db;
	public void dbRun() {
		db.runDb();
	}
	
}