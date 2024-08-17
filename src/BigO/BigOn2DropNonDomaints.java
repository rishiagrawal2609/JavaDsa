package BigO;

public class BigOn2DropNonDomaints {
    public static void printItems(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);

            }

        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}


//this took n*n = n^2 + n iteration -> time complexity --> O(n^2+n) --> n^2 is a dominant term, so we will drop the non-dominant term

