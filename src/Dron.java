/**
 * Created by ttinfo on 2017-02-12.
 */
public class Dron extends Zerg {
    public void Dron(){
        attackType=new NearFieldAttack();
        moveType=new OnFoot();
    }
    public void display(){
        System.out.println("이렇게 살면 먹고살듯");
    }
}
