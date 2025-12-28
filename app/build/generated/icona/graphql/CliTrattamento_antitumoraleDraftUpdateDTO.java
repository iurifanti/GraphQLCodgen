package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class Trattamento_antitumorale.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTrattamento_antitumoraleDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String altro;
    private Integer cicli_effettuati;
    private Integer cicli_previsti;
    private String data;
    private String data_fine;
    private String dose_gray_totale;
    private String filtra_farmaci;
    private String infezioni;
    private Integer linea;
    private Boolean risposta_trattamento;
    private Boolean sepsi_severa;
    private Boolean tossicita_GI;
    private Boolean tossicita_SNC;
    private Boolean tossicita_anemia;
    private Boolean tossicita_cardiaca;
    private Boolean tossicita_epatica;
    private Boolean tossicita_neutropenia;
    private Boolean tossicita_piastrinopenia;
    private CliFarmaco_antitumoraleRoleRefsDTO farmaco_antitumorale_;
    private CliTipo_trattamento_antitumoraleRoleRefDTO tipo_trattamento_antitumorale_;

    public CliTrattamento_antitumoraleDraftUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAltro() {
        return altro;
    }
    public void setAltro(String altro) {
        this.altro = altro;
    }

    public Integer getCicli_effettuati() {
        return cicli_effettuati;
    }
    public void setCicli_effettuati(Integer cicli_effettuati) {
        this.cicli_effettuati = cicli_effettuati;
    }

    public Integer getCicli_previsti() {
        return cicli_previsti;
    }
    public void setCicli_previsti(Integer cicli_previsti) {
        this.cicli_previsti = cicli_previsti;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getDose_gray_totale() {
        return dose_gray_totale;
    }
    public void setDose_gray_totale(String dose_gray_totale) {
        this.dose_gray_totale = dose_gray_totale;
    }

    public String getFiltra_farmaci() {
        return filtra_farmaci;
    }
    public void setFiltra_farmaci(String filtra_farmaci) {
        this.filtra_farmaci = filtra_farmaci;
    }

    public String getInfezioni() {
        return infezioni;
    }
    public void setInfezioni(String infezioni) {
        this.infezioni = infezioni;
    }

    public Integer getLinea() {
        return linea;
    }
    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public Boolean getRisposta_trattamento() {
        return risposta_trattamento;
    }
    public void setRisposta_trattamento(Boolean risposta_trattamento) {
        this.risposta_trattamento = risposta_trattamento;
    }

    public Boolean getSepsi_severa() {
        return sepsi_severa;
    }
    public void setSepsi_severa(Boolean sepsi_severa) {
        this.sepsi_severa = sepsi_severa;
    }

    public Boolean getTossicita_GI() {
        return tossicita_GI;
    }
    public void setTossicita_GI(Boolean tossicita_GI) {
        this.tossicita_GI = tossicita_GI;
    }

    public Boolean getTossicita_SNC() {
        return tossicita_SNC;
    }
    public void setTossicita_SNC(Boolean tossicita_SNC) {
        this.tossicita_SNC = tossicita_SNC;
    }

    public Boolean getTossicita_anemia() {
        return tossicita_anemia;
    }
    public void setTossicita_anemia(Boolean tossicita_anemia) {
        this.tossicita_anemia = tossicita_anemia;
    }

    public Boolean getTossicita_cardiaca() {
        return tossicita_cardiaca;
    }
    public void setTossicita_cardiaca(Boolean tossicita_cardiaca) {
        this.tossicita_cardiaca = tossicita_cardiaca;
    }

    public Boolean getTossicita_epatica() {
        return tossicita_epatica;
    }
    public void setTossicita_epatica(Boolean tossicita_epatica) {
        this.tossicita_epatica = tossicita_epatica;
    }

    public Boolean getTossicita_neutropenia() {
        return tossicita_neutropenia;
    }
    public void setTossicita_neutropenia(Boolean tossicita_neutropenia) {
        this.tossicita_neutropenia = tossicita_neutropenia;
    }

    public Boolean getTossicita_piastrinopenia() {
        return tossicita_piastrinopenia;
    }
    public void setTossicita_piastrinopenia(Boolean tossicita_piastrinopenia) {
        this.tossicita_piastrinopenia = tossicita_piastrinopenia;
    }

    public CliFarmaco_antitumoraleRoleRefsDTO getFarmaco_antitumorale_() {
        return farmaco_antitumorale_;
    }
    public void setFarmaco_antitumorale_(CliFarmaco_antitumoraleRoleRefsDTO farmaco_antitumorale_) {
        this.farmaco_antitumorale_ = farmaco_antitumorale_;
    }

    public CliTipo_trattamento_antitumoraleRoleRefDTO getTipo_trattamento_antitumorale_() {
        return tipo_trattamento_antitumorale_;
    }
    public void setTipo_trattamento_antitumorale_(CliTipo_trattamento_antitumoraleRoleRefDTO tipo_trattamento_antitumorale_) {
        this.tipo_trattamento_antitumorale_ = tipo_trattamento_antitumorale_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (cicli_effettuati != null) {
            joiner.add("cicli_effettuati: " + GraphQLRequestSerializer.getEntry(cicli_effettuati));
        }
        if (cicli_previsti != null) {
            joiner.add("cicli_previsti: " + GraphQLRequestSerializer.getEntry(cicli_previsti));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (dose_gray_totale != null) {
            joiner.add("dose_gray_totale: " + GraphQLRequestSerializer.getEntry(dose_gray_totale));
        }
        if (filtra_farmaci != null) {
            joiner.add("filtra_farmaci: " + GraphQLRequestSerializer.getEntry(filtra_farmaci));
        }
        if (infezioni != null) {
            joiner.add("infezioni: " + GraphQLRequestSerializer.getEntry(infezioni));
        }
        if (linea != null) {
            joiner.add("linea: " + GraphQLRequestSerializer.getEntry(linea));
        }
        if (risposta_trattamento != null) {
            joiner.add("risposta_trattamento: " + GraphQLRequestSerializer.getEntry(risposta_trattamento));
        }
        if (sepsi_severa != null) {
            joiner.add("sepsi_severa: " + GraphQLRequestSerializer.getEntry(sepsi_severa));
        }
        if (tossicita_GI != null) {
            joiner.add("tossicita_GI: " + GraphQLRequestSerializer.getEntry(tossicita_GI));
        }
        if (tossicita_SNC != null) {
            joiner.add("tossicita_SNC: " + GraphQLRequestSerializer.getEntry(tossicita_SNC));
        }
        if (tossicita_anemia != null) {
            joiner.add("tossicita_anemia: " + GraphQLRequestSerializer.getEntry(tossicita_anemia));
        }
        if (tossicita_cardiaca != null) {
            joiner.add("tossicita_cardiaca: " + GraphQLRequestSerializer.getEntry(tossicita_cardiaca));
        }
        if (tossicita_epatica != null) {
            joiner.add("tossicita_epatica: " + GraphQLRequestSerializer.getEntry(tossicita_epatica));
        }
        if (tossicita_neutropenia != null) {
            joiner.add("tossicita_neutropenia: " + GraphQLRequestSerializer.getEntry(tossicita_neutropenia));
        }
        if (tossicita_piastrinopenia != null) {
            joiner.add("tossicita_piastrinopenia: " + GraphQLRequestSerializer.getEntry(tossicita_piastrinopenia));
        }
        if (farmaco_antitumorale_ != null) {
            joiner.add("farmaco_antitumorale_: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorale_));
        }
        if (tipo_trattamento_antitumorale_ != null) {
            joiner.add("tipo_trattamento_antitumorale_: " + GraphQLRequestSerializer.getEntry(tipo_trattamento_antitumorale_));
        }
        return joiner.toString();
    }

    public static CliTrattamento_antitumoraleDraftUpdateDTO.Builder builder() {
        return new CliTrattamento_antitumoraleDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String altro;
        private Integer cicli_effettuati;
        private Integer cicli_previsti;
        private String data;
        private String data_fine;
        private String dose_gray_totale;
        private String filtra_farmaci;
        private String infezioni;
        private Integer linea;
        private Boolean risposta_trattamento;
        private Boolean sepsi_severa;
        private Boolean tossicita_GI;
        private Boolean tossicita_SNC;
        private Boolean tossicita_anemia;
        private Boolean tossicita_cardiaca;
        private Boolean tossicita_epatica;
        private Boolean tossicita_neutropenia;
        private Boolean tossicita_piastrinopenia;
        private CliFarmaco_antitumoraleRoleRefsDTO farmaco_antitumorale_;
        private CliTipo_trattamento_antitumoraleRoleRefDTO tipo_trattamento_antitumorale_;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltro(String altro) {
            this.altro = altro;
            return this;
        }

        public Builder setCicli_effettuati(Integer cicli_effettuati) {
            this.cicli_effettuati = cicli_effettuati;
            return this;
        }

        public Builder setCicli_previsti(Integer cicli_previsti) {
            this.cicli_previsti = cicli_previsti;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setDose_gray_totale(String dose_gray_totale) {
            this.dose_gray_totale = dose_gray_totale;
            return this;
        }

        public Builder setFiltra_farmaci(String filtra_farmaci) {
            this.filtra_farmaci = filtra_farmaci;
            return this;
        }

        public Builder setInfezioni(String infezioni) {
            this.infezioni = infezioni;
            return this;
        }

        public Builder setLinea(Integer linea) {
            this.linea = linea;
            return this;
        }

        public Builder setRisposta_trattamento(Boolean risposta_trattamento) {
            this.risposta_trattamento = risposta_trattamento;
            return this;
        }

        public Builder setSepsi_severa(Boolean sepsi_severa) {
            this.sepsi_severa = sepsi_severa;
            return this;
        }

        public Builder setTossicita_GI(Boolean tossicita_GI) {
            this.tossicita_GI = tossicita_GI;
            return this;
        }

        public Builder setTossicita_SNC(Boolean tossicita_SNC) {
            this.tossicita_SNC = tossicita_SNC;
            return this;
        }

        public Builder setTossicita_anemia(Boolean tossicita_anemia) {
            this.tossicita_anemia = tossicita_anemia;
            return this;
        }

        public Builder setTossicita_cardiaca(Boolean tossicita_cardiaca) {
            this.tossicita_cardiaca = tossicita_cardiaca;
            return this;
        }

        public Builder setTossicita_epatica(Boolean tossicita_epatica) {
            this.tossicita_epatica = tossicita_epatica;
            return this;
        }

        public Builder setTossicita_neutropenia(Boolean tossicita_neutropenia) {
            this.tossicita_neutropenia = tossicita_neutropenia;
            return this;
        }

        public Builder setTossicita_piastrinopenia(Boolean tossicita_piastrinopenia) {
            this.tossicita_piastrinopenia = tossicita_piastrinopenia;
            return this;
        }

        public Builder setFarmaco_antitumorale_(CliFarmaco_antitumoraleRoleRefsDTO farmaco_antitumorale_) {
            this.farmaco_antitumorale_ = farmaco_antitumorale_;
            return this;
        }

        public Builder setTipo_trattamento_antitumorale_(CliTipo_trattamento_antitumoraleRoleRefDTO tipo_trattamento_antitumorale_) {
            this.tipo_trattamento_antitumorale_ = tipo_trattamento_antitumorale_;
            return this;
        }


        public CliTrattamento_antitumoraleDraftUpdateDTO build() {
            CliTrattamento_antitumoraleDraftUpdateDTO result = new CliTrattamento_antitumoraleDraftUpdateDTO();
            result.set_id(this._id);
            result.setAltro(this.altro);
            result.setCicli_effettuati(this.cicli_effettuati);
            result.setCicli_previsti(this.cicli_previsti);
            result.setData(this.data);
            result.setData_fine(this.data_fine);
            result.setDose_gray_totale(this.dose_gray_totale);
            result.setFiltra_farmaci(this.filtra_farmaci);
            result.setInfezioni(this.infezioni);
            result.setLinea(this.linea);
            result.setRisposta_trattamento(this.risposta_trattamento);
            result.setSepsi_severa(this.sepsi_severa);
            result.setTossicita_GI(this.tossicita_GI);
            result.setTossicita_SNC(this.tossicita_SNC);
            result.setTossicita_anemia(this.tossicita_anemia);
            result.setTossicita_cardiaca(this.tossicita_cardiaca);
            result.setTossicita_epatica(this.tossicita_epatica);
            result.setTossicita_neutropenia(this.tossicita_neutropenia);
            result.setTossicita_piastrinopenia(this.tossicita_piastrinopenia);
            result.setFarmaco_antitumorale_(this.farmaco_antitumorale_);
            result.setTipo_trattamento_antitumorale_(this.tipo_trattamento_antitumorale_);
            return result;
        }

    }
}
