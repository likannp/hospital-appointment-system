package hospital.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    public void testDoctorCreation() {
        Doctor doctor = new Doctor("CRM12345", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com");
        assertEquals("CRM12345", doctor.getCrm());
        assertEquals("Dr. João Silva", doctor.getNome());
        assertEquals("(11) 98765-4321", doctor.getTelefone());
        assertEquals("joao.silva@hospital.com", doctor.getEmail());
    }
}

