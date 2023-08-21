package practice002.entities;

public class Player {
    private String name;
    private String lastname;
    private int position;
    private int number;
    
    public Player(String name, String lastname, int position, int number){
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.number = number;
    }    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public int getPosition(){
        return position;
    }
    
    public void setPosition(int position){
        this.position = position;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
}
