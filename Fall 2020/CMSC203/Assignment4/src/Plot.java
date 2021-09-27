/**
 * @author brandontenorio
 */
public class Plot
{
    private int x;
    private int y;
    private int width;
    private int depth;

    /**
     * No-arg constructor. Initializes x to 0, y to 0, width to 1, depth to 1
     */
    public Plot()
    {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.depth = 0;
    }

    /**
     * Copy constructor. Creates a new Plot using the information of the Plot object passed to it
     * @param p: Plot object
     */
    public Plot (Plot p)
    {
        this.x = p.x;
        this.y = p.y;
        this.width = p.width;
        this.depth = p.depth;
    }

    /**
     * Parametrized constructor
     * @param x: x-value of the upper left corner of the plot
     * @param y: y-value of the upper left corner of the plot
     * @param width: Horizontal extent of the plot
     * @param depth: Vertical extent of the plot
     */
    public Plot(int x, int y, int width, int depth)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }


    /**
     * Determines if this plot overlaps the parameter
     * @param plot An instance of Plot
     * @return True if it overlaps the parameter
     */
    public boolean overlaps(Plot plot){
        boolean overlaps = true;
        if (plot.width < width || plot.depth < depth)
            overlaps = false;
        return overlaps;
    }

    /**
     * Determines if this plot encompasses the parameter
     * @param plot An instance of Plot
     * @return True if Plot encompasses the parameter
     */
    public boolean encompasses(Plot plot){
        boolean encompasses = false;
        if (plot.width < width || plot.depth < depth){
            encompasses = true;
        }
        return encompasses;
    }

    /**
     * Returns the depth of the plot
     * @return Plot's depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Returns width of the plot
     * @return Plot's width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns x value
     * @return x value
     */
    public int getX() {
        return x;
    }

    /**
     * Returns y value
     * @return y value
     */
    public int getY() {
        return y;
    }

    /**
     * Set's plot's depth
     * @param depth The depth of the plot
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Sets the width of the plot
     * @param width The plot's width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets the x value
     * @param x the value to be set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y value
     * @param y The value to be set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Prints out the plot's x and y coordinates as well as its width and depth
     * @return A String with the plot's information
     */
    @Override
    public String toString(){
        return "Upper left: (" + getX() + "," + getY() + ":"
                + "\nWidth: " + getWidth()
                + "\nDepth: " + getDepth();
    }

}
