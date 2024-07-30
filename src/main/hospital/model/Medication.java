package main.hospital.model;

public class Medication {
    private String id;
    private String consultationId;
    private String name;
    private String type;
    private String instructions;

    public Medication(String id, String consultationId, String name, String type, String instructions) {
        this.id = id;
        this.consultationId = consultationId;
        this.name = name;
        this.type = type;
        this.instructions = instructions;
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

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId;
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

    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", consultationId='" + consultationId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
