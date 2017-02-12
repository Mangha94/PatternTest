public class Main {

    public static void main(String[] args) {
        System.out.println("NearFieldAttack에 문제 있음");

        Zerg dron=new Dron();
        dron.performAttack();
        dron.performMove();

        Zerg overlord=new Overlord();
        overlord.performAttack();
        overlord.performMove();

        Zerg hydra=new Hydra();
        hydra.performAttack();
        hydra.performMove();

    }
}
