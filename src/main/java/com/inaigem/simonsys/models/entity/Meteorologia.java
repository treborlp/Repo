package com.inaigem.simonsys.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "meteorologia")
public class Meteorologia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "Panel_TempF_Avg")
    private Float temperaturaPanel;
    @Column(name="AirTempF_Avg")
    private Float temperaturaAireAvg;
    @Column(name="RH")
    private Float humedadRelativa;
    @Column(name="BP_inHg_Avg")
    private Float presionAtmosfericaAvg;
    @Column(name="Rain_in_Tot")
    private Float precipitacionTotal;
    @Column(name = "TdewF_Avg")
    private Float TemperaturaPuntoRocio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Float getTemperaturaPanel() {
        return temperaturaPanel;
    }

    public void setTemperaturaPanel(Float temperaturaPanel) {
        this.temperaturaPanel = temperaturaPanel;
    }

    public Float getTemperaturaAireAvg() {
        return temperaturaAireAvg;
    }

    public void setTemperaturaAireAvg(Float temperaturaAireAvg) {
        this.temperaturaAireAvg = temperaturaAireAvg;
    }

    public Float getHumedadRelativa() {
        return humedadRelativa;
    }

    public void setHumedadRelativa(Float humedadRelativa) {
        this.humedadRelativa = humedadRelativa;
    }

    public Float getPresionAtmosfericaAvg() {
        return presionAtmosfericaAvg;
    }

    public void setPresionAtmosfericaAvg(Float presionAtmosfericaAvg) {
        this.presionAtmosfericaAvg = presionAtmosfericaAvg;
    }

    public Float getPrecipitacionTotal() {
        return precipitacionTotal;
    }

    public void setPrecipitacionTotal(Float precipitacionTotal) {
        this.precipitacionTotal = precipitacionTotal;
    }

    public Float getTemperaturaPuntoRocio() {
        return TemperaturaPuntoRocio;
    }

    public void setTemperaturaPuntoRocio(Float temperaturaPuntoRocio) {
        TemperaturaPuntoRocio = temperaturaPuntoRocio;
    }

    private static final long serialVersionUID = -6249567170806845128L;
}
