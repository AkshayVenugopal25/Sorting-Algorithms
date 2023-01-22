import java.util.Random;
import static java.lang.Math.abs;
import static java.lang.Math.random;

public class selection_sort
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int arrayLength = 10;
        int[] arr = new int[arrayLength];

        for(int i = 0; i < arrayLength; ++i)
        {
            arr[i] = abs(random.nextInt() % 10);
        }

        System.out.println("Array before sorting : ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Array after sorting : ");
        printArray(arr);
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr)
    {
        int arrayLength = arr.length;

        for(int i = 0; i < arrayLength - 1; ++i)
        {
            int minimumIndex = i;

            for(int j = i + 1; j < arrayLength; ++j)
            {
                if(arr[j] < arr[minimumIndex])
                {
                    minimumIndex = j;
                }
            }

            if(minimumIndex != i)
            {
                // swapping element
                int tempElement = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = tempElement;
            }
        }
    }
}
