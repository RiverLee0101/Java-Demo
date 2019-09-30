package chainOfResponsibility;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 */
abstract class Leader {
    private Leader next;
    public void setNext(Leader next){
        this.next = next;
    }
    public Leader getNext(){
        return next;
    }
    public abstract void handleRequest(int leaveDays);
}
