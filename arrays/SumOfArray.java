class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        System.out.print(sum);
    }
}