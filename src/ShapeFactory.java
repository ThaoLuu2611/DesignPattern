
public class ShapeFactory {
	Shape shape;
	public Shape getShape(String shape){
		if(shape.equalsIgnoreCase("Square"))
			return new Square();
		else if(shape.equalsIgnoreCase("Striangular"))
			return new Striangular();
		return null;
	}

}
