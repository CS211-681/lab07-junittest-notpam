package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeAll
    static void init() {

    }

    @BeforeEach // เรียกทุกครั้ง
    void setUp() {
        s = new Student("6710451283", "Test");



    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15")
    void testAddScore() {
        Student s = new Student("6710451283", "Test");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    void testCalGrade() {
        Student s =new Student("6710451283", "Test");
        s.addScore(80);
        assertEquals("A", s.getGrade());
    }

    @Test
    void testIsID() {
        Student s = new Student("6710451283", "Test");
        assertTrue(s.isId("6710451283"));
        assertFalse(s.isId("6710055431"));
    }

    @Test
    void testIsNameContains() {
        Student s = new Student("6710451283", "Test");
        assertTrue(s.isNameContains("Test"));
        assertFalse(s.isNameContains("java"));

    }

}