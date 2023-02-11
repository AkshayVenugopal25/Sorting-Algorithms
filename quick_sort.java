import java.util.Random;

import static java.lang.Math.abs;

public class quick_sort
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

        quickSort(arr, 0, arrayLength - 1);

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
    public static void quickSort(int[] arr, int lowIndex, int highIndex)
    {
        if(lowIndex >= highIndex)
        {
            return;
        }
        int pivot = arr[highIndex];
        int leftPtr = lowIndex;
        int rightPtr = highIndex;

        while(leftPtr < rightPtr)
        {
            while(arr[leftPtr] <= pivot && leftPtr < rightPtr)
            {
                leftPtr++;
            }
            while(arr[rightPtr] > pivot && leftPtr < rightPtr)
            {
                rightPtr--;
            }

            swap(arr, leftPtr, rightPtr);
        }

        swap(arr, rightPtr, highIndex);

        quickSort(arr, lowIndex, leftPtr-1);
        quickSort(arr, leftPtr, highIndex);
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex)
    {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
