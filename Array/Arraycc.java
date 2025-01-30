

public class Arraycc {
    public static void update_element(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static int linearSearch(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 20) {
                return i;
            }

        }
        return -1;
    }

    public static int largestnum(int marks[]) {
        int largestnum = Integer.MIN_VALUE;
        int smallestnum = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > largestnum) {
                largestnum = marks[i];
            }
            if (smallestnum > marks[i]) {
                smallestnum = marks[i];
            }

        }
        System.out.println("smallest num : " + smallestnum);
        return largestnum;
    }

    public static int binarysearch(int marks[], int key) {
        int start = 0, end = marks.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            // compare
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void rev_array(int marks[]) {
        int first = 0, last = marks.length - 1;
        while (first < last) {
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;
            first++;
            last--;
        }
    }

    public static void pair_in_array(int marks[]) {
        int tp = 0;
        for (int i = 0; i < marks.length; i++) {
            int curr = marks[i];
            for (int j = i + 1; j < marks.length; j++) {
                System.out.print("(" + curr + "," + marks[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair: " + tp);
    }

    public static void print_subarrray(int marks[]) {
        int total_subarray = 0;
        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // System.out.print("("+start+","+end+")");
                    System.out.print(marks[k] + " ");
                    total_subarray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + total_subarray);
    }

    public static void printsubarr_sum(int marks[]) {

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                int cuurSum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print("("+start+","+end+")");
                    cuurSum += marks[k];

                }
                System.out.println(cuurSum);
                if (maxSum < cuurSum) {
                    maxSum = cuurSum;
                }

            }

        }
        System.out.println("max sum : " + maxSum);

    }

    public static void Prefix_sum(int marks[]) {
        int maxSum = Integer.MIN_VALUE;
        int cuurSum = 0;
        int prefix[] = new int[marks.length];
        prefix[0] = marks[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + marks[i];
        }

        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                cuurSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < cuurSum) {
                    maxSum = cuurSum;
                }

            }

        }
        System.out.println("max sum : " + maxSum);

    }







    // public static void kadane_algo(int marks[]){
    //     int currentsum = 0;
    //     int maxsum= Integer.MIN_VALUE;
    //     for (int i = 0; i < marks.length; i++) {
    //         currentsum = currentsum + marks[i];
    //         if (currentsum <0) {
    //             currentsum = 0;
    //         }
    //         maxsum = Math.max(maxsum, currentsum);
    //     }
    //     System.out.println("Max : "+ maxsum);
    // }
    public static void kadane_algo(int marks[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < marks.length; i++) {
            currentsum += marks[i];
            
            // Update maxsum if the currentsum is greater
            maxsum = Math.max(maxsum, currentsum);
            
            // If currentsum becomes negative, reset it
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        
        // If all elements are negative, maxsum will hold the largest negative element
        System.out.println("Max: " + maxsum);
    }




    //find 2nd largest num in anrray 
    public static int sec_largenum(int marks[]){
        int second ;
        int n = marks.length;
        if (n <= 2) {
            return -1;
        }
        int largest = second = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            largest = Math.max(largest, marks[i]);
        }
        for(int i = 0 ; i <n ; i++){
            if (marks[i]!=largest) {
                second = Math.max(second, marks[i]);
            }
        }
        return second;
    }

    

    

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int marks[] = new int[50];
        // int num[] = {1,2,3};
        // String Fruits[]={"mango", "apple"};
        // int marks[]= new int[100];

        // input
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // //output
        // System.out.println("1st elemt "+ marks[0]);
        // System.out.println("2nd elemt "+ marks[1]);
        // System.out.println("3rd elemt "+ marks[2]);
        // marks[2] = 100;
        // System.out.println(marks[2]);
        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println(percentage);
        // System.out.println(marks.length);

        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int key = 10;
        System.out.println(sec_largenum(marks));
        // kadane_algo(marks);
        // Prefix_sum(marks);
        // printsubarr_sum(marks);
        // print_subarrray(marks);
        // pair_in_array(marks);
        // rev_array(marks);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i]+ " ");
        // }
        // update_element(marks);
        // for(int i=0; i<marks.length; i++){
        // System.out.println(marks[i]+" ");
        // }

        // int index = linearSearch(marks);
        // if (index == -1) {
        // System.out.println("not found");

        // }else{
        // System.out.println("key is at "+ index);
        // }
        // System.out.println("largest value :" + largestnum(marks));
        // System.out.println("indexs of key :"+ binarysearch(marks, key));
    }
}