package DiaryAssignment;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = false;

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void unlockDiary(){
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

//    public boolean unLockDiary() {
//        return true;
//    }


}
