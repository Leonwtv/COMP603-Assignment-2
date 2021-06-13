
package comp603.project1;
import java.util.Scanner;

public class CharacterRace {
       
    UserCreatedCharacter chooseRace = UserCreatedCharacter.getInstance();
    
 
        public void dwarf(){
        chooseRace.setConstitution(chooseRace.constitution + 2);
        chooseRace.setRace("Dwarf");
        chooseRace.setAbilities(new String[]{"Darkvision","Dwarven Resiliance", "Dwarven Combat Training", "Stonecunning"});
     
        }
                
         public void elf(){
        chooseRace.setDexterity(chooseRace.dexterity + 2);
        chooseRace.setRace("Elf");
        chooseRace.setAbilities(new String[]{"Darkvision","Keen Seneses", "Fey Ancestry", "Trance"});
        }
                
         public void gnome(){
        chooseRace.setIntelligence(chooseRace.intelligence + 2);
        chooseRace.setRace("Gnome");      
        chooseRace.setAbilities(new String[]{"Darkvision","Gnome Cunning"});
        }
                
         public void halfelf(){
        chooseRace.setCharisma(chooseRace.charisma + 2);
        chooseRace.setRace("Half-Elf");
        chooseRace.setAbilities(new String[]{"Darkvision","Fey Ancestry", "Skill Diversity"});
        }
                
        public void halfling(){
        chooseRace.setDexterity(chooseRace.dexterity + 2);
        chooseRace.setRace("Halfling");
        chooseRace.setAbilities(new String[]{"Lucky", "Brave", "Halfling Nimbleness"});
        }
                
        public void halforc(){
        chooseRace.setStrength(chooseRace.strength + 2);
        chooseRace.setConstitution(chooseRace.constitution + 1);
        chooseRace.setRace("Half-Orc");
        chooseRace.setAbilities(new String[]{"Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"});
        }
                
        public void human(){
        chooseRace.setRace("Human");
        chooseRace.setAbilities(new String[]{"Extra Language"});
        }
                
        public void tiefling(){
        chooseRace.setRace("Tiefling");
        chooseRace.setCharisma(chooseRace.charisma + 2);
        chooseRace.setIntelligence(chooseRace.intelligence + 1);
        chooseRace.setAbilities(new String[]{"Darkvision","hellish Resistance", "Infernal Legacy"});
        }

    }
    


 
     

     
    

    
