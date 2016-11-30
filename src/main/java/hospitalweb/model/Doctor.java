package hospitalweb.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="doctors")
//@DiscriminatorValue(value = "Doctor")
public class Doctor extends User{

    @Column(name="doctor_specialization")
    private String doctorSpecialization;

    @ManyToMany
    @JoinTable(name = "doctor_pacients",
            joinColumns = @JoinColumn(name = "doctor_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "pacient_id", referencedColumnName = "user_id"))
    private Set<Pacient> pacientSet;

    public Set<Pacient> getPacientSet() {
        return pacientSet;
    }

    public void setPacientSet(Set<Pacient> pacientSet) {
        this.pacientSet = pacientSet;
    }

    public Doctor(){

    }

    public Doctor(String nickName, String name, String password, String egn, String doctorSpecialization) {
        super(nickName, name, password, egn);
        this.doctorSpecialization=doctorSpecialization;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
}
