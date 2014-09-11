
public class AANnetwork {

	public static void main(String[] args) {
		Reader r = new Reader("src/resources/features.txt");
		Reader a = new Reader("src/resources/targets.txt");
		
		double[] weights = new double[10];
		for(int i = 0; i < 10; i++){
			weights[i] = Math.random() * 2 - 1;
		}
		
		//Read input/output
		for (int i = 0; i < r.size(); i++) {
			double[] inputs = r.getNextInputs();
			double[] outputs = a.getNextInputs();
			double output = outputs[0];
			Layer outputlayer = new Layer(7, inputs, weights);
			//TODO run network
		}
	}

}
