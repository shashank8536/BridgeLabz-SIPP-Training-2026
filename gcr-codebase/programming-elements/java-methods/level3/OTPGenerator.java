public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }
        
        if (areAllUnique(otps)) {
            System.out.println("All 10 OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
    
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    
    public static boolean areAllUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
