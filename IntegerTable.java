// IntegerTable

public class IntegerTable {

    public static void main(String[] args) { 

        System.out.println("N\tN^2\tN^3\tN^4");
        for (int n = 1; n <= 5; n++) {
            int n2 = n * n;
            int n3 = n * n * n;
            int n4 = n * n * n * n;
            System.out.println(n + "\t" + n2 + "\t" + n3 + "\t" + n4);
        }
    }
}














