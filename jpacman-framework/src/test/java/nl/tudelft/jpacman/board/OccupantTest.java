package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // TODO corriger les assert dans getSquare()
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // TODO
        Square sq = new BasicSquare();
        unit.occupy(sq);
        assertThat(unit.getSquare()).isEqualTo(sq);
        sq.remove(unit);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // TODO
        Square sq = new BasicSquare();
        Square sq2 = new BasicSquare();
        unit.occupy(sq);
        unit.occupy(sq2);
        assertThat(sq.getOccupants().isEmpty()).isTrue();
        assertThat(unit.getSquare()).isEqualTo(sq2);
        sq.remove(unit);
        sq2.remove(unit);
    }
}
