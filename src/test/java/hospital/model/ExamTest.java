package hospital.model;

import hospital.exception.ExamException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamTest extends BaseTest {

    @Test
    public void testExamCreation() {
        Exam exam = new Exam("1", appointment, "Ultrassom", "2L de água.", "Tudo normal.");

        assertEquals("1", exam.getId());
        assertEquals(appointment, exam.getAppointment());
        assertEquals("Ultrassom", exam.getName());
        assertEquals("2L de água.", exam.getObservation());
        assertEquals("Tudo normal.", exam.getResult());
    }
    @Test
    public void testInvalidId() {
        Exception exception = assertThrows(ExamException.class, () -> {
            new Exam("", appointment, "Ultrassom", "2L de água.", "Tudo normal.");
        });
        assertEquals("ID cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidAppointment() {
        Exception exception = assertThrows(ExamException.class, () -> {
            new Exam("1", null, "Ultrassom", "2L de água.", "Tudo normal.");
        });
        assertEquals("Appointment cannot be null", exception.getMessage());
    }

    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(ExamException.class, () -> {
            new Exam("1", appointment, "", "2L de água.", "Tudo normal.");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidObservation() {
        Exception exception = assertThrows(ExamException.class, () -> {
            new Exam("1", appointment, "Ultrassom", null, "Tudo normal.");
        });
        assertEquals("Observation cannot be null", exception.getMessage());
    }

    @Test
    public void testInvalidResult() {
        Exception exception = assertThrows(ExamException.class, () -> {
            new Exam("1", appointment, "Ultrassom", "2L de água.", "");
        });
        assertEquals("Result cannot be null or empty", exception.getMessage());
    }
}

