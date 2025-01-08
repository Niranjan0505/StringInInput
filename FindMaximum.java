public class FindMaximum {
    public static void main(String[] args) {
        int[] numbers={2,6,11,20,3,7,18};
        int max=numbers[0];
        for ( int i=1; i<numbers.length; i++)
            if (numbers[i]>max){
                max=numbers[i];
            }

        System.out.println("The maximum value:" +max);
    }
}