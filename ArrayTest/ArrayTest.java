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

    public void bubbleSort() {

        for (int i = 0; i <= arr.length ; i++) {
            for (int j = 1; j < (arr.length) ; j++) {

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
