package entities;

public class VectorSum {
	//VALUES
	private int[] vectorA;
	private int[] vectorB;
	private int[] vectorC;
	
	//CONSTRUCTOR
	public VectorSum(int[] vectorA, int[] vectorB) {
		this.vectorA = vectorA;
		this.vectorB = vectorB;
	}
	
	//GETTERS AND SETTERS
	
	
	//METHODS
	public void calculateSum() {
		this.vectorC = new int[vectorA.length];//Cria o vetor C só quando vai fazer a operação
		for(int i = 0; i < vectorC.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}
	}
	
	public int[] getVectorC() {
		calculateSum();
		return vectorC;
	}
}
