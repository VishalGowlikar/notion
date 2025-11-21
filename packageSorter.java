public class PackageSorter {

    public static String sort(int width, int height, int length, int mass) {
        long volume = (long) width * height * length;

        boolean bulky = volume >= 1_000_000
                || width >= 150
                || height >= 150
                || length >= 150;

        boolean heavy = mass >= 20;

        if (bulky && heavy) {
            return "REJECTED";
        } else if (bulky || heavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {

        // Test cases
        System.out.println(sort(100, 100, 100, 10));   
        System.out.println(sort(200, 50, 50, 10));     
        System.out.println(sort(50, 50, 50, 25));      
        System.out.println(sort(200, 200, 200, 30));   
        System.out.println(sort(150, 149, 149, 10));   
        System.out.println(sort(100, 100, 100, 20));   
        System.out.println(sort(100, 100, 1000, 19));  
    }
}
