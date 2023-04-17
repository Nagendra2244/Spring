package Com.SpringDemo5;
import java.util.*;

public class Question {
    int questionId;
    String questionName;
    List<String> answers;
   
	public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

 public void display() {
        System.out.println("Question Number:"+questionId);
        System.out.println("Question Name:"+questionName);
        Iterator<String> itr = answers.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
 
}
