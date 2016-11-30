package hospitalweb.model;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.Set;

@Entity
@Scope("prototype")
@Table(name="pacients")
//@DiscriminatorValue(value = "Pacient")
public class Pacient extends User{

    @Column(name="illness")
    private String illness;

    @ManyToMany(mappedBy = "pacientSet", targetEntity = Doctor.class)
    private Set<Doctor> doctors;

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Pacient(){

    }

    public Pacient(String nickName, String name, String password, String egn, String illness) {
        super(nickName, name, password, egn);
        this.illness=illness;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
