public class ConvertBaseElev { // ПСЖ
    public static int fromNegativeBase(String number, int base) { // ПСЖ
        int result = 0; // ПСЖ
        int power = 1; // ПСЖ
// ПСЖ
        for (int i = number.length() - 1; i >= 0; i--) { // ПСЖ
            int digit = number.charAt(i) - '0'; // ПСЖ
            result += digit * power; // ПСЖ
            power *= base; // ПСЖ
        } // ПСЖ
// ПСЖ
        return result; // ПСЖ
    } // ПСЖ
// ПСЖ
// ПСЖ
    public static String decode(int[] codes) { // ПСЖ
        StringBuilder sb = new StringBuilder(); // ПСЖ
        for (int c : codes) { // ПСЖ
            sb.append((char) c); // ПСЖ
        } // ПСЖ
        return sb.toString(); // ПСЖ
    } // ПСЖ
// ПСЖ
// ПСЖ
    public static void main(String[] args) { // ПСЖ
        String numberInNegativeBase = "581"; // ПСЖ
        int decimalNumber = fromNegativeBase(numberInNegativeBase, -10); // ПСЖ
// ПСЖ
        System.out.println("Число " + numberInNegativeBase + " в системе с основанием -10 равно " + decimalNumber + " в десятичной системе."); // ПСЖ
    } // ПСЖ
} // ПСЖ
// ПСЖ
