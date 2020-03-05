
import attack.ArrowAttact;
import attack.SwordAttack;
import defense.ArmorDefense;
import defense.BehaviourDefense;
import defense.ShiledDefense;
import fly.PlaneFly;
import fly.RocketFly;
import fly.WingsFly;
import sound.NormalSound;
import sound.ToaSound;






/**
 *
 * @author nasikhatin
 */
public class Main {
    public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttact(), (BehaviourDefense) new ShiledDefense());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println("");
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), (BehaviourDefense) new ArmorDefense());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();

    System.out.println("");
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setBehaviourFly(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();
  }
}
