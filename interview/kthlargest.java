public class kthlargest {
    public static void main(String[] args) {
        int[] a={11,12,38,400,51,26};
        int k=4;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){

                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(a[i]);
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
       
       
    }
    
}
