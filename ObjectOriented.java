
package objectoriented;

import Containers.Aquarium;
import animals.Fish;
import animals.Snails;


public class ObjectOriented {

    
    public static void main(String[] args) {
       
       Aquarium a1=new Aquarium();
       a1.addFish();
       
       a1.f[0].type="clownfish";
       a1.f[1].type = "beta fish";
       
       a1.addSnail();
       a1.printAquariumInfo();
      
    }
    
}
