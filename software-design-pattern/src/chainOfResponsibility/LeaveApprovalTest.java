package chainOfResponsibility;

public class LeaveApprovalTest {

	public static void main(String[] args) {
		// 组装责任链
		Leader t1 = new ClassAdviser();
		Leader t2 = new DepartmentHead();
		Leader t3 = new Dean();
		
		t1.setNext(t2);
		t2.setNext(t3);
	
		t1.handleRequest(8);
	}

}
