import org.junit.Test;

import static org.junit.Assert.assertNull;

public class GenericTypeManagerTest {
    @Test public void testGetGenericTypeClass() {
        GenericTypeManager<String> manager = new GenericTypeManager<>();
        assertNull("test GenericTypeManager's ability to get Class<String> obj from String as a generic type",
                manager.getGenericTypeClass());
    }
}
