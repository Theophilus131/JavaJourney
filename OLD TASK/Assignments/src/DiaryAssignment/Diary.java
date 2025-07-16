package DiaryAssignment;

import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void unlockDiary(){
        isLocked = false;
    }

    public void lockDiary(){
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String entryName, String password){



    }

    public void deleteEntry(int entryID ){


    }

    public int findEntryByID(int id){
        return 0;
    }

    public void updateEntry(int id,String name,String password){

    }


}
