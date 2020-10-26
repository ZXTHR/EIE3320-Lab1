/**
 * Picture.java
 *
 * @author: Ku Wing Fung 18075712d
 * @author: Wong Tsz Hin 18050573d
 *
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Picture
{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Picture(){
    
    }

    public void addShape(Shape s)
    {
        shapes.add(s);
    }
    
    public void computeShape()
    {
        for(Iterator shapeLoop = shapes.iterator(); shapeLoop.hasNext(); )
        {
            Shape shape = (Shape)shapeLoop.next();
            shape.computeArea();
            shape.computePerimeter();
        }
    }
    
    public void listAllShapeTypes()
    {
        for(Iterator shapeLoop = shapes.iterator(); shapeLoop.hasNext(); )
        {
            Shape shape = (Shape)shapeLoop.next();
            shape.displayShape();
        }
    }
    
    public void listSingleShapeType(String className)
    {
        for(Iterator shapeLoop = shapes.iterator(); shapeLoop.hasNext(); )
        {
            Shape shape = (Shape)shapeLoop.next();
            if (className.equals(shape.getClass().getName())) {
                shape.displayShape();
            }
        }
    }

}
