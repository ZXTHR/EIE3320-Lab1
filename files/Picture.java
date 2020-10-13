import java.util.ArrayList;
import java.util.Iterator;
public class Picture
{
    private ArrayList<Shape> shapes;
    public Picture(){
        shapes = new ArrayList<Shape>();
    }
    void addShape(Shape s)
    {
        shapes.add(s);
    }
    
    void computeShape()
    {
        for(Iterator shapeloop = shapes.iterator(); shapeloop.hasNext(); )
        {
            Shape shape = (Shape)shapeloop.next();
            shape.computeArea();
            shape.computePerimeter();
        }
    }
    
    public void listAllShapeTypes()
    {
        for(Iterator shapeloop = shapes.iterator(); shapeloop.hasNext(); )
        {
            Shape shape = (Shape)shapeloop.next();
            shape.displayShape();
        }
    }
    
    public void listSingleShapeType(String className)
    {
        for(Iterator shapeloop = shapes.iterator(); shapeloop.hasNext(); )
        {
            Shape shape = (Shape)shapeloop.next();
            if (className.equals(shape.getClass().getName())) {
                shape.displayShape();
            }
        }
    }

}
