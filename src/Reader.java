import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Reader {
	private List<Double[]> lines = new ArrayList<Double[]>();
	private int linecounter;

	public	 Reader(String file){
		linecounter = 0;
		try {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(new File(file)));
			} catch (FileNotFoundException e) {
				System.err.println("Given file is not found");
				e.printStackTrace();
			}
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Double[] numberValues = new Double[values.length];
				for(int i = 0; i < values.length; i++){
					numberValues[i] = Double.parseDouble(values[i]);
				}
				lines.add(numberValues);
			}
			br.close();
		} catch (IOException e) {
			System.err.println("Error while reading file");
			e.printStackTrace();
		}
		System.out.println("Read " + lines.size() + " lines");
	}
	
	public Double[] getNextInputs(){
		Double[] res = lines.get(linecounter);
		linecounter++;
		return res;
	}
	
	public int size(){
		return lines.size();
	}
}
