class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
        this.capacity = capacity; 
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        array[size] = n;
        this.size++;
    }

    public int popback() {
        int [] poppedArr = new int[capacity];
        for(int counter = 0; counter < array.length - 1; counter++){
            poppedArr[counter] = array[counter]; 
        }
        int valToPop = array[size-1];
        this.array = poppedArr;
        this.size--;
        return valToPop;

    }

    private void resize() {
        int [] doubledArray = new int[capacity*2];
        for(int counter = 0; counter < array.length; counter++){
            doubledArray[counter] = array[counter]; 
        }
        this.capacity *= 2;
        this.array = doubledArray;

    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
