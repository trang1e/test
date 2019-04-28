public class bubbleSort {
    public static void main(String[] args){
        int[] a={4,2,3,7,56,23,1};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
