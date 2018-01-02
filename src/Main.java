
public class Main {
	public static void main(String arg[])
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("Square");
		shape.draw();
		shape = shapeFactory.getShape("Striangular");
		shape.draw();
	}
}
