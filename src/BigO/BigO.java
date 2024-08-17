package BigO;

public class BigO {
    public static void printItems(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}


// this code is O(n)