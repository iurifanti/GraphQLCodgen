package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Terapia_altro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTerapia_altroCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String altra_motivazione_fine;
    private String altro_farmaco;
    private String data_fine;
    @javax.validation.constraints.NotNull
    private String data_inizio;
    private String dosaggio;
    private String motivazione_fine;
    private String ricerca_farmaco;
    private String dosaggio_;
    private String farmaco;
    private String farmaco_ATC_;

    public CliTerapia_altroCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getAltra_motivazione_fine() {
        return altra_motivazione_fine;
    }
    public void setAltra_motivazione_fine(String altra_motivazione_fine) {
        this.altra_motivazione_fine = altra_motivazione_fine;
    }

    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getData_inizio() {
        return data_inizio;
    }
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public String getDosaggio() {
        return dosaggio;
    }
    public void setDosaggio(String dosaggio) {
        this.dosaggio = dosaggio;
    }

    public String getMotivazione_fine() {
        return motivazione_fine;
    }
    public void setMotivazione_fine(String motivazione_fine) {
        this.motivazione_fine = motivazione_fine;
    }

    public String getRicerca_farmaco() {
        return ricerca_farmaco;
    }
    public void setRicerca_farmaco(String ricerca_farmaco) {
        this.ricerca_farmaco = ricerca_farmaco;
    }

    public String getDosaggio_() {
        return dosaggio_;
    }
    public void setDosaggio_(String dosaggio_) {
        this.dosaggio_ = dosaggio_;
    }

    public String getFarmaco() {
        return farmaco;
    }
    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }

    public String getFarmaco_ATC_() {
        return farmaco_ATC_;
    }
    public void setFarmaco_ATC_(String farmaco_ATC_) {
        this.farmaco_ATC_ = farmaco_ATC_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (altra_motivazione_fine != null) {
            joiner.add("altra_motivazione_fine: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine));
        }
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (dosaggio != null) {
            joiner.add("dosaggio: " + GraphQLRequestSerializer.getEntry(dosaggio));
        }
        if (motivazione_fine != null) {
            joiner.add("motivazione_fine: " + GraphQLRequestSerializer.getEntry(motivazione_fine));
        }
        if (ricerca_farmaco != null) {
            joiner.add("ricerca_farmaco: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco));
        }
        if (dosaggio_ != null) {
            joiner.add("dosaggio_: " + GraphQLRequestSerializer.getEntry(dosaggio_));
        }
        if (farmaco != null) {
            joiner.add("farmaco: " + GraphQLRequestSerializer.getEntry(farmaco));
        }
        if (farmaco_ATC_ != null) {
            joiner.add("farmaco_ATC_: " + GraphQLRequestSerializer.getEntry(farmaco_ATC_));
        }
        return joiner.toString();
    }

    public static CliTerapia_altroCreateDTO.Builder builder() {
        return new CliTerapia_altroCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String altra_motivazione_fine;
        private String altro_farmaco;
        private String data_fine;
        private String data_inizio;
        private String dosaggio;
        private String motivazione_fine;
        private String ricerca_farmaco;
        private String dosaggio_;
        private String farmaco;
        private String farmaco_ATC_;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setAltra_motivazione_fine(String altra_motivazione_fine) {
            this.altra_motivazione_fine = altra_motivazione_fine;
            return this;
        }

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        public Builder setDosaggio(String dosaggio) {
            this.dosaggio = dosaggio;
            return this;
        }

        public Builder setMotivazione_fine(String motivazione_fine) {
            this.motivazione_fine = motivazione_fine;
            return this;
        }

        public Builder setRicerca_farmaco(String ricerca_farmaco) {
            this.ricerca_farmaco = ricerca_farmaco;
            return this;
        }

        public Builder setDosaggio_(String dosaggio_) {
            this.dosaggio_ = dosaggio_;
            return this;
        }

        public Builder setFarmaco(String farmaco) {
            this.farmaco = farmaco;
            return this;
        }

        public Builder setFarmaco_ATC_(String farmaco_ATC_) {
            this.farmaco_ATC_ = farmaco_ATC_;
            return this;
        }


        public CliTerapia_altroCreateDTO build() {
            CliTerapia_altroCreateDTO result = new CliTerapia_altroCreateDTO();
            result.set_clientId(this._clientId);
            result.setAltra_motivazione_fine(this.altra_motivazione_fine);
            result.setAltro_farmaco(this.altro_farmaco);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setDosaggio(this.dosaggio);
            result.setMotivazione_fine(this.motivazione_fine);
            result.setRicerca_farmaco(this.ricerca_farmaco);
            result.setDosaggio_(this.dosaggio_);
            result.setFarmaco(this.farmaco);
            result.setFarmaco_ATC_(this.farmaco_ATC_);
            return result;
        }

    }
}
