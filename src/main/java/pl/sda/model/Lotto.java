package pl.sda.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lotto {

    @SerializedName("numerki")
    @Expose
    private String numerki;
    @SerializedName("num_losowania")
    @Expose
    private String numLosowania;
    @SerializedName("data_losowania")
    @Expose
    private String dataLosowania;
    @SerializedName("superszansa_id")
    @Expose
    private String superszansaId;

    public String getNumerki() {
        return numerki;
    }

    public void setNumerki(String numerki) {
        this.numerki = numerki;
    }

    public String getNumLosowania() {
        return numLosowania;
    }

    public void setNumLosowania(String numLosowania) {
        this.numLosowania = numLosowania;
    }

    public String getDataLosowania() {
        return dataLosowania;
    }

    public void setDataLosowania(String dataLosowania) {
        this.dataLosowania = dataLosowania;
    }

    public String getSuperszansaId() {
        return superszansaId;
    }

    public void setSuperszansaId(String superszansaId) {
        this.superszansaId = superszansaId;
    }

    @Override
    public String toString() {
        return "Lotto{" +
                "numerki='" + numerki + '\'' +
                ", numLosowania='" + numLosowania + '\'' +
                ", dataLosowania='" + dataLosowania + '\'' +
                ", superszansaId='" + superszansaId + '\'' +
                '}';
    }
}
