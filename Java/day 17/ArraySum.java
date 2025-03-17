public class ArraySum{
    public static int found(int[] arr,int elem){

        for(int i=0;i<arr.length;i++){
            if(elem == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int sum = 9;
        for(int i=0;i<arr.length;i++){
            int index = found(arr,sum-arr[i]);

            if(index!=-1){
                System.out.println("[ " + i + "," + index+"]");
            }
        }
    }
}