package algoritms.derekbanas;

public class ArrayStructures {
    static int[] array = new int[50];
    static int arraySize = 10;

    public void generateArray() {
        for(int i = 0; i<arraySize; i++) {
            array[i] = (int) (Math.random()*10)+10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i<arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(array[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValue(int index) {
        if(index<arraySize) return array[index];
        return 0;
    }

    public boolean checkValue(int value) {
        for(int i = 0; i<arraySize; i++) {
            if(value==array[i]) return true;
        }
        return false;
    }

    public void deleteValue(int value) {
        for(int i = 0; i<arraySize-1; i++) {
            if(array[i]==value) {
                deleteIndex(i);
            }
        }
    }

    public void insertValue(int value) {
        if(arraySize<50) {
            array[arraySize] = value;
            arraySize++;
        }
    }

    public void deleteIndex(int index) {
        if(index<arraySize) {
            for(int i = index; i<arraySize-1; i++) {
                array[i] = array[i+1];
            }
        }
        arraySize--;
    }

    public String linerSearchForValue(int value) {
        boolean check = false;
        String indexWithValue = "";
        System.out.print("value was found in the: ");
        for(int i = 0; i<arraySize-1; i++) {
            if(array[i]==value) {
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

    public static void main(String[] args) {


    }
}
