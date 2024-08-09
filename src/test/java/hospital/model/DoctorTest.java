package hospital.model;

import hospital.exception.DoctorException;
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

    @Test
    public void testInvalidCrm() {
        Exception exception = assertThrows(DoctorException.class, () -> {
            new Doctor("", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com");
        });
        assertEquals("CRM cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidNome() {
        Exception exception = assertThrows(DoctorException.class, () -> {
            new Doctor("CRM12345", "", "(11) 98765-4321", "joao.silva@hospital.com");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(DoctorException.class, () -> {
            new Doctor("CRM12345", "Dr. João Silva", "(11) 98765-4321", "invalid-email");
        });
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    public void testInvalidTelefone() {
        Exception exception = assertThrows(DoctorException.class, () -> {
            new Doctor("CRM12345", "Dr. João Silva", "987654321", "joao.silva@hospital.com");
        });
        assertEquals("Invalid phone number format", exception.getMessage());
    }

    @Test
    public void testToString() {
        Doctor doctor = new Doctor("CRM12345", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com");
        String expectedString = "Doctor{crm='CRM12345', nome='Dr. João Silva', telefone='(11) 98765-4321', email='joao.silva@hospital.com'}";
        assertEquals(expectedString, doctor.toString());
    }
}
