public class GenericTypeManager <T> {
    GenericTypeManager() {
        genericTypeClass = null;
    }

    private Class<T> genericTypeClass;

    Class<T> getGenericTypeClass() {
        return genericTypeClass;
    }
}
