package domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocationTest {
    Location location;

    @Before
    public void setup() {
        location = new Location(0, 0);
    }

    @Test
    public void moveColumnRight() {
        assertThat(location.moveRight(), is(1));
    }

    @Test
    public void moveColumnLeft() {
        location.moveRight();
        assertThat(location.moveLeft(), is(0));
    }

    @Test
    public void nextRow() {
        location.nextRow(1);
        assertThat(location.getRow(), is(1));
    }
}
