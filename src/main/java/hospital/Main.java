package poxa.hospital;
import poxa.hospital.model.Appointment;
import poxa.hospital.model.Doctor;
import poxa.hospital.model.Patient;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date appointmentDate = null;

        Doctor doctor = new Doctor("CRM12345", "Dr. João Silva", "(11) 98765-4321", "joao.silva@hospital.com");
        Patient patient = new Patient("54321", "Maria Oliveira", "Marcos Vinicius", "9876-5432", "PlanoSaude123");

        Doctor doctor2 = new Doctor("CRM67890", "Dra. Ana Costa", "(21) 12345-6789", "ana.costa@hospital.com");
        Patient patient2 = new Patient("67890", "João Pereira", "Monica Costa", "1234-5678", "PlanoSaude456");


        appointmentDate = dateFormat.parse("15/08/2024");
        Date appointmentDate2 = dateFormat.parse("10/09/2024");
        Appointment appointment = new Appointment(doctor, patient, "Consulta", appointmentDate);
        Appointment appointment2 = new Appointment(doctor2, patient2, "Retorno", appointmentDate2);

        System.out.println("Primeiro caso:");
        System.out.println(appointment);

        System.out.println("Segundo caso:");
        System.out.println(appointment2);
    }
}
