package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHero_instantiatesCorrectly() throws Exception {
        Hero hero = new Hero("brian", 60, "Superman", "Stubborn");
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void newRectangle_getName_brian() {
        Hero hero = new Hero("brian", 60, "Superman", "Stubborn");
        assertEquals("brian", hero.getName());
    }

    @Test
    public void functionalityTest() {
        Hero firstHero = new Hero("brian", 60, "Superman", "Stubborn");
        assertTrue(Hero.getAll().contains(firstHero));
    }

//    @Test
//    public void AllHeroAreCorrectlyReturned_true() {
//        Hero firstHero = new Hero("Aquaman", 40, "Ability to communicate with creatures", "kryptonite");
//        Hero secondHero= new Hero("Ironman", 44, "Supersonic flight Energy", "Ego-Centric");
//        Hero thirdHero = new Hero("Wakanda", 36, "Vibranium", "Nerdy");
//        assertEquals(true, Hero.getAll());
//    }
//
//    @Test
//    public void all_returnsAllInstancesOfHero_true() throws Exception {
//        Hero firstHero = new Hero("Aquaman", 40, "Ability to communicate with creatures", "kryptonite");
//        Hero secondHero = new Hero("Ironman", 44, "Supersonic flight Energy", "Ego-Centric");
//        Hero thirdHero = new Hero("Wakanda", 36, "Vibranium", "Nerdy");
//        assertTrue(Hero.all().contains("firstHero"));
//        assertTrue(Hero.all().contains("secondHero"));
//        assertTrue(Hero.all().contains("thirdHero"));
//    }
}