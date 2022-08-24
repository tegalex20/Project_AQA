package TDD;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class UnitTest {
    // TDD- сначало пишут тест и если он не проходит, создаем метод под него
    @Test
    // great object
    public void test1(){
        new Unit(50,25);
    }

    @Test
    //тест узнать здоровье Юнита, для этого создаем метод Здоровья getHealth
    public void test2(){
        Unit unit = new Unit(60,25);
        assertEquals(60, unit.getHealth());
    }

    @Test

    public void test3() {
        Unit unit = new Unit(50, 30);
        unit.takeDamage(25);
    }

    @Test
    //тест узнать  Юнит получает урон и у него изменился уровень здоровья? для этого создаем метод takeDamage
    public void test4() {
        Unit unit = new Unit(100, 25);
        unit.takeDamage(30);
        assertEquals(70,unit.getHealth());

    }

    @Test

    public void test5(){
        Unit unitTom = new Unit(100, 25);
        Unit unitDenis = new Unit(100, 25);
        unitDenis.addDamage(unitTom);
    }

    @Test
    //тест узнать  ЮнитTom получает урон от ЮнитДенис и у него изменился уровень здоровья? для этого используем метод addDamage
    public void test6(){
        Unit unitTom = new Unit(100, 25);
        Unit unitDenis = new Unit(100, 40);
        unitDenis.addDamage(unitTom);
        assertEquals(60,unitTom.getHealth());
    }

    @Test
    //тест узнать  ЮнитДенис  получает урон от ЮнитTom  и у него изменился уровень здоровья? для этого используем метод addDamage
    public void test7(){
        Unit unitTom = new Unit(100, 25);
        Unit unitDenis = new Unit(100, 30);
        unitTom.addDamage(unitDenis);
        assertEquals(75,unitDenis.getHealth()); // change expected health to 60
    }
}
