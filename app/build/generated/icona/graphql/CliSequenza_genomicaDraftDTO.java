package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Sequenza_genomica.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSequenza_genomicaDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private String altra_metodica;
    private String altro_centro;
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
    private String centro_sequenziatore;
    private String metodica_genotipo;
    private CliMutazioneDraftRoleObjectsDTO mutazione;
    private String paziente;

    public CliSequenza_genomicaDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getCentro_sequenziatore() {
        return centro_sequenziatore;
    }
    public void setCentro_sequenziatore(String centro_sequenziatore) {
        this.centro_sequenziatore = centro_sequenziatore;
    }

    public String getMetodica_genotipo() {
        return metodica_genotipo;
    }
    public void setMetodica_genotipo(String metodica_genotipo) {
        this.metodica_genotipo = metodica_genotipo;
    }

    public CliMutazioneDraftRoleObjectsDTO getMutazione() {
        return mutazione;
    }
    public void setMutazione(CliMutazioneDraftRoleObjectsDTO mutazione) {
        this.mutazione = mutazione;
    }

    public String getPaziente() {
        return paziente;
    }
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altro_centro != null) {
            joiner.add("altro_centro: " + GraphQLRequestSerializer.getEntry(altro_centro));
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
        if (centro_sequenziatore != null) {
            joiner.add("centro_sequenziatore: " + GraphQLRequestSerializer.getEntry(centro_sequenziatore));
        }
        if (metodica_genotipo != null) {
            joiner.add("metodica_genotipo: " + GraphQLRequestSerializer.getEntry(metodica_genotipo));
        }
        if (mutazione != null) {
            joiner.add("mutazione: " + GraphQLRequestSerializer.getEntry(mutazione));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        return joiner.toString();
    }

    public static CliSequenza_genomicaDraftDTO.Builder builder() {
        return new CliSequenza_genomicaDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private String altra_metodica;
        private String altro_centro;
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
        private String centro_sequenziatore;
        private String metodica_genotipo;
        private CliMutazioneDraftRoleObjectsDTO mutazione;
        private String paziente;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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

        public Builder setCentro_sequenziatore(String centro_sequenziatore) {
            this.centro_sequenziatore = centro_sequenziatore;
            return this;
        }

        public Builder setMetodica_genotipo(String metodica_genotipo) {
            this.metodica_genotipo = metodica_genotipo;
            return this;
        }

        public Builder setMutazione(CliMutazioneDraftRoleObjectsDTO mutazione) {
            this.mutazione = mutazione;
            return this;
        }

        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }


        public CliSequenza_genomicaDraftDTO build() {
            CliSequenza_genomicaDraftDTO result = new CliSequenza_genomicaDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltro_centro(this.altro_centro);
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
            result.setCentro_sequenziatore(this.centro_sequenziatore);
            result.setMetodica_genotipo(this.metodica_genotipo);
            result.setMutazione(this.mutazione);
            result.setPaziente(this.paziente);
            return result;
        }

    }
}
