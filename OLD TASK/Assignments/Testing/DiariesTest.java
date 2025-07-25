import DiaryAssignment.Diaries;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    private  Diaries myDiary;

    @BeforeEach
    public void doThisFirst(){
        myDiary = new Diaries();
    }

    @Test
    public void testDiariesCanBeAddedBYFirstNameAndLastName(){
        myDiary.add("John","Doe");
        assertEquals(1,myDiary.getSize());
       myDiary.add("Jane","Doe");
      assertEquals(2,myDiary.getSize());
    }

    @Test
    public void testDiaryCanBeLookForBy_UserName(){
        myDiary.add("John","Doe");
       assertEquals("John", myDiary.findByUserName("John").getUserName());
    }

    @Test
    public void testThatEntryCanBe_deleted_or_removed(){
    myDiary.add("John","Doe");
    myDiary.delete("John");
    assertEquals(0,myDiary.getSize());

    }

    @Test
    public void testThatEntryCanAddTwoEntries_AndDeleteOneEntry(){
        myDiary.add("John","Doe");
        myDiary.add("Jane","Doe");
        myDiary.delete("John");
        assertEquals(1,myDiary.getSize());

    }

    @Test
    public void testThatEntryCanAddTwoEntries_AndDeleteAllEntries(){
        myDiary.add("John","Doe");
        myDiary.add("Jane","Doe");
        myDiary.delete("John");
        myDiary.delete("Jane");
        assertEquals(0,myDiary.getSize());
    }




}
