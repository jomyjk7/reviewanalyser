package simlilearn.com.reviewanalyser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewanalyserApplicationTests {

    private ReviewanalyserApplication analyser = new ReviewanalyserApplication();
    @Test	 
    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }
}


