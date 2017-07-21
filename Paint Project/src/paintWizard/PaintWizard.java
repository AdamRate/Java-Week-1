package paintWizard;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PaintWizard {

	DecimalFormat df = new DecimalFormat("####0.00");

	public ArrayList<Paint> Paints = new ArrayList<>();
	{
		Paints.add(new Paint("CheapoMax", 19.99, 20, 10));
		Paints.add(new Paint("AverageJoes", 17.99, 15, 11));
		Paints.add(new Paint("DuluxourousPaints", 25.00, 10, 20));
	}

	public int[] calcCheapest(int inputSize) {
		int[] totalTins = new int[3];
		int[] remainder = new int[3];
		double total = 0, total2 = 0, total3 = 0;
		int c = 0;

		for (int i = 0; i < Paints.size(); i++) {
			Paint Test = Paints.get(i);
			totalTins[i] = inputSize / Test.totalCoverage;
			remainder[i] = inputSize % Test.totalCoverage;
			// System.out.println(totalTins[i] + " " + remainder[i]);
		}

		Paint Test = Paints.get(0);
		if (remainder[0] != 0 && remainder[0] - Test.totalCoverage <= 0) {
			totalTins[0]++;
		}
		Test = Paints.get(c);
		total = totalTins[c] * Test.price;
		System.out.println(
				"Tins of " + Test.name + " Needed: " + totalTins[c] + "\t\t Total Price: £" + df.format(total));
		c++;

		if (remainder[c] != 0 && remainder[c] - Test.totalCoverage <= 0) {
			totalTins[c]++;
		}
		Test = Paints.get(c);
		total2 = totalTins[c] * Test.price;
		System.out.println(
				"Tins of " + Test.name + " Needed: " + totalTins[c] + "\t\t Total Price: £" + df.format(total2));
		c++;

		if (remainder[c] != 0 && remainder[c] - Test.totalCoverage <= 0) {
			totalTins[c]++;
		}
		Test = Paints.get(c);
		total3 = totalTins[c] * Test.price;
		System.out
				.println("Tins of " + Test.name + " Needed: " + totalTins[c] + "\t Total Price: £" + df.format(total3));

		if (total < total2) {
			System.out.println("Option 1 is cheapest\n");
		} else
			System.out.println("Option 2 is cheapest\n");
		return totalTins;
	}

	public void leastWaste(int inputSize, int[] totalTins) {
		int[] totalWaste = new int[3];
		for (int i = 0; i < Paints.size(); i++) {
			Paint Test = Paints.get(i);
			totalWaste[i] = (totalTins[i] * Test.totalCoverage) - inputSize;
			System.out.println("Using " + Test.name + " will leave: " + totalWaste[i] + " metres of waste paint");
		}

		if (totalWaste[0] < totalWaste[1]) {
			System.out.println("Option 1 and 3 waste the least paint");
		} else
			System.out.println("Option 2 wastes the least paint");
	}

	public void listPaints() {

		for (int i = 0; i < Paints.size(); i++) {
			Paints.get(i).printDetails();
		}
	}

}
