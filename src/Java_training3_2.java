public class Java_training3_2 {
    public static void main(String[] args) {

        //task 4
        int[] array = new int[6];
        array[0] = 10;
        array[1] = 12;
        array[2] = 35;
        array[3] = 25;
        array[4] = 19;
        array[5] = 17;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }


            //task5
            double[] elements = {4.7, 34.6, 87.23, 345, 7, 234.9};
            int i = 0;
            while (i < elements.length){
                if(elements[i] > 24.12 && elements[i] < 467.23){
                    System.out.println(elements[i]);
            }
                i++;
            }




            //task 6
            int[] elem = {4, 8, 16, 17, 30, 11};
            int count_of_elem = 0;
            for(int j = 0; j < elem.length; j++) {
                if (elem[j] % 2 == 0) {
                    count_of_elem++;
                }

            }
        System.out.println(count_of_elem);
        }
}