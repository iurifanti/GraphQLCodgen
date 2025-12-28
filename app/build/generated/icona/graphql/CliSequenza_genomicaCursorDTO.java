package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Sequenza_genomica.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliSequenza_genomicaCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altra_metodica;
    private String altro_centro;
    private String codice_centro;
    private String codice_paziente;
    private String data_analisi;
    private String data_prelievo;
    private String effettuato_su;
    private String elenco_mutazioni_ENV;
    private String elenco_mutazioni_INT;
    private String elenco_mutazioni_PR;
    private String elenco_mutazioni_RT;
    private String elenco_mutazioni_V3;
    private String etichetta;
    private String filtro_codice_paziente;
    private Integer mutazioni;
    private String mutazioni_no_farmaco;
    private Boolean nessuna_mutazione_ENV;
    private Boolean nessuna_mutazione_INT;
    private Boolean nessuna_mutazione_PR;
    private Boolean nessuna_mutazione_RT;
    private Boolean nessuna_mutazione_V3;
    private String nucleotidi;
    private String regione;
    private String sottotipo;
    private String tipo_sequenza;

    public CliSequenza_genomicaCursorDTO() {
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

    public String getAltra_metodica() {
        return altra_metodica;
    }
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    public String getAltro_centro() {
        return altro_centro;
    }
    public void setAltro_centro(String altro_centro) {
        this.altro_centro = altro_centro;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getCodice_paziente() {
        return codice_paziente;
    }
    public void setCodice_paziente(String codice_paziente) {
        this.codice_paziente = codice_paziente;
    }

    public String getData_analisi() {
        return data_analisi;
    }
    public void setData_analisi(String data_analisi) {
        this.data_analisi = data_analisi;
    }

    public String getData_prelievo() {
        return data_prelievo;
    }
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    public String getEffettuato_su() {
        return effettuato_su;
    }
    public void setEffettuato_su(String effettuato_su) {
        this.effettuato_su = effettuato_su;
    }

    public String getElenco_mutazioni_ENV() {
        return elenco_mutazioni_ENV;
    }
    public void setElenco_mutazioni_ENV(String elenco_mutazioni_ENV) {
        this.elenco_mutazioni_ENV = elenco_mutazioni_ENV;
    }

    public String getElenco_mutazioni_INT() {
        return elenco_mutazioni_INT;
    }
    public void setElenco_mutazioni_INT(String elenco_mutazioni_INT) {
        this.elenco_mutazioni_INT = elenco_mutazioni_INT;
    }

    public String getElenco_mutazioni_PR() {
        return elenco_mutazioni_PR;
    }
    public void setElenco_mutazioni_PR(String elenco_mutazioni_PR) {
        this.elenco_mutazioni_PR = elenco_mutazioni_PR;
    }

    public String getElenco_mutazioni_RT() {
        return elenco_mutazioni_RT;
    }
    public void setElenco_mutazioni_RT(String elenco_mutazioni_RT) {
        this.elenco_mutazioni_RT = elenco_mutazioni_RT;
    }

    public String getElenco_mutazioni_V3() {
        return elenco_mutazioni_V3;
    }
    public void setElenco_mutazioni_V3(String elenco_mutazioni_V3) {
        this.elenco_mutazioni_V3 = elenco_mutazioni_V3;
    }

    public String getEtichetta() {
        return etichetta;
    }
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }

    public String getFiltro_codice_paziente() {
        return filtro_codice_paziente;
    }
    public void setFiltro_codice_paziente(String filtro_codice_paziente) {
        this.filtro_codice_paziente = filtro_codice_paziente;
    }

    public Integer getMutazioni() {
        return mutazioni;
    }
    public void setMutazioni(Integer mutazioni) {
        this.mutazioni = mutazioni;
    }

    public String getMutazioni_no_farmaco() {
        return mutazioni_no_farmaco;
    }
    public void setMutazioni_no_farmaco(String mutazioni_no_farmaco) {
        this.mutazioni_no_farmaco = mutazioni_no_farmaco;
    }

    public Boolean getNessuna_mutazione_ENV() {
        return nessuna_mutazione_ENV;
    }
    public void setNessuna_mutazione_ENV(Boolean nessuna_mutazione_ENV) {
        this.nessuna_mutazione_ENV = nessuna_mutazione_ENV;
    }

    public Boolean getNessuna_mutazione_INT() {
        return nessuna_mutazione_INT;
    }
    public void setNessuna_mutazione_INT(Boolean nessuna_mutazione_INT) {
        this.nessuna_mutazione_INT = nessuna_mutazione_INT;
    }

    public Boolean getNessuna_mutazione_PR() {
        return nessuna_mutazione_PR;
    }
    public void setNessuna_mutazione_PR(Boolean nessuna_mutazione_PR) {
        this.nessuna_mutazione_PR = nessuna_mutazione_PR;
    }

    public Boolean getNessuna_mutazione_RT() {
        return nessuna_mutazione_RT;
    }
    public void setNessuna_mutazione_RT(Boolean nessuna_mutazione_RT) {
        this.nessuna_mutazione_RT = nessuna_mutazione_RT;
    }

    public Boolean getNessuna_mutazione_V3() {
        return nessuna_mutazione_V3;
    }
    public void setNessuna_mutazione_V3(Boolean nessuna_mutazione_V3) {
        this.nessuna_mutazione_V3 = nessuna_mutazione_V3;
    }

    public String getNucleotidi() {
        return nucleotidi;
    }
    public void setNucleotidi(String nucleotidi) {
        this.nucleotidi = nucleotidi;
    }

    public String getRegione() {
        return regione;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getSottotipo() {
        return sottotipo;
    }
    public void setSottotipo(String sottotipo) {
        this.sottotipo = sottotipo;
    }

    public String getTipo_sequenza() {
        return tipo_sequenza;
    }
    public void setTipo_sequenza(String tipo_sequenza) {
        this.tipo_sequenza = tipo_sequenza;
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
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altro_centro != null) {
            joiner.add("altro_centro: " + GraphQLRequestSerializer.getEntry(altro_centro));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (codice_paziente != null) {
            joiner.add("codice_paziente: " + GraphQLRequestSerializer.getEntry(codice_paziente));
        }
        if (data_analisi != null) {
            joiner.add("data_analisi: " + GraphQLRequestSerializer.getEntry(data_analisi));
        }
        if (data_prelievo != null) {
            joiner.add("data_prelievo: " + GraphQLRequestSerializer.getEntry(data_prelievo));
        }
        if (effettuato_su != null) {
            joiner.add("effettuato_su: " + GraphQLRequestSerializer.getEntry(effettuato_su));
        }
        if (elenco_mutazioni_ENV != null) {
            joiner.add("elenco_mutazioni_ENV: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV));
        }
        if (elenco_mutazioni_INT != null) {
            joiner.add("elenco_mutazioni_INT: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT));
        }
        if (elenco_mutazioni_PR != null) {
            joiner.add("elenco_mutazioni_PR: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR));
        }
        if (elenco_mutazioni_RT != null) {
            joiner.add("elenco_mutazioni_RT: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT));
        }
        if (elenco_mutazioni_V3 != null) {
            joiner.add("elenco_mutazioni_V3: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3));
        }
        if (etichetta != null) {
            joiner.add("etichetta: " + GraphQLRequestSerializer.getEntry(etichetta));
        }
        if (filtro_codice_paziente != null) {
            joiner.add("filtro_codice_paziente: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente));
        }
        if (mutazioni != null) {
            joiner.add("mutazioni: " + GraphQLRequestSerializer.getEntry(mutazioni));
        }
        if (mutazioni_no_farmaco != null) {
            joiner.add("mutazioni_no_farmaco: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco));
        }
        if (nessuna_mutazione_ENV != null) {
            joiner.add("nessuna_mutazione_ENV: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV));
        }
        if (nessuna_mutazione_INT != null) {
            joiner.add("nessuna_mutazione_INT: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT));
        }
        if (nessuna_mutazione_PR != null) {
            joiner.add("nessuna_mutazione_PR: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR));
        }
        if (nessuna_mutazione_RT != null) {
            joiner.add("nessuna_mutazione_RT: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT));
        }
        if (nessuna_mutazione_V3 != null) {
            joiner.add("nessuna_mutazione_V3: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3));
        }
        if (nucleotidi != null) {
            joiner.add("nucleotidi: " + GraphQLRequestSerializer.getEntry(nucleotidi));
        }
        if (regione != null) {
            joiner.add("regione: " + GraphQLRequestSerializer.getEntry(regione));
        }
        if (sottotipo != null) {
            joiner.add("sottotipo: " + GraphQLRequestSerializer.getEntry(sottotipo));
        }
        if (tipo_sequenza != null) {
            joiner.add("tipo_sequenza: " + GraphQLRequestSerializer.getEntry(tipo_sequenza));
        }
        return joiner.toString();
    }

    public static CliSequenza_genomicaCursorDTO.Builder builder() {
        return new CliSequenza_genomicaCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String altra_metodica;
        private String altro_centro;
        private String codice_centro;
        private String codice_paziente;
        private String data_analisi;
        private String data_prelievo;
        private String effettuato_su;
        private String elenco_mutazioni_ENV;
        private String elenco_mutazioni_INT;
        private String elenco_mutazioni_PR;
        private String elenco_mutazioni_RT;
        private String elenco_mutazioni_V3;
        private String etichetta;
        private String filtro_codice_paziente;
        private Integer mutazioni;
        private String mutazioni_no_farmaco;
        private Boolean nessuna_mutazione_ENV;
        private Boolean nessuna_mutazione_INT;
        private Boolean nessuna_mutazione_PR;
        private Boolean nessuna_mutazione_RT;
        private Boolean nessuna_mutazione_V3;
        private String nucleotidi;
        private String regione;
        private String sottotipo;
        private String tipo_sequenza;

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

        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        public Builder setAltro_centro(String altro_centro) {
            this.altro_centro = altro_centro;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setCodice_paziente(String codice_paziente) {
            this.codice_paziente = codice_paziente;
            return this;
        }

        public Builder setData_analisi(String data_analisi) {
            this.data_analisi = data_analisi;
            return this;
        }

        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        public Builder setEffettuato_su(String effettuato_su) {
            this.effettuato_su = effettuato_su;
            return this;
        }

        public Builder setElenco_mutazioni_ENV(String elenco_mutazioni_ENV) {
            this.elenco_mutazioni_ENV = elenco_mutazioni_ENV;
            return this;
        }

        public Builder setElenco_mutazioni_INT(String elenco_mutazioni_INT) {
            this.elenco_mutazioni_INT = elenco_mutazioni_INT;
            return this;
        }

        public Builder setElenco_mutazioni_PR(String elenco_mutazioni_PR) {
            this.elenco_mutazioni_PR = elenco_mutazioni_PR;
            return this;
        }

        public Builder setElenco_mutazioni_RT(String elenco_mutazioni_RT) {
            this.elenco_mutazioni_RT = elenco_mutazioni_RT;
            return this;
        }

        public Builder setElenco_mutazioni_V3(String elenco_mutazioni_V3) {
            this.elenco_mutazioni_V3 = elenco_mutazioni_V3;
            return this;
        }

        public Builder setEtichetta(String etichetta) {
            this.etichetta = etichetta;
            return this;
        }

        public Builder setFiltro_codice_paziente(String filtro_codice_paziente) {
            this.filtro_codice_paziente = filtro_codice_paziente;
            return this;
        }

        public Builder setMutazioni(Integer mutazioni) {
            this.mutazioni = mutazioni;
            return this;
        }

        public Builder setMutazioni_no_farmaco(String mutazioni_no_farmaco) {
            this.mutazioni_no_farmaco = mutazioni_no_farmaco;
            return this;
        }

        public Builder setNessuna_mutazione_ENV(Boolean nessuna_mutazione_ENV) {
            this.nessuna_mutazione_ENV = nessuna_mutazione_ENV;
            return this;
        }

        public Builder setNessuna_mutazione_INT(Boolean nessuna_mutazione_INT) {
            this.nessuna_mutazione_INT = nessuna_mutazione_INT;
            return this;
        }

        public Builder setNessuna_mutazione_PR(Boolean nessuna_mutazione_PR) {
            this.nessuna_mutazione_PR = nessuna_mutazione_PR;
            return this;
        }

        public Builder setNessuna_mutazione_RT(Boolean nessuna_mutazione_RT) {
            this.nessuna_mutazione_RT = nessuna_mutazione_RT;
            return this;
        }

        public Builder setNessuna_mutazione_V3(Boolean nessuna_mutazione_V3) {
            this.nessuna_mutazione_V3 = nessuna_mutazione_V3;
            return this;
        }

        public Builder setNucleotidi(String nucleotidi) {
            this.nucleotidi = nucleotidi;
            return this;
        }

        public Builder setRegione(String regione) {
            this.regione = regione;
            return this;
        }

        public Builder setSottotipo(String sottotipo) {
            this.sottotipo = sottotipo;
            return this;
        }

        public Builder setTipo_sequenza(String tipo_sequenza) {
            this.tipo_sequenza = tipo_sequenza;
            return this;
        }


        public CliSequenza_genomicaCursorDTO build() {
            CliSequenza_genomicaCursorDTO result = new CliSequenza_genomicaCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltro_centro(this.altro_centro);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_paziente(this.codice_paziente);
            result.setData_analisi(this.data_analisi);
            result.setData_prelievo(this.data_prelievo);
            result.setEffettuato_su(this.effettuato_su);
            result.setElenco_mutazioni_ENV(this.elenco_mutazioni_ENV);
            result.setElenco_mutazioni_INT(this.elenco_mutazioni_INT);
            result.setElenco_mutazioni_PR(this.elenco_mutazioni_PR);
            result.setElenco_mutazioni_RT(this.elenco_mutazioni_RT);
            result.setElenco_mutazioni_V3(this.elenco_mutazioni_V3);
            result.setEtichetta(this.etichetta);
            result.setFiltro_codice_paziente(this.filtro_codice_paziente);
            result.setMutazioni(this.mutazioni);
            result.setMutazioni_no_farmaco(this.mutazioni_no_farmaco);
            result.setNessuna_mutazione_ENV(this.nessuna_mutazione_ENV);
            result.setNessuna_mutazione_INT(this.nessuna_mutazione_INT);
            result.setNessuna_mutazione_PR(this.nessuna_mutazione_PR);
            result.setNessuna_mutazione_RT(this.nessuna_mutazione_RT);
            result.setNessuna_mutazione_V3(this.nessuna_mutazione_V3);
            result.setNucleotidi(this.nucleotidi);
            result.setRegione(this.regione);
            result.setSottotipo(this.sottotipo);
            result.setTipo_sequenza(this.tipo_sequenza);
            return result;
        }

    }
}
