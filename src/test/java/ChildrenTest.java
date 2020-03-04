import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChildrenTest {
    Parent p;
    Family f;
    Children c;
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getcName() {
        //p = new Family("Owin");
        f = new Family("Owin");
        p = new Children(f.getfN(), "Dera");
    }

    @Test
    public void greetings() {
        //p.greetings();
        f.greetings();
        c.greetings();
    }
}