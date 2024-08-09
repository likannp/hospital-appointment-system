package hospital.model;

public class Medication {
    private String id;
    private Appointment appointment;
    private String name;
    private String type;
    private String instructions;
    private String dosage;

    public Medication(String id, Appointment appointment, String name, String type, String instructions, String dosage) {
        this.id = id;
        this.appointment = appointment;
        this.name = name;
        this.type = type;
        this.instructions = instructions;
        this.dosage = dosage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Appointment getApoointment() {
        return appointment;
    }

    public void setApoointment(Appointment appointment) {
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
        this.instructions = instructions;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
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
