import java.util.Arrays;

public class StatFormulas {
	public static double mean(double values[]) {
		double sum = 0;
		int len = values.length;
		for(int i=0;i<len;i++)
				sum+=values[i];
		sum=sum/len;
		return sum;
	}
	
	public static double median(double values[]) {
		Arrays.sort(values); 
		int len = values.length;
		if (len%2!=0) {
			return values[(len/2)+1];
		}
		else{
			int med1 = len/2;
			int med2 = med1+1;
			double medVal = (values[med1]+values[med2])/2;
			return medVal;
		}
	}
	
	public static double std(double values[]) {
		double mean = mean(values);
		int len = values.length;
		
		double squaredSum = 0;
		
		for(int i=0;i<len;i++) {
			double temp = values[i]-mean;
			temp = Math.pow(temp, 2);
			squaredSum += temp;
		}
		squaredSum = squaredSum/len;
		return Math.sqrt(squaredSum);
	}
}
