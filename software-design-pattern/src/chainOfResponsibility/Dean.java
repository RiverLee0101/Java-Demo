package chainOfResponsibility;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 */
public class Dean extends Leader {
    public void handleRequest(int leaveDays){
        if(leaveDays <= 10){
            System.out.println("院长批准您请假" + leaveDays + "天。");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
