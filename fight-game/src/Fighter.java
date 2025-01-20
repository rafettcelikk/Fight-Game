import java.util.Random;

public class Fighter {
    String name;
    int minDamage;
    int maxDamage;
    int health;
    int weight;
    int block;

    Fighter(String name, int minDamage, int maxDamage, int health, int weight, int block){
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.weight = weight;
        if(block >= 0 && block <= 100){
            this.block = block;
        }
        else{
            this.block = 0;
        }
    }

    int hit(Fighter opponent){
        int damage = generateRandDamage(this.minDamage, this.maxDamage);
        System.out.println(this.name + " " + opponent.name + " " + damage + " vurdu.");
        if(opponent.isBlocked()){
            System.out.println(opponent.name + " gelen hasarı blokladı!");
            return opponent.health;
        }
        if(opponent.health - damage < 0){
            return 0;
        }
        return opponent.health - damage;
    }

    boolean isBlocked(){
        double randNumber = Math.random() * 100;
        return this.block <= randNumber;
    }

    int generateRandDamage(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
