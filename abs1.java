abstract class Bird{
    public abstract void eat();;
    public abstract void fly();
}

class Spparow extends Bird{
    @Override
    public void eat(){
        System.out.println("Sparrow eats grains");
    }

    @Override
    public void fly(){
        System.out.println("Fly at medium level of sky");
    }
}

class Crow extends Bird{
    @Override
    public void eat(){
        System.err.println("Crow eat grass");
    }

    @Override
    public void fly(){
        System.out.println("crow fly at min range");
    }
}

 abstract class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle fly above clouds");
    }
    public abstract void eat();

}

class serpantEagle extends Eagle{
        public void eat(){
            System.out.println("Eats flesh");
        }
}

class goldenEagle extends Eagle{
    public void eat(){
        System.out.println("Eats snake");
    }
}

  class Sky {
     public static void allowBird(Bird ref){
        ref.eat();
        ref.fly();

        System.out.println();
   
     }
 }







public class abs1 {
    public static void main(String[] args) {
        Spparow sp = new Spparow();
        Eagle e1;
        Eagle e2;
        e1= new serpantEagle();
        e2= new goldenEagle();
            
    
        Crow cr = new Crow();

         Sky.allowBird(sp);
        Sky.allowBird(e1);
        Sky.allowBird(e2);
        Sky.allowBird(cr);
    }
}
