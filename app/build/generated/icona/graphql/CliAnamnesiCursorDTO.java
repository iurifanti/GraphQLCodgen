package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Anamnesi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliAnamnesiCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliAnamnesiCursorDTO() {
    }


    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    public Boolean getAltro_luogo() {
        return altro_luogo;
    }
    public void setAltro_luogo(Boolean altro_luogo) {
        this.altro_luogo = altro_luogo;
    }

    public String getAltro_luogo_test_HIV() {
        return altro_luogo_test_HIV;
    }
    public void setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
        this.altro_luogo_test_HIV = altro_luogo_test_HIV;
    }

    public Integer getAnni_fumo_pregresso() {
        return anni_fumo_pregresso;
    }
    public void setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
        this.anni_fumo_pregresso = anni_fumo_pregresso;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getData_enrol() {
        return data_enrol;
    }
    public void setData_enrol(String data_enrol) {
        this.data_enrol = data_enrol;
    }

    public String getData_prima_prep() {
        return data_prima_prep;
    }
    public void setData_prima_prep(String data_prima_prep) {
        this.data_prima_prep = data_prima_prep;
    }

    public String getData_primo_riscontro_HIV() {
        return data_primo_riscontro_HIV;
    }
    public void setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
        this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
    }

    public String getData_sieroconversione() {
        return data_sieroconversione;
    }
    public void setData_sieroconversione(String data_sieroconversione) {
        this.data_sieroconversione = data_sieroconversione;
    }

    public String getData_ultima_prep() {
        return data_ultima_prep;
    }
    public void setData_ultima_prep(String data_ultima_prep) {
        this.data_ultima_prep = data_ultima_prep;
    }

    public String getData_ultimo_test_negativo() {
        return data_ultimo_test_negativo;
    }
    public void setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
        this.data_ultimo_test_negativo = data_ultimo_test_negativo;
    }

    public String getFamiliarita_cardiovascolare() {
        return familiarita_cardiovascolare;
    }
    public void setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
        this.familiarita_cardiovascolare = familiarita_cardiovascolare;
    }

    public Boolean getFumatore() {
        return fumatore;
    }
    public void setFumatore(Boolean fumatore) {
        this.fumatore = fumatore;
    }

    public Boolean getInfezione_acuta() {
        return infezione_acuta;
    }
    public void setInfezione_acuta(Boolean infezione_acuta) {
        this.infezione_acuta = infezione_acuta;
    }

    public String getPaziente() {
        return paziente;
    }
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    public Boolean getPrep() {
        return prep;
    }
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    public Boolean getPrep_quotidiana() {
        return prep_quotidiana;
    }
    public void setPrep_quotidiana(Boolean prep_quotidiana) {
        this.prep_quotidiana = prep_quotidiana;
    }

    public String getScolarita() {
        return scolarita;
    }
    public void setScolarita(String scolarita) {
        this.scolarita = scolarita;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliAnamnesiCursorDTO.Builder builder() {
        return new CliAnamnesiCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        public Builder setAltro_luogo(Boolean altro_luogo) {
            this.altro_luogo = altro_luogo;
            return this;
        }

        public Builder setAltro_luogo_test_HIV(String altro_luogo_test_HIV) {
            this.altro_luogo_test_HIV = altro_luogo_test_HIV;
            return this;
        }

        public Builder setAnni_fumo_pregresso(Integer anni_fumo_pregresso) {
            this.anni_fumo_pregresso = anni_fumo_pregresso;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setData_enrol(String data_enrol) {
            this.data_enrol = data_enrol;
            return this;
        }

        public Builder setData_prima_prep(String data_prima_prep) {
            this.data_prima_prep = data_prima_prep;
            return this;
        }

        public Builder setData_primo_riscontro_HIV(String data_primo_riscontro_HIV) {
            this.data_primo_riscontro_HIV = data_primo_riscontro_HIV;
            return this;
        }

        public Builder setData_sieroconversione(String data_sieroconversione) {
            this.data_sieroconversione = data_sieroconversione;
            return this;
        }

        public Builder setData_ultima_prep(String data_ultima_prep) {
            this.data_ultima_prep = data_ultima_prep;
            return this;
        }

        public Builder setData_ultimo_test_negativo(String data_ultimo_test_negativo) {
            this.data_ultimo_test_negativo = data_ultimo_test_negativo;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare(String familiarita_cardiovascolare) {
            this.familiarita_cardiovascolare = familiarita_cardiovascolare;
            return this;
        }

        public Builder setFumatore(Boolean fumatore) {
            this.fumatore = fumatore;
            return this;
        }

        public Builder setInfezione_acuta(Boolean infezione_acuta) {
            this.infezione_acuta = infezione_acuta;
            return this;
        }

        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        public Builder setPrep_quotidiana(Boolean prep_quotidiana) {
            this.prep_quotidiana = prep_quotidiana;
            return this;
        }

        public Builder setScolarita(String scolarita) {
            this.scolarita = scolarita;
            return this;
        }

        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }


        public CliAnamnesiCursorDTO build() {
            CliAnamnesiCursorDTO result = new CliAnamnesiCursorDTO();
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
            return result;
        }

    }
}
