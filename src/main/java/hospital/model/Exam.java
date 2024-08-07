package poxa.hospital.model;

public class Exam {
    private String id;
    private String consultationId;
    private String name;
    private String observation;
    private String result;

    public Exam(String id, String consultationId, String name, String observation, String result) {
        this.id = id;
        this.consultationId = consultationId;
        this.name = name;
        this.observation = observation;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id='" + id + '\'' +
                ", consultationId='" + consultationId + '\'' +
                ", name='" + name + '\'' +
                ", observation='" + observation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
