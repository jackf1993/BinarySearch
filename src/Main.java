/* author: Jack Farah
 * description: Binary Search implementation. O(log n)
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {-22, -5, 7, 15, 22, 30, 45, 88, 90, 100, 105};
        System.out.println(binarySearch(array, -5));
        System.out.println(binarySearch(array, 100));
        System.out.println(binarySearch(array, 78));
        System.out.println(binarySearch(array, 45));
        System.out.println(binarySearch(array, -22));
        System.out.println(binarySearch(array, 45));
    }

    public static boolean binarySearch(int[] array, int findValue) {
        int start = 0;
        int end = array.length;

        if(array.length == 0) return false;

        while (start < end) {
            int midpoint = (end + start) / 2;

            if(array[midpoint] == findValue){
                return true;
            }
            else if (array[midpoint] < findValue) {
                start = midpoint + 1;
            }
            else if (array[midpoint] > findValue) {
                end = midpoint;
            }

        }
        return false;
    }
}
