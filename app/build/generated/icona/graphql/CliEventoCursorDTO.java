package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Evento.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEventoCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliEventoCursorDTO() {
    }


    public String getIPI() {
        return IPI;
    }
    public void setIPI(String IPI) {
        this.IPI = IPI;
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

    public String getAaIPI() {
        return aaIPI;
    }
    public void setAaIPI(String aaIPI) {
        this.aaIPI = aaIPI;
    }

    public String getAltro() {
        return altro;
    }
    public void setAltro(String altro) {
        this.altro = altro;
    }

    public Boolean getAnamnesi() {
        return anamnesi;
    }
    public void setAnamnesi(Boolean anamnesi) {
        this.anamnesi = anamnesi;
    }

    public Integer getC_dettaglio_id() {
        return c_dettaglio_id;
    }
    public void setC_dettaglio_id(Integer c_dettaglio_id) {
        this.c_dettaglio_id = c_dettaglio_id;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Boolean getDocumentazione_necessaria() {
        return documentazione_necessaria;
    }
    public void setDocumentazione_necessaria(Boolean documentazione_necessaria) {
        this.documentazione_necessaria = documentazione_necessaria;
    }

    public String getEpisodio() {
        return episodio;
    }
    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public Integer getId_respond() {
        return id_respond;
    }
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    public String getMetodo_diagnosi_tumore() {
        return metodo_diagnosi_tumore;
    }
    public void setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
        this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
    }

    public String getNome_gruppo() {
        return nome_gruppo;
    }
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    public String getNome_patologia() {
        return nome_patologia;
    }
    public void setNome_patologia(String nome_patologia) {
        this.nome_patologia = nome_patologia;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public String getObject_title() {
        return object_title;
    }
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    public String getPaziente() {
        return paziente;
    }
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    public Integer getPaziente_o() {
        return paziente_o;
    }
    public void setPaziente_o(Integer paziente_o) {
        this.paziente_o = paziente_o;
    }

    public String getPerformance_status() {
        return performance_status;
    }
    public void setPerformance_status(String performance_status) {
        this.performance_status = performance_status;
    }

    public String getSiti_coinvolti_M() {
        return siti_coinvolti_M;
    }
    public void setSiti_coinvolti_M(String siti_coinvolti_M) {
        this.siti_coinvolti_M = siti_coinvolti_M;
    }

    public String getSiti_coinvolti_N() {
        return siti_coinvolti_N;
    }
    public void setSiti_coinvolti_N(String siti_coinvolti_N) {
        this.siti_coinvolti_N = siti_coinvolti_N;
    }

    public String getSiti_coinvolti_T() {
        return siti_coinvolti_T;
    }
    public void setSiti_coinvolti_T(String siti_coinvolti_T) {
        this.siti_coinvolti_T = siti_coinvolti_T;
    }

    public Boolean getSpecifica_tumori() {
        return specifica_tumori;
    }
    public void setSpecifica_tumori(Boolean specifica_tumori) {
        this.specifica_tumori = specifica_tumori;
    }

    public String getStadio_tumore() {
        return stadio_tumore;
    }
    public void setStadio_tumore(String stadio_tumore) {
        this.stadio_tumore = stadio_tumore;
    }

    public String getStato_accertamento() {
        return stato_accertamento;
    }
    public void setStato_accertamento(String stato_accertamento) {
        this.stato_accertamento = stato_accertamento;
    }

    public String getTipo_imaging() {
        return tipo_imaging;
    }
    public void setTipo_imaging(String tipo_imaging) {
        this.tipo_imaging = tipo_imaging;
    }

    public Boolean getWarning_respond() {
        return warning_respond;
    }
    public void setWarning_respond(Boolean warning_respond) {
        this.warning_respond = warning_respond;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliEventoCursorDTO.Builder builder() {
        return new CliEventoCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder setIPI(String IPI) {
            this.IPI = IPI;
            return this;
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

        public Builder setAaIPI(String aaIPI) {
            this.aaIPI = aaIPI;
            return this;
        }

        public Builder setAltro(String altro) {
            this.altro = altro;
            return this;
        }

        public Builder setAnamnesi(Boolean anamnesi) {
            this.anamnesi = anamnesi;
            return this;
        }

        public Builder setC_dettaglio_id(Integer c_dettaglio_id) {
            this.c_dettaglio_id = c_dettaglio_id;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setDocumentazione_necessaria(Boolean documentazione_necessaria) {
            this.documentazione_necessaria = documentazione_necessaria;
            return this;
        }

        public Builder setEpisodio(String episodio) {
            this.episodio = episodio;
            return this;
        }

        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
            this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
            return this;
        }

        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        public Builder setNome_patologia(String nome_patologia) {
            this.nome_patologia = nome_patologia;
            return this;
        }

        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        public Builder setPaziente_o(Integer paziente_o) {
            this.paziente_o = paziente_o;
            return this;
        }

        public Builder setPerformance_status(String performance_status) {
            this.performance_status = performance_status;
            return this;
        }

        public Builder setSiti_coinvolti_M(String siti_coinvolti_M) {
            this.siti_coinvolti_M = siti_coinvolti_M;
            return this;
        }

        public Builder setSiti_coinvolti_N(String siti_coinvolti_N) {
            this.siti_coinvolti_N = siti_coinvolti_N;
            return this;
        }

        public Builder setSiti_coinvolti_T(String siti_coinvolti_T) {
            this.siti_coinvolti_T = siti_coinvolti_T;
            return this;
        }

        public Builder setSpecifica_tumori(Boolean specifica_tumori) {
            this.specifica_tumori = specifica_tumori;
            return this;
        }

        public Builder setStadio_tumore(String stadio_tumore) {
            this.stadio_tumore = stadio_tumore;
            return this;
        }

        public Builder setStato_accertamento(String stato_accertamento) {
            this.stato_accertamento = stato_accertamento;
            return this;
        }

        public Builder setTipo_imaging(String tipo_imaging) {
            this.tipo_imaging = tipo_imaging;
            return this;
        }

        public Builder setWarning_respond(Boolean warning_respond) {
            this.warning_respond = warning_respond;
            return this;
        }


        public CliEventoCursorDTO build() {
            CliEventoCursorDTO result = new CliEventoCursorDTO();
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
            return result;
        }

    }
}
