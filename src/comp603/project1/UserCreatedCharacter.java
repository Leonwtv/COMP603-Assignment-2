
package comp603.project1;

public class UserCreatedCharacter extends AttributesTemplate{
    
      //Private constructor made for class to keep it from being accessed by other classes
    private static UserCreatedCharacter stats;
    
    private UserCreatedCharacter(){
       //Private constructor prevents other classes from creating difefrent objects 
    }
    
   
    public static UserCreatedCharacter getInstance(){
        if(null == stats)
        {
            stats = new UserCreatedCharacter();
        }
        return stats;
    }
    
    //Getters and setters for all variables found in attributes template
    
        public void setName(String name){
        this.name = name;
        }
        
        public String getName(){
        return name;
        }
        
        public void setRace(String race){
        this.race = race;
        }
        public String getRace(){
        return race;
        }
        
        public void setPlayerClass(String playerClass){
        this.playerClass = playerClass;
        }
        public String getPlayerClass(){
        return playerClass;
        }
    
        public void setStrength(int strength){
        this.strength = strength;
        }
        public int getStrength(){
        return strength;
        }
    
        public void setDexterity(int dexterity){
        this.dexterity = dexterity;
        }
        public int getDexterity(){
            return dexterity;
        }

        public void setConstitution(int constitution){
            this.constitution = constitution;
        }
        public int getConstitution(){
            return constitution;
        }

        public void setIntelligence(int intelligence){
            this.intelligence = intelligence;
        }
        public int getIntelligence(){
            return intelligence;
        }

        public void setWisdom(int wisdom){
            this.wisdom = wisdom;
        }
        public int getWisdom(){
            return wisdom;
        }

        public void setCharisma(int charisma){
            this.charisma = charisma;
        }
        public int getCharisma(){
            return charisma;
        }

        public void setBackground(String background){
            this.background = background;
        }
        public String getBackground(){
            return background;
        }

        public void setAbilities(String[] abilities){
        this.abilities = abilities;
        }
        public String[] getAbilities(){
            return abilities;
        }
        
         public void setClassFeatures(String[] classfeatures){
        this.classfeatures = classfeatures;
        }
        public String[] getClassFeatures(){
            return classfeatures;
        }


    }



