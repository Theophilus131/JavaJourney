package DiaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

   public Diaries(){
       diaries = new ArrayList<>();
   }

    public String add(String firstName, String lastName){
       this.diaries.add(new Diary(firstName, lastName));
       return firstName + " " + lastName;

    }

    public String findByUserName(String userName){
        for (Diary diary : diaries) {
            if(diary.getUserName().equals(userName)){

            }
        }

        return userName;
    }

    public void delete(String firstName,  String lastName) {
       this.diaries.remove(new Diary(firstName, lastName));
    }

}


