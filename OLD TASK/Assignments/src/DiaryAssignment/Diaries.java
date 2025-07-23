package DiaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

   public Diaries(){
       diaries = new ArrayList<>();
   }

    public void add(String firstName, String lastName){
        for(Diary diary : diaries){
            if(diary.getUserName().equals(firstName) && diary.getUserName().equals(lastName)){
                diaries.add(diary);
            }
        }

    }

    public Diary findByUserName(String userName){
        for (Diary diary : diaries) {
            if(diary.getUserName().equals(userName)){
                return diary;
            }
        }

        return null;
    }

    public void delete(String userName) {
       for(Diary diary : diaries){
           if(diary.getUserName().equals(userName)){
               diaries.remove(diary);
           }
       }
    }

}


