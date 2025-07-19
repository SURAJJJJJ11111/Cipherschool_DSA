public class Question7_2 {

    public static int addArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int sum = 0;
        int place = 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;
            int currSum = digit1 + digit2 + carry;
            sum = sum + (currSum % 10) * place;
            carry = currSum / 10;
            place *= 10;
            i--;
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 5, 4, 9};
        int[] arr2 = {2, 1, 4};
        System.out.println(addArrays(arr1, arr2)); // Output: 9763
    }
    
}