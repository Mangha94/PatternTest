/**
 * Created by ttinfo on 2017-02-12.
 */
public class Overlord extends Zerg{
    public Overlord(){
        attackType=new CanNotAttack();
        moveType=new Flight();
    }
    public void display()
    {
        System.out.println("it's Ovarlord");
    }
}
