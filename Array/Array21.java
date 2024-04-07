// Binary Search Program

public class Array21 
{
    public int search(int arr[],int searchEle , int low, int high)
    {
        if(high>=low)
        {
            int mid = low+((high-low)/2);
        
        if(arr[mid]== searchEle)
        {
            return mid;
        }
        if(searchEle < arr[mid])
        {
            return search(arr,searchEle,low,mid - 1);
        }
        if(searchEle > arr[mid])
        {
            return search(arr,searchEle,mid+1,arr.length-1);
        }
        
        }
        return -1;
    }
    public static void main (String args[])
    {
        int arr[]= {10,20,30,40,60,90,110};
        Array21 a21 = new Array21();
        int searchEle = 90;
        int index = a21.search(arr, searchEle,0, arr.length-1);
        System.out.println("Element is present at index "+index);

    }
}
