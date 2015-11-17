public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung:
	// https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen
	 * Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 6) {
				uebung6();
			}
			if (nr == 7) {
				uebung7();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1
		Zeichenfenster.zeichneLinie(100, 100, 700, 100);
		Zeichenfenster.zeichneLinie(700, 100, 700, 300);
		Zeichenfenster.zeichneLinie(700, 300, 100, 300);
		Zeichenfenster.zeichneLinie(100, 300, 100, 100);

		Zeichenfenster.zeichneEllipse(400, 200, 600, 200);
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
		int x1 = 0;
		int y1 = 800;
		int x2 = 800;
		int y2 = 0;

		for (int n = 1; n <= 80; n++) {
			Zeichenfenster.zeichneLinie(x1, y1, x2, y2);
			x2 = x2 - 10;
			y1 = y1 - 10;
		}
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
		int x = 200;
		int y = 400;
		int d = 100;

		for (int n = 1; n <= 60; n++) {
			Zeichenfenster.zeichneEllipse(x, y, d, d);
			x = x + 5;
			d = d + 5;
		}
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
		int m = 400;
		int h = 200;
		int b = 800;

		for (int n = 1; n <= 60; n++) {
			Zeichenfenster.zeichneEllipse(m, m, h, b);
			b = b - 10;
			h = h + 10;
		}
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5

		for (int n = 1; n <= 100; n++) {
			Zeichenfenster.zeichneLinie(0+8*n, 0, 800, 0+8*n);
			Zeichenfenster.zeichneLinie(800, 0+8*n, 800-8*n, 800);
			Zeichenfenster.zeichneLinie(800-8*n, 800, 0, 800-n*8);
			Zeichenfenster.zeichneLinie(0, 800-n*8, 0+n*8, 0);
		}
	}

	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}

}
