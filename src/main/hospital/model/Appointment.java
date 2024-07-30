package main.hospital.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Appointment {
    private static final AtomicInteger queryCounter = new AtomicInteger(0);
    private String id;
    private String queryIdentifier;
    private Doctor doctor;
    private Patient patient;
    private String tipo;
    private Date data;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    public Appointment() {
        this.queryIdentifier = generateQueryIdentifier();
    }

    // Construtor com parâmetros
    public Appointment(Doctor doctor, Patient patient, String tipo, Date data) {
        this.queryIdentifier = generateQueryIdentifier(); // Gera o identificador da consulta
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
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormattedDate() {
        return DATE_FORMAT.format(data);
    }

    public void setFormattedDate(String dateString) throws ParseException {
        this.data = DATE_FORMAT.parse(dateString);
    }

    @Override
    public String toString() {
        return "Consulta: " + queryIdentifier +
                ", Médico: " + (doctor != null ? doctor.getNome() : "N/A") +
                ", CRM: " + (doctor != null ? doctor.getCrm() : "N/A") +
                ", Paciente: " + (patient != null ? patient.getName() : "N/A") +
                ", Tipo: '" + tipo + '\'' +
                ", Data: " + getFormattedDate();
    }
}
