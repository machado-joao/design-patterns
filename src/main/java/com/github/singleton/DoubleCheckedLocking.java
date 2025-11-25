public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {
    }

    public static DoubleCheckedLocking getInstance() {
        DoubleCheckedLocking result = instance;
        if (result == null) {
            synchronized (DoubleCheckedLocking.class) {
                result = instance;
                if (result == null) {
                    instance = result = new DoubleCheckedLocking();
                }
            }
        }
        return result;
    }

}
