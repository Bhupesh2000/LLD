package OOPs.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Tree firstTree = new Tree(120.0, 90, TreeType.OAK);
        Tree secondTree = new Tree(85, 55, TreeType.MAPLE);
        
        firstTree.announceTall();
        secondTree.announceTall();

        System.out.println("Trunk color : " + Tree.TRUNK_COLOR); // accessed via class name, not via instance name
        Tree.announceTree();

    }
}
