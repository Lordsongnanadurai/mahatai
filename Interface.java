// Here we have achieved abstraction using interface.

interface Vehicle {
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    
  int speed;
  
    public void speedUp(int increment){
        
        speed = speed + increment;
    }
    
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed);
    }
}

class Bike implements Vehicle {
    
    int speed;
  
    public void speedUp(int increment){
        
        speed = speed + increment;
    }
      
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed);
    }
    
}
class Interface {
    
    public static void main (String[] args) {
    
        
        Bicycle bi = new Bicycle();
        bi.speedUp(3);
        bi.applyBrakes(1);
        
        System.out.println("Bicycle present state :");
        bi.printStates();
        
        
        Bike bi1 = new Bike();
        bi1.speedUp(4);
        bi1.applyBrakes(3);
        
        System.out.println("Bike present state :");
        bi1.printStates();
    }
}
