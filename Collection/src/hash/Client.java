package hash;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("�������һ��ͳ�ƶ����ˡ�����������س���");
		int total=in.nextInt();
		Hashitem[] list =new Hashitem[total];
		for (int i=0;i<total;i++) {
			System.out.println("������������ �绰���� ��ַ �����м�ո��������ע���ڸ��������ݺ��»س����������");
			list[i]=new Hashitem(in.next(), in.next(), in.next());
			
		}
		
		HashMap map1=new HashMap();
		
		for (int i=0;i<list.length;i++) {
			
			map1.store(list[i]);
			
		}
		
		System.out.println("\n\n\n s or S means U would like to search for some with the number"+"\n"+
		"d or D means That U could delete someone.\n"+
		"e or E means ending this program instantly"+
		"\n p or P means printing every single user recorded"+
		"\n a or A means adding another record to the whole db"+
		"\n Press Enter Every Time You Complete Your Command And Follow Instructions\n\n\n");/////////////here to complete////////////
		
		while (true) {
			String instruction=in.next();
			if (instruction.equalsIgnoreCase("S")) {
				System.out.println("Enter your number for searching.Finish with pressing ENTER");
				map1.search(in.next());
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("D")) {
				System.out.println("Enter your number for deleting.Finish with pressing ENTER");
				map1.delete(in.next());
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("P")) {
				map1.printme();
				System.out.println("End of the operation, gone back to top");
				continue;
			}
			else if (instruction.equalsIgnoreCase("E")) {
				System.exit(0);
			}
			else if (instruction.equalsIgnoreCase("A")) {
				map1.store(new Hashitem(in.next(),in.next(),in.next()) );
			}
			else {System.out.println("Check your command and refer to the command\nBack To Top");}
		}
	}
}
