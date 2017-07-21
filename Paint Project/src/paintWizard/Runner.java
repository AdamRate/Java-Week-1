package paintWizard;

public class Runner {

	public static void main(String[] args) {
		
		PaintWizard wiz = new PaintWizard();
		wiz.listPaints();
		int inputSize = 10;
		wiz.leastWaste(inputSize,wiz.calcCheapest(inputSize));
	}

}
