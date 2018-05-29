public class Emre33Sort {

    public void bubbleSort(int[] unsorted) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < unsorted.length - 1; i++) {
                if(unsorted[i] > unsorted[i + 1]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swapped = true;
                }
            }
        }

    }

}