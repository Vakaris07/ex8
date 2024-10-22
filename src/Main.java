public class Main {
    public static void main(String[] args) {
        int[] array={9,2,5,6,7,8,1,3};
        int temp;
        int swap=0;
        for(int i=0; i< array.length-1; i++){
            for(int j=0; j< array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap++;

                }
            }
        }
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("There were "+swap+" swaps");
    }
}