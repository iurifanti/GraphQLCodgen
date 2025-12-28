package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Anamnesi, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliAnamnesiDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Boolean altro_luogo;
    private String altro_luogo_test_HIV;
    private Integer anni_fumo_pregresso;
    private String codice_centro;
    private String data_enrol;
    private String data_prima_prep;
    private String data_primo_riscontro_HIV;
    private String data_sieroconversione;
    private String data_ultima_prep;
    private String data_ultimo_test_negativo;
    private String familiarita_cardiovascolare;
    private Boolean fumatore;
    private Boolean infezione_acuta;
    private String paziente;
    private Boolean prep;
    private Boolean prep_quotidiana;
    private String scolarita;
    private String team;
    private CliLuogo_test_HIVDTO luogo_test_HIV_;
    private CliMotivazione_naiveDTO motivazione_naive;
    private CliPazienteDTO Paziente_anamnesi;

    public CliAnamnesiDTO() {
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
     * The attribute _createdby of Anamnesi. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Anamnesi. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Anamnesi. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Anamnesi. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Anamnesi. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Anamnesi. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Anamnesi. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Anamnesi. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altro_luogo of Anamnesi. It is of type Boolean. Path: luogo_test_HIV_ altro.
     */
    public Boolean getAltro_luogo() {
        return altro_luogo;
    }
    /**
     * The attribute altro_luogo of Anamnesi. It is of type Boolean. Path: luogo_test_HIV_ altro.
     */
    public void setAltro_luogo(Boolean altro_luogo) {
        this.altro_luogo = altro_luogo;
    }

    /**
     * The attribute altro_luogo_test_HIV of Anamnesi. It is of type String. Max length: 255.
     */
    public String getAltro_luogo_test_HIV() {
        return altro_luogo_test_HIV;
    }
    /**
     * The attribute altro_luogo_test_HIV of Anamnesi. It is of type String. Max length: 255.
     */
    public void setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
        this.altro_luogo_test_HIV = altro_luogo_test_HIV;
    }

    /**
     * The attribute anni_fumo_pregresso of Anamnesi. It is of type Int.
     */
    public Integer getAnni_fumo_pregresso() {
        return anni_fumo_pregresso;
    }
    /**
     * The attribute anni_fumo_pregresso of Anamnesi. It is of type Int.
     */
    public void setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
        this.anni_fumo_pregresso = anni_fumo_pregresso;
    }

    /**
     * The attribute codice_centro of Anamnesi. It is of type String. Path: Paziente_anamnesi.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Anamnesi. It is of type String. Path: Paziente_anamnesi.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data_enrol of Anamnesi. It is of type Date @dateFormat. Path: MIN - MinPaziente_anamnesi.controllo_clinico data. Cannot be null.
     */
    public String getData_enrol() {
        return data_enrol;
    }
    /**
     * The attribute data_enrol of Anamnesi. It is of type Date @dateFormat. Path: MIN - MinPaziente_anamnesi.controllo_clinico data. Cannot be null.
     */
    public void setData_enrol(String data_enrol) {
        this.data_enrol = data_enrol;
    }

    /**
     * The attribute data_prima_prep of Anamnesi. It is of type Date @dateFormat.
     */
    public String getData_prima_prep() {
        return data_prima_prep;
    }
    /**
     * The attribute data_prima_prep of Anamnesi. It is of type Date @dateFormat.
     */
    public void setData_prima_prep(String data_prima_prep) {
        this.data_prima_prep = data_prima_prep;
    }

    /**
     * The attribute data_primo_riscontro_HIV of Anamnesi. It is of type Date @dateFormat. Ranges: 1980-01-01:.
     */
    public String getData_primo_riscontro_HIV() {
        return data_primo_riscontro_HIV;
    }
    /**
     * The attribute data_primo_riscontro_HIV of Anamnesi. It is of type Date @dateFormat. Ranges: 1980-01-01:.
     */
    public void setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
        this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
    }

    /**
     * The attribute data_sieroconversione of Anamnesi. It is of type Date @dateFormat.
     */
    public String getData_sieroconversione() {
        return data_sieroconversione;
    }
    /**
     * The attribute data_sieroconversione of Anamnesi. It is of type Date @dateFormat.
     */
    public void setData_sieroconversione(String data_sieroconversione) {
        this.data_sieroconversione = data_sieroconversione;
    }

    /**
     * The attribute data_ultima_prep of Anamnesi. It is of type Date @dateFormat.
     */
    public String getData_ultima_prep() {
        return data_ultima_prep;
    }
    /**
     * The attribute data_ultima_prep of Anamnesi. It is of type Date @dateFormat.
     */
    public void setData_ultima_prep(String data_ultima_prep) {
        this.data_ultima_prep = data_ultima_prep;
    }

    /**
     * The attribute data_ultimo_test_negativo of Anamnesi. It is of type Date @dateFormat.
     */
    public String getData_ultimo_test_negativo() {
        return data_ultimo_test_negativo;
    }
    /**
     * The attribute data_ultimo_test_negativo of Anamnesi. It is of type Date @dateFormat.
     */
    public void setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
        this.data_ultimo_test_negativo = data_ultimo_test_negativo;
    }

    /**
     * The attribute familiarita_cardiovascolare of Anamnesi. It is of type String. Domain: no OR non so OR si.}Max length: 255.
     */
    public String getFamiliarita_cardiovascolare() {
        return familiarita_cardiovascolare;
    }
    /**
     * The attribute familiarita_cardiovascolare of Anamnesi. It is of type String. Domain: no OR non so OR si.}Max length: 255.
     */
    public void setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
        this.familiarita_cardiovascolare = familiarita_cardiovascolare;
    }

    /**
     * The attribute fumatore of Anamnesi. It is of type Boolean.
     */
    public Boolean getFumatore() {
        return fumatore;
    }
    /**
     * The attribute fumatore of Anamnesi. It is of type Boolean.
     */
    public void setFumatore(Boolean fumatore) {
        this.fumatore = fumatore;
    }

    /**
     * The attribute infezione_acuta of Anamnesi. It is of type Boolean.
     */
    public Boolean getInfezione_acuta() {
        return infezione_acuta;
    }
    /**
     * The attribute infezione_acuta of Anamnesi. It is of type Boolean.
     */
    public void setInfezione_acuta(Boolean infezione_acuta) {
        this.infezione_acuta = infezione_acuta;
    }

    /**
     * The attribute paziente of Anamnesi. It is of type String. Expression: 'if(
!isNull(paziente_i),paziente_i,
paziente_h
	
)'.Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Anamnesi. It is of type String. Expression: 'if(
!isNull(paziente_i),paziente_i,
paziente_h
	
)'.Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute prep of Anamnesi. It is of type Boolean.
     */
    public Boolean getPrep() {
        return prep;
    }
    /**
     * The attribute prep of Anamnesi. It is of type Boolean.
     */
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    /**
     * The attribute prep_quotidiana of Anamnesi. It is of type Boolean.
     */
    public Boolean getPrep_quotidiana() {
        return prep_quotidiana;
    }
    /**
     * The attribute prep_quotidiana of Anamnesi. It is of type Boolean.
     */
    public void setPrep_quotidiana(Boolean prep_quotidiana) {
        this.prep_quotidiana = prep_quotidiana;
    }

    /**
     * The attribute scolarita of Anamnesi. It is of type String. Domain: Elementare OR Manca dato OR Media superiore OR Media inferiore OR Universitaria.}Max length: 255.
     */
    public String getScolarita() {
        return scolarita;
    }
    /**
     * The attribute scolarita of Anamnesi. It is of type String. Domain: Elementare OR Manca dato OR Media superiore OR Media inferiore OR Universitaria.}Max length: 255.
     */
    public void setScolarita(String scolarita) {
        this.scolarita = scolarita;
    }

    /**
     * The attribute team of Anamnesi. It is of type String. Expression: '__CurrentUser.team'.
     */
    public String getTeam() {
        return team;
    }
    /**
     * The attribute team of Anamnesi. It is of type String. Expression: '__CurrentUser.team'.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * The associated object for the role luogo_test_HIV_.
     */
    public CliLuogo_test_HIVDTO getLuogo_test_HIV_() {
        return luogo_test_HIV_;
    }
    /**
     * The associated object for the role luogo_test_HIV_.
     */
    public void setLuogo_test_HIV_(CliLuogo_test_HIVDTO luogo_test_HIV_) {
        this.luogo_test_HIV_ = luogo_test_HIV_;
    }

    /**
     * The associated object for the role motivazione_naive.
     */
    public CliMotivazione_naiveDTO getMotivazione_naive() {
        return motivazione_naive;
    }
    /**
     * The associated object for the role motivazione_naive.
     */
    public void setMotivazione_naive(CliMotivazione_naiveDTO motivazione_naive) {
        this.motivazione_naive = motivazione_naive;
    }

    /**
     * The associated object for the role Paziente_anamnesi.
     */
    public CliPazienteDTO getPaziente_anamnesi() {
        return Paziente_anamnesi;
    }
    /**
     * The associated object for the role Paziente_anamnesi.
     */
    public void setPaziente_anamnesi(CliPazienteDTO Paziente_anamnesi) {
        this.Paziente_anamnesi = Paziente_anamnesi;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
        }
        if (altro_luogo != null) {
            joiner.add("altro_luogo: " + GraphQLRequestSerializer.getEntry(altro_luogo));
        }
        if (altro_luogo_test_HIV != null) {
            joiner.add("altro_luogo_test_HIV: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV));
        }
        if (anni_fumo_pregresso != null) {
            joiner.add("anni_fumo_pregresso: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data_enrol != null) {
            joiner.add("data_enrol: " + GraphQLRequestSerializer.getEntry(data_enrol));
        }
        if (data_prima_prep != null) {
            joiner.add("data_prima_prep: " + GraphQLRequestSerializer.getEntry(data_prima_prep));
        }
        if (data_primo_riscontro_HIV != null) {
            joiner.add("data_primo_riscontro_HIV: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV));
        }
        if (data_sieroconversione != null) {
            joiner.add("data_sieroconversione: " + GraphQLRequestSerializer.getEntry(data_sieroconversione));
        }
        if (data_ultima_prep != null) {
            joiner.add("data_ultima_prep: " + GraphQLRequestSerializer.getEntry(data_ultima_prep));
        }
        if (data_ultimo_test_negativo != null) {
            joiner.add("data_ultimo_test_negativo: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo));
        }
        if (familiarita_cardiovascolare != null) {
            joiner.add("familiarita_cardiovascolare: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare));
        }
        if (fumatore != null) {
            joiner.add("fumatore: " + GraphQLRequestSerializer.getEntry(fumatore));
        }
        if (infezione_acuta != null) {
            joiner.add("infezione_acuta: " + GraphQLRequestSerializer.getEntry(infezione_acuta));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        if (prep != null) {
            joiner.add("prep: " + GraphQLRequestSerializer.getEntry(prep));
        }
        if (prep_quotidiana != null) {
            joiner.add("prep_quotidiana: " + GraphQLRequestSerializer.getEntry(prep_quotidiana));
        }
        if (scolarita != null) {
            joiner.add("scolarita: " + GraphQLRequestSerializer.getEntry(scolarita));
        }
        if (team != null) {
            joiner.add("team: " + GraphQLRequestSerializer.getEntry(team));
        }
        if (luogo_test_HIV_ != null) {
            joiner.add("luogo_test_HIV_: " + GraphQLRequestSerializer.getEntry(luogo_test_HIV_));
        }
        if (motivazione_naive != null) {
            joiner.add("motivazione_naive: " + GraphQLRequestSerializer.getEntry(motivazione_naive));
        }
        if (Paziente_anamnesi != null) {
            joiner.add("Paziente_anamnesi: " + GraphQLRequestSerializer.getEntry(Paziente_anamnesi));
        }
        return joiner.toString();
    }

    public static CliAnamnesiDTO.Builder builder() {
        return new CliAnamnesiDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private Boolean altro_luogo;
        private String altro_luogo_test_HIV;
        private Integer anni_fumo_pregresso;
        private String codice_centro;
        private String data_enrol;
        private String data_prima_prep;
        private String data_primo_riscontro_HIV;
        private String data_sieroconversione;
        private String data_ultima_prep;
        private String data_ultimo_test_negativo;
        private String familiarita_cardiovascolare;
        private Boolean fumatore;
        private Boolean infezione_acuta;
        private String paziente;
        private Boolean prep;
        private Boolean prep_quotidiana;
        private String scolarita;
        private String team;
        private CliLuogo_test_HIVDTO luogo_test_HIV_;
        private CliMotivazione_naiveDTO motivazione_naive;
        private CliPazienteDTO Paziente_anamnesi;

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
         * The attribute _createdby of Anamnesi. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Anamnesi. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Anamnesi. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Anamnesi. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Anamnesi. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altro_luogo of Anamnesi. It is of type Boolean. Path: luogo_test_HIV_ altro.
         */
        public Builder setAltro_luogo(Boolean altro_luogo) {
            this.altro_luogo = altro_luogo;
            return this;
        }

        /**
         * The attribute altro_luogo_test_HIV of Anamnesi. It is of type String. Max length: 255.
         */
        public Builder setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
            this.altro_luogo_test_HIV = altro_luogo_test_HIV;
            return this;
        }

        /**
         * The attribute anni_fumo_pregresso of Anamnesi. It is of type Int.
         */
        public Builder setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
            this.anni_fumo_pregresso = anni_fumo_pregresso;
            return this;
        }

        /**
         * The attribute codice_centro of Anamnesi. It is of type String. Path: Paziente_anamnesi.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data_enrol of Anamnesi. It is of type Date @dateFormat. Path: MIN - MinPaziente_anamnesi.controllo_clinico data. Cannot be null.
         */
        public Builder setData_enrol(String data_enrol) {
            this.data_enrol = data_enrol;
            return this;
        }

        /**
         * The attribute data_prima_prep of Anamnesi. It is of type Date @dateFormat.
         */
        public Builder setData_prima_prep(String data_prima_prep) {
            this.data_prima_prep = data_prima_prep;
            return this;
        }

        /**
         * The attribute data_primo_riscontro_HIV of Anamnesi. It is of type Date @dateFormat. Ranges: 1980-01-01:.
         */
        public Builder setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
            this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
            return this;
        }

        /**
         * The attribute data_sieroconversione of Anamnesi. It is of type Date @dateFormat.
         */
        public Builder setData_sieroconversione(String data_sieroconversione) {
            this.data_sieroconversione = data_sieroconversione;
            return this;
        }

        /**
         * The attribute data_ultima_prep of Anamnesi. It is of type Date @dateFormat.
         */
        public Builder setData_ultima_prep(String data_ultima_prep) {
            this.data_ultima_prep = data_ultima_prep;
            return this;
        }

        /**
         * The attribute data_ultimo_test_negativo of Anamnesi. It is of type Date @dateFormat.
         */
        public Builder setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
            this.data_ultimo_test_negativo = data_ultimo_test_negativo;
            return this;
        }

        /**
         * The attribute familiarita_cardiovascolare of Anamnesi. It is of type String. Domain: no OR non so OR si.}Max length: 255.
         */
        public Builder setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
            this.familiarita_cardiovascolare = familiarita_cardiovascolare;
            return this;
        }

        /**
         * The attribute fumatore of Anamnesi. It is of type Boolean.
         */
        public Builder setFumatore(Boolean fumatore) {
            this.fumatore = fumatore;
            return this;
        }

        /**
         * The attribute infezione_acuta of Anamnesi. It is of type Boolean.
         */
        public Builder setInfezione_acuta(Boolean infezione_acuta) {
            this.infezione_acuta = infezione_acuta;
            return this;
        }

        /**
         * The attribute paziente of Anamnesi. It is of type String. Expression: 'if(
!isNull(paziente_i),paziente_i,
paziente_h
	
)'.Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute prep of Anamnesi. It is of type Boolean.
         */
        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        /**
         * The attribute prep_quotidiana of Anamnesi. It is of type Boolean.
         */
        public Builder setPrep_quotidiana(Boolean prep_quotidiana) {
            this.prep_quotidiana = prep_quotidiana;
            return this;
        }

        /**
         * The attribute scolarita of Anamnesi. It is of type String. Domain: Elementare OR Manca dato OR Media superiore OR Media inferiore OR Universitaria.}Max length: 255.
         */
        public Builder setScolarita(String scolarita) {
            this.scolarita = scolarita;
            return this;
        }

        /**
         * The attribute team of Anamnesi. It is of type String. Expression: '__CurrentUser.team'.
         */
        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        /**
         * The associated object for the role luogo_test_HIV_.
         */
        public Builder setLuogo_test_HIV_(CliLuogo_test_HIVDTO luogo_test_HIV_) {
            this.luogo_test_HIV_ = luogo_test_HIV_;
            return this;
        }

        /**
         * The associated object for the role motivazione_naive.
         */
        public Builder setMotivazione_naive(CliMotivazione_naiveDTO motivazione_naive) {
            this.motivazione_naive = motivazione_naive;
            return this;
        }

        /**
         * The associated object for the role Paziente_anamnesi.
         */
        public Builder setPaziente_anamnesi(CliPazienteDTO Paziente_anamnesi) {
            this.Paziente_anamnesi = Paziente_anamnesi;
            return this;
        }


        public CliAnamnesiDTO build() {
            CliAnamnesiDTO result = new CliAnamnesiDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltro_luogo(this.altro_luogo);
            result.setAltro_luogo_test_HIV(this.altro_luogo_test_HIV);
            result.setAnni_fumo_pregresso(this.anni_fumo_pregresso);
            result.setCodice_centro(this.codice_centro);
            result.setData_enrol(this.data_enrol);
            result.setData_prima_prep(this.data_prima_prep);
            result.setData_primo_riscontro_HIV(this.data_primo_riscontro_HIV);
            result.setData_sieroconversione(this.data_sieroconversione);
            result.setData_ultima_prep(this.data_ultima_prep);
            result.setData_ultimo_test_negativo(this.data_ultimo_test_negativo);
            result.setFamiliarita_cardiovascolare(this.familiarita_cardiovascolare);
            result.setFumatore(this.fumatore);
            result.setInfezione_acuta(this.infezione_acuta);
            result.setPaziente(this.paziente);
            result.setPrep(this.prep);
            result.setPrep_quotidiana(this.prep_quotidiana);
            result.setScolarita(this.scolarita);
            result.setTeam(this.team);
            result.setLuogo_test_HIV_(this.luogo_test_HIV_);
            result.setMotivazione_naive(this.motivazione_naive);
            result.setPaziente_anamnesi(this.Paziente_anamnesi);
            return result;
        }

    }
}
