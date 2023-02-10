package exercice1;

public class Rectangle extends Shape {
	
	public Rectangle(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public int getArea(){
        return this.largeur * this.hauteur;
    }

	public static void main(String[] args) {
		
		
		Shape rectangle1 = new Rectangle(10,24);
        System.out.println("La surface du rextangle est: " + rectangle1.getArea());
		// TODO Auto-generated method stub

	}

}
