
public class SolutionArea {
	public static void main() {
		int a[] = new int[4];
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*9);
		}
		// create each objects
		Rectangle A = new Rectangle(a[1],a[2]);
		Square B = new Square(a[3]);
		Circle C = new Circle(a[4]);
		
		// Store figure array in order
		int figure1[] = new int[3];
		figure1[0] = A;
		figure1[1] = B;
		figure1[2] = C;
		
		// Store figure array in random
		int figure2[] = new int[3];
		for(int j=0; j< figure2.length; j++) {
			figure2[j] = figure1[choose()];
			}
		
		// express figure2
		System.out.println("The contenst of figure2 are as follows:");
		for(int j=0; j< figure2.length; j++) {
			System.out.println("I am a"+ figure2[j].name +"with area" + figure2[j].);
			}
	}
}
