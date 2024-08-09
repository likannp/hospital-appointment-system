package hospital.model;
import hospital.exception.DoctorException;


public class Doctor {
    private String crm;
    private String nome;
    private String telefone;
    private String email;

    public Doctor(){}

    public Doctor(String crm, String nome, String telefone, String email) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (crm == null || crm.isEmpty()) {
            throw new DoctorException("CRM cannot be null or empty");
        }
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new DoctorException("Name cannot be null or empty");
        }
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new DoctorException("Email cannot be null or empty");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) { // Exemplo básico de validação de email
            throw new DoctorException("Invalid email format");
        }
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new DoctorException("Phone number cannot be null or empty");
        }
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
