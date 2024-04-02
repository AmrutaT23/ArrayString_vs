//Find common elements from three arrays.

class Array10
{
    public static void main(String[] args) 
    {
        int[] arr1 = {2,3,4,5};
        int[] arr2 = {2,4 ,9,11,12,10,91};
        int[] arr3 = {7,0,21,4,22,67,2};

        for(int x=0; x<arr1.length; x++){
            for(int y=0; y<arr2.length; y++){
                for(int z=0; z<arr3.length; z++){
                    
                    if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
                    {System.out.println("Common Element Are : "+arr3[z]);}
                }
            }
        }
    }
}