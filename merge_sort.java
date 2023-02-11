import java.util.Random;

import static java.lang.Math.abs;

public class merge_sort
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

        mergeSort(arr);

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

    public static void mergeSort(int[] arr)
    {
        int arrLength = arr.length;

        if(arrLength <= 1)
        {
            return;
        }

        int midIndex = arrLength / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrLength - midIndex];

        for(int i = 0; i < midIndex; ++i)
        {
            leftArray[i] = arr[i];
        }
        for(int i = midIndex; i < arrLength; ++i)
        {
            rightArray[i - midIndex] = arr[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        //merge the sorted Array

        merge(arr, leftArray, rightArray);

    }

    public static void merge(int[] arr, int[] leftArray, int[] rightArray)
    {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;

        int i = 0, j = 0, k = 0;

        while(i < leftArrayLength && j < rightArrayLength)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                ++i;
                ++k;
            }
            else
            {
                arr[k] = rightArray[j];
                ++j;
                ++k;
            }
        }

        while(i < leftArrayLength)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightArrayLength)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}













