import java.util.Random;

import static java.lang.Math.abs;

public class bubble_sort
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int arrayLength = 10;
        int[] arr = new int[arrayLength];

        for(int i = 0; i < arrayLength; ++i)
        {
            arr[i] = abs(random.nextInt() % 100);
        }

        System.out.println("Array before sorting : ");
        printArray(arr);
        bubbleSort(arr);
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

    public static void bubbleSort(int[] arr)
    {
        int arrayLength = arr.length;

        for(int i = 0; i < arrayLength - 1; ++i)
        {
            for(int j = 0; j < arrayLength - i - 1; ++j)
            {
                if(arr[j] > arr[j+1])
                {
                    int tempElement = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempElement;
                }
            }
        }
    }
}
