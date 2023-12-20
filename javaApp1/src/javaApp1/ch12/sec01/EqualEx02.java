package javaApp1.ch12.sec01;

public class EqualEx02 {

	public static void main(String[] args) {
		Netplex np = new Netplex("100", "a123", "p123");
		Netplex np1 = new Netplex("100", "a124", "p1234");
		Netplex np2 = new Netplex("100", "a125", "p1235");
		Netplex np3 = new Netplex("100", "a126", "p1236");
		
		Netplex np4 = new Netplex("100", "a126", "p1236");
		Netplex np5 = new Netplex("200", "a126", "p1236");
		
		if(np1.equals(np2)) {
			System.out.println("������ü");
		}
		else {
			System.out.println("�ٸ���ü");
		}
	}

}

class Netplex{
	String key;
	String id;
	String pwd;
	public Netplex(String key, String id, String pwd) {
		super();
		this.key = key;
		this.id = id;
		this.pwd = pwd;
	}
	
	//���ü key�� ���� ���
	@Override
	public int hashCode() {
		
		return key.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Netplex) {
			Netplex np = (Netplex) obj;
			if(this.key.equals(np.key)) {
				return true;
			}
		}
		return false;
	
	}
	
}