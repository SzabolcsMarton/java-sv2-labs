package schoolrecords;

public class SchoolHelpers {

    public static double calculateAverage(double sum, int count) {
        return Math.floor((sum / count) * 100.0) / 100.0;
    }

    public static void ensureNotNull(Object object, String paramName) {
        if(object == null){
            throw new NullPointerException(paramName + " must not be null!");
        }
    }

    public static boolean isEmpty(String str){
        if (str == null || str.isEmpty()){
            return true;
        }
        return false;
    }
}
