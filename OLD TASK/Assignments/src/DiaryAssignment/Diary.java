package DiaryAssignment;

import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private List<String> entries;

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
        for(int index = 0; index < entries.size(); index++){
            if(entries.get(index).equals(entryName)){
                entries.set(index, password);

            }
        }

    }

    public void deleteEntry(int entryID ){
        for( int index = 0; index < entries.size(); index++ ){
            if( entries.get(index).equals(entryID) ){
                entries.remove(index);
            }
        }


    }

    public int findEntryByID(int id){
        for(int index = 0; index < entries.size(); index++){
            if( entries.get(index).equals(id) ){
                return index;
            }
        }

        return id;
    }

    public void updateEntry(int id,String name,String password){
        for(int index = 0; index < entries.size(); index++){
            if( entries.get(index).equals(id) ){
                entries.set(index, name);

            }
        }

    }


}
