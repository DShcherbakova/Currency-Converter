import java.awt.*;

public class Laboratory {
    public static void main(String[] args) {

        Pokemon absol = new Pokemon("Absol", 65,75, 130);
        Pokemon pancham = new Pokemon("Pancham", 67, 43, 82);
        Pokemon pangoro = new Pokemon("Pangoro",95, 58, 124);
        Pokemon machop = new Pokemon("Machop",70, 35, 80);
        Pokemon machoke = new Pokemon("Machoke",80, 45, 100);
        Pokemon machamp = new Pokemon("Machamp",90, 55, 130);

        absol.sleep();
        absol.fight();
        System.out.println();

        pancham.sleep();
        pancham.fight();
        System.out.println();

        pangoro.sleep();
        pangoro.fight();
        System.out.println();

        machop.sleep();
        machop.fight();
        System.out.println();

        machoke.sleep();
        machoke.fight();
        System.out.println();

        machamp.sleep();
        machamp.fight();
        System.out.println();


    }
}
class Pokemon {
    int currentAttack = 0;
    int currentHp = 0;
    int maxHp;
    int maxAttack = 200;
    String pokemonName;
    int hp;
    int speed;
    int attack;

    Pokemon(String pokemonName, int hp, int speed, int attack) {
        this.pokemonName = pokemonName;
        this.speed = speed;
        this.hp = hp;
        this.currentHp = maxHp;
        this.currentAttack = attack;
    }

    public void sleep() {
        if (currentHp < maxHp / 10) {
            System.out.println(pokemonName +" пошёл спать");
            currentHp += maxHp / 10;
        } else {
            System.out.println(pokemonName +" не хочет спать");
        }

    }
    public void fight() {
        if (currentAttack < maxAttack && currentAttack >= 100) {
            System.out.println(this.pokemonName +" любит драться");
        } else {
            System.out.println("У "+ this.pokemonName +" слабая атака");
        }
    }
}
