import DiaryAssignment.Diary;

import java.util.List;

public class Diaries {
    private List<Diary> diaries;

    public String add(String firstName, String lastName){

    }

    public String findByUserName(String userName){
        return userName;
    }

    public void delete(String userName){
        diaries.remove(findByUserName(userName));
    }

}
