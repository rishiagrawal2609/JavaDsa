package BigO;

public class BigOn2 {
    public static void printItems(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);

            }

        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}


//this took n*n = n^2 iteration -> time complexity --> O(n^2)
