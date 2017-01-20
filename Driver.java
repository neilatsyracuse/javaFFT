//author Neil
//test FFT time

package testFFT;
import java.util.Random;
import java.util.Timer;

import org.ejml.simple.*;





public class Driver {
	public static final Boolean deepLearningFlag = false;
	public static final Boolean testFFT = true;
	
	public static void main(String[] args) {
		
		if(testFFT){
			//Create matrix 
			int rowSize = 8;
			int colSize= 8;
			double min=-1.0;
			double max=1.0;
			Random r = new Random();
			//System.out.println(min+(max-min)*r.nextDouble());
			double[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
			double[][] data2 = {{1,2,3}, {4,5,6}, {7,8,9}};
				for (int row = 0; row < 3; row ++)
		            for (int col = 0; col < 3; col++)
		                System.out.println (data[row][col]);
			SimpleMatrix dataMatrix = new SimpleMatrix(data);
			SimpleMatrix dataMatrix2 = new SimpleMatrix(data2);
			SimpleMatrix cMatrix =  dataMatrix.mult(dataMatrix2);
			//cMatrix.print();
//			for (int row = 0; row < 3; row ++)
//	            for (int col = 0; col < 3; col++)
//	                System.out.println (cMatrix[row][col]);
//			// TODO Auto-generated method stub
			int n = 4096;
	        Complex[] x = new Complex[n];
	        // original data
	        for (int i = 0; i < n; i++) {
	            x[i] = new Complex(i, 0);
	            x[i] = new Complex(-2*Math.random() + 1, 0);
	        }
			long a = System.nanoTime();
//	        FFT.show(x, "x");
//	        // FFT of original data
	        Complex[] y = FFT.fft(x);
	        long b = System.nanoTime();
	        double time= (double)((b - a))/1000000;
		    System.out.printf("time elapsed: %f ms",time);
	        //FFT.show(y, "y = fft(x)");
//	        // take inverse FFT
//	        Complex[] z = FFT.ifft(y);
//	        FFT.show(z, "z = ifft(y)");	
		}
		if(deepLearningFlag){
		System.out.println("start test depplearning4j");
		
		}
		
		
	}

}
