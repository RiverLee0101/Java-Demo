package chainOfResponsibility;

public class DepartmentHead extends Leader{
	public void handleRequest(int leaveDays){
		if(leaveDays <= 7){
			System.out.println("ϵ������׼�����" + leaveDays + "�졣"); 
		}else{
			if(getNext() != null){
				getNext().handleRequest(leaveDays);
			}else{
				System.out.println("�������̫�࣬û������׼�ü�����");
			}
		}
	}
}
