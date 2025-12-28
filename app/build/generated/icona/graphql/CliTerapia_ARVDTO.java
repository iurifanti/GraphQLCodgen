package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Terapia_ARV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTerapia_ARVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliDosaggioDTO dosaggio_;
    private CliFarmaco_ARVDTO farmaco_ARV;
    private CliMotivazione_fine_ARVDTO motivazione_fine_ARV_princ;
    private CliMotivazione_fine_ARVDTO motivazione_fine_ARV_sec;
    private CliMotivazione_inizio_ARVDTO motivazione_inizio_ARV;
    private CliPazienteDTO Paziente_terapia_ARV;

    public CliTerapia_ARVDTO() {
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
     * The attribute _createdby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Terapia_ARV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Terapia_ARV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Terapia_ARV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
     */
    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    /**
     * The attribute altro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
     */
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    /**
     * The attribute altro_inizio_terapia of Terapia_ARV. It is of type String. Max length: 255.
     */
    public String getAltro_inizio_terapia() {
        return altro_inizio_terapia;
    }
    /**
     * The attribute altro_inizio_terapia of Terapia_ARV. It is of type String. Max length: 255.
     */
    public void setAltro_inizio_terapia(String altro_inizio_terapia) {
        this.altro_inizio_terapia = altro_inizio_terapia;
    }

    /**
     * The attribute altro_variazione_terapia of Terapia_ARV. It is of type String. Max length: 255.
     */
    public String getAltro_variazione_terapia() {
        return altro_variazione_terapia;
    }
    /**
     * The attribute altro_variazione_terapia of Terapia_ARV. It is of type String. Max length: 255.
     */
    public void setAltro_variazione_terapia(String altro_variazione_terapia) {
        this.altro_variazione_terapia = altro_variazione_terapia;
    }

    /**
     * The attribute anno_generico of Terapia_ARV. It is of type Int. Path: farmaco_ARV anno_generico.
     */
    public Integer getAnno_generico() {
        return anno_generico;
    }
    /**
     * The attribute anno_generico of Terapia_ARV. It is of type Int. Path: farmaco_ARV anno_generico.
     */
    public void setAnno_generico(Integer anno_generico) {
        this.anno_generico = anno_generico;
    }

    /**
     * The attribute booster of Terapia_ARV. It is of type String. Domain: Non noto OR Si OR No.}Max length: 255.
     */
    public String getBooster() {
        return booster;
    }
    /**
     * The attribute booster of Terapia_ARV. It is of type String. Domain: Non noto OR Si OR No.}Max length: 255.
     */
    public void setBooster(String booster) {
        this.booster = booster;
    }

    /**
     * The attribute codice_centro of Terapia_ARV. It is of type String. Path: Paziente_terapia_ARV.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Terapia_ARV. It is of type String. Path: Paziente_terapia_ARV.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data_fine of Terapia_ARV. It is of type Date @dateFormat.
     */
    public String getData_fine() {
        return data_fine;
    }
    /**
     * The attribute data_fine of Terapia_ARV. It is of type Date @dateFormat.
     */
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    /**
     * The attribute data_inizio of Terapia_ARV. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_inizio() {
        return data_inizio;
    }
    /**
     * The attribute data_inizio of Terapia_ARV. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    /**
     * The attribute disponibile_generico of Terapia_ARV. It is of type Boolean. Expression: 'anno_generico<=toInt(getYear(data_inizio))'.
     */
    public Boolean getDisponibile_generico() {
        return disponibile_generico;
    }
    /**
     * The attribute disponibile_generico of Terapia_ARV. It is of type Boolean. Expression: 'anno_generico<=toInt(getYear(data_inizio))'.
     */
    public void setDisponibile_generico(Boolean disponibile_generico) {
        this.disponibile_generico = disponibile_generico;
    }

    /**
     * The attribute doppio_cieco of Terapia_ARV. It is of type Boolean.
     */
    public Boolean getDoppio_cieco() {
        return doppio_cieco;
    }
    /**
     * The attribute doppio_cieco of Terapia_ARV. It is of type Boolean.
     */
    public void setDoppio_cieco(Boolean doppio_cieco) {
        this.doppio_cieco = doppio_cieco;
    }

    /**
     * The attribute dosaggi_count of Terapia_ARV. It is of type Int. Path: COUNT_ALL - Count allfarmaco_ARV.dosaggio_ nome.
     */
    public Integer getDosaggi_count() {
        return dosaggi_count;
    }
    /**
     * The attribute dosaggi_count of Terapia_ARV. It is of type Int. Path: COUNT_ALL - Count allfarmaco_ARV.dosaggio_ nome.
     */
    public void setDosaggi_count(Integer dosaggi_count) {
        this.dosaggi_count = dosaggi_count;
    }

    /**
     * The attribute farmaco_ATC of Terapia_ARV. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
     */
    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    /**
     * The attribute farmaco_ATC of Terapia_ARV. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
     */
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    /**
     * The attribute filtro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
     */
    public String getFiltro_farmaco() {
        return filtro_farmaco;
    }
    /**
     * The attribute filtro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
     */
    public void setFiltro_farmaco(String filtro_farmaco) {
        this.filtro_farmaco = filtro_farmaco;
    }

    /**
     * The attribute generico of Terapia_ARV. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public String getGenerico() {
        return generico;
    }
    /**
     * The attribute generico of Terapia_ARV. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public void setGenerico(String generico) {
        this.generico = generico;
    }

    /**
     * The attribute genotipo_guidata of Terapia_ARV. It is of type String. Domain: si OR no OR non so.}Max length: 255.
     */
    public String getGenotipo_guidata() {
        return genotipo_guidata;
    }
    /**
     * The attribute genotipo_guidata of Terapia_ARV. It is of type String. Domain: si OR no OR non so.}Max length: 255.
     */
    public void setGenotipo_guidata(String genotipo_guidata) {
        this.genotipo_guidata = genotipo_guidata;
    }

    /**
     * The attribute long_acting of Terapia_ARV. It is of type Boolean. Path: farmaco_ATC_ long_acting.
     */
    public Boolean getLong_acting() {
        return long_acting;
    }
    /**
     * The attribute long_acting of Terapia_ARV. It is of type Boolean. Path: farmaco_ATC_ long_acting.
     */
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    /**
     * The attribute motivazione_fine_ARV_princ_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_princ nome.
     */
    public String getMotivazione_fine_ARV_princ_() {
        return motivazione_fine_ARV_princ_;
    }
    /**
     * The attribute motivazione_fine_ARV_princ_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_princ nome.
     */
    public void setMotivazione_fine_ARV_princ_(String motivazione_fine_ARV_princ_) {
        this.motivazione_fine_ARV_princ_ = motivazione_fine_ARV_princ_;
    }

    /**
     * The attribute motivazione_fine_ARV_sec_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_sec nome.
     */
    public String getMotivazione_fine_ARV_sec_() {
        return motivazione_fine_ARV_sec_;
    }
    /**
     * The attribute motivazione_fine_ARV_sec_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_sec nome.
     */
    public void setMotivazione_fine_ARV_sec_(String motivazione_fine_ARV_sec_) {
        this.motivazione_fine_ARV_sec_ = motivazione_fine_ARV_sec_;
    }

    /**
     * The attribute motivazione_inizio_ARV_ of Terapia_ARV. It is of type String. Path: motivazione_inizio_ARV nome.
     */
    public String getMotivazione_inizio_ARV_() {
        return motivazione_inizio_ARV_;
    }
    /**
     * The attribute motivazione_inizio_ARV_ of Terapia_ARV. It is of type String. Path: motivazione_inizio_ARV nome.
     */
    public void setMotivazione_inizio_ARV_(String motivazione_inizio_ARV_) {
        this.motivazione_inizio_ARV_ = motivazione_inizio_ARV_;
    }

    /**
     * The attribute nome_farmaco of Terapia_ARV. It is of type String. Path: farmaco_ARV nome. Cannot be null.
     */
    public String getNome_farmaco() {
        return nome_farmaco;
    }
    /**
     * The attribute nome_farmaco of Terapia_ARV. It is of type String. Path: farmaco_ARV nome. Cannot be null.
     */
    public void setNome_farmaco(String nome_farmaco) {
        this.nome_farmaco = nome_farmaco;
    }

    /**
     * The attribute nome_gruppo of Terapia_ARV. It is of type String. Path: farmaco_ARV nome_gruppo.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Terapia_ARV. It is of type String. Path: farmaco_ARV nome_gruppo.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_trial of Terapia_ARV. It is of type String. Max length: 255.
     */
    public String getNome_trial() {
        return nome_trial;
    }
    /**
     * The attribute nome_trial of Terapia_ARV. It is of type String. Max length: 255.
     */
    public void setNome_trial(String nome_trial) {
        this.nome_trial = nome_trial;
    }

    /**
     * The attribute object_title of Terapia_ARV. It is of type String. Expression: 'concat("Farmaco ARV: ", data_inizio, " (", nome_farmaco, ")")'.Cannot be null.
     */
    public String getObject_title() {
        return object_title;
    }
    /**
     * The attribute object_title of Terapia_ARV. It is of type String. Expression: 'concat("Farmaco ARV: ", data_inizio, " (", nome_farmaco, ")")'.Cannot be null.
     */
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    /**
     * The attribute once of Terapia_ARV. It is of type String. Domain: Once OR BID OR TID o altro OR Non noto OR Standard.}Max length: 255.
     */
    public String getOnce() {
        return once;
    }
    /**
     * The attribute once of Terapia_ARV. It is of type String. Domain: Once OR BID OR TID o altro OR Non noto OR Standard.}Max length: 255.
     */
    public void setOnce(String once) {
        this.once = once;
    }

    /**
     * The attribute user_team of Terapia_ARV. It is of type String. Expression: '__CurrentUser.team'.
     */
    public String getUser_team() {
        return user_team;
    }
    /**
     * The attribute user_team of Terapia_ARV. It is of type String. Expression: '__CurrentUser.team'.
     */
    public void setUser_team(String user_team) {
        this.user_team = user_team;
    }

    /**
     * The associated object for the role dosaggio_.
     */
    public CliDosaggioDTO getDosaggio_() {
        return dosaggio_;
    }
    /**
     * The associated object for the role dosaggio_.
     */
    public void setDosaggio_(CliDosaggioDTO dosaggio_) {
        this.dosaggio_ = dosaggio_;
    }

    /**
     * The associated object for the role farmaco_ARV.
     */
    public CliFarmaco_ARVDTO getFarmaco_ARV() {
        return farmaco_ARV;
    }
    /**
     * The associated object for the role farmaco_ARV.
     */
    public void setFarmaco_ARV(CliFarmaco_ARVDTO farmaco_ARV) {
        this.farmaco_ARV = farmaco_ARV;
    }

    /**
     * The associated object for the role motivazione_fine_ARV_princ.
     */
    public CliMotivazione_fine_ARVDTO getMotivazione_fine_ARV_princ() {
        return motivazione_fine_ARV_princ;
    }
    /**
     * The associated object for the role motivazione_fine_ARV_princ.
     */
    public void setMotivazione_fine_ARV_princ(CliMotivazione_fine_ARVDTO motivazione_fine_ARV_princ) {
        this.motivazione_fine_ARV_princ = motivazione_fine_ARV_princ;
    }

    /**
     * The associated object for the role motivazione_fine_ARV_sec.
     */
    public CliMotivazione_fine_ARVDTO getMotivazione_fine_ARV_sec() {
        return motivazione_fine_ARV_sec;
    }
    /**
     * The associated object for the role motivazione_fine_ARV_sec.
     */
    public void setMotivazione_fine_ARV_sec(CliMotivazione_fine_ARVDTO motivazione_fine_ARV_sec) {
        this.motivazione_fine_ARV_sec = motivazione_fine_ARV_sec;
    }

    /**
     * The associated object for the role motivazione_inizio_ARV.
     */
    public CliMotivazione_inizio_ARVDTO getMotivazione_inizio_ARV() {
        return motivazione_inizio_ARV;
    }
    /**
     * The associated object for the role motivazione_inizio_ARV.
     */
    public void setMotivazione_inizio_ARV(CliMotivazione_inizio_ARVDTO motivazione_inizio_ARV) {
        this.motivazione_inizio_ARV = motivazione_inizio_ARV;
    }

    /**
     * The associated object for the role Paziente_terapia_ARV.
     */
    public CliPazienteDTO getPaziente_terapia_ARV() {
        return Paziente_terapia_ARV;
    }
    /**
     * The associated object for the role Paziente_terapia_ARV.
     */
    public void setPaziente_terapia_ARV(CliPazienteDTO Paziente_terapia_ARV) {
        this.Paziente_terapia_ARV = Paziente_terapia_ARV;
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
        if (dosaggio_ != null) {
            joiner.add("dosaggio_: " + GraphQLRequestSerializer.getEntry(dosaggio_));
        }
        if (farmaco_ARV != null) {
            joiner.add("farmaco_ARV: " + GraphQLRequestSerializer.getEntry(farmaco_ARV));
        }
        if (motivazione_fine_ARV_princ != null) {
            joiner.add("motivazione_fine_ARV_princ: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ));
        }
        if (motivazione_fine_ARV_sec != null) {
            joiner.add("motivazione_fine_ARV_sec: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec));
        }
        if (motivazione_inizio_ARV != null) {
            joiner.add("motivazione_inizio_ARV: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV));
        }
        if (Paziente_terapia_ARV != null) {
            joiner.add("Paziente_terapia_ARV: " + GraphQLRequestSerializer.getEntry(Paziente_terapia_ARV));
        }
        return joiner.toString();
    }

    public static CliTerapia_ARVDTO.Builder builder() {
        return new CliTerapia_ARVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
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
        private CliDosaggioDTO dosaggio_;
        private CliFarmaco_ARVDTO farmaco_ARV;
        private CliMotivazione_fine_ARVDTO motivazione_fine_ARV_princ;
        private CliMotivazione_fine_ARVDTO motivazione_fine_ARV_sec;
        private CliMotivazione_inizio_ARVDTO motivazione_inizio_ARV;
        private CliPazienteDTO Paziente_terapia_ARV;

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
         * The attribute _createdby of Terapia_ARV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Terapia_ARV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Terapia_ARV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Terapia_ARV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Terapia_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
         */
        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        /**
         * The attribute altro_inizio_terapia of Terapia_ARV. It is of type String. Max length: 255.
         */
        public Builder setAltro_inizio_terapia(String altro_inizio_terapia) {
            this.altro_inizio_terapia = altro_inizio_terapia;
            return this;
        }

        /**
         * The attribute altro_variazione_terapia of Terapia_ARV. It is of type String. Max length: 255.
         */
        public Builder setAltro_variazione_terapia(String altro_variazione_terapia) {
            this.altro_variazione_terapia = altro_variazione_terapia;
            return this;
        }

        /**
         * The attribute anno_generico of Terapia_ARV. It is of type Int. Path: farmaco_ARV anno_generico.
         */
        public Builder setAnno_generico(Integer anno_generico) {
            this.anno_generico = anno_generico;
            return this;
        }

        /**
         * The attribute booster of Terapia_ARV. It is of type String. Domain: Non noto OR Si OR No.}Max length: 255.
         */
        public Builder setBooster(String booster) {
            this.booster = booster;
            return this;
        }

        /**
         * The attribute codice_centro of Terapia_ARV. It is of type String. Path: Paziente_terapia_ARV.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data_fine of Terapia_ARV. It is of type Date @dateFormat.
         */
        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        /**
         * The attribute data_inizio of Terapia_ARV. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        /**
         * The attribute disponibile_generico of Terapia_ARV. It is of type Boolean. Expression: 'anno_generico<=toInt(getYear(data_inizio))'.
         */
        public Builder setDisponibile_generico(Boolean disponibile_generico) {
            this.disponibile_generico = disponibile_generico;
            return this;
        }

        /**
         * The attribute doppio_cieco of Terapia_ARV. It is of type Boolean.
         */
        public Builder setDoppio_cieco(Boolean doppio_cieco) {
            this.doppio_cieco = doppio_cieco;
            return this;
        }

        /**
         * The attribute dosaggi_count of Terapia_ARV. It is of type Int. Path: COUNT_ALL - Count allfarmaco_ARV.dosaggio_ nome.
         */
        public Builder setDosaggi_count(Integer dosaggi_count) {
            this.dosaggi_count = dosaggi_count;
            return this;
        }

        /**
         * The attribute farmaco_ATC of Terapia_ARV. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
         */
        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        /**
         * The attribute filtro_farmaco of Terapia_ARV. It is of type String. Max length: 255.
         */
        public Builder setFiltro_farmaco(String filtro_farmaco) {
            this.filtro_farmaco = filtro_farmaco;
            return this;
        }

        /**
         * The attribute generico of Terapia_ARV. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
         */
        public Builder setGenerico(String generico) {
            this.generico = generico;
            return this;
        }

        /**
         * The attribute genotipo_guidata of Terapia_ARV. It is of type String. Domain: si OR no OR non so.}Max length: 255.
         */
        public Builder setGenotipo_guidata(String genotipo_guidata) {
            this.genotipo_guidata = genotipo_guidata;
            return this;
        }

        /**
         * The attribute long_acting of Terapia_ARV. It is of type Boolean. Path: farmaco_ATC_ long_acting.
         */
        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        /**
         * The attribute motivazione_fine_ARV_princ_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_princ nome.
         */
        public Builder setMotivazione_fine_ARV_princ_(String motivazione_fine_ARV_princ_) {
            this.motivazione_fine_ARV_princ_ = motivazione_fine_ARV_princ_;
            return this;
        }

        /**
         * The attribute motivazione_fine_ARV_sec_ of Terapia_ARV. It is of type String. Path: motivazione_fine_ARV_sec nome.
         */
        public Builder setMotivazione_fine_ARV_sec_(String motivazione_fine_ARV_sec_) {
            this.motivazione_fine_ARV_sec_ = motivazione_fine_ARV_sec_;
            return this;
        }

        /**
         * The attribute motivazione_inizio_ARV_ of Terapia_ARV. It is of type String. Path: motivazione_inizio_ARV nome.
         */
        public Builder setMotivazione_inizio_ARV_(String motivazione_inizio_ARV_) {
            this.motivazione_inizio_ARV_ = motivazione_inizio_ARV_;
            return this;
        }

        /**
         * The attribute nome_farmaco of Terapia_ARV. It is of type String. Path: farmaco_ARV nome. Cannot be null.
         */
        public Builder setNome_farmaco(String nome_farmaco) {
            this.nome_farmaco = nome_farmaco;
            return this;
        }

        /**
         * The attribute nome_gruppo of Terapia_ARV. It is of type String. Path: farmaco_ARV nome_gruppo.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_trial of Terapia_ARV. It is of type String. Max length: 255.
         */
        public Builder setNome_trial(String nome_trial) {
            this.nome_trial = nome_trial;
            return this;
        }

        /**
         * The attribute object_title of Terapia_ARV. It is of type String. Expression: 'concat("Farmaco ARV: ", data_inizio, " (", nome_farmaco, ")")'.Cannot be null.
         */
        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        /**
         * The attribute once of Terapia_ARV. It is of type String. Domain: Once OR BID OR TID o altro OR Non noto OR Standard.}Max length: 255.
         */
        public Builder setOnce(String once) {
            this.once = once;
            return this;
        }

        /**
         * The attribute user_team of Terapia_ARV. It is of type String. Expression: '__CurrentUser.team'.
         */
        public Builder setUser_team(String user_team) {
            this.user_team = user_team;
            return this;
        }

        /**
         * The associated object for the role dosaggio_.
         */
        public Builder setDosaggio_(CliDosaggioDTO dosaggio_) {
            this.dosaggio_ = dosaggio_;
            return this;
        }

        /**
         * The associated object for the role farmaco_ARV.
         */
        public Builder setFarmaco_ARV(CliFarmaco_ARVDTO farmaco_ARV) {
            this.farmaco_ARV = farmaco_ARV;
            return this;
        }

        /**
         * The associated object for the role motivazione_fine_ARV_princ.
         */
        public Builder setMotivazione_fine_ARV_princ(CliMotivazione_fine_ARVDTO motivazione_fine_ARV_princ) {
            this.motivazione_fine_ARV_princ = motivazione_fine_ARV_princ;
            return this;
        }

        /**
         * The associated object for the role motivazione_fine_ARV_sec.
         */
        public Builder setMotivazione_fine_ARV_sec(CliMotivazione_fine_ARVDTO motivazione_fine_ARV_sec) {
            this.motivazione_fine_ARV_sec = motivazione_fine_ARV_sec;
            return this;
        }

        /**
         * The associated object for the role motivazione_inizio_ARV.
         */
        public Builder setMotivazione_inizio_ARV(CliMotivazione_inizio_ARVDTO motivazione_inizio_ARV) {
            this.motivazione_inizio_ARV = motivazione_inizio_ARV;
            return this;
        }

        /**
         * The associated object for the role Paziente_terapia_ARV.
         */
        public Builder setPaziente_terapia_ARV(CliPazienteDTO Paziente_terapia_ARV) {
            this.Paziente_terapia_ARV = Paziente_terapia_ARV;
            return this;
        }


        public CliTerapia_ARVDTO build() {
            CliTerapia_ARVDTO result = new CliTerapia_ARVDTO();
            result.set_clientId(this._clientId);
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
            result.setDosaggio_(this.dosaggio_);
            result.setFarmaco_ARV(this.farmaco_ARV);
            result.setMotivazione_fine_ARV_princ(this.motivazione_fine_ARV_princ);
            result.setMotivazione_fine_ARV_sec(this.motivazione_fine_ARV_sec);
            result.setMotivazione_inizio_ARV(this.motivazione_inizio_ARV);
            result.setPaziente_terapia_ARV(this.Paziente_terapia_ARV);
            return result;
        }

    }
}
