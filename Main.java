import java.util.Random;

public class Main {
    public static void main(String[] args) throws EmptyTreeException, InvalidPositionException, BoundaryViolationException {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Random rand = new Random();
        int n = 100;
        
        // Generate random integers and display them unsorted
        System.out.println("Unsorted numbers:");
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(1000);
            System.out.print(num + " ");
            bst.insert(num);
        }
        //Display them sorted
        System.out.println("\n\nSorted numbers:");
        try {
            for (Integer num : bst.inOrder()) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
