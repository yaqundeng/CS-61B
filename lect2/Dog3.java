public class Dog{
    int WeightinPounds;

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


public class DogLaucher{
    public static void main(String[] args){
        Dog d = new Dog();
        d.WeightinPounds =25;
        d.makeNoise():
    }
}

![image](https://user-images.githubusercontent.com/90111475/132766654-72b87bca-b57f-4915-85c2-90cf55b1a0d1.png)
