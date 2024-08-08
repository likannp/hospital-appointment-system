package hospital.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamTest extends BaseTest {

    @Test
    public void testExamCreation() {
        // Criação de um exame com valores de teste
        Exam exam = new Exam("1", appointment, "Ultrassom", "2L de água.", "Tudo normal.");

        // Verificações dos atributos do exame
        assertEquals("1", exam.getId());
        assertEquals(appointment, exam.getAppointment());
        assertEquals("Ultrassom", exam.getName());
        assertEquals("2L de água.", exam.getObservation());
        assertEquals("Tudo normal.", exam.getResult());
    }
}

