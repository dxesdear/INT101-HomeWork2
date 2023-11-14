package work01;

public class Utilitor {
    public static String testString(String value){
        if(value == null) throw new NullPointerException();
        if(value.isBlank()) throw new IllegalArgumentException();
        return value;
    }
    public static double testPositive(double value){
        if(value >= 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }
    public long computeIsbn10(long isbn10){
        String stringIsbn = String.valueOf(isbn10);
        if(stringIsbn.length() !=9) throw new IllegalArgumentException("The ISBN must be 9 digit");
        int sum=0;
        for (int i = 0; i < 9; i++) {
            int digit = stringIsbn.charAt(i);
            sum += digit*(i+1);
        }
        int remain = sum % 11;
        return (remain==0)?0:11-remain;
    }


}
