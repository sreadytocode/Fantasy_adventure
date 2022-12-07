package player.caster;

import enum_data.ElementTypes;
import org.junit.Before;
import org.junit.Test;
import player.type.caster.MythicalCreature;

import static org.junit.Assert.assertEquals;

public class MythicalCreatureTest {
    MythicalCreature creature;

    @Before
    public void before(){
        creature = new MythicalCreature("Dragon", "A fierce dragon in battle but a crybaby so weak at defence", ElementTypes.Fire, 50, 2);
    }

    @Test
    public void hasName(){
        assertEquals("Dragon", creature.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A fierce dragon in battle but a crybaby so weak at defence", creature.getDescription());
    }

    @Test
    public void hasElementType(){
        assertEquals(ElementTypes.Fire, creature.getElementType());
    }

    @Test
    public void canAttack(){
        assertEquals(50, creature.getDamage());
    }

    @Test
    public void hasDefence(){
        assertEquals(2, creature.getDefence());
    }
}
