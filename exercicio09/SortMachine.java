package exercicio09;

public class SortMachine {

    public double[] runSort(double[] list, SortMethod method){
        double[] sortedList = list;
        if (method == SortMethod.QUICK_SORT){
            quickSort(sortedList, 0, sortedList.length-1);
        }else if (method == SortMethod.MERGE_SORT){
            mergeSort(sortedList, 0, sortedList.length-1);
        }
        return sortedList;
    }


    // QUICK SORT METHODS:

    private void quickSort(double[] list, int start, int end) {
        if (end > start) {
            int indexPivot = divide(list, start, end);

            quickSort(list, start, indexPivot - 1);
            quickSort(list, indexPivot + 1, end);
        }
    }

    private int divide(double[] list, int start, int end) {
        double pivot;
        int pontRight = end;
        int pontLeft = start + 1;
        pivot = list[start];

        while (pontLeft <= pontRight) {

            while (pontLeft <= pontRight && list[pontLeft] <= pivot) {
                pontLeft++;
            }

            while (pontRight >= pontLeft && list[pontRight] > pivot) {
                pontRight--;
            }

            if (pontLeft < pontRight) {
                change(list, pontRight, pontLeft);
                pontLeft++;
                pontRight--;
            }
        }

        change(list, start, pontRight);
        return pontRight;
    }

    private void change(double[] list, int i, int j) {
        double temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }


    // MERGE SORT METHODS:

    private void merge(double[] list, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        double[] L = new double[n1];
        double[] M = new double[n2];

        // fill the left and right list
        for (int i = 0; i < n1; i++)
            L[i] = list[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = list[q + 1 + j];

        // Maintain current index of sub-lists and main list
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two sub arrays, sort them and merge them
    private void mergeSort(double[] list, int left, int right) {
        if (left < right) {

            // m is the point where the list is divided into two sub lists
            int mid = (left + right) / 2;

            // recursive call to each sub lists
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);

            // Merge the sorted sub lists
            merge(list, left, mid, right);
        }
    }
}