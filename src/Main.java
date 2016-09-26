import java.util.*;

/**
 * Created by User on 22.09.2016.
 */
public class Main {

    public static void main (String args[] )
    {
        Box mybox1 = new Box ();
        mybox1.width = 2;
        mybox1.heigh = 2;
        mybox1.depth = 2;

        Box mybox2 = new Box ();
        mybox2.setDim (3,3,3);

        Box mybox3 = new Box ();

        System.out.println (mybox1.vol());
        System.out.println (mybox2.vol());
        System.out.println (mybox3.vol());
    }

}
