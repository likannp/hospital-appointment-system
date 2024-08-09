package hospital.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import hospital.exception.AppointmentException;

public class Appointment {
    private static final AtomicInteger queryCounter = new AtomicInteger(0);
    private String id;
    private String queryIdentifier;
    private Doctor doctor;
    private Patient patient;
    private String tipo;
    private Date data;
    private ArrayList<Medication> medications;
    private ArrayList<Exam> exams;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public Appointment() {
        this.queryIdentifier = generateQueryIdentifier();
        this.medications = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    // Construtor com parâmetros
    public Appointment(Doctor doctor, Patient patient, String tipo, Date data) {
        this();
        this.doctor = doctor;
        this.patient = patient;
        this.tipo = tipo;
        this.data = data;
    }

    private String generateQueryIdentifier() {
        return "Q-" + queryCounter.incrementAndGet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQueryIdentifier() {
        return queryIdentifier;
    }

    public void setQueryIdentifier(String queryIdentifier) {
        this.queryIdentifier = queryIdentifier;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new AppointmentException("Doctor cannot be null");
        }
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        if (patient == null) {
            throw new AppointmentException("Patient cannot be null");
        }
        this.patient = patient;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new AppointmentException("Type of appointment cannot be null or empty");
        }
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data == null) {
            throw new AppointmentException("Date cannot be null");
        }
        this.data = data;
    }

    public String getFormattedDate() {
        return DATE_FORMAT.format(data);
    }

    public void setFormattedDate(String dateString) throws ParseException {
        if (dateString == null || dateString.isEmpty()) {
            throw new AppointmentException("Date string cannot be null or empty");
        }
        this.data = DATE_FORMAT.parse(dateString);
    }

    public void addMedication(Medication medication) {
        if (medication == null) {
            throw new AppointmentException("Medication cannot be null");
        }
        this.medications.add(medication);
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public void addExam(Exam exam) {
        if (exam == null) {
            throw new AppointmentException("Exam cannot be null");
        }
        this.exams.add(exam);
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    @Override
    public String toString() {
        return "Consulta: " + queryIdentifier +
                ", Médico: " + (doctor != null ? doctor.getNome() : "N/A") +
                ", CRM: " + (doctor != null ? doctor.getCrm() : "N/A") +
                ", Paciente: " + (patient != null ? patient.getName() : "N/A") +
                ", Tipo: '" + tipo + '\'' +
                ", Data: " + getFormattedDate() +
                ", Medicamentos: " + medications +
                ", Exames: " + exams;
    }
}
