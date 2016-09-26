/**
 * Created by User on 22.09.2016.
 */
public class Box
    {
        double width, heigh, depth;

        Box ()
        {
            width = 0;
            heigh = 0;
            depth = 0;
        }

        void setDim (double w, double h, double d)
        {
            width = w;
            heigh = h;
            depth = d;
        }

        double vol ()
        {
            return width * heigh * depth;
        }

    }
