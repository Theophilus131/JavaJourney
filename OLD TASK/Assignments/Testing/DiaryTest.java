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
    public void testDiaryCanBeCreated(){
        assertNotNull(diary);
        assertEquals("theo", diary.getUserName());
        assertEquals("1234", diary.getPassword());
    }

    @Test
    public void testDiaryCanBeUnLockedWithPassword(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.getPassword();
        assertEquals("1234", diary.getPassword());
    }

    @Test
    public void testDiaryCanBeUnLockedWithUserName(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.getUserName();
        assertEquals("theo", diary.getUserName());
    }

    @Test
    public void testDiaryEntryCanBe_Created(){
        diary.createEntry("Home alone", "it is what is is");
        assertEquals(diary.createEntry("Home alone", "it is what is is"));

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

    @Test
    public void testThatEntryCanBe_deleted_or_removed(){
        diary.unlockDiary();
        assertEquals(1,diary.findEntryByID(1));
    }


    @Test
    public void testThatDiaryEntryCanBeFindById(){
        diary.unlockDiary();
        assertEquals(1,diary.findEntryByID(1));
        assertEquals(2,diary.findEntryByID(2));
        assertEquals(1000,diary.findEntryByID(1000));
    }




}
