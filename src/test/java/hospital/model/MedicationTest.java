package hospital.model;

import hospital.exception.ExamException;
import hospital.exception.MedicationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicationTest extends BaseTest {
    @Test
    public void testMedicationCreation() {
        Medication medication = new Medication("1", appointment, "Rivotril", "Aloprazam", "Vicia, ter cuidado.", "1/2 de noite");

        assertEquals("1", medication.getId());
        assertEquals(appointment, medication.getApoointment());
        assertEquals("Rivotril", medication.getName());
        assertEquals("Aloprazam", medication.getType());
        assertEquals("Vicia, ter cuidado.", medication.getInstructions());
        assertEquals("1/2 de noite", medication.getDosage());

    }
    @Test
    public void testInvalidId() {
        Exception exception = assertThrows(MedicationException.class, () -> {
            new Medication("", appointment, "Rivotril", "Aloprazam", "Vicia, ter cuidado.", "1/2 de noite");
        });
        assertEquals("ID cannot be null or empty", exception.getMessage());
    }
    @Test
    public void testInvalidAppointment() {
        Exception exception = assertThrows(MedicationException.class, () -> {
            new Medication("1", null, "Rivotril", "Aloprazam", "Vicia, ter cuidado.", "1/2 de noite");
        });
        assertEquals("Appointment cannot be null", exception.getMessage());
    }
    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(MedicationException.class, () -> {
            new Medication("1", appointment, "", "Aloprazam", "Vicia, ter cuidado.", "1/2 de noite");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }
    @Test
    public void testInvalidInstructions() {
        Exception exception = assertThrows(MedicationException.class, () -> {
            new Medication("1", appointment, "Rivotril", "Aloprazolam", "", "1/2 de noite");
        });
        assertEquals("Instructions cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidDosage() {
        Exception exception = assertThrows(MedicationException.class, () -> {
            new Medication("1", appointment, "Rivotril", "Aloprazolam", "Vicia, ter cuidado.","");
        });
        assertEquals("Dosage cannot be null or empty", exception.getMessage());
    }


}
