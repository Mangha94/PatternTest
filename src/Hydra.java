/**
 * Created by ttinfo on 2017-02-12.
 */
public class Hydra extends Zerg{
    public Hydra(){
        attackType=new RangedAttack();
        moveType=new OnFoot();
    }
    public void display(){
        System.out.println("흐헐 허얼");
    }
}
