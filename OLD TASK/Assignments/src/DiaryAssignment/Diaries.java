package DiaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;

   public Diaries(){
       diaries = new ArrayList<>();
   }

    public void add(String firstName, String lastName){
                diaries.add(new Diary(firstName,lastName));

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
       diaries.remove(findByUserName(userName));


    }

    public int getSize() {
       return diaries.size();
    }
}


