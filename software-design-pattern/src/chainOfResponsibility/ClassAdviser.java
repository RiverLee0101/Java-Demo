package chainOfResponsibility;

public class ClassAdviser extends Leader{
	public void handleRequest(int leaveDays){
		if(leaveDays <= 2) {
			System.out.print("��������׼���"+leaveDays+"��");
		}else{
			if(getNext() != null){
				getNext().handleRequest(leaveDays);
			}else{
				System.out.print("�������̫�࣬û������׼�����");
			}
		}
	}
}
