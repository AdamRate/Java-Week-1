package paintWizard;

public class Paint {
	private static int totalPaints;
	public String name;
	public int paintNo;
	public double price;
	public int litres;
	public int coveragePL;
	public int totalCoverage;

	public Paint(String name, double price, int litres, int coveragePL) {
		totalPaints++;
		this.name=name;
		this.paintNo = totalPaints;
		this.price = price;
		this.litres = litres;
		this.coveragePL = coveragePL;
		this.totalCoverage = coveragePL * litres;
	}

	public void printDetails() {
		System.out.println(toString() + "\n");
	}

	public String toString() {
		return "Paint Type: " + paintNo + "\tPrice: £" + price + "\tLitres: " + litres + "\tCoverage: " + coveragePL +" m/l \tTotal Coverage: " + totalCoverage +"m^2";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLitres() {
		return litres;
	}

	public void setLitres(int litres) {
		this.litres = litres;
	}

	public int getCoveragePL() {
		return coveragePL;
	}

	public void setCoveragePL(int coveragePL) {
		this.coveragePL = coveragePL;
	}
	
	

}
