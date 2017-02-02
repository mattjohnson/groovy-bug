import org.junit.Test;

import static org.junit.Assert.*;

public class GoodPersonTest {

    @Test
    public void it_should_print_the_class_name() throws Exception {
        assertEquals(GoodPerson.class, new GoodPerson().returnMyClass());
        assertEquals(GoodPerson.class, new GoodPerson().returnMyClassExplicitly());
    }

    @Test
    public void it_should_return_the_i_am_a_person_message() throws Exception {
        assertEquals("I'm a good person", new GoodPerson().getGoodPerson());
    }
}