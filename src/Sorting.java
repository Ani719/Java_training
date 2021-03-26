public class Sorting {
    public static void main(String[] args) {
        int [] array = {67, 3, 18, 45, 91, 16, 14};
        int n;

        for (int i = 0; i < array.length- 1; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    n = array[j + 1];

                    array[j + 1] = array[j];
                    array[j] = n;

                }
            }
        }
        for (int i = 0; i < array.length;i++)
            System.out.println(array[i]);

    }
}
