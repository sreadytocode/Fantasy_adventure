package player.caster;

import enum_data.Race;
import org.junit.Before;
import org.junit.Test;
import player.Inventory;
import player.type.caster.Caster;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CasterTest {

    Caster caster;
    Inventory inventory;

    @Before
    public void before(){
        Inventory cheese = new Inventory("Cheese");
        Inventory bread = new Inventory("Bread");
        ArrayList<Inventory>item = new ArrayList<>();
        item.add(cheese);
        item.add(bread);
        caster = new Caster("Esau", Race.Human, 100, 5, item);
    }

    @Test
    public void hasName(){
        assertEquals("Esau", caster.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.Human, caster.getRace());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, caster.getHealth());
    }

    @Test
    public void hasLevel(){
        assertEquals(5, caster.getLevel());
    }

    @Test
    public void hasItem(){
        assertEquals(2, caster.getItemCount());
    }
}
