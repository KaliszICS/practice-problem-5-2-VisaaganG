public class PracticeProblem {

    public static int findValue(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static int findThirdValue(String n, String[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(n)) {
                count++;

                if (count == 3) {
                    return i;
                }
            }
        }

        return -1;
    }

	public static double[] append(double n, double[] arr) {
        double[] newArr = new double[arr.length + 1];

        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        
        newArr[arr.length] = n;

        return newArr;
    }


}