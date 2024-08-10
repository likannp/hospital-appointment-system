package hospital.model;

import org.junit.jupiter.api.BeforeEach;
import java.util.Date;

public class BaseTest {
    protected Appointment appointment;
    protected Doctor doctor;
    protected Patient patient;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor("CRM12345", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com");
        patient = new Patient("54321", "Maria Oliveira", "Rua das Flores, 123", "9876-5432", "PlanoSaude123");
        appointment = new Appointment(doctor, patient, "Consulta", new Date());
    }

}

