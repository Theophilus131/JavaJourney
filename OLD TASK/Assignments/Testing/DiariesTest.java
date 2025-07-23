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
        assertEquals("theo umar",myDiary.add("theo", "umar"));
    }

    @Test
    public void testDiaryCanBeLookForBy_UserName(){
        Diaries myDiary = new Diaries();
        myDiary.findByUserName("theo");
        assertEquals("theo",myDiary.findByUserName("theo"));

    }

    @Test
    public void testThatEntryCanBe_deleted_or_removed(){
     myDiary.add("theo","theo");
     myDiary.delete("theo");
     assertNull(myDiary.findByUserName("theo"));

    }


}
