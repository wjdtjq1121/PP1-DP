package edu.handong.csee.pp1.dp;

public class Main {
	
	static boolean INFO = true;
	
	public static void main(String[] args) {
		new Main().run(args);
	}

	private void run(String[] args) {
		String gitPath = args[0];
		String arffFilePathToBeSaved = args[1];
		
		MetricCollector metricCollector = new MetricCollector(gitPath,arffFilePathToBeSaved);
		
		metricCollector.collect();
		metricCollector.saveAnArffFile();
	}
}
