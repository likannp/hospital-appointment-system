package hospital.model;

import hospital.exception.AppointmentException;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest extends BaseTest {

    @Test
    public void testAppointmentCreation() {
        assertEquals(doctor, appointment.getDoctor());
        assertEquals(patient, appointment.getPatient());
        assertEquals("Consulta", appointment.getType());  // Verifica o tipo
        assertNotNull(appointment.getData());
        assertNotNull(appointment.getQueryIdentifier());
    }

    @Test
    public void testSetDoctor() {
        Exception exception = assertThrows(AppointmentException.class, () -> appointment.setDoctor(null));
        assertEquals("Doctor cannot be null", exception.getMessage());
    }

    @Test
    public void testSetPatient() {
        Exception exception = assertThrows(AppointmentException.class, () -> appointment.setPatient(null));
        assertEquals("Patient cannot be null", exception.getMessage());
    }

    @Test
    public void testSetType() {
        Exception exception = assertThrows(AppointmentException.class, () -> appointment.setType(null));
        assertEquals("Type of appointment cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testSetDate() {
        Exception exception = assertThrows(AppointmentException.class, () -> appointment.setData(null));
        assertEquals("Date cannot be null", exception.getMessage());
    }

    @Test
    public void testSetFormattedDate() throws ParseException {
        Exception exception = assertThrows(AppointmentException.class, () -> appointment.setFormattedDate(null));
        assertEquals("Date string cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testAddMedication() {
        Medication medication = new Medication("1", appointment, "Paracetamol", "Liquido", "tomar de noite", "500mg");
        appointment.addMedication(medication);
        assertTrue(appointment.getMedications().contains(medication));

        Exception exception = assertThrows(AppointmentException.class, () -> appointment.addMedication(null));
        assertEquals("Medication cannot be null", exception.getMessage());
    }

    @Test
    public void testAddExam() {
        Exam exam = new Exam("1", appointment, "Hemograma", "Jejum", "Glicose alta.");
        appointment.addExam(exam);
        assertTrue(appointment.getExams().contains(exam));

        Exception exception = assertThrows(AppointmentException.class, () -> appointment.addExam(null));
        assertEquals("Exam cannot be null", exception.getMessage());
    }
}
