package TDD;

public class Unit {

    private int health;
    private final int damage;

    public Unit (int health, int damage){
       this.health = health;
       this.damage = damage;
    }

    public int getHealth(){
        return health;
    }


    public void takeDamage(int damage){
      health -= damage;
    }

    public void addDamage (Unit unitTom){  //метод расчета изменения уровня здоровья Тома
        unitTom.takeDamage(damage);
    }

    public void addDamage1 (Unit unitDenis){  //метод расчета изменения уровня здоровья Тома
        unitDenis.takeDamage(damage);
    }
}
