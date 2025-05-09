package conceptsAndQn;

public class Array {

    static int largestArr(int[] arr) {
        int len = arr.length;
        int largest = 0;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return arr[largest];
    }

    static int secondLargestArr(int[] arr) {
        int len = arr.length;
        int largest = 0;
        int res = -1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return res;
    }

    static boolean checkArrShort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    static int[] reverseArr(int[] arr){
        int min = 0;
        int max = (arr.length) -1;

        while (min < max) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }
        return arr;
    }

    static int deleteDuplicateElement(int[] arr) {
        int length = arr.length;
        int res = 1;

        for (int i = 1; i < length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;

    }

    static int[] removeZero(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                for (int j = i+1; j < len; j++) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        return arr;
    }

    static int[] leftRotateByOne(int[] arr) {
        int len = arr.length;
        int temp = arr[0];
        for (int i = 1; i < len; i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        return arr;
    }

    static void leaderInAnArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean state = true;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] <= arr[j]) {
                    System.out.println(arr[j]);
                    state = false;
                    break;
                }
            }
            if (state == true) {
                System.out.println(arr[i]);
            }
        }
    }

    static void leaderInAnArray2(int[] arr){
        int n = arr.length;
        int cur = arr[n-1];
        System.out.println(cur);
        for (int i = n-2; i >= 0 ; i--) {
            if (cur < arr[i]) {
                cur = arr[i];
                System.out.println(cur);
            }
        }
    }

    static int maximunDifference(int[] arr){
        int len = arr.length;
        int greater = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                int difference = arr[j]-arr[i];
                if (greater < difference) {
                    greater = difference;
                }
            }
        }
        return greater;
    }

    static int maximunDifference2(int[] arr){
        int res = arr[1] - arr[0];
        int small = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            res = Math.max(res,arr[i]-small);
            small = Math.min(arr[i],small);
        }
        return res;
    }

    static int stockMarketBuyAndSell() {
        int[] ar = {50,52,53,50,55,56,60,62,58,62,63};
        int n = 11, c= 0;
        int max = 0;
        for(int i=0; i<n;i++) {
            c = 0;
            for(int j=i;j<n-1;j++) {
                if(ar[j]<ar[j+1]) c++;
                else break;
            }
            if (max<c)	max = c;
        }
        return (c+1);
    }

    static void stockSpan() {
        int[] ar = {30,20,25,28,26,29};
        for (int i = 0; i < ar.length; i++) {
            int span = 0;
                for (int j = i; j >=0; j--) {
                    if (ar[j] <= ar[i]) span++;
                    else break;
                }
                System.out.print(span + " ");

            }
    }

    static int trappingrainWater(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n-1; i++) {
            int lmax = arr[i];
            for (int j = 0; j <i ; j++) {
                lmax = Math.max(arr[j],lmax);
            }
            int rmax = arr[i];
            for (int k = i+1; k <n ; k++) {
                rmax = Math.max(arr[k],rmax);
            }
            res = res + (Math.min(rmax,lmax) - arr[i]);
        }
        return res;
    }

    static int trappingrainWaterWEfficentSol(int[] arr){
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            res = res + (Math.min(lmax[i],rmax[i])- arr[i]);
        }
        return res;
    }

    static int maximumConsecutiveOnes(){
        int[] arr = {0,1,1,1,0,0};
        int c = 0;
        int max= 0;
        for (int j : arr) {
            if (j == 1) c++;
            else {
                max = Math.max(c,max);
                c = 0;
            }
        }
        return max;
    }

    public static void main(String []args){
        int[] arr = {3,0,1,2,5};

        // ArrayList
//        ArrayList<Integer> num = new ArrayList<Integer>(3);
//        for (int i = 0; i < 15; i++) {
//            num.add(i);
//        }
//        System.out.println(num);

        //Find the largest element in a array
//        int a = largestArr(arr);
//        System.out.println(a);

        //Find the Second largest element
//        int a = secondLargestArr(arr);
//        System.out.println(arr[a]);

        //Check if a array is shorted
//        boolean a = checkArrShort(arr);
//        System.out.println(a);

        //Reverse a Array
//        System.out.println(Arrays.toString(reverseArr(arr)));

        //Delete duplicate from shorted array
//        System.out.println(deleteDuplicateElement(arr));

        //Move Zero to end
//        System.out.println(Arrays.toString(removeZero(arr)));

        //Left Rotate By One
//        System.out.println(Arrays.toString(leftRotateByOne(arr)));

        //Left Rotate By D
//        System.out.println(Arrays.toString(leftRotateByD(arr,3)));

        //Find the leader of the array
//        leaderInAnArray(arr);
//        leaderInAnArray2(arr);

        //Find the maxium gratest difference value
//        System.out.println(maximunDifference(arr));
//        System.out.println(maximunDifference2(arr));

        //Stock Market Problem
//        System.out.println(stockMarketBuyAndSell());

        //Trapping Rain Water
//        System.out.println(trappingrainWater(arr));
//        System.out.println(trappingrainWaterWEfficentSol(arr));

        //Maximum consecutive 1
//        System.out.println(maximumConsecutiveOnes());

        //Stock Span Problem
        stockSpan();

    }
}
