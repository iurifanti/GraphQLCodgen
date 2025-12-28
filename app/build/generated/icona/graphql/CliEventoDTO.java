package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Evento, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEventoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String IPI;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String aaIPI;
    private String altro;
    private Boolean anamnesi;
    private Integer c_dettaglio_id;
    private String codice_centro;
    private String data;
    private Boolean documentazione_necessaria;
    private String episodio;
    private Integer id_respond;
    private String metodo_diagnosi_tumore;
    private String nome_gruppo;
    private String nome_patologia;
    private String nome_tipo;
    private String object_title;
    private String paziente;
    private Integer paziente_o;
    private String performance_status;
    private String siti_coinvolti_M;
    private String siti_coinvolti_N;
    private String siti_coinvolti_T;
    private Boolean specifica_tumori;
    private String stadio_tumore;
    private String stato_accertamento;
    private String tipo_imaging;
    private Boolean warning_respond;
    private CliClassificazione_ICD10DTO classificazione_ICD10_;
    private CliPatologiaDTO patologia;
    private CliPazienteDTO Paziente_evento;
    private CliC_dettaglioDTO c_dettaglio_;

    public CliEventoDTO() {
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
     * The attribute IPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
     */
    public String getIPI() {
        return IPI;
    }
    /**
     * The attribute IPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
     */
    public void setIPI(String IPI) {
        this.IPI = IPI;
    }

    /**
     * The attribute _createdby of Evento. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Evento. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Evento. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Evento. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Evento. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Evento. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Evento. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Evento. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute aaIPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3.}Max length: 255.
     */
    public String getAaIPI() {
        return aaIPI;
    }
    /**
     * The attribute aaIPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3.}Max length: 255.
     */
    public void setAaIPI(String aaIPI) {
        this.aaIPI = aaIPI;
    }

    /**
     * The attribute altro of Evento. It is of type Text.
     */
    public String getAltro() {
        return altro;
    }
    /**
     * The attribute altro of Evento. It is of type Text.
     */
    public void setAltro(String altro) {
        this.altro = altro;
    }

    /**
     * The attribute anamnesi of Evento. It is of type Boolean.
     */
    public Boolean getAnamnesi() {
        return anamnesi;
    }
    /**
     * The attribute anamnesi of Evento. It is of type Boolean.
     */
    public void setAnamnesi(Boolean anamnesi) {
        this.anamnesi = anamnesi;
    }

    /**
     * The attribute c_dettaglio_id of Evento. It is of type Int. Path: c_dettaglio_ __id. Cannot be null.
     */
    public Integer getC_dettaglio_id() {
        return c_dettaglio_id;
    }
    /**
     * The attribute c_dettaglio_id of Evento. It is of type Int. Path: c_dettaglio_ __id. Cannot be null.
     */
    public void setC_dettaglio_id(Integer c_dettaglio_id) {
        this.c_dettaglio_id = c_dettaglio_id;
    }

    /**
     * The attribute codice_centro of Evento. It is of type String. Path: Paziente_evento.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Evento. It is of type String. Path: Paziente_evento.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Evento. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Evento. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute documentazione_necessaria of Evento. It is of type Boolean. Path: patologia documentazione.
     */
    public Boolean getDocumentazione_necessaria() {
        return documentazione_necessaria;
    }
    /**
     * The attribute documentazione_necessaria of Evento. It is of type Boolean. Path: patologia documentazione.
     */
    public void setDocumentazione_necessaria(Boolean documentazione_necessaria) {
        this.documentazione_necessaria = documentazione_necessaria;
    }

    /**
     * The attribute episodio of Evento. It is of type String. Max length: 255.
     */
    public String getEpisodio() {
        return episodio;
    }
    /**
     * The attribute episodio of Evento. It is of type String. Max length: 255.
     */
    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    /**
     * The attribute id_respond of Evento. It is of type Int. Path: Paziente_evento id_respond.
     */
    public Integer getId_respond() {
        return id_respond;
    }
    /**
     * The attribute id_respond of Evento. It is of type Int. Path: Paziente_evento id_respond.
     */
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    /**
     * The attribute metodo_diagnosi_tumore of Evento. It is of type String. Domain: Biopsia OR Imaging OR Biochimica.}Max length: 255.
     */
    public String getMetodo_diagnosi_tumore() {
        return metodo_diagnosi_tumore;
    }
    /**
     * The attribute metodo_diagnosi_tumore of Evento. It is of type String. Domain: Biopsia OR Imaging OR Biochimica.}Max length: 255.
     */
    public void setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
        this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
    }

    /**
     * The attribute nome_gruppo of Evento. It is of type String. Path: patologia nome_gruppo. Cannot be null.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Evento. It is of type String. Path: patologia nome_gruppo. Cannot be null.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_patologia of Evento. It is of type String. Path: patologia nome. Cannot be null.
     */
    public String getNome_patologia() {
        return nome_patologia;
    }
    /**
     * The attribute nome_patologia of Evento. It is of type String. Path: patologia nome. Cannot be null.
     */
    public void setNome_patologia(String nome_patologia) {
        this.nome_patologia = nome_patologia;
    }

    /**
     * The attribute nome_tipo of Evento. It is of type String. Path: patologia nome_tipo. Cannot be null.
     */
    public String getNome_tipo() {
        return nome_tipo;
    }
    /**
     * The attribute nome_tipo of Evento. It is of type String. Path: patologia nome_tipo. Cannot be null.
     */
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    /**
     * The attribute object_title of Evento. It is of type String. Expression: 'concat("Patologia: ", data," (", nome_tipo, ")")'.Cannot be null.
     */
    public String getObject_title() {
        return object_title;
    }
    /**
     * The attribute object_title of Evento. It is of type String. Expression: 'concat("Patologia: ", data," (", nome_tipo, ")")'.Cannot be null.
     */
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    /**
     * The attribute paziente of Evento. It is of type String. Path: Paziente_evento codice_interno. Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Evento. It is of type String. Path: Paziente_evento codice_interno. Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute paziente_o of Evento. It is of type Int. Path: o_Paziente_ __id. Cannot be null.
     */
    public Integer getPaziente_o() {
        return paziente_o;
    }
    /**
     * The attribute paziente_o of Evento. It is of type Int. Path: o_Paziente_ __id. Cannot be null.
     */
    public void setPaziente_o(Integer paziente_o) {
        this.paziente_o = paziente_o;
    }

    /**
     * The attribute performance_status of Evento. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
     */
    public String getPerformance_status() {
        return performance_status;
    }
    /**
     * The attribute performance_status of Evento. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
     */
    public void setPerformance_status(String performance_status) {
        this.performance_status = performance_status;
    }

    /**
     * The attribute siti_coinvolti_M of Evento. It is of type String. Domain: M0 OR M1 OR MX.}Max length: 255.
     */
    public String getSiti_coinvolti_M() {
        return siti_coinvolti_M;
    }
    /**
     * The attribute siti_coinvolti_M of Evento. It is of type String. Domain: M0 OR M1 OR MX.}Max length: 255.
     */
    public void setSiti_coinvolti_M(String siti_coinvolti_M) {
        this.siti_coinvolti_M = siti_coinvolti_M;
    }

    /**
     * The attribute siti_coinvolti_N of Evento. It is of type String. Domain: N0 OR N1 OR N2 OR N3 OR NX OR Nis.}Max length: 255.
     */
    public String getSiti_coinvolti_N() {
        return siti_coinvolti_N;
    }
    /**
     * The attribute siti_coinvolti_N of Evento. It is of type String. Domain: N0 OR N1 OR N2 OR N3 OR NX OR Nis.}Max length: 255.
     */
    public void setSiti_coinvolti_N(String siti_coinvolti_N) {
        this.siti_coinvolti_N = siti_coinvolti_N;
    }

    /**
     * The attribute siti_coinvolti_T of Evento. It is of type String. Domain: T0 OR T1 OR T2 OR T3 OR T4 OR Tis OR TX.}Max length: 255.
     */
    public String getSiti_coinvolti_T() {
        return siti_coinvolti_T;
    }
    /**
     * The attribute siti_coinvolti_T of Evento. It is of type String. Domain: T0 OR T1 OR T2 OR T3 OR T4 OR Tis OR TX.}Max length: 255.
     */
    public void setSiti_coinvolti_T(String siti_coinvolti_T) {
        this.siti_coinvolti_T = siti_coinvolti_T;
    }

    /**
     * The attribute specifica_tumori of Evento. It is of type Boolean. Path: patologia mostra_specifica_tumori.
     */
    public Boolean getSpecifica_tumori() {
        return specifica_tumori;
    }
    /**
     * The attribute specifica_tumori of Evento. It is of type Boolean. Path: patologia mostra_specifica_tumori.
     */
    public void setSpecifica_tumori(Boolean specifica_tumori) {
        this.specifica_tumori = specifica_tumori;
    }

    /**
     * The attribute stadio_tumore of Evento. It is of type String. Domain: 0 OR I OR II OR III OR IV.}Max length: 255.
     */
    public String getStadio_tumore() {
        return stadio_tumore;
    }
    /**
     * The attribute stadio_tumore of Evento. It is of type String. Domain: 0 OR I OR II OR III OR IV.}Max length: 255.
     */
    public void setStadio_tumore(String stadio_tumore) {
        this.stadio_tumore = stadio_tumore;
    }

    /**
     * The attribute stato_accertamento of Evento. It is of type String. Domain: Accertato da autopsia OR Accertato OR Presuntivo OR Accertato da altra fonte.}Max length: 255.
     */
    public String getStato_accertamento() {
        return stato_accertamento;
    }
    /**
     * The attribute stato_accertamento of Evento. It is of type String. Domain: Accertato da autopsia OR Accertato OR Presuntivo OR Accertato da altra fonte.}Max length: 255.
     */
    public void setStato_accertamento(String stato_accertamento) {
        this.stato_accertamento = stato_accertamento;
    }

    /**
     * The attribute tipo_imaging of Evento. It is of type String. Domain: CT OR RM.}Max length: 255.
     */
    public String getTipo_imaging() {
        return tipo_imaging;
    }
    /**
     * The attribute tipo_imaging of Evento. It is of type String. Domain: CT OR RM.}Max length: 255.
     */
    public void setTipo_imaging(String tipo_imaging) {
        this.tipo_imaging = tipo_imaging;
    }

    /**
     * The attribute warning_respond of Evento. It is of type Boolean. Path: patologia warning_respond.
     */
    public Boolean getWarning_respond() {
        return warning_respond;
    }
    /**
     * The attribute warning_respond of Evento. It is of type Boolean. Path: patologia warning_respond.
     */
    public void setWarning_respond(Boolean warning_respond) {
        this.warning_respond = warning_respond;
    }

    /**
     * The associated object for the role classificazione_ICD10_.
     */
    public CliClassificazione_ICD10DTO getClassificazione_ICD10_() {
        return classificazione_ICD10_;
    }
    /**
     * The associated object for the role classificazione_ICD10_.
     */
    public void setClassificazione_ICD10_(CliClassificazione_ICD10DTO classificazione_ICD10_) {
        this.classificazione_ICD10_ = classificazione_ICD10_;
    }

    /**
     * The associated object for the role patologia.
     */
    public CliPatologiaDTO getPatologia() {
        return patologia;
    }
    /**
     * The associated object for the role patologia.
     */
    public void setPatologia(CliPatologiaDTO patologia) {
        this.patologia = patologia;
    }

    /**
     * The associated object for the role Paziente_evento.
     */
    public CliPazienteDTO getPaziente_evento() {
        return Paziente_evento;
    }
    /**
     * The associated object for the role Paziente_evento.
     */
    public void setPaziente_evento(CliPazienteDTO Paziente_evento) {
        this.Paziente_evento = Paziente_evento;
    }

    /**
     * The associated object for the role c_dettaglio_.
     */
    public CliC_dettaglioDTO getC_dettaglio_() {
        return c_dettaglio_;
    }
    /**
     * The associated object for the role c_dettaglio_.
     */
    public void setC_dettaglio_(CliC_dettaglioDTO c_dettaglio_) {
        this.c_dettaglio_ = c_dettaglio_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (IPI != null) {
            joiner.add("IPI: " + GraphQLRequestSerializer.getEntry(IPI));
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
        if (aaIPI != null) {
            joiner.add("aaIPI: " + GraphQLRequestSerializer.getEntry(aaIPI));
        }
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (anamnesi != null) {
            joiner.add("anamnesi: " + GraphQLRequestSerializer.getEntry(anamnesi));
        }
        if (c_dettaglio_id != null) {
            joiner.add("c_dettaglio_id: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (documentazione_necessaria != null) {
            joiner.add("documentazione_necessaria: " + GraphQLRequestSerializer.getEntry(documentazione_necessaria));
        }
        if (episodio != null) {
            joiner.add("episodio: " + GraphQLRequestSerializer.getEntry(episodio));
        }
        if (id_respond != null) {
            joiner.add("id_respond: " + GraphQLRequestSerializer.getEntry(id_respond));
        }
        if (metodo_diagnosi_tumore != null) {
            joiner.add("metodo_diagnosi_tumore: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore));
        }
        if (nome_gruppo != null) {
            joiner.add("nome_gruppo: " + GraphQLRequestSerializer.getEntry(nome_gruppo));
        }
        if (nome_patologia != null) {
            joiner.add("nome_patologia: " + GraphQLRequestSerializer.getEntry(nome_patologia));
        }
        if (nome_tipo != null) {
            joiner.add("nome_tipo: " + GraphQLRequestSerializer.getEntry(nome_tipo));
        }
        if (object_title != null) {
            joiner.add("object_title: " + GraphQLRequestSerializer.getEntry(object_title));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        if (paziente_o != null) {
            joiner.add("paziente_o: " + GraphQLRequestSerializer.getEntry(paziente_o));
        }
        if (performance_status != null) {
            joiner.add("performance_status: " + GraphQLRequestSerializer.getEntry(performance_status));
        }
        if (siti_coinvolti_M != null) {
            joiner.add("siti_coinvolti_M: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M));
        }
        if (siti_coinvolti_N != null) {
            joiner.add("siti_coinvolti_N: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N));
        }
        if (siti_coinvolti_T != null) {
            joiner.add("siti_coinvolti_T: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T));
        }
        if (specifica_tumori != null) {
            joiner.add("specifica_tumori: " + GraphQLRequestSerializer.getEntry(specifica_tumori));
        }
        if (stadio_tumore != null) {
            joiner.add("stadio_tumore: " + GraphQLRequestSerializer.getEntry(stadio_tumore));
        }
        if (stato_accertamento != null) {
            joiner.add("stato_accertamento: " + GraphQLRequestSerializer.getEntry(stato_accertamento));
        }
        if (tipo_imaging != null) {
            joiner.add("tipo_imaging: " + GraphQLRequestSerializer.getEntry(tipo_imaging));
        }
        if (warning_respond != null) {
            joiner.add("warning_respond: " + GraphQLRequestSerializer.getEntry(warning_respond));
        }
        if (classificazione_ICD10_ != null) {
            joiner.add("classificazione_ICD10_: " + GraphQLRequestSerializer.getEntry(classificazione_ICD10_));
        }
        if (patologia != null) {
            joiner.add("patologia: " + GraphQLRequestSerializer.getEntry(patologia));
        }
        if (Paziente_evento != null) {
            joiner.add("Paziente_evento: " + GraphQLRequestSerializer.getEntry(Paziente_evento));
        }
        if (c_dettaglio_ != null) {
            joiner.add("c_dettaglio_: " + GraphQLRequestSerializer.getEntry(c_dettaglio_));
        }
        return joiner.toString();
    }

    public static CliEventoDTO.Builder builder() {
        return new CliEventoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String IPI;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String aaIPI;
        private String altro;
        private Boolean anamnesi;
        private Integer c_dettaglio_id;
        private String codice_centro;
        private String data;
        private Boolean documentazione_necessaria;
        private String episodio;
        private Integer id_respond;
        private String metodo_diagnosi_tumore;
        private String nome_gruppo;
        private String nome_patologia;
        private String nome_tipo;
        private String object_title;
        private String paziente;
        private Integer paziente_o;
        private String performance_status;
        private String siti_coinvolti_M;
        private String siti_coinvolti_N;
        private String siti_coinvolti_T;
        private Boolean specifica_tumori;
        private String stadio_tumore;
        private String stato_accertamento;
        private String tipo_imaging;
        private Boolean warning_respond;
        private CliClassificazione_ICD10DTO classificazione_ICD10_;
        private CliPatologiaDTO patologia;
        private CliPazienteDTO Paziente_evento;
        private CliC_dettaglioDTO c_dettaglio_;

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
         * The attribute IPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
         */
        public Builder setIPI(String IPI) {
            this.IPI = IPI;
            return this;
        }

        /**
         * The attribute _createdby of Evento. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Evento. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Evento. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Evento. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Evento. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute aaIPI of Evento. It is of type String. Domain: 0 OR 1 OR 2 OR 3.}Max length: 255.
         */
        public Builder setAaIPI(String aaIPI) {
            this.aaIPI = aaIPI;
            return this;
        }

        /**
         * The attribute altro of Evento. It is of type Text.
         */
        public Builder setAltro(String altro) {
            this.altro = altro;
            return this;
        }

        /**
         * The attribute anamnesi of Evento. It is of type Boolean.
         */
        public Builder setAnamnesi(Boolean anamnesi) {
            this.anamnesi = anamnesi;
            return this;
        }

        /**
         * The attribute c_dettaglio_id of Evento. It is of type Int. Path: c_dettaglio_ __id. Cannot be null.
         */
        public Builder setC_dettaglio_id(Integer c_dettaglio_id) {
            this.c_dettaglio_id = c_dettaglio_id;
            return this;
        }

        /**
         * The attribute codice_centro of Evento. It is of type String. Path: Paziente_evento.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Evento. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute documentazione_necessaria of Evento. It is of type Boolean. Path: patologia documentazione.
         */
        public Builder setDocumentazione_necessaria(Boolean documentazione_necessaria) {
            this.documentazione_necessaria = documentazione_necessaria;
            return this;
        }

        /**
         * The attribute episodio of Evento. It is of type String. Max length: 255.
         */
        public Builder setEpisodio(String episodio) {
            this.episodio = episodio;
            return this;
        }

        /**
         * The attribute id_respond of Evento. It is of type Int. Path: Paziente_evento id_respond.
         */
        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        /**
         * The attribute metodo_diagnosi_tumore of Evento. It is of type String. Domain: Biopsia OR Imaging OR Biochimica.}Max length: 255.
         */
        public Builder setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
            this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
            return this;
        }

        /**
         * The attribute nome_gruppo of Evento. It is of type String. Path: patologia nome_gruppo. Cannot be null.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_patologia of Evento. It is of type String. Path: patologia nome. Cannot be null.
         */
        public Builder setNome_patologia(String nome_patologia) {
            this.nome_patologia = nome_patologia;
            return this;
        }

        /**
         * The attribute nome_tipo of Evento. It is of type String. Path: patologia nome_tipo. Cannot be null.
         */
        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        /**
         * The attribute object_title of Evento. It is of type String. Expression: 'concat("Patologia: ", data," (", nome_tipo, ")")'.Cannot be null.
         */
        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        /**
         * The attribute paziente of Evento. It is of type String. Path: Paziente_evento codice_interno. Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute paziente_o of Evento. It is of type Int. Path: o_Paziente_ __id. Cannot be null.
         */
        public Builder setPaziente_o(Integer paziente_o) {
            this.paziente_o = paziente_o;
            return this;
        }

        /**
         * The attribute performance_status of Evento. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5.}Max length: 255.
         */
        public Builder setPerformance_status(String performance_status) {
            this.performance_status = performance_status;
            return this;
        }

        /**
         * The attribute siti_coinvolti_M of Evento. It is of type String. Domain: M0 OR M1 OR MX.}Max length: 255.
         */
        public Builder setSiti_coinvolti_M(String siti_coinvolti_M) {
            this.siti_coinvolti_M = siti_coinvolti_M;
            return this;
        }

        /**
         * The attribute siti_coinvolti_N of Evento. It is of type String. Domain: N0 OR N1 OR N2 OR N3 OR NX OR Nis.}Max length: 255.
         */
        public Builder setSiti_coinvolti_N(String siti_coinvolti_N) {
            this.siti_coinvolti_N = siti_coinvolti_N;
            return this;
        }

        /**
         * The attribute siti_coinvolti_T of Evento. It is of type String. Domain: T0 OR T1 OR T2 OR T3 OR T4 OR Tis OR TX.}Max length: 255.
         */
        public Builder setSiti_coinvolti_T(String siti_coinvolti_T) {
            this.siti_coinvolti_T = siti_coinvolti_T;
            return this;
        }

        /**
         * The attribute specifica_tumori of Evento. It is of type Boolean. Path: patologia mostra_specifica_tumori.
         */
        public Builder setSpecifica_tumori(Boolean specifica_tumori) {
            this.specifica_tumori = specifica_tumori;
            return this;
        }

        /**
         * The attribute stadio_tumore of Evento. It is of type String. Domain: 0 OR I OR II OR III OR IV.}Max length: 255.
         */
        public Builder setStadio_tumore(String stadio_tumore) {
            this.stadio_tumore = stadio_tumore;
            return this;
        }

        /**
         * The attribute stato_accertamento of Evento. It is of type String. Domain: Accertato da autopsia OR Accertato OR Presuntivo OR Accertato da altra fonte.}Max length: 255.
         */
        public Builder setStato_accertamento(String stato_accertamento) {
            this.stato_accertamento = stato_accertamento;
            return this;
        }

        /**
         * The attribute tipo_imaging of Evento. It is of type String. Domain: CT OR RM.}Max length: 255.
         */
        public Builder setTipo_imaging(String tipo_imaging) {
            this.tipo_imaging = tipo_imaging;
            return this;
        }

        /**
         * The attribute warning_respond of Evento. It is of type Boolean. Path: patologia warning_respond.
         */
        public Builder setWarning_respond(Boolean warning_respond) {
            this.warning_respond = warning_respond;
            return this;
        }

        /**
         * The associated object for the role classificazione_ICD10_.
         */
        public Builder setClassificazione_ICD10_(CliClassificazione_ICD10DTO classificazione_ICD10_) {
            this.classificazione_ICD10_ = classificazione_ICD10_;
            return this;
        }

        /**
         * The associated object for the role patologia.
         */
        public Builder setPatologia(CliPatologiaDTO patologia) {
            this.patologia = patologia;
            return this;
        }

        /**
         * The associated object for the role Paziente_evento.
         */
        public Builder setPaziente_evento(CliPazienteDTO Paziente_evento) {
            this.Paziente_evento = Paziente_evento;
            return this;
        }

        /**
         * The associated object for the role c_dettaglio_.
         */
        public Builder setC_dettaglio_(CliC_dettaglioDTO c_dettaglio_) {
            this.c_dettaglio_ = c_dettaglio_;
            return this;
        }


        public CliEventoDTO build() {
            CliEventoDTO result = new CliEventoDTO();
            result.set_clientId(this._clientId);
            result.setIPI(this.IPI);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAaIPI(this.aaIPI);
            result.setAltro(this.altro);
            result.setAnamnesi(this.anamnesi);
            result.setC_dettaglio_id(this.c_dettaglio_id);
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setDocumentazione_necessaria(this.documentazione_necessaria);
            result.setEpisodio(this.episodio);
            result.setId_respond(this.id_respond);
            result.setMetodo_diagnosi_tumore(this.metodo_diagnosi_tumore);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_patologia(this.nome_patologia);
            result.setNome_tipo(this.nome_tipo);
            result.setObject_title(this.object_title);
            result.setPaziente(this.paziente);
            result.setPaziente_o(this.paziente_o);
            result.setPerformance_status(this.performance_status);
            result.setSiti_coinvolti_M(this.siti_coinvolti_M);
            result.setSiti_coinvolti_N(this.siti_coinvolti_N);
            result.setSiti_coinvolti_T(this.siti_coinvolti_T);
            result.setSpecifica_tumori(this.specifica_tumori);
            result.setStadio_tumore(this.stadio_tumore);
            result.setStato_accertamento(this.stato_accertamento);
            result.setTipo_imaging(this.tipo_imaging);
            result.setWarning_respond(this.warning_respond);
            result.setClassificazione_ICD10_(this.classificazione_ICD10_);
            result.setPatologia(this.patologia);
            result.setPaziente_evento(this.Paziente_evento);
            result.setC_dettaglio_(this.c_dettaglio_);
            return result;
        }

    }
}
