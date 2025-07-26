package OOPs.ClassesAndObjects;

import java.awt.Color;

public class Tree {
    double heightFT;
    double diameterFT;
    TreeType type; // TreeType is a enum
    static Color TRUNK_COLOR = new Color(102, 51, 0); // belongs to class, every instance will have the same

    Tree(double heightFT, double diameterFT, TreeType type){
        this.heightFT = heightFT;
        this.diameterFT = diameterFT;
        this.type = type;
    }
    
    void grow(){
        this.heightFT = this.heightFT + 10;
        this.diameterFT = this.diameterFT + 1;
    }

    void announceTall(){
        if(this.heightFT > 100) System.out.println("It is a tall " + this.type + " tree");
    }

    // Doesnot depend on any instance attributes, only static attributes. If it did, it would give an error
    static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + " tree");
    }
}

// heightFT, diameterFT, type, grow, announceTall are all non-static members
// TRUNK_COLOR, announceTree are static members