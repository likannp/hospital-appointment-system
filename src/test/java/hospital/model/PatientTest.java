package hospital.model;

import hospital.exception.PatientException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest extends BaseTest {

    @Test
    public void testPatientCreation() {
        Patient patient = new Patient("54321", "Rua das Flores, 123", "Maria Oliveira", "9876-5432", "PlanoSaude123");

        assertEquals("54321", patient.getCpf());
        assertEquals("Rua das Flores, 123", patient.getAddress());
        assertEquals("Maria Oliveira", patient.getName());
        assertEquals("9876-5432", patient.getPhone());
        assertEquals("PlanoSaude123", patient.getHealthInsurance());
    }

    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(PatientException.class, () -> {
            new Patient("54321", "Rua das Flores, 123", "", "9876-5432", "PlanoSaude123");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testSetInvalidName() {
        Patient patient = new Patient("54321", "Rua das Flores, 123", "Maria Oliveira", "9876-5432", "PlanoSaude123");
        Exception exception = assertThrows(PatientException.class, () -> {
            patient.setName("");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testToString() {
        Patient patient = new Patient("54321", "Rua das Flores, 123", "Maria Oliveira", "9876-5432", "PlanoSaude123");
        String expectedString = "Patient{cpf='54321', address='Rua das Flores, 123', name='Maria Oliveira', phone='9876-5432', healthInsurance='PlanoSaude123'}";
        assertEquals(expectedString, patient.toString());
    }
}
