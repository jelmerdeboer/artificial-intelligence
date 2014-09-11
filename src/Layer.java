
public class Layer {
/**
 * aantal inputs van perceptrons is het aantal perceptrons van de vorige laag TODO
 * @param numberOfPerceptrons
 * @param inputs
 * @param weights
 */
	public Layer(int numberOfPerceptrons, double[] inputs, double[] weights){
		Perceptron[] perceptrons = new Perceptron[numberOfPerceptrons];
		
		for(int i = 0; i < numberOfPerceptrons; i++){
			perceptrons[i] = new Perceptron(inputs, weights, 0.1, 0.1);
			System.out.println(perceptrons[i].getOutput());
//			perceptron.getoutput(layer-1[i])
		}
		
		
		
	}
}
