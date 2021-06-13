package comp603.project1;

public class BaseStats {
    
   public static void createBaseStats(){
    
   UserCreatedCharacter fetchBaseStats = UserCreatedCharacter.getInstance();
  
   //An instance of Roll4D6 is created for each ability, in order to generate a new random roll for each ability
   Roll4D6 strengthRoll = new Roll4D6();
   Roll4D6 dexterityRoll = new Roll4D6();
   Roll4D6 constitutionRoll = new Roll4D6();
   Roll4D6 intelligenceRoll = new Roll4D6();
   Roll4D6 wisdomRoll = new Roll4D6();
   Roll4D6 charismaRoll = new Roll4D6();
   
   //The variables is set to to the Roll4D6 instances created above
   
   fetchBaseStats.setStrength(strengthRoll.getResult());
   fetchBaseStats.setDexterity(dexterityRoll.getResult());
   fetchBaseStats.setConstitution(constitutionRoll.getResult()); 
   fetchBaseStats.setIntelligence(intelligenceRoll.getResult());
   fetchBaseStats.setWisdom(wisdomRoll.getResult());
   fetchBaseStats.setCharisma(charismaRoll.getResult());
   
  //Print out of the results
   System.out.println("\nTo determine the base stats of your character, for each stat four six-sided dice will be rolled with the highest three dice added together.");
   System.out.println("Your characters' base stats are: \n");
   
   System.out.println("Strength: " +  fetchBaseStats.getStrength());
   System.out.println("Dexterity: " + fetchBaseStats.getDexterity());
   System.out.println("Constitution: " + fetchBaseStats.getConstitution());
   System.out.println("Intelligence: " + fetchBaseStats.getIntelligence());
   System.out.println("Wisdom: " + fetchBaseStats.getWisdom());
   System.out.println("Charisma: " + fetchBaseStats.getCharisma());
  
  }
   
   
}

