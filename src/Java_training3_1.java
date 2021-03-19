
public class Java_training3_1 {
    public static void main(String[] args){

        //Task 1
        int [] num = new int[2];
        num[0] = 5;
        num[1] = 15;


        //Task 2
        int [] numbers = new int [1000];
        int number = 0;
        while (number < numbers.length){
            numbers[number] = number + 1;
            number = number + 1;
        }
        System.out.println(numbers[500]);


        //Task 3
        int [] odd_numbers = new int [20];
        for(int i = -20; i < odd_numbers.length; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }





    }
}