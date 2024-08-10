package hospital.model;

import hospital.exception.ExamException;

public class Exam {
    private String id;
    private Appointment appointment;
    private String name;
    private String observation;
    private String result;

    public Exam(String id, Appointment appointment, String name, String observation, String result) {
        setId(id);
        setAppointment(appointment);
        setName(name);
        setObservation(observation);
        setResult(result);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new ExamException("ID cannot be null or empty");
        }
        this.id = id;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new ExamException("Appointment cannot be null");
        }
        this.appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ExamException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        if (observation == null) {
            throw new ExamException("Observation cannot be null");
        }
        this.observation = observation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        if (result == null || result.isEmpty()) {
            throw new ExamException("Result cannot be null or empty");
        }
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
