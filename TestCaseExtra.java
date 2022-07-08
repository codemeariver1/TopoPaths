import java.io.*;

public class TestCaseExtra
{
	public static void main(String [] args) throws IOException
	{
		System.out.println("Custom Test Case (See graphs.png)");
    boolean success;

    System.out.println("[G1] 2 connected vertices in a line (1 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra1-graph.txt") == 1);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G2] 2 unconnected vertices (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra2-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G3] multiple vertices with 0 incoming (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra3-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G4] 2 unconnected components (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra4-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G5] multigraph 1 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra5-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G6] multigraph 2 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra6-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G7] multigraph 3 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra7-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G8] cycle graph 1 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra8-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G9] cycle graph 2 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra9-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G10] cycle graph 3 (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra10-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G11] graph with central vertex (1 topopath)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra11-graph.txt") == 1);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G12] generic graph 1 (1 topopath)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra12-graph.txt") == 1);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G13] generic graph 2 (1 topopath)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra13-graph.txt") == 1);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();

    System.out.println("[G14] 1,000,000 unconnected vertices (0 topopaths)");
		success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra14-graph.txt") == 0);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
   
    System.out.println("[G15] 1,000,000 connected vertices in a line (1 topopath)");
    success = (TopoPaths.countTopoPaths("extra_input_files/TestCaseExtra15-graph.txt") == 1);
		System.out.println(success ? "PASS" : "fail whale :(");
    System.out.println();
	}
}
