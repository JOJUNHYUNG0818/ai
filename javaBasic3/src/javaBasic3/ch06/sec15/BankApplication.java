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
			System.out.println("1.계좌생성 :2.계좌목록 :3.예금 :4.출금 :5.종료");
			System.out.println("--------------------------------------");
			int meun =sc.nextInt();
			
			if(meun==1)
			{
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String accountNum=sc.next();
				System.out.println("계좌주: ");
				String owner=sc.next();
				System.out.println("초기입금액: ");
				int money=sc.nextInt();
				
				Account newCount =new  Account(accountNum, owner, money);
				
				for(int i=0; i<accountArray.length; i++)
				{
					if(accountArray[i]==null)
					{
						accountArray[i]=newCount;
						System.out.println("계좌가 생성되었습니다.");
						break;
					}
				}
			}
			else if(meun==2)
			{
				System.out.println("--------");
				System.out.println("계좌목록");
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
				System.out.println("예금");
				System.out.println("--------");
				
				System.out.println("계좌번호: ");
				String accountNum = sc.next();
				System.out.println("예금액: ");
				int money = sc.nextInt();
				
				Account account = findAccount(accountNum);
				
				if(account==null)
				{
					System.out.println("계좌가 없습니다.");
				}
				else {
					
				account.setMoney(account.getMoney()+money);
		        System.out.println("결과: 입금이 성공되었습니다");
				}
			
			}
			else if(meun==4)
			{
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				
				System.out.println("계좌번호: ");
				String accountNum = sc.next();
				System.out.println("예금액: ");
				int money = sc.nextInt();
				
				Account account = findAccount(accountNum);
				
				if(account==null)
				{
					System.out.println("계좌가 없습니다.");
				}
				else
				{
				account.setMoney(account.getMoney()-money);
		        System.out.println("결과: 입금이 성공되었습니다");
				}
			}
			
			else if(meun==5)
			{
				System.out.println("프로그램종료");
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
	
