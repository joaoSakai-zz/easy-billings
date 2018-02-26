package com.joaosakai.easybillings.model;

import com.joaosakai.easybillings.enumerations.Appearance;
import com.joaosakai.easybillings.enumerations.Fluidity;
import com.joaosakai.easybillings.enumerations.Sensation;
import com.joaosakai.easybillings.enumerations.Symbol;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "EB_MARKING")
public class Marking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "varchar(20)")
    @Enumerated(EnumType.STRING)
    private Symbol symbol;

    @Column(columnDefinition = "boolean")
    private boolean meeting;

    @Column(columnDefinition = "varchar(20)")
    @Enumerated(EnumType.STRING)
    private Sensation sensation;

    @Column(columnDefinition = "varchar(30)")
    @Enumerated(EnumType.STRING)
    private Appearance appearance;

    @Column(columnDefinition = "varchar(25)")
    @Enumerated(EnumType.STRING)
    private Fluidity fluidity;

    @Temporal(TemporalType.DATE)
    private Calendar createdOn;

    public Marking() { }

    public Marking(Symbol symbol, boolean meeting, Sensation sensation, Appearance appearance, Fluidity fluidity, Calendar createdOn) {
        this.symbol = symbol;
        this.meeting = meeting;
        this.sensation = sensation;
        this.appearance = appearance;
        this.fluidity = fluidity;
        this.createdOn = createdOn;
    }

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

    public Calendar getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
    }
}
