package hospital.model;

public class Exam {
    private String id;
    private Appointment appointment;
    private String name;
    private String observation;
    private String result;

    public Exam(String id, Appointment appointment, String name, String observation, String result) {
        this.id = id;
        this.appointment = appointment;
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

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
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
                ", appointment=" + (appointment != null ? appointment.getQueryIdentifier() : "N/A") +
                ", name='" + name + '\'' +
                ", observation='" + observation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
