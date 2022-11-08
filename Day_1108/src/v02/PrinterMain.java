package v02;

public class PrinterMain extends Printer {

	public static void main(String[] args) {
		Printer p;
		
		p = new Printer();;
		p.maker = "삼성";
		
		//System.out.println(p.maker);
		print(p);
		Inkjet p1 = new Inkjet();
		p1.maker = "캐논";
		p1.color = "빨강색";
		//print(p1);
		//System.out.println(p.maker + "" +((Inkjet)p).color);
		Laser l = new Laser();
		l.maker = "HP";
		l.toner = "10ml 검정 토너";
		print(l);
	}
	
	public static void print(Object p) {
		if(p instanceof Printer)return;
		
		if(p instanceof Inkjet) {
			 Inkjet p1 = (Inkjet) p;
			 System.out.println(p1.maker + "," + p1.color);
		}else if(p instanceof Laser) {
			Laser p1 = (Laser) p;
			System.out.println(p1.maker + "," + p1.toner);
		} else if(p instanceof Printer) {
			Printer p1 = (Printer) p;
			System.out.println(p1.maker);
		}
			
	}
}
