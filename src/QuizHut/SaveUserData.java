package QuizHut;


public class SaveUserData {
    public void saveRslt(int uid, int correct, int wrong, int skip){
        System.out.println("User : "+ uid);
        System.out.println("Correct : "+ correct);
        System.out.println("Wrong : "+ wrong);
        System.out.println("Skiped : "+ skip);
    }
}
