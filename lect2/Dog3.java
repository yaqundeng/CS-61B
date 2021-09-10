public class Dog{
    int weightinpounds;//the property of the Dog class

    public Dog(int w){
        weightinpounds=w; //constructor of the dog class, parameter in braces
        }

    public void makenoise(){
        if(weightinpounds < 10){
            System.out.println("yip!");
        }
        else if( weightinpounds < 30){
            System.out.println("bark.");
        }else{
            System.out.println("woof!");
        }
    }

    public static Dog biggerdog( Dog d1, Dog d2){
        if(d1.weightinpounds > d2. weightinpounds){
            return d1;
        }
        return d2;
    }
}
