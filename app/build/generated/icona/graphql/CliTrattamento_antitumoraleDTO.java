package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Trattamento_antitumorale, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTrattamento_antitumoraleDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String altro;
    private Boolean cellulare;
    private Boolean chemioterapia;
    private Boolean chirurgico;
    private Integer cicli_effettuati;
    private Integer cicli_previsti;
    private String data;
    private String data_fine;
    private String dose_gray_totale;
    private String farmaci_antitumorali;
    private String filtra_farmaci;
    private Boolean immunoterapia;
    private String infezioni;
    private Integer linea;
    private Boolean ormonale;
    private Boolean radioterapia;
    private Boolean risposta_trattamento;
    private Boolean sepsi_severa;
    private Boolean staminali;
    private String tipo_trattamento;
    private Boolean tossicita_GI;
    private Boolean tossicita_SNC;
    private Boolean tossicita_anemia;
    private Boolean tossicita_cardiaca;
    private Boolean tossicita_epatica;
    private Boolean tossicita_neutropenia;
    private Boolean tossicita_piastrinopenia;
    private CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale_;
    private CliH_PazienteDTO h_Paziente_;
    private CliO_PazienteDTO o_paziente_;
    private CliPazienteDTO paziente_;

    public CliTrattamento_antitumoraleDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of Trattamento_antitumorale. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Trattamento_antitumorale. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro of Trattamento_antitumorale. It is of type Text.
     */
    public String getAltro() {
        return altro;
    }
    /**
     * The attribute altro of Trattamento_antitumorale. It is of type Text.
     */
    public void setAltro(String altro) {
        this.altro = altro;
    }

    /**
     * The attribute cellulare of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ cellulare.
     */
    public Boolean getCellulare() {
        return cellulare;
    }
    /**
     * The attribute cellulare of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ cellulare.
     */
    public void setCellulare(Boolean cellulare) {
        this.cellulare = cellulare;
    }

    /**
     * The attribute chemioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chemioterapia.
     */
    public Boolean getChemioterapia() {
        return chemioterapia;
    }
    /**
     * The attribute chemioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chemioterapia.
     */
    public void setChemioterapia(Boolean chemioterapia) {
        this.chemioterapia = chemioterapia;
    }

    /**
     * The attribute chirurgico of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chirurgico.
     */
    public Boolean getChirurgico() {
        return chirurgico;
    }
    /**
     * The attribute chirurgico of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chirurgico.
     */
    public void setChirurgico(Boolean chirurgico) {
        this.chirurgico = chirurgico;
    }

    /**
     * The attribute cicli_effettuati of Trattamento_antitumorale. It is of type Int.
     */
    public Integer getCicli_effettuati() {
        return cicli_effettuati;
    }
    /**
     * The attribute cicli_effettuati of Trattamento_antitumorale. It is of type Int.
     */
    public void setCicli_effettuati(Integer cicli_effettuati) {
        this.cicli_effettuati = cicli_effettuati;
    }

    /**
     * The attribute cicli_previsti of Trattamento_antitumorale. It is of type Int.
     */
    public Integer getCicli_previsti() {
        return cicli_previsti;
    }
    /**
     * The attribute cicli_previsti of Trattamento_antitumorale. It is of type Int.
     */
    public void setCicli_previsti(Integer cicli_previsti) {
        this.cicli_previsti = cicli_previsti;
    }

    /**
     * The attribute data of Trattamento_antitumorale. It is of type Date @dateFormat.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Trattamento_antitumorale. It is of type Date @dateFormat.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute data_fine of Trattamento_antitumorale. It is of type Date @dateFormat.
     */
    public String getData_fine() {
        return data_fine;
    }
    /**
     * The attribute data_fine of Trattamento_antitumorale. It is of type Date @dateFormat.
     */
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    /**
     * The attribute dose_gray_totale of Trattamento_antitumorale. It is of type Real @realFormat.
     */
    public String getDose_gray_totale() {
        return dose_gray_totale;
    }
    /**
     * The attribute dose_gray_totale of Trattamento_antitumorale. It is of type Real @realFormat.
     */
    public void setDose_gray_totale(String dose_gray_totale) {
        this.dose_gray_totale = dose_gray_totale;
    }

    /**
     * The attribute farmaci_antitumorali of Trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
     */
    public String getFarmaci_antitumorali() {
        return farmaci_antitumorali;
    }
    /**
     * The attribute farmaci_antitumorali of Trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
     */
    public void setFarmaci_antitumorali(String farmaci_antitumorali) {
        this.farmaci_antitumorali = farmaci_antitumorali;
    }

    /**
     * The attribute filtra_farmaci of Trattamento_antitumorale. It is of type String. Max length: 255.
     */
    public String getFiltra_farmaci() {
        return filtra_farmaci;
    }
    /**
     * The attribute filtra_farmaci of Trattamento_antitumorale. It is of type String. Max length: 255.
     */
    public void setFiltra_farmaci(String filtra_farmaci) {
        this.filtra_farmaci = filtra_farmaci;
    }

    /**
     * The attribute immunoterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ immunoterapia.
     */
    public Boolean getImmunoterapia() {
        return immunoterapia;
    }
    /**
     * The attribute immunoterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ immunoterapia.
     */
    public void setImmunoterapia(Boolean immunoterapia) {
        this.immunoterapia = immunoterapia;
    }

    /**
     * The attribute infezioni of Trattamento_antitumorale. It is of type Text.
     */
    public String getInfezioni() {
        return infezioni;
    }
    /**
     * The attribute infezioni of Trattamento_antitumorale. It is of type Text.
     */
    public void setInfezioni(String infezioni) {
        this.infezioni = infezioni;
    }

    /**
     * The attribute linea of Trattamento_antitumorale. It is of type Int.
     */
    public Integer getLinea() {
        return linea;
    }
    /**
     * The attribute linea of Trattamento_antitumorale. It is of type Int.
     */
    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    /**
     * The attribute ormonale of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ ormonale.
     */
    public Boolean getOrmonale() {
        return ormonale;
    }
    /**
     * The attribute ormonale of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ ormonale.
     */
    public void setOrmonale(Boolean ormonale) {
        this.ormonale = ormonale;
    }

    /**
     * The attribute radioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ radioterapia.
     */
    public Boolean getRadioterapia() {
        return radioterapia;
    }
    /**
     * The attribute radioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ radioterapia.
     */
    public void setRadioterapia(Boolean radioterapia) {
        this.radioterapia = radioterapia;
    }

    /**
     * The attribute risposta_trattamento of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getRisposta_trattamento() {
        return risposta_trattamento;
    }
    /**
     * The attribute risposta_trattamento of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setRisposta_trattamento(Boolean risposta_trattamento) {
        this.risposta_trattamento = risposta_trattamento;
    }

    /**
     * The attribute sepsi_severa of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getSepsi_severa() {
        return sepsi_severa;
    }
    /**
     * The attribute sepsi_severa of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setSepsi_severa(Boolean sepsi_severa) {
        this.sepsi_severa = sepsi_severa;
    }

    /**
     * The attribute staminali of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ staminali.
     */
    public Boolean getStaminali() {
        return staminali;
    }
    /**
     * The attribute staminali of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ staminali.
     */
    public void setStaminali(Boolean staminali) {
        this.staminali = staminali;
    }

    /**
     * The attribute tipo_trattamento of Trattamento_antitumorale. It is of type String. Path: tipo_trattamento_antitumorale_ nome.
     */
    public String getTipo_trattamento() {
        return tipo_trattamento;
    }
    /**
     * The attribute tipo_trattamento of Trattamento_antitumorale. It is of type String. Path: tipo_trattamento_antitumorale_ nome.
     */
    public void setTipo_trattamento(String tipo_trattamento) {
        this.tipo_trattamento = tipo_trattamento;
    }

    /**
     * The attribute tossicita_GI of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_GI() {
        return tossicita_GI;
    }
    /**
     * The attribute tossicita_GI of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_GI(Boolean tossicita_GI) {
        this.tossicita_GI = tossicita_GI;
    }

    /**
     * The attribute tossicita_SNC of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_SNC() {
        return tossicita_SNC;
    }
    /**
     * The attribute tossicita_SNC of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_SNC(Boolean tossicita_SNC) {
        this.tossicita_SNC = tossicita_SNC;
    }

    /**
     * The attribute tossicita_anemia of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_anemia() {
        return tossicita_anemia;
    }
    /**
     * The attribute tossicita_anemia of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_anemia(Boolean tossicita_anemia) {
        this.tossicita_anemia = tossicita_anemia;
    }

    /**
     * The attribute tossicita_cardiaca of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_cardiaca() {
        return tossicita_cardiaca;
    }
    /**
     * The attribute tossicita_cardiaca of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_cardiaca(Boolean tossicita_cardiaca) {
        this.tossicita_cardiaca = tossicita_cardiaca;
    }

    /**
     * The attribute tossicita_epatica of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_epatica() {
        return tossicita_epatica;
    }
    /**
     * The attribute tossicita_epatica of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_epatica(Boolean tossicita_epatica) {
        this.tossicita_epatica = tossicita_epatica;
    }

    /**
     * The attribute tossicita_neutropenia of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_neutropenia() {
        return tossicita_neutropenia;
    }
    /**
     * The attribute tossicita_neutropenia of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_neutropenia(Boolean tossicita_neutropenia) {
        this.tossicita_neutropenia = tossicita_neutropenia;
    }

    /**
     * The attribute tossicita_piastrinopenia of Trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getTossicita_piastrinopenia() {
        return tossicita_piastrinopenia;
    }
    /**
     * The attribute tossicita_piastrinopenia of Trattamento_antitumorale. It is of type Boolean.
     */
    public void setTossicita_piastrinopenia(Boolean tossicita_piastrinopenia) {
        this.tossicita_piastrinopenia = tossicita_piastrinopenia;
    }

    /**
     * The associated object for the role tipo_trattamento_antitumorale_.
     */
    public CliTipo_trattamento_antitumoraleDTO getTipo_trattamento_antitumorale_() {
        return tipo_trattamento_antitumorale_;
    }
    /**
     * The associated object for the role tipo_trattamento_antitumorale_.
     */
    public void setTipo_trattamento_antitumorale_(CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale_) {
        this.tipo_trattamento_antitumorale_ = tipo_trattamento_antitumorale_;
    }

    /**
     * The associated object for the role h_Paziente_.
     */
    public CliH_PazienteDTO getH_Paziente_() {
        return h_Paziente_;
    }
    /**
     * The associated object for the role h_Paziente_.
     */
    public void setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
    }

    /**
     * The associated object for the role o_paziente_.
     */
    public CliO_PazienteDTO getO_paziente_() {
        return o_paziente_;
    }
    /**
     * The associated object for the role o_paziente_.
     */
    public void setO_paziente_(CliO_PazienteDTO o_paziente_) {
        this.o_paziente_ = o_paziente_;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (cellulare != null) {
            joiner.add("cellulare: " + GraphQLRequestSerializer.getEntry(cellulare));
        }
        if (chemioterapia != null) {
            joiner.add("chemioterapia: " + GraphQLRequestSerializer.getEntry(chemioterapia));
        }
        if (chirurgico != null) {
            joiner.add("chirurgico: " + GraphQLRequestSerializer.getEntry(chirurgico));
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
        if (farmaci_antitumorali != null) {
            joiner.add("farmaci_antitumorali: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali));
        }
        if (filtra_farmaci != null) {
            joiner.add("filtra_farmaci: " + GraphQLRequestSerializer.getEntry(filtra_farmaci));
        }
        if (immunoterapia != null) {
            joiner.add("immunoterapia: " + GraphQLRequestSerializer.getEntry(immunoterapia));
        }
        if (infezioni != null) {
            joiner.add("infezioni: " + GraphQLRequestSerializer.getEntry(infezioni));
        }
        if (linea != null) {
            joiner.add("linea: " + GraphQLRequestSerializer.getEntry(linea));
        }
        if (ormonale != null) {
            joiner.add("ormonale: " + GraphQLRequestSerializer.getEntry(ormonale));
        }
        if (radioterapia != null) {
            joiner.add("radioterapia: " + GraphQLRequestSerializer.getEntry(radioterapia));
        }
        if (risposta_trattamento != null) {
            joiner.add("risposta_trattamento: " + GraphQLRequestSerializer.getEntry(risposta_trattamento));
        }
        if (sepsi_severa != null) {
            joiner.add("sepsi_severa: " + GraphQLRequestSerializer.getEntry(sepsi_severa));
        }
        if (staminali != null) {
            joiner.add("staminali: " + GraphQLRequestSerializer.getEntry(staminali));
        }
        if (tipo_trattamento != null) {
            joiner.add("tipo_trattamento: " + GraphQLRequestSerializer.getEntry(tipo_trattamento));
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
        if (tipo_trattamento_antitumorale_ != null) {
            joiner.add("tipo_trattamento_antitumorale_: " + GraphQLRequestSerializer.getEntry(tipo_trattamento_antitumorale_));
        }
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (o_paziente_ != null) {
            joiner.add("o_paziente_: " + GraphQLRequestSerializer.getEntry(o_paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliTrattamento_antitumoraleDTO.Builder builder() {
        return new CliTrattamento_antitumoraleDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String altro;
        private Boolean cellulare;
        private Boolean chemioterapia;
        private Boolean chirurgico;
        private Integer cicli_effettuati;
        private Integer cicli_previsti;
        private String data;
        private String data_fine;
        private String dose_gray_totale;
        private String farmaci_antitumorali;
        private String filtra_farmaci;
        private Boolean immunoterapia;
        private String infezioni;
        private Integer linea;
        private Boolean ormonale;
        private Boolean radioterapia;
        private Boolean risposta_trattamento;
        private Boolean sepsi_severa;
        private Boolean staminali;
        private String tipo_trattamento;
        private Boolean tossicita_GI;
        private Boolean tossicita_SNC;
        private Boolean tossicita_anemia;
        private Boolean tossicita_cardiaca;
        private Boolean tossicita_epatica;
        private Boolean tossicita_neutropenia;
        private Boolean tossicita_piastrinopenia;
        private CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale_;
        private CliH_PazienteDTO h_Paziente_;
        private CliO_PazienteDTO o_paziente_;
        private CliPazienteDTO paziente_;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of Trattamento_antitumorale. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro of Trattamento_antitumorale. It is of type Text.
         */
        public Builder setAltro(String altro) {
            this.altro = altro;
            return this;
        }

        /**
         * The attribute cellulare of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ cellulare.
         */
        public Builder setCellulare(Boolean cellulare) {
            this.cellulare = cellulare;
            return this;
        }

        /**
         * The attribute chemioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chemioterapia.
         */
        public Builder setChemioterapia(Boolean chemioterapia) {
            this.chemioterapia = chemioterapia;
            return this;
        }

        /**
         * The attribute chirurgico of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ chirurgico.
         */
        public Builder setChirurgico(Boolean chirurgico) {
            this.chirurgico = chirurgico;
            return this;
        }

        /**
         * The attribute cicli_effettuati of Trattamento_antitumorale. It is of type Int.
         */
        public Builder setCicli_effettuati(Integer cicli_effettuati) {
            this.cicli_effettuati = cicli_effettuati;
            return this;
        }

        /**
         * The attribute cicli_previsti of Trattamento_antitumorale. It is of type Int.
         */
        public Builder setCicli_previsti(Integer cicli_previsti) {
            this.cicli_previsti = cicli_previsti;
            return this;
        }

        /**
         * The attribute data of Trattamento_antitumorale. It is of type Date @dateFormat.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute data_fine of Trattamento_antitumorale. It is of type Date @dateFormat.
         */
        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        /**
         * The attribute dose_gray_totale of Trattamento_antitumorale. It is of type Real @realFormat.
         */
        public Builder setDose_gray_totale(String dose_gray_totale) {
            this.dose_gray_totale = dose_gray_totale;
            return this;
        }

        /**
         * The attribute farmaci_antitumorali of Trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
         */
        public Builder setFarmaci_antitumorali(String farmaci_antitumorali) {
            this.farmaci_antitumorali = farmaci_antitumorali;
            return this;
        }

        /**
         * The attribute filtra_farmaci of Trattamento_antitumorale. It is of type String. Max length: 255.
         */
        public Builder setFiltra_farmaci(String filtra_farmaci) {
            this.filtra_farmaci = filtra_farmaci;
            return this;
        }

        /**
         * The attribute immunoterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ immunoterapia.
         */
        public Builder setImmunoterapia(Boolean immunoterapia) {
            this.immunoterapia = immunoterapia;
            return this;
        }

        /**
         * The attribute infezioni of Trattamento_antitumorale. It is of type Text.
         */
        public Builder setInfezioni(String infezioni) {
            this.infezioni = infezioni;
            return this;
        }

        /**
         * The attribute linea of Trattamento_antitumorale. It is of type Int.
         */
        public Builder setLinea(Integer linea) {
            this.linea = linea;
            return this;
        }

        /**
         * The attribute ormonale of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ ormonale.
         */
        public Builder setOrmonale(Boolean ormonale) {
            this.ormonale = ormonale;
            return this;
        }

        /**
         * The attribute radioterapia of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ radioterapia.
         */
        public Builder setRadioterapia(Boolean radioterapia) {
            this.radioterapia = radioterapia;
            return this;
        }

        /**
         * The attribute risposta_trattamento of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setRisposta_trattamento(Boolean risposta_trattamento) {
            this.risposta_trattamento = risposta_trattamento;
            return this;
        }

        /**
         * The attribute sepsi_severa of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setSepsi_severa(Boolean sepsi_severa) {
            this.sepsi_severa = sepsi_severa;
            return this;
        }

        /**
         * The attribute staminali of Trattamento_antitumorale. It is of type Boolean. Path: tipo_trattamento_antitumorale_ staminali.
         */
        public Builder setStaminali(Boolean staminali) {
            this.staminali = staminali;
            return this;
        }

        /**
         * The attribute tipo_trattamento of Trattamento_antitumorale. It is of type String. Path: tipo_trattamento_antitumorale_ nome.
         */
        public Builder setTipo_trattamento(String tipo_trattamento) {
            this.tipo_trattamento = tipo_trattamento;
            return this;
        }

        /**
         * The attribute tossicita_GI of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_GI(Boolean tossicita_GI) {
            this.tossicita_GI = tossicita_GI;
            return this;
        }

        /**
         * The attribute tossicita_SNC of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_SNC(Boolean tossicita_SNC) {
            this.tossicita_SNC = tossicita_SNC;
            return this;
        }

        /**
         * The attribute tossicita_anemia of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_anemia(Boolean tossicita_anemia) {
            this.tossicita_anemia = tossicita_anemia;
            return this;
        }

        /**
         * The attribute tossicita_cardiaca of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_cardiaca(Boolean tossicita_cardiaca) {
            this.tossicita_cardiaca = tossicita_cardiaca;
            return this;
        }

        /**
         * The attribute tossicita_epatica of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_epatica(Boolean tossicita_epatica) {
            this.tossicita_epatica = tossicita_epatica;
            return this;
        }

        /**
         * The attribute tossicita_neutropenia of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_neutropenia(Boolean tossicita_neutropenia) {
            this.tossicita_neutropenia = tossicita_neutropenia;
            return this;
        }

        /**
         * The attribute tossicita_piastrinopenia of Trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setTossicita_piastrinopenia(Boolean tossicita_piastrinopenia) {
            this.tossicita_piastrinopenia = tossicita_piastrinopenia;
            return this;
        }

        /**
         * The associated object for the role tipo_trattamento_antitumorale_.
         */
        public Builder setTipo_trattamento_antitumorale_(CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale_) {
            this.tipo_trattamento_antitumorale_ = tipo_trattamento_antitumorale_;
            return this;
        }

        /**
         * The associated object for the role h_Paziente_.
         */
        public Builder setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        /**
         * The associated object for the role o_paziente_.
         */
        public Builder setO_paziente_(CliO_PazienteDTO o_paziente_) {
            this.o_paziente_ = o_paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliTrattamento_antitumoraleDTO build() {
            CliTrattamento_antitumoraleDTO result = new CliTrattamento_antitumoraleDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltro(this.altro);
            result.setCellulare(this.cellulare);
            result.setChemioterapia(this.chemioterapia);
            result.setChirurgico(this.chirurgico);
            result.setCicli_effettuati(this.cicli_effettuati);
            result.setCicli_previsti(this.cicli_previsti);
            result.setData(this.data);
            result.setData_fine(this.data_fine);
            result.setDose_gray_totale(this.dose_gray_totale);
            result.setFarmaci_antitumorali(this.farmaci_antitumorali);
            result.setFiltra_farmaci(this.filtra_farmaci);
            result.setImmunoterapia(this.immunoterapia);
            result.setInfezioni(this.infezioni);
            result.setLinea(this.linea);
            result.setOrmonale(this.ormonale);
            result.setRadioterapia(this.radioterapia);
            result.setRisposta_trattamento(this.risposta_trattamento);
            result.setSepsi_severa(this.sepsi_severa);
            result.setStaminali(this.staminali);
            result.setTipo_trattamento(this.tipo_trattamento);
            result.setTossicita_GI(this.tossicita_GI);
            result.setTossicita_SNC(this.tossicita_SNC);
            result.setTossicita_anemia(this.tossicita_anemia);
            result.setTossicita_cardiaca(this.tossicita_cardiaca);
            result.setTossicita_epatica(this.tossicita_epatica);
            result.setTossicita_neutropenia(this.tossicita_neutropenia);
            result.setTossicita_piastrinopenia(this.tossicita_piastrinopenia);
            result.setTipo_trattamento_antitumorale_(this.tipo_trattamento_antitumorale_);
            result.setH_Paziente_(this.h_Paziente_);
            result.setO_paziente_(this.o_paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
