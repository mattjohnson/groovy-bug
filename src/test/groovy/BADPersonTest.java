import org.junit.Test;

import static org.junit.Assert.*;

public class BADPersonTest {

    @Test
    public void it_should_print_the_class_name() throws Exception {
        assertEquals(BADPerson.class, new BADPerson().returnMyClass());
        assertEquals(BADPerson.class, new BADPerson().returnMyClassExplicitly());
    }

    @Test
    public void it_should_return_the_i_am_a_person_message() throws Exception {
        assertEquals("I'm a bad person", new BADPerson().getBADPerson());
    }
}