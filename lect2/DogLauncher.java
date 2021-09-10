public class DogLauncher{

    public static void main ( String [] args){
            Dog d =new Dog(25);
            Dog d2= new Dog(100);

            Dog big=Dog.biggerdog(d,d2);
            big.makenoise();
            //d.makenoise();
    }
}
