public class NumberChecker {
    public static void main(String[] args) {
        int num = 153;
        System.out.println("Testing Number: " + num);
        
        int count = countDigits(num);
        System.out.println("Digit count: " + count);
        
        int[] digits = storeDigits(num);
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(digits, num));
        
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
        
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(num, digits));
        
        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
        
        int[] reversed = reverseDigitsArray(digits);
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        
        System.out.println("Is Prime? (7): " + isPrime(7));
        System.out.println("Is Neon Number? (9): " + isNeonNumber(9));
        System.out.println("Is Spy Number? (1124): " + isSpyNumber(1124));
        System.out.println("Is Automorphic Number? (5): " + isAutomorphicNumber(5));
        System.out.println("Is Buzz Number? (14): " + isBuzzNumber(14));
        
        System.out.println("Is Perfect Number? (28): " + isPerfectNumber(28));
        System.out.println("Is Abundant Number? (12): " + isAbundantNumber(12));
        System.out.println("Is Deficient Number? (15): " + isDeficientNumber(15));
        System.out.println("Is Strong Number? (145): " + isStrongNumber(145));
    }
    
    // Q2 methods
    public static int countDigits(int num) {
        int count = 0;
        int temp = Math.abs(num);
        if (temp == 0) return 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int temp = Math.abs(num);
        if (temp == 0) {
            digits[0] = 0;
            return digits;
        }
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(int[] digits, int originalNum) {
        int sum = 0;
        int power = digits.length;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == originalNum;
    }
    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) secondLargest = largest;
        return new int[]{largest, secondLargest};
    }
    
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) secondSmallest = smallest;
        return new int[]{smallest, secondSmallest};
    }
    
    // Q3 methods
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }
    
    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }
    
    // Q4 methods
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }
    
    // Q5 methods
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = sumOfDigits(storeDigits(square));
        return sum == num;
    }
    
    public static boolean isSpyNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
            product *= digits[i];
        }
        return sum == product;
    }
    
    public static boolean isAutomorphicNumber(int num) {
        long square = (long) num * num;
        String numStr = String.valueOf(num);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(numStr);
    }
    
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || Math.abs(num) % 10 == 7;
    }
    
    // Q6 methods
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
    
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
    
    public static boolean isStrongNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int fact = 1;
            for (int j = 1; j <= digits[i]; j++) {
                fact *= j;
            }
            sum += fact;
        }
        return sum == num;
    }
}
