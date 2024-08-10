package hospital.model;

import hospital.exception.ExamException;
import hospital.exception.MedicationException;


public class Medication {
    private String id;
    private Appointment appointment;
    private String name;
    private String type;
    private String instructions;
    private String dosage;

    public Medication(String id, Appointment appointment, String name, String type, String instructions, String dosage) {
        setId(id);
        getAppointment(appointment);
        setName(name);
        setType(type);
        setInstructions(instructions);
        setDosage(dosage);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new MedicationException("ID cannot be null or empty");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new MedicationException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public Appointment getApoointment() {
        return appointment;
    }

    public void getAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new MedicationException("Appointment cannot be null");
        }
        this.appointment = appointment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        if (instructions == null || instructions.isEmpty()) {
            throw new MedicationException("Instructions cannot be null or empty");
        }
        this.instructions = instructions;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        if (dosage == null || dosage.isEmpty()) {
            throw new MedicationException("Dosage cannot be null or empty");
        }
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", appointment ='" + appointment + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", instructions='" + instructions + '\'' +
                ", dosage='" + dosage + '\'' +
                '}';
    }
}
