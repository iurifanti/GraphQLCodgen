package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Farmaco_ATC, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliFarmaco_ATCDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean antitumorale;
    private String codice;
    private String ddd;
    private String ddd_kind;
    private String ddd_note;
    private String ddd_um;
    private Boolean epatico;
    private Boolean hiv;
    private Integer livello;
    private Boolean long_acting;
    private String nome;
    private Boolean non_arv;
    private Boolean prep;
    private String titolo;
    private CliClassificazione_farmaco_ATCDTO classificazione_farmaco_ATC_;

    public CliFarmaco_ATCDTO() {
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
     * The attribute _id of Farmaco_ATC. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Farmaco_ATC. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute antitumorale of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getAntitumorale() {
        return antitumorale;
    }
    /**
     * The attribute antitumorale of Farmaco_ATC. It is of type Boolean.
     */
    public void setAntitumorale(Boolean antitumorale) {
        this.antitumorale = antitumorale;
    }

    /**
     * The attribute codice of Farmaco_ATC. It is of type String. Domain: .}Max length: 7.Cannot be null.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Farmaco_ATC. It is of type String. Domain: .}Max length: 7.Cannot be null.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute ddd of Farmaco_ATC. It is of type Real @realFormat.
     */
    public String getDdd() {
        return ddd;
    }
    /**
     * The attribute ddd of Farmaco_ATC. It is of type Real @realFormat.
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * The attribute ddd_kind of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public String getDdd_kind() {
        return ddd_kind;
    }
    /**
     * The attribute ddd_kind of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public void setDdd_kind(String ddd_kind) {
        this.ddd_kind = ddd_kind;
    }

    /**
     * The attribute ddd_note of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public String getDdd_note() {
        return ddd_note;
    }
    /**
     * The attribute ddd_note of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public void setDdd_note(String ddd_note) {
        this.ddd_note = ddd_note;
    }

    /**
     * The attribute ddd_um of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public String getDdd_um() {
        return ddd_um;
    }
    /**
     * The attribute ddd_um of Farmaco_ATC. It is of type String. Max length: 255.
     */
    public void setDdd_um(String ddd_um) {
        this.ddd_um = ddd_um;
    }

    /**
     * The attribute epatico of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getEpatico() {
        return epatico;
    }
    /**
     * The attribute epatico of Farmaco_ATC. It is of type Boolean.
     */
    public void setEpatico(Boolean epatico) {
        this.epatico = epatico;
    }

    /**
     * The attribute hiv of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getHiv() {
        return hiv;
    }
    /**
     * The attribute hiv of Farmaco_ATC. It is of type Boolean.
     */
    public void setHiv(Boolean hiv) {
        this.hiv = hiv;
    }

    /**
     * The attribute livello of Farmaco_ATC. It is of type Int.
     */
    public Integer getLivello() {
        return livello;
    }
    /**
     * The attribute livello of Farmaco_ATC. It is of type Int.
     */
    public void setLivello(Integer livello) {
        this.livello = livello;
    }

    /**
     * The attribute long_acting of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getLong_acting() {
        return long_acting;
    }
    /**
     * The attribute long_acting of Farmaco_ATC. It is of type Boolean.
     */
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    /**
     * The attribute nome of Farmaco_ATC. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Farmaco_ATC. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute non_arv of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getNon_arv() {
        return non_arv;
    }
    /**
     * The attribute non_arv of Farmaco_ATC. It is of type Boolean.
     */
    public void setNon_arv(Boolean non_arv) {
        this.non_arv = non_arv;
    }

    /**
     * The attribute prep of Farmaco_ATC. It is of type Boolean.
     */
    public Boolean getPrep() {
        return prep;
    }
    /**
     * The attribute prep of Farmaco_ATC. It is of type Boolean.
     */
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    /**
     * The attribute titolo of Farmaco_ATC. It is of type String. Expression: 'concat(codice,": ",nome, if(isNull(ddd_kind),"",concat(" (",ddd_kind,")")))'.
     */
    public String getTitolo() {
        return titolo;
    }
    /**
     * The attribute titolo of Farmaco_ATC. It is of type String. Expression: 'concat(codice,": ",nome, if(isNull(ddd_kind),"",concat(" (",ddd_kind,")")))'.
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * The associated object for the role classificazione_farmaco_ATC_.
     */
    public CliClassificazione_farmaco_ATCDTO getClassificazione_farmaco_ATC_() {
        return classificazione_farmaco_ATC_;
    }
    /**
     * The associated object for the role classificazione_farmaco_ATC_.
     */
    public void setClassificazione_farmaco_ATC_(CliClassificazione_farmaco_ATCDTO classificazione_farmaco_ATC_) {
        this.classificazione_farmaco_ATC_ = classificazione_farmaco_ATC_;
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
        if (antitumorale != null) {
            joiner.add("antitumorale: " + GraphQLRequestSerializer.getEntry(antitumorale));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (ddd != null) {
            joiner.add("ddd: " + GraphQLRequestSerializer.getEntry(ddd));
        }
        if (ddd_kind != null) {
            joiner.add("ddd_kind: " + GraphQLRequestSerializer.getEntry(ddd_kind));
        }
        if (ddd_note != null) {
            joiner.add("ddd_note: " + GraphQLRequestSerializer.getEntry(ddd_note));
        }
        if (ddd_um != null) {
            joiner.add("ddd_um: " + GraphQLRequestSerializer.getEntry(ddd_um));
        }
        if (epatico != null) {
            joiner.add("epatico: " + GraphQLRequestSerializer.getEntry(epatico));
        }
        if (hiv != null) {
            joiner.add("hiv: " + GraphQLRequestSerializer.getEntry(hiv));
        }
        if (livello != null) {
            joiner.add("livello: " + GraphQLRequestSerializer.getEntry(livello));
        }
        if (long_acting != null) {
            joiner.add("long_acting: " + GraphQLRequestSerializer.getEntry(long_acting));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (non_arv != null) {
            joiner.add("non_arv: " + GraphQLRequestSerializer.getEntry(non_arv));
        }
        if (prep != null) {
            joiner.add("prep: " + GraphQLRequestSerializer.getEntry(prep));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        if (classificazione_farmaco_ATC_ != null) {
            joiner.add("classificazione_farmaco_ATC_: " + GraphQLRequestSerializer.getEntry(classificazione_farmaco_ATC_));
        }
        return joiner.toString();
    }

    public static CliFarmaco_ATCDTO.Builder builder() {
        return new CliFarmaco_ATCDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean antitumorale;
        private String codice;
        private String ddd;
        private String ddd_kind;
        private String ddd_note;
        private String ddd_um;
        private Boolean epatico;
        private Boolean hiv;
        private Integer livello;
        private Boolean long_acting;
        private String nome;
        private Boolean non_arv;
        private Boolean prep;
        private String titolo;
        private CliClassificazione_farmaco_ATCDTO classificazione_farmaco_ATC_;

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
         * The attribute _id of Farmaco_ATC. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute antitumorale of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setAntitumorale(Boolean antitumorale) {
            this.antitumorale = antitumorale;
            return this;
        }

        /**
         * The attribute codice of Farmaco_ATC. It is of type String. Domain: .}Max length: 7.Cannot be null.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute ddd of Farmaco_ATC. It is of type Real @realFormat.
         */
        public Builder setDdd(String ddd) {
            this.ddd = ddd;
            return this;
        }

        /**
         * The attribute ddd_kind of Farmaco_ATC. It is of type String. Max length: 255.
         */
        public Builder setDdd_kind(String ddd_kind) {
            this.ddd_kind = ddd_kind;
            return this;
        }

        /**
         * The attribute ddd_note of Farmaco_ATC. It is of type String. Max length: 255.
         */
        public Builder setDdd_note(String ddd_note) {
            this.ddd_note = ddd_note;
            return this;
        }

        /**
         * The attribute ddd_um of Farmaco_ATC. It is of type String. Max length: 255.
         */
        public Builder setDdd_um(String ddd_um) {
            this.ddd_um = ddd_um;
            return this;
        }

        /**
         * The attribute epatico of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setEpatico(Boolean epatico) {
            this.epatico = epatico;
            return this;
        }

        /**
         * The attribute hiv of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setHiv(Boolean hiv) {
            this.hiv = hiv;
            return this;
        }

        /**
         * The attribute livello of Farmaco_ATC. It is of type Int.
         */
        public Builder setLivello(Integer livello) {
            this.livello = livello;
            return this;
        }

        /**
         * The attribute long_acting of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        /**
         * The attribute nome of Farmaco_ATC. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute non_arv of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setNon_arv(Boolean non_arv) {
            this.non_arv = non_arv;
            return this;
        }

        /**
         * The attribute prep of Farmaco_ATC. It is of type Boolean.
         */
        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        /**
         * The attribute titolo of Farmaco_ATC. It is of type String. Expression: 'concat(codice,": ",nome, if(isNull(ddd_kind),"",concat(" (",ddd_kind,")")))'.
         */
        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }

        /**
         * The associated object for the role classificazione_farmaco_ATC_.
         */
        public Builder setClassificazione_farmaco_ATC_(CliClassificazione_farmaco_ATCDTO classificazione_farmaco_ATC_) {
            this.classificazione_farmaco_ATC_ = classificazione_farmaco_ATC_;
            return this;
        }


        public CliFarmaco_ATCDTO build() {
            CliFarmaco_ATCDTO result = new CliFarmaco_ATCDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAntitumorale(this.antitumorale);
            result.setCodice(this.codice);
            result.setDdd(this.ddd);
            result.setDdd_kind(this.ddd_kind);
            result.setDdd_note(this.ddd_note);
            result.setDdd_um(this.ddd_um);
            result.setEpatico(this.epatico);
            result.setHiv(this.hiv);
            result.setLivello(this.livello);
            result.setLong_acting(this.long_acting);
            result.setNome(this.nome);
            result.setNon_arv(this.non_arv);
            result.setPrep(this.prep);
            result.setTitolo(this.titolo);
            result.setClassificazione_farmaco_ATC_(this.classificazione_farmaco_ATC_);
            return result;
        }

    }
}
