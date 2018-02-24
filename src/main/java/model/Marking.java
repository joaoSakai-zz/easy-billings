package model;

import enumerations.Appearance;
import enumerations.Fluidity;
import enumerations.Sensation;
import enumerations.Symbol;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Marking {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "EB_SYMBOL")
    private Symbol symbol;

    @Column(name = "EB_MEETING")
    private boolean meeting;

    @Column(name = "EB_SENSATION")
    private Sensation sensation;

    @Column(name = "EB_APPEARANCE")
    private Appearance appearance;

    @Column(name = "EB_FLUIDITY")
    private Fluidity fluidity;

    @Temporal(TemporalType.DATE)
    @Column(name = "EB_CREATED_ON")
    private LocalDate createdOn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isMeeting() {
        return meeting;
    }

    public void setMeeting(boolean meeting) {
        this.meeting = meeting;
    }

    public Sensation getSensation() {
        return sensation;
    }

    public void setSensation(Sensation sensation) {
        this.sensation = sensation;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Fluidity getFluidity() {
        return fluidity;
    }

    public void setFluidity(Fluidity fluidity) {
        this.fluidity = fluidity;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
