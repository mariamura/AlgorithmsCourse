package algoritms.derekbanas;

public class Sort {

    public String linerSearchForValue(int value) {
        boolean check = false;
        String indexWithValue = "";
        System.out.print("value was found in the: ");
        for(int i = 0; i<ArrayStructures.arraySize-1; i++) {
            if(ArrayStructures.array[i]==value) {
                check = true;
                System.out.print(i + " ");
                indexWithValue+= i + " ";
            }
        }
        if(!check) {
            indexWithValue = "none";
            System.out.print(indexWithValue);
        }
        System.out.println();
        return indexWithValue;

    }

    public void bubbleSort() {
        for(int i = ArrayStructures.arraySize-1; i>1; i--) {
            for (int j = 0; j<i; j++) {
                int b = ArrayStructures.array[j];
                int c = ArrayStructures.array[j+1];
                if(b>c) {
                    ArrayStructures.array[j] = c;
                    ArrayStructures.array[j+1] = b;
                }
            }
        }
    }

    public void selectionSort() {
        for(int i = 0; i<ArrayStructures.arraySize; i++) {
            int min = i;
            for(int j = i; j<ArrayStructures.arraySize; j++) {
                if(ArrayStructures.array[min]> ArrayStructures.array[j]) {
                    min = j;
                }
            }
            int temp = ArrayStructures.array[i];
            ArrayStructures.array[i] = ArrayStructures.array[min];
            ArrayStructures.array[min] = temp;
        }
    }


    public void binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = ArrayStructures.arraySize - 1;

        while(lowIndex <= highIndex ) {
            int midIndex = (highIndex + lowIndex)/2;
            if(ArrayStructures.array[midIndex]<value) {
                lowIndex = midIndex+1;
            }
            else if(ArrayStructures.array[midIndex]>value){
                highIndex = midIndex-1;
            }
            else {
                System.out.println("\nFound a match for " + value + " at index " + midIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();
        Sort sort = new Sort();
        arrayStructures.generateArray();

        arrayStructures.printArray();
        System.out.println("\nAfter sorting...\n");
        sort.selectionSort();
        arrayStructures.printArray();
    }
}
