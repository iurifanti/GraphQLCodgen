package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Terapia_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_ARVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altro_farmaco;
    private String altro_inizio_terapia;
    private String altro_variazione_terapia;
    private Integer anno_generico;
    private String booster;
    private String codice_centro;
    private String data_fine;
    private String data_inizio;
    private Boolean disponibile_generico;
    private Boolean doppio_cieco;
    private Integer dosaggi_count;
    private String farmaco_ATC;
    private String filtro_farmaco;
    private String generico;
    private String genotipo_guidata;
    private Boolean long_acting;
    private String motivazione_fine_ARV_princ_;
    private String motivazione_fine_ARV_sec_;
    private String motivazione_inizio_ARV_;
    private String nome_farmaco;
    private String nome_gruppo;
    private String nome_trial;
    private String object_title;
    private String once;
    private String user_team;

    public CliTerapia_ARVCursorDTO() {
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

    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getAltro_inizio_terapia() {
        return altro_inizio_terapia;
    }
    public void setAltro_inizio_terapia(String altro_inizio_terapia) {
        this.altro_inizio_terapia = altro_inizio_terapia;
    }

    public String getAltro_variazione_terapia() {
        return altro_variazione_terapia;
    }
    public void setAltro_variazione_terapia(String altro_variazione_terapia) {
        this.altro_variazione_terapia = altro_variazione_terapia;
    }

    public Integer getAnno_generico() {
        return anno_generico;
    }
    public void setAnno_generico(Integer anno_generico) {
        this.anno_generico = anno_generico;
    }

    public String getBooster() {
        return booster;
    }
    public void setBooster(String booster) {
        this.booster = booster;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
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

    public Boolean getDisponibile_generico() {
        return disponibile_generico;
    }
    public void setDisponibile_generico(Boolean disponibile_generico) {
        this.disponibile_generico = disponibile_generico;
    }

    public Boolean getDoppio_cieco() {
        return doppio_cieco;
    }
    public void setDoppio_cieco(Boolean doppio_cieco) {
        this.doppio_cieco = doppio_cieco;
    }

    public Integer getDosaggi_count() {
        return dosaggi_count;
    }
    public void setDosaggi_count(Integer dosaggi_count) {
        this.dosaggi_count = dosaggi_count;
    }

    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    public String getFiltro_farmaco() {
        return filtro_farmaco;
    }
    public void setFiltro_farmaco(String filtro_farmaco) {
        this.filtro_farmaco = filtro_farmaco;
    }

    public String getGenerico() {
        return generico;
    }
    public void setGenerico(String generico) {
        this.generico = generico;
    }

    public String getGenotipo_guidata() {
        return genotipo_guidata;
    }
    public void setGenotipo_guidata(String genotipo_guidata) {
        this.genotipo_guidata = genotipo_guidata;
    }

    public Boolean getLong_acting() {
        return long_acting;
    }
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    public String getMotivazione_fine_ARV_princ_() {
        return motivazione_fine_ARV_princ_;
    }
    public void setMotivazione_fine_ARV_princ_(String motivazione_fine_ARV_princ_) {
        this.motivazione_fine_ARV_princ_ = motivazione_fine_ARV_princ_;
    }

    public String getMotivazione_fine_ARV_sec_() {
        return motivazione_fine_ARV_sec_;
    }
    public void setMotivazione_fine_ARV_sec_(String motivazione_fine_ARV_sec_) {
        this.motivazione_fine_ARV_sec_ = motivazione_fine_ARV_sec_;
    }

    public String getMotivazione_inizio_ARV_() {
        return motivazione_inizio_ARV_;
    }
    public void setMotivazione_inizio_ARV_(String motivazione_inizio_ARV_) {
        this.motivazione_inizio_ARV_ = motivazione_inizio_ARV_;
    }

    public String getNome_farmaco() {
        return nome_farmaco;
    }
    public void setNome_farmaco(String nome_farmaco) {
        this.nome_farmaco = nome_farmaco;
    }

    public String getNome_gruppo() {
        return nome_gruppo;
    }
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    public String getNome_trial() {
        return nome_trial;
    }
    public void setNome_trial(String nome_trial) {
        this.nome_trial = nome_trial;
    }

    public String getObject_title() {
        return object_title;
    }
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    public String getOnce() {
        return once;
    }
    public void setOnce(String once) {
        this.once = once;
    }

    public String getUser_team() {
        return user_team;
    }
    public void setUser_team(String user_team) {
        this.user_team = user_team;
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
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (altro_inizio_terapia != null) {
            joiner.add("altro_inizio_terapia: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia));
        }
        if (altro_variazione_terapia != null) {
            joiner.add("altro_variazione_terapia: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia));
        }
        if (anno_generico != null) {
            joiner.add("anno_generico: " + GraphQLRequestSerializer.getEntry(anno_generico));
        }
        if (booster != null) {
            joiner.add("booster: " + GraphQLRequestSerializer.getEntry(booster));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (disponibile_generico != null) {
            joiner.add("disponibile_generico: " + GraphQLRequestSerializer.getEntry(disponibile_generico));
        }
        if (doppio_cieco != null) {
            joiner.add("doppio_cieco: " + GraphQLRequestSerializer.getEntry(doppio_cieco));
        }
        if (dosaggi_count != null) {
            joiner.add("dosaggi_count: " + GraphQLRequestSerializer.getEntry(dosaggi_count));
        }
        if (farmaco_ATC != null) {
            joiner.add("farmaco_ATC: " + GraphQLRequestSerializer.getEntry(farmaco_ATC));
        }
        if (filtro_farmaco != null) {
            joiner.add("filtro_farmaco: " + GraphQLRequestSerializer.getEntry(filtro_farmaco));
        }
        if (generico != null) {
            joiner.add("generico: " + GraphQLRequestSerializer.getEntry(generico));
        }
        if (genotipo_guidata != null) {
            joiner.add("genotipo_guidata: " + GraphQLRequestSerializer.getEntry(genotipo_guidata));
        }
        if (long_acting != null) {
            joiner.add("long_acting: " + GraphQLRequestSerializer.getEntry(long_acting));
        }
        if (motivazione_fine_ARV_princ_ != null) {
            joiner.add("motivazione_fine_ARV_princ_: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ_));
        }
        if (motivazione_fine_ARV_sec_ != null) {
            joiner.add("motivazione_fine_ARV_sec_: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec_));
        }
        if (motivazione_inizio_ARV_ != null) {
            joiner.add("motivazione_inizio_ARV_: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV_));
        }
        if (nome_farmaco != null) {
            joiner.add("nome_farmaco: " + GraphQLRequestSerializer.getEntry(nome_farmaco));
        }
        if (nome_gruppo != null) {
            joiner.add("nome_gruppo: " + GraphQLRequestSerializer.getEntry(nome_gruppo));
        }
        if (nome_trial != null) {
            joiner.add("nome_trial: " + GraphQLRequestSerializer.getEntry(nome_trial));
        }
        if (object_title != null) {
            joiner.add("object_title: " + GraphQLRequestSerializer.getEntry(object_title));
        }
        if (once != null) {
            joiner.add("once: " + GraphQLRequestSerializer.getEntry(once));
        }
        if (user_team != null) {
            joiner.add("user_team: " + GraphQLRequestSerializer.getEntry(user_team));
        }
        return joiner.toString();
    }

    public static CliTerapia_ARVCursorDTO.Builder builder() {
        return new CliTerapia_ARVCursorDTO.Builder();
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
        private String altro_farmaco;
        private String altro_inizio_terapia;
        private String altro_variazione_terapia;
        private Integer anno_generico;
        private String booster;
        private String codice_centro;
        private String data_fine;
        private String data_inizio;
        private Boolean disponibile_generico;
        private Boolean doppio_cieco;
        private Integer dosaggi_count;
        private String farmaco_ATC;
        private String filtro_farmaco;
        private String generico;
        private String genotipo_guidata;
        private Boolean long_acting;
        private String motivazione_fine_ARV_princ_;
        private String motivazione_fine_ARV_sec_;
        private String motivazione_inizio_ARV_;
        private String nome_farmaco;
        private String nome_gruppo;
        private String nome_trial;
        private String object_title;
        private String once;
        private String user_team;

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

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setAltro_inizio_terapia(String altro_inizio_terapia) {
            this.altro_inizio_terapia = altro_inizio_terapia;
            return this;
        }

        public Builder setAltro_variazione_terapia(String altro_variazione_terapia) {
            this.altro_variazione_terapia = altro_variazione_terapia;
            return this;
        }

        public Builder setAnno_generico(Integer anno_generico) {
            this.anno_generico = anno_generico;
            return this;
        }

        public Builder setBooster(String booster) {
            this.booster = booster;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
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

        public Builder setDisponibile_generico(Boolean disponibile_generico) {
            this.disponibile_generico = disponibile_generico;
            return this;
        }

        public Builder setDoppio_cieco(Boolean doppio_cieco) {
            this.doppio_cieco = doppio_cieco;
            return this;
        }

        public Builder setDosaggi_count(Integer dosaggi_count) {
            this.dosaggi_count = dosaggi_count;
            return this;
        }

        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        public Builder setFiltro_farmaco(String filtro_farmaco) {
            this.filtro_farmaco = filtro_farmaco;
            return this;
        }

        public Builder setGenerico(String generico) {
            this.generico = generico;
            return this;
        }

        public Builder setGenotipo_guidata(String genotipo_guidata) {
            this.genotipo_guidata = genotipo_guidata;
            return this;
        }

        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ_(String motivazione_fine_ARV_princ_) {
            this.motivazione_fine_ARV_princ_ = motivazione_fine_ARV_princ_;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec_(String motivazione_fine_ARV_sec_) {
            this.motivazione_fine_ARV_sec_ = motivazione_fine_ARV_sec_;
            return this;
        }

        public Builder setMotivazione_inizio_ARV_(String motivazione_inizio_ARV_) {
            this.motivazione_inizio_ARV_ = motivazione_inizio_ARV_;
            return this;
        }

        public Builder setNome_farmaco(String nome_farmaco) {
            this.nome_farmaco = nome_farmaco;
            return this;
        }

        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        public Builder setNome_trial(String nome_trial) {
            this.nome_trial = nome_trial;
            return this;
        }

        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        public Builder setOnce(String once) {
            this.once = once;
            return this;
        }

        public Builder setUser_team(String user_team) {
            this.user_team = user_team;
            return this;
        }


        public CliTerapia_ARVCursorDTO build() {
            CliTerapia_ARVCursorDTO result = new CliTerapia_ARVCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltro_farmaco(this.altro_farmaco);
            result.setAltro_inizio_terapia(this.altro_inizio_terapia);
            result.setAltro_variazione_terapia(this.altro_variazione_terapia);
            result.setAnno_generico(this.anno_generico);
            result.setBooster(this.booster);
            result.setCodice_centro(this.codice_centro);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setDisponibile_generico(this.disponibile_generico);
            result.setDoppio_cieco(this.doppio_cieco);
            result.setDosaggi_count(this.dosaggi_count);
            result.setFarmaco_ATC(this.farmaco_ATC);
            result.setFiltro_farmaco(this.filtro_farmaco);
            result.setGenerico(this.generico);
            result.setGenotipo_guidata(this.genotipo_guidata);
            result.setLong_acting(this.long_acting);
            result.setMotivazione_fine_ARV_princ_(this.motivazione_fine_ARV_princ_);
            result.setMotivazione_fine_ARV_sec_(this.motivazione_fine_ARV_sec_);
            result.setMotivazione_inizio_ARV_(this.motivazione_inizio_ARV_);
            result.setNome_farmaco(this.nome_farmaco);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_trial(this.nome_trial);
            result.setObject_title(this.object_title);
            result.setOnce(this.once);
            result.setUser_team(this.user_team);
            return result;
        }

    }
}
