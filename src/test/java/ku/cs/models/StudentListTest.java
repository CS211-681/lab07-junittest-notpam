package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451283", "Test");
        assertEquals(1, s.getStudents().size());
    }


    @Test
    void testFindStudentById() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451283", "Test");
        assertEquals("Test", s.findStudentById("6710451283").getName());
    }

    @Test
    void testFilterByName() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451283", "Test");

        StudentList filtered = s.filterByName("Test");
        assertEquals(1, filtered.getStudents().size());
    }

    @Test
    void testGiveScoreToId() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451283", "Test");
        s.giveScoreToId("6710451283", 85);

        assertEquals(85, s.findStudentById("6710451283").getScore());
    }

    @Test
    void testViewGradeOfId() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451283", "Test");
        s.giveScoreToId("6710451283", 85);


        assertEquals("A", s.findStudentById("6710451283").getGrade());
    }
}