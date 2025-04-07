package Competitions.TeamCodeSpring2025;

import java.util.Arrays;

public class myHeap {
    private int[][] heap;
    private int size;
    private int capacity;

    public myHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity][];
        this.size = 0;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        int[] temp = Arrays.copyOf(heap[index1], heap[index1].length);
        heap[index1] = Arrays.copyOf(heap[index2], heap[index2].length);
        heap[index2] = temp;
    }

    private void heapifyUp(int index) {
        while (index > 0 && heap[index][0] > heap[getParentIndex(index)][0]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void heapifyDown(int index) {
        int largestIndex = index;
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        if (leftChildIndex < size && heap[leftChildIndex][0] > heap[largestIndex][0]) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex][0] > heap[largestIndex][0]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex);
        }
    }

    public void insert(int[] value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] =  Arrays.copyOf(value, value.length);
        heapifyUp(size);
        size++;
    }

    public int[] extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int[] max = heap[0];
        heap[0] = Arrays.copyOf(heap[size - 1], heap[size-1].length);
        size--;
        heapifyDown(0);
        return max;
    }

    public int[] peekMax() {
         if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void heapSort(int[][] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int[] temp = Arrays.copyOf(arr[0], arr[0].length);
            arr[0] = Arrays.copyOf(arr[i], arr[i].length);
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[][] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left][0] > arr[largest][0])
            largest = left;

        if (right < n && arr[right][0] > arr[largest][0])
            largest = right;

        if (largest != i) {
            int[] swap = Arrays.copyOf(arr[i], arr[i].length);
            arr[i] = Arrays.copyOf(arr[largest], arr[largest].length);
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        
    }
}