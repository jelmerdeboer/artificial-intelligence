
public class AANnetwork {

	public static void main(String[] args) {
		Reader r = new Reader("src/resources/features.txt");
		Reader a = new Reader("src/resources/targets.txt");
		
		for (int i = 0; i < r.size(); i++) {
			Double[] inputs = r.getNextInputs();
			Double[] outputs = a.getNextInputs();
			Double output = outputs[0];
			System.out.println(inputs.toString());
			System.out.println(output+"");
			//TODO run network
		}
	}

}
