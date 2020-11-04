public abstract class Figure {
		// declaration of fields
		private int number1;
		private int number2;
		private String name;

		// declaration of Access Method
		public int getNumber1(){
			return number1;
		}
		public int getNumber2(){
			return number2;
		}
		public String getName(){
			return name;
		}
		
		// declaration of constructor
		public Figure(int a, int b, String c) {
			this.number1 = a;
			this.number2 = b;
			this.name = c;
		}
		// declaration of abstract method
		abstract double getArea() ;
		
		public class Rectangle extends Figure {
			String l = "rectangle";
			// constructor
			Rectangle(int x, int y, String l) {
				super();
			}
			@Override
			double getArea() {
				return double area = getNumber1()*getNumber2();
			}
		}
		public class Square extends Figure {
			String l = "square";
			// constructor
			Square(int x,int y, String l) {
				super();
			}
			@Override
			double getArea() {
				return double area = getNumber1()*getNumber1();
			}
		}
		public class Circle extends Figure {
			// constructor
			String l = "circle";
			Circle(int x,int y, String l) {
				super();
			}
			@Override
			double getArea() {
				return double area = Math.pow(getNumber1(), 2)*Math.PI;
			}
		}
}
