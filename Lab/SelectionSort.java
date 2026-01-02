public class SelectionSort {

    public static void main(String [] args){

    int [] a = {1,4,6,8,20};

    for(int i = 0; i<a.length;i++){
        int MinIndex = i;

    for(int j = i + 1; j<a.length; i++){
        if(a[j] < a[MinIndex]){
            MinIndex = j;
        }
    }    

    int temp = a[MinIndex];
    a[MinIndex] = a[i];
    temp = a[i];
}
    for(int x : a){
        System.out.println(x);
}  
}
}
