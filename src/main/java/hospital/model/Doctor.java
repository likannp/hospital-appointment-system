package hospital.model;

import hospital.exception.DoctorException;

public class Doctor {
    private String crm;
    private String nome;
    private String telefone;
    private String email;

    public Doctor() {}

    public Doctor(String crm, String nome, String telefone, String email) {
        setCrm(crm);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
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
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
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
        // Adicionar uma expressão regular para validar o formato do telefone
        if (!telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}")) {
            throw new DoctorException("Invalid phone number format");
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