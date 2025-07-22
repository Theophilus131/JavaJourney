package DiaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

   public Diaries(){
       diaries = new ArrayList<>();
   }

    public String add(String firstName, String lastName){
        for(Diary diary : diaries){
            if(diary.getUserName().equals(firstName) && diary.getUserName().equals(lastName)){
                diaries.add(diary);
            }
        }
        return firstName;
    }


    public String findByUserName(String userName){
        for (Diary diary : diaries) {
            if(diary.getUserName().equals(userName)){

            }
        }

        return userName;
    }

    public void delete(String firstName,  String lastName) {
       for(Diary diary : diaries){
           if(diary.getUserName().equals(firstName) && diary.getUserName().equals(lastName)){
               diaries.remove(diary);
           }
       }
    }

}


