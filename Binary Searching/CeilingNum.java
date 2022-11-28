import java.util.Scanner;

/* ONLY FOR ARRAY SORTED IN ASCENDING ORDER */
public class CeilingNum {
    public static void main(String[] args) {
        /* To input elements in the array from the user. */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");

        /* Initializing the Array */
        int size = input.nextInt();
        int[] array = new int[size];

        /* Entering elements in the Array */
        System.out.println("Enter" + " " + size + " " + "elements in the Array: ");
        for (int i = 0; i < size; i++) {
            if (i == 0){
                System.out.println("Enter the first element");
            } else{
                System.out.println("Enter the next element");
            }
            array[i] = input.nextInt();
        }

        /* Enter the target element */
        System.out.print("Enter the value whose ceiling and floor is to be found: ");
        int target = input.nextInt();

        int ceiling = findCeiling(array, target); // Passing the array and the target value in the findCeiling() function and storing it in a variable
        int floor = findFloor(array, target); // Passing the array and the target value in the findFloor() function and storing it in a variable

        /* Printing the output */
        if (ceiling == -1){
            System.out.println("Ceiling: No such numbers exist");
        } else {
            System.out.println("The ceiling number of" + " " + target + " " + "in the array" + " " + "is" + " " + ceiling);
        }

        if (floor == -1){
            System.out.println("Floor: No such numbers exist");
        } else {
            System.out.println("The floor number of" + " " + target + " " + "in the array" + " " + "is" + " " + floor);
        }
    }

    static int findCeiling(int[] arr, int target){
        /* Setting start and end value, to set search space */
        int start = 0;
        int end = arr.length - 1;

        /* Condition for the ceiling value not existing in the array */
        if (target > arr[arr.length - 1]){
            return -1;
        }

        /* Checking if the target value is present in the array or not */
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return target;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[start]; // Returning the smallest number greater than the Target.
    }

    static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        /* Condition for the floor value not existing in the array */
        if (target < arr[0]){
            return - 1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return target;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[end]; // Returning the greatest number smaller than the Target.
    }
}
