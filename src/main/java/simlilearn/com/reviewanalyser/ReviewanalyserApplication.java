package simlilearn.com.reviewanalyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewanalyserApplication {
public static double getWordCount(String review){
        	int count = 0;
      	 
            	String string[] = review.toLowerCase().split("([,.\\s]+)");  
            	for(String s : string){  
   	 	count++;
            	}  
   	 return count;
    }
    public static void main(String[] args) {
   	 SpringApplication.run(ReviewanalyserApplication.class, args);
    }
}
