package exercice1;

public class Square extends Shape {
	
	 public Square(int largeur) {
	        super(largeur, largeur);
	    }

	public static void main(String[] args) {
		
		Shape square1 = new Square(20);
        System.out.println("La surface du carré est: " + square1.getArea());
		// TODO Auto-generated method stub

	}

}
