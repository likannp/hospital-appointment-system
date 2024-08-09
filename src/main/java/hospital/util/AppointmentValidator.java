package hospital.util;

import hospital.exception.AppointmentException;
import hospital.model.Doctor;
import hospital.model.Patient;

import java.util.Date;

public class AppointmentValidator {

    public static void validateDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new AppointmentException("Doctor cannot be null");
        }
    }

    public static void validatePatient(Patient patient) {
        if (patient == null) {
            throw new AppointmentException("Patient cannot be null");
        }
    }

    public static void validateTipo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new AppointmentException("Type of appointment cannot be null or empty");
        }
    }

    public static void validateDate(Date date) {
        if (date == null) {
            throw new AppointmentException("Date cannot be null");
        }
    }
}
