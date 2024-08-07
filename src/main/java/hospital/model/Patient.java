package hospital.model;

public class Patient {
    private String cpf;
    private String address;
    private String name;
    private String phone;
    private String healthInsurance;

    public Patient(String cpf, String address, String name, String phone, String healthInsurance) {
        this.cpf = cpf;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.healthInsurance = healthInsurance;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cpf='" + cpf + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", healthInsurance='" + healthInsurance + '\'' +
                '}';
    }
}
