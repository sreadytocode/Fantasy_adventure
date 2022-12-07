package player.caster;

import enum_data.ElementTypes;
import org.junit.Before;
import org.junit.Test;
import player.type.caster.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;


    @Before
    public void before(){
        spell = new Spell("Icestorm","A storm of ice shaped like cats" , ElementTypes.Ice, 29);
    }

    @Test
    public void hasName(){
        assertEquals("Icestorm", spell.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A storm of ice shaped like cats", spell.getDescription());
    }

    @Test
    public void hasElementType(){
        assertEquals(ElementTypes.Ice, spell.getElementType());
    }

    @Test
    public void hasDamage(){
        assertEquals(29, spell.getDamage());
    }
}
