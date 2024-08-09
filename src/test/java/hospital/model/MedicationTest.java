package hospital.model;

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
}
