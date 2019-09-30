package chainOfResponsibility;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 */
public class ClassAdviser extends Leader {
    public void handleRequest(int leaveDays){
        if(leaveDays <= 2) {
            System.out.print("班主任批准请假"+leaveDays+"天");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.print("请假天数太多，没有人批准该请假");
            }
        }
    }
}
