import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        // TODO: Write the code to compare the sums of the arrays and return the result.
        return sum1 == sum2 ? true:false;
    }

    private int calculateSum(int[] array) {
        
        // TODO: Write the code to calculate the sum of the array.
        int suma = 0;
        for (int num:array){
            suma += num;
        }
        return suma;

    }
    public boolean isSorted(int[] array) {
        
        if (array == null || array.length <= 1) {
             return true; 
         }

         for (int i = 1; i < array.length; i++) {
             if (array[i] < array[i - 1]) {
                 return false; 
             }
         }

         return true;
     }
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        int[] arrayInverso = new int[array.length];
        for(int i = array.length-1, j = 0; i>=0;i--, j++){
            arrayInverso[j] = array[i];
        }
        return arrayInverso;
    }
    
    public List<Integer> determineAllFactors(int number) {

        List<Integer> factors = new ArrayList<>();

    if (number <= 0) {
        return factors; 
    }

    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            factors.add(i);
        }
    }

    return factors;
        
    }
    
    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<>();
        
        if (number <= 0 || limit <= 0) {
            return multiples; 
        }

        for (int i = number; i < limit; i += number) {
            multiples.add(i);
        }

        return multiples;
    }
}
class ArrayMagic {
    
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        boolean res=false;
        // TODO: Write your code
        for(int elemento:array){
            if(number < elemento){
                res = true;
                return res;
            }
        }
        return res;
    }
    
    public static int findSecondLargestElement(int[] array) {
        if (array == null || array.length < 2) {
            return -1; //Cuando no hay elementos suficientes
        }

        int max = Integer.MIN_VALUE;
        int segundoGrande = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                segundoGrande = max;
                max = num;
            } else if (num > segundoGrande && num < max) {
                segundoGrande = num;
            }
        }

        if (segundoGrande == Integer.MIN_VALUE) {
            return -1; 
        }

        return segundoGrande;
    }
}
public class ArrayExercises {

	public static void main(String[] args) {
		// Test for BiArray class
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        BiArray biArray = new BiArray(array1, array2);
        
        boolean areSumsEqual = biArray.areSumsEqual();
        System.out.println("Are the sums of array1 and array2 equal? " + areSumsEqual); 
        
        int[] testArray = {3, 1, 4, 2};
        boolean isSorted = biArray.isSorted(testArray);
        System.out.println("Is the testArray sorted? " + isSorted); 
        
        int[] reversedArray = biArray.reverseArray(testArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray)); 
        
        List<Integer> factors = biArray.determineAllFactors(12);
        System.out.println("Factors of 12: " + factors); 
        
        List<Integer> multiples = biArray.determineMultiples(3, 20);
        System.out.println("Multiples of 3 less than 20: " + multiples); 
        
        // Test for ArrayMagic class
        ArrayMagic arrayMagic = new ArrayMagic();
        
        int[] numsArray = {2, 4, 6, 8};
        boolean hasElementGreaterThan = arrayMagic.doesHaveElementGreaterThan(numsArray, 5);
        System.out.println("Does the array have an element greater than 5? " + hasElementGreaterThan); 
        
        int[] secondLargestArray = {7, 4, 9, 2, 8};
        int secondLargest = ArrayMagic.findSecondLargestElement(secondLargestArray);
        System.out.println("Second largest element: " + secondLargest); 
    
	}

}
