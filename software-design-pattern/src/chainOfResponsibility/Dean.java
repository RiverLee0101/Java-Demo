package chainOfResponsibility;

public class Dean extends Leader{
	public void handleRequest(int leaveDays){
		if(leaveDays <= 10){
			System.out.println("Ժ����׼�����" + leaveDays + "�졣");
		}else{
			if(getNext() != null){
				getNext().handleRequest(leaveDays);
			}else{
				System.out.println("�������̫�࣬û������׼�ü�����");
			}
		}
	}
}
