package monster;

import enum_data.ElementTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    Monster monster;

    @Before
    public void before(){
       monster = new Monster("Siren", "Watch out for this Siren she will before you know it sing to you until you are no more...", ElementTypes.Water, 100, 40, 8, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Siren", monster.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Watch out for this Siren she will before you know it sing to you until you are no more...", monster.getDescription());
    }

    @Test
    public void hasElementType(){
        assertEquals(ElementTypes.Water, monster.getElementType());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, monster.getHealth());
    }

    @Test
    public void hasAttackStrength(){
        assertEquals(40, monster.getAttackStrength());
    }

    @Test
    public void hasDefence(){
        assertEquals(8, monster.getDefence());
    }

    @Test
    public void hasLevel(){
        assertEquals(7, monster.getLevel());
    }
}
