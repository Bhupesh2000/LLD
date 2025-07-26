package OOPs.Encapsulation;

import java.awt.Color;

public class Tree {

    protected static Color TRUNK_COLOR = new Color(102, 51, 0); // belongs to class, every instance will have the same
    private double heightFT;
    private double diameterFT;
    private TreeType type; // TreeType is a enum

    public Tree(double heightFT, double diameterFT, TreeType type){
        this.heightFT = heightFT;
        this.diameterFT = diameterFT;
        this.type = type;
    }

    // Getters
    public double getHeightFT(){
        return heightFT;
    }

    public double getDiameterFT(){
        return diameterFT;
    }
    
    public TreeType getType(){
        return type;
    }

    // Setters
    public void setHeightFT(double heightFT){
        this.heightFT = heightFT;
    }

    public void setDiamterFT(double diameterFT){
        this.diameterFT = diameterFT;
    }
    
    // No setter for type because this cannot be changed. OAK tree cannot be changed into Maple tree

    public void grow(){
        this.heightFT = this.heightFT + 10;
        this.diameterFT = this.diameterFT + 1;
    }

    public void announceTall(){
        if(this.heightFT > 100) System.out.println("It is a tall " + this.type + " tree");
    }

    // Doesnot depend on any instance attributes, only static attributes. If it did, it would give an error
    public static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + " tree");
    }
}

// heightFT, diameterFT, type, grow, announceTall are all non-static members
// TRUNK_COLOR, announceTree are static members