
package comp603.project1;

public class CharacterClass{
   
       UserCreatedCharacter selectClass = UserCreatedCharacter.getInstance();
        
       
                public void barbarian(){
                    selectClass.setPlayerClass("Barbarian");
                    selectClass.setClassFeatures(new String[]{"Rage","Unarmoured Defense", "Brutality", "Primal Path"});
                  
                }
                
                public void bard(){
                    selectClass.setPlayerClass("Bard");
                    selectClass.setClassFeatures(new String[]{"Spellcasting","Composition", "Bardic Inspiration", "Bard College"});
               
                }
                
                public void cleric(){
                    selectClass.setPlayerClass("Cleric");
                    selectClass.setClassFeatures(new String[]{"Divine Domain","Spellcasting"});
                }
                
                public void druid(){
                    selectClass.setPlayerClass("Druid");
                    selectClass.setClassFeatures(new String[]{"Druidic","Spellcasting", "Primal Power", "Wild Shape", "Druid Circle"});
                }
                
                public void fighter(){
                    selectClass.setPlayerClass("Fighter");
                    selectClass.setClassFeatures(new String[]{"Fighting Style","Second Wind", "Resolve", "Maneuvers", "Martial Archetype"});       
                }
                
                public void monk(){
                    selectClass.setPlayerClass("Monk");
                    selectClass.setClassFeatures(new String[]{"Martial Arts","Unarmoured Defense", "Ki", "Flurry of Blows", "Mantras", "Monastic Tradition"});
                  
                }
                
                public void paladin(){
                    selectClass.setPlayerClass("Paladin");
                    selectClass.setClassFeatures(new String[]{"Sacred Oath","Conviction", "Smite", "Fighting Style"});
                   
                }
                
                public void ranger(){
                    selectClass.setPlayerClass("Ranger");
                    selectClass.setClassFeatures(new String[]{"Survival Instincts","Hunter's Focus", "Scrap", "Traps", "Ranger Archetype"});
                  
                }
                
                public void rogue(){
                    selectClass.setPlayerClass("Rogue");
                    selectClass.setClassFeatures(new String[]{"Expertise","Sneak Attack", "Thieve's Gant", "Focus", "Exploits", "Roguish Archetype"});
                 
                }
                
                public void sorcerer(){
                    selectClass.setPlayerClass("Sorcerer");
                    selectClass.setClassFeatures(new String[]{"Sorcery","Metamagic", "Sorcerous Origin"});
                   
                }
                
                public void warlock(){
                    selectClass.setPlayerClass("Warlock");
                    selectClass.setClassFeatures(new String[]{"Otherwordly Patron","Pact Boon", "Pact Magic"});
   
                }
                
                public void wizard(){
                    selectClass.setPlayerClass("Wizard");
                    selectClass.setClassFeatures(new String[]{"Spellscript","Spellcasting", "Arcane Tradition"});
                  
                }
                
              
        }
         
    


   
    
       
    
    

