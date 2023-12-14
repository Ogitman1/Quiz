public class Question{//Classes podem ser definidas para por "funcionalidades", os métodos, pra assim "doar" seus métodos para outras classes
    String question;
    String [] options;
    int CorrectanswerCount;

    public Question(String question,String [] options, int CorrectanswerCount){//Constructor Question
        this.question = question;
        this.options = options;
        this.CorrectanswerCount = CorrectanswerCount;


    }
    public boolean Chechanswer(int answer){//Check answer
        return answer == CorrectanswerCount ;
    }
    public void displayquestion(){
        System.out.println(question);//Display question that was entered into the database
        for(int i = 0; i < options.length; i++){//Display options
            System.out.println((i+1)+ ") " + options[i]);
        }
    }
}

