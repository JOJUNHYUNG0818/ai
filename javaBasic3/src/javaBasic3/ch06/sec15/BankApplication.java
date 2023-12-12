package javaBasic3.ch06.sec15;
import java.util.Scanner;
public class BankApplication {
	
	static Account[] accountArray = new Account[100];
	
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("--------------------------------------");
			System.out.println("1.���»��� :2.���¸�� :3.���� :4.��� :5.����");
			System.out.println("--------------------------------------");
			int meun =sc.nextInt();
			
			if(meun==1)
			{
				System.out.println("---------");
				System.out.println("���»���");
				System.out.println("---------");
				
				System.out.println("���¹�ȣ: ");
				String accountNum=sc.next();
				System.out.println("������: ");
				String owner=sc.next();
				System.out.println("�ʱ��Աݾ�: ");
				int money=sc.nextInt();
				
				Account newCount =new  Account(accountNum, owner, money);
				
				for(int i=0; i<accountArray.length; i++)
				{
					if(accountArray[i]==null)
					{
						accountArray[i]=newCount;
						System.out.println("���°� �����Ǿ����ϴ�.");
						break;
					}
				}
			}
			else if(meun==2)
			{
				System.out.println("--------");
				System.out.println("���¸��");
				System.out.println("--------");
				
				for(int i=0; i<accountArray.length; i++)
				{
					if(accountArray[i]==null)
						break;
					else
						System.out.println(accountArray[i].getAccountNum()+" "+accountArray[i].getOwner()+" "+accountArray[i].getMoney());
					
				}
				
			}
			
			else if(meun==3)
			{
				System.out.println("--------");
				System.out.println("����");
				System.out.println("--------");
				
				System.out.println("���¹�ȣ: ");
				String accountNum = sc.next();
				System.out.println("���ݾ�: ");
				int money = sc.nextInt();
				
				Account account = findAccount(accountNum);
				
				if(account==null)
				{
					System.out.println("���°� �����ϴ�.");
				}
				else {
					
				account.setMoney(account.getMoney()+money);
		        System.out.println("���: �Ա��� �����Ǿ����ϴ�");
				}
			
			}
			else if(meun==4)
			{
				System.out.println("--------");
				System.out.println("���");
				System.out.println("--------");
				
				System.out.println("���¹�ȣ: ");
				String accountNum = sc.next();
				System.out.println("���ݾ�: ");
				int money = sc.nextInt();
				
				Account account = findAccount(accountNum);
				
				if(account==null)
				{
					System.out.println("���°� �����ϴ�.");
				}
				else
				{
				account.setMoney(account.getMoney()-money);
		        System.out.println("���: �Ա��� �����Ǿ����ϴ�");
				}
			}
			
			else if(meun==5)
			{
				System.out.println("���α׷�����");
				run=false;
			}
			
			
		}
		
	}

	private static Account findAccount(String accountNum) {
        Account account = null;
        for(int i =0; i <accountArray.length; i++){
            
            if(accountArray[i] != null){
                
                String dbAno = accountArray[i].getAccountNum();
                
                if(dbAno.equals(accountNum)){
                    
                    account = accountArray[i];
                    break;
                }
            }
            
        }
		return account;
	}
}
	
