import DiaryAssignment.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;
    @BeforeEach
    public void doThisFirst(){
        diary = new Diary("theo", "1234");
    }


    @Test
    public void testUnlockDiary_changesIsLockedToFalse() {
        diary.unlockDiary();
        assertFalse(diary.isLocked());
    }

    @Test
    public void testlockDiary_changesIsLockedToTrue() {
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }



}
