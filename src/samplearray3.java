public class samplearray3 {
    public static void main(String[] args) {
        int[][] myarray = {
                {0, 1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };
        for (int[] array : myarray) {
            for (int data : array) {
                System.out.println(data);
            }
        }
    }
}