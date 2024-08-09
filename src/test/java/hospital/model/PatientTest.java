package hospital.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest extends BaseTest {
    @Test
    public void testPatientCreation() {
        patient = new Patient("54321", "Rua das Flores, 123", "Maria Oliveira", "9876-5432", "PlanoSaude123");

        assertEquals("54321", patient.getCpf());
        assertEquals("Rua das Flores, 123", patient.getAddress());
        assertEquals("Maria Oliveira", patient.getName());
        assertEquals("9876-5432", patient.getPhone());
        assertEquals("PlanoSaude123", patient.getHealthInsurance());

    }
    }