public abstract class Shape implements Drawable 
{
    protected float area;
    protected float perimeter;

    public abstract void readShape();
    public abstract void computeArea();
    public abstract void computePerimeter();
    public abstract void displayShape();
}
