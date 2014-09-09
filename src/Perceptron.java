public class Perceptron {

	private double[] inputs;
	private double[] weights;
	private double treshold;
	private int epochs;
	private double alpha;
	
	public Perceptron(double[] argInputs, double argTreshold, int argEpochs, double argAlpha){
		inputs = argInputs;
		weights = new double[argInputs.length];
		treshold = argTreshold;
		epochs = argEpochs;
		alpha = argAlpha;
		
		for(int i = 0; i < inputs.length; i++){
			weights[i] = Math.random() * 2 - 1;
		}
		
	}
	
	public double getOutput(){
		double res = 0.0;
		
		for(int i = 0; i < inputs.length; i++){
			res += inputs[i] * weights[i];
		}
		
		return res - treshold;
	}
	
}