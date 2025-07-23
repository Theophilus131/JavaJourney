package DiaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;


    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.entries = new ArrayList<Entry>();
            }

    public void unlockDiary() {
        if(this.password.equals(password)){
            isLocked = false;

        }

    }

    public void lockDiary(){
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body){
        entries.add(new Entry(5, title, body));

    }

    public void deleteEntry(int entryID ){
        for( int index = 0; index < entries.size(); index++ ){
            if( entries.get(index).getId() ==(entryID) ){
                entries.remove(0);
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

    public void updateEntry(int id,String title,String body){
        for(Entry entry: entries){
            if(entry.getId() == id){
                entry.setTitle(title);
                entry.setBody(body);

               }
                   }
    }

    public String getUserName(){

        return userName;
        }

        public String getPassword(){
        return password;
        }

    public int getSize() {
        return entries.size();
    }

}





