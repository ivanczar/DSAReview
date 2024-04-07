package ArrayTest;
class ArrayTest {
    
    int[] arr = {2,5,4,1,3};


    public String toString() {

        String res = "";

        for (int i = 0; i < this.arr.length ; i++) {
            res += arr[i];
        }

        return res;
    }


    // Worst case: O(n^2) - array completely unsorted
    // Best case: O(n) - array almost sorted
    public void bubbleSort() {

        for (int i = 0; i <= arr.length ; i++) {
            // -i prevents looping through the already sorted section
            for (int j = 1; j < (arr.length - i) ; j++) {

                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayTest arr = new ArrayTest();

        System.out.println(arr);

        arr.bubbleSort();

        System.out.println(arr);


    }


}
