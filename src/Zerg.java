/**
 * 종족을 파악하고 능력을 표출
 */
public abstract class Zerg {
    AttackType attackType;
    MoveType moveType;

    public Zerg(){

    }
    public abstract void display();

    /**
     * 공격타입
     */
    public void performAttack(){
        attackType.attack();
    }
    /**
     * 능력
     */
    public void performMove(){
        moveType.move();
    }
    public void moving(){
        System.out.println("모든 캐릭은 움직이거나 죽을수 있다");
    }
    public void setAttacType(AttackType at){
        attackType=at;
    }
    public void setMoveType(MoveType mt){
        moveType=mt;
    }
}