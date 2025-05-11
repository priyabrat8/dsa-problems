package conceptQn;

public class Searching {

    static int linearSerchWhileLoop(int[] arr,int n) {
        int i = 0;
        int location = -1;
        while (arr[i] != n && i < arr.length) {
            i++;
        }
        if (i < arr.length) {
            location = i;
        }
        return location;
    }

    static int linearSerchForLoop(int[] arr,int n) {
        int location = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == n) {
                location = i;
                break;
            }
        }
        return location;
    }

    static int binarySearch(int[] arr,int n) {
        int i = 0;
        int location =-1;
        int j = arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if (arr[mid] == n) {
                location = i;
                break;
            } else if (arr[mid] < n) {
                i = mid +1;
            } else {
              j = mid-1;
            }
        }
        return location;
    }

    static int recursiveBinarySearch(int[] arr,int n,int max, int min) {
        int mid = (max+min)/2;
        if (min > max) return -1;
        if (arr[mid] == n) {
          return mid;
        } else if (arr[mid] < n) {
            return recursiveBinarySearch(arr,n,mid+1, min);
        } else {
            return recursiveBinarySearch(arr,n,max, mid-1);
        }
    }

    static int indexOfFirstOccurenceRecursive(int[] arr, int n, int max, int min) {
        if (min > max) return -1;
        int mid = (min+max)/2;
        if (arr[mid] == n) {
            if (mid == 0 || arr[mid] != arr[mid-1]) {
                return mid;
            }else {
                return indexOfFirstOccurenceRecursive(arr,n,mid-1,min);
            }

        }
        else if (arr[mid] < n) {
            return indexOfFirstOccurenceRecursive(arr,n,mid+1,min);
        } else {
            return indexOfFirstOccurenceRecursive(arr,n,max,mid-1);
        }
    }

    static int indexOfFirstOccurenceItrative(int[] arr,int n){
        int i = 0;
        int j = arr.length -1;

        while (i<=j) {
            int mid = (i+j)/2;
            if (arr[mid] < n) i = mid+1;
            else if(arr[mid] > n) j = mid-1;
            else {
                if (mid == 0 || arr[mid] != arr[mid-1]) {
                    return mid;
                } else {
                    j = mid -1;
                }
            }
        }

        return -1;
    }

    public static int mostlastOccurenceItrative(int[] arr,int n){
        int j = arr.length -1;
        int i = 0;
        int mid;
        while (i <= j){
            mid = (i+j)/2;
            if (arr[mid] < n) {
                i = mid+1;
            } else if(arr[mid] > n)  {
                j = mid-1;
            } else {
                if (mid == arr.length-1 || arr[mid] != arr[mid+1]) {
                    return mid;
                }
                else {
                    i = mid+1;
                }
            }
        }

        return -1;
    }

    public static int countOfOccuranceIterative(int[] arr, int n){
        int i = 0;
        int j = arr.length -1;
        int count = 0;
        while (i <= j) {
            int mid = (i+j)/2;
            if (arr[mid] < n) i = mid+1;
            else if(arr[mid] > n) j = mid-1;
            else {
                if (mid != 0 || mid != arr.length-1) {
                    if (arr[mid] == arr[mid+1]) i = mid+1;
                    else if (arr[mid] == arr[mid-1]) j = mid-1;
                }
                count++;
            }
        }
        return count;
    }


    public static void main(String []args) {
        int[] arr = {1,2,6,9,9,60,80};
        int n = 9;

        // Linear Search
//        System.out.println(linearSerchWhileLoop(arr,n));
//        System.out.println(linearSerchForLoop(arr,n));

        //Binary Search
//        System.out.println(binarySearch(arr,n));
//        System.out.println(recursiveBinarySearch(arr,n,arr.length-1,0));

        // Finding the most first Occurance
//        System.out.println(indexOfFirstOccurenceItrative(arr,n));
//        System.out.println(indexOfFirstOccurenceRecursive(arr,n, arr.length-1, 0));

        // Finding the most last Occurence
//        System.out.println(mostlastOccurenceItrative(arr,9));

        // Counting the occurance of a number
//        System.out.println(countOfOccuranceIterative(arr,n));

        
    }
}
