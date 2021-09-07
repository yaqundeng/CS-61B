public class Sum {
    
    public static boolean isTrue(int[] a){
        
        int sum=1;
        
        for (int i=0;  i < a.length; i++){
            
            for (int j=0; j< a.length; j++){
                
                for (int h=0; h< a.length; h++){
                   
                    if (a[i]+a[j]+a[h] ==0){
                        
                        sum=0;
                        break;
                        
                    }
                }
            }
        }
        if ( sum==0){ return true; }
        else{ return false;}
    }


     public static void main(String []args){
        
        int[] a = new int[]{5, 1, 0, 3, 6};
        
        System.out.println(isTrue(a));
     }
}
