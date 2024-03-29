import java.util.Comparator;

class SelectionSort implements Comparable<Bier>
{
    public void sort(int arr[])
    {
        int n = arr.length;


        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     *
     * @param arr
     */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public String compareTo(Bier otherBier){
        return String.compare(Bier.getName(),otherBier.getName())
    }


}
