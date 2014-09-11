public class Perceptron {

	private ArrayList<double> inputs;
	private double[] weights;
	private double treshold;
	private double alpha;
	
	public Perceptron(double[] argInputs, double[] argWeights, double argTreshold, double argAlpha){
		inputs = argInputs;
		weights = new double[inputs.length];
		treshold = argTreshold;
		alpha = argAlpha;
		double[] weights = new double[10];
		for(int i = 0; i < 10; i++){
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
	
	
	public void updateWeights(double error){
		for(int i = 0; i < weights.length; i++){
			weights[i] = weights[i] + (alpha * inputs[i] * error);
		}
	}
	
	public double[] getWeights(){
		return weights;
	}
}