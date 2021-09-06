public class Max{
    
    public static int isMax(int[] a){
        int sum=0;
        
        for (int i=0;  i < a.length; i++){
            
            if( sum+a[i] > sum){
                sum+=a[i];
            }
                
        }
        return sum;
    }

     public static void main(String []args){
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println(isMax(a));
     }
}
