import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GenericTypeManagerTest {
    @Test public void testGetGenericTypeClass() {
        GenericTypeManager<String> manager = new GenericTypeManager<>();
        assertNotNull("test GenericTypeManager's ability to get Class<String> obj from String as a generic type",
                manager.getGenericTypeClass());
    }
}
