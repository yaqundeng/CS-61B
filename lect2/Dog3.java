public class Dog{
    int WeightinPounds;
    
    public Dog(int w){
        WeightinPounds=w;
    }


    public void makeNoise(){
        if (WeightinPounds <10){
            System.out.println("yip!");
         }
        else if (WeightinPounds <30){
            System.out.println("bark.");
         }
        else{
            System.out.println("wooof!");
        }
        
     }
}
