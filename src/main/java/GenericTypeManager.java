/**
 *This is the main class of the library
 * @author oleg
 *
 */
public class GenericTypeManager <T> {
    GenericTypeManager() {
        genericTypeClass = null;
    }

    private Class<T> genericTypeClass;

    Class<T> getGenericTypeClass() {
        return genericTypeClass;
    }
}
