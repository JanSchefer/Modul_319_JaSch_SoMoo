
    public class main {
        public static void main(String args[]) {
            SelectionSort ob = new SelectionSort();
            int arr[] = {64, 25, 12, 22, 11};
            ob.sort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }