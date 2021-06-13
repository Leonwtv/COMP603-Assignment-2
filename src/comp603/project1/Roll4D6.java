package comp603.project1;

import java.util.Random;

public class Roll4D6 {
    
    Random rand = new Random();
   
    //4 random numbers as array elements passed into method to calculate the sum of the highest 3 
    int[] die = {rand.nextInt(6) + 1,rand.nextInt(6) + 1,rand.nextInt(6) + 1,rand.nextInt(6) + 1};
    private int result = calculateSum(die);
 
  
    private static int calculateSum(int[] dice){
      
        int outcome = 0;
        int smallest =  Integer.MAX_VALUE;
    
        for (int x=0; x <dice.length; x++){
            if (dice[x] < smallest)
                smallest = dice[x];
                outcome += dice[x];
            }
            outcome -= smallest;
            return outcome;
    }  
    
/**Accessor for the generated full name, returns dice result*/
    public void setResult(int result){
        this.result = result;
        }
        public int getResult(){
        return result;
        }
        

}
   
 
    
  
