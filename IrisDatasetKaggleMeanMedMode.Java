
import java.io.*;
import java.util.Arrays;

public class Main {
	  public static void main(String[] args) throws Exception{
	   
	          FileReader fr=new FileReader("C:\\Users\\KUSHAL\\Downloads\\datasets_19_420_Iris.txt");    
	          BufferedReader br=new BufferedReader(fr);    
	          
	          double a[] = new double[1000];    //column 1 values
	          double b[] = new double[1000];
	          double c[] = new double[1000];
	          double d[] = new double[1000];
	          String line;    
	          line = br.readLine();   
	          int count=0;					//take one step ahead for column headings
	          while ((line = br.readLine()) != null)
	          { 
	        	  
	            String[] cols = line.split(",");
	          	a[count]=Double.parseDouble(cols[1]);
	          	b[count]=Double.parseDouble(cols[2]);
	          	c[count]=Double.parseDouble(cols[3]);
	          	d[count]=Double.parseDouble(cols[4]);
	          	count++;
	          }  
	       //   System.out.println(count);
	          double e[]=new double[count];
	          double f[]=new double[count];
	          double g[]=new double[count];
	          double h[]=new double[count];
	          int i=0;
	          for(i=0;i<e.length;i++)
	          {
	        	  e[i]=a[i];
	        	  f[i]=b[i];
	        	  g[i]=c[i];
	        	  h[i]=d[i];
	          }
	         
	          Arrays.sort(e);
	          Arrays.sort(f);
	          Arrays.sort(g);
	          Arrays.sort(h);
	          double mean1 = mean(e);
	          double mean2=mean(f);
	          double mean3=mean(g);
	          double mean4=mean(h);
	          double median1 = median(e);
	          double median2=median(f);
	          double median3=median(g);
	          double median4=median(h);
	          double mode1 = mode(e);
	          double mode2=mode(f);
	          double mode3=mode(g);
	          double mode4=mode(h);
	          System.out.println("Mean Sepal length  : "+ mean1);
	          System.out.println("Mean Sepal width   : "+ mean2);
	          System.out.println("Mean Petal length  : "+ mean3);
	          System.out.println("Mean Petal width   : "+ mean4);
	          System.out.println();
	          System.out.println("Median Sepal length  : "+ median1);
	          System.out.println("Median Sepal width   : "+ median2);
	          System.out.println("Median Petal length  : "+ median3);
	          System.out.println("Median Petal width   : "+ median4);
	          System.out.println();
	          System.out.println("Mode Sepal length  : "+ mode1);
	          System.out.println("Mode Sepal width   : "+ mode2);
	          System.out.println("Mode Petal length  : "+ mode3);
	          System.out.println("Mode Petal width   : "+ mode4);
	          br.close();
	          fr.close();    
	    }  
	  
	  
	  public static double mean(double array[])
	  {
	        int sum=0;
	        for(int i=0; i<array.length ;i++)
	        {
	            sum+=array[i];
	        }
	        //System.out.println(sum);
	        Arrays.sort(array);
	        double mean = (double)sum/(double)array.length; 
	        return mean;
	  }
	  
	  public static double median(double[] array)
	  {
		  double median1;
		  if((array.length)%2==0)
	        {
	            int middle = array.length / 2;
	            median1 = (double)(array[middle]+array[middle - 1])/ 2;
	        }
		  
	        else  {
	            int middle  = (array.length/2);
	            median1 = array[middle];
	        }  
		  return median1;
	  }
	  public static double mode(double array[])
	  {
	        int[] count = new int[array.length];
	        for(int i=0;i<array.length;i++)
	        {
	            for(int j=0; j <array.length ;j++)
	            {
	                    if(array[i] == array[j])
	                    {
	                        count[i]++;
	                    }
	            }
	        }
	        int max=0;
	        double mode=0;
	        for(int i=0;i<array.length;i++)
	        {
	            if(count[i]>max)
	            {
	                max = count[i];
	                mode= array[i];
	            }
	        }
	        return mode;
	  }
	}    
