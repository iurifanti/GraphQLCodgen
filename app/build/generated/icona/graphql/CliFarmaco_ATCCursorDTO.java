package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Farmaco_ATC.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_ATCCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliFarmaco_ATCCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAntitumorale() {
        return antitumorale;
    }
    public void setAntitumorale(Boolean antitumorale) {
        this.antitumorale = antitumorale;
    }

    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdd_kind() {
        return ddd_kind;
    }
    public void setDdd_kind(String ddd_kind) {
        this.ddd_kind = ddd_kind;
    }

    public String getDdd_note() {
        return ddd_note;
    }
    public void setDdd_note(String ddd_note) {
        this.ddd_note = ddd_note;
    }

    public String getDdd_um() {
        return ddd_um;
    }
    public void setDdd_um(String ddd_um) {
        this.ddd_um = ddd_um;
    }

    public Boolean getEpatico() {
        return epatico;
    }
    public void setEpatico(Boolean epatico) {
        this.epatico = epatico;
    }

    public Boolean getHiv() {
        return hiv;
    }
    public void setHiv(Boolean hiv) {
        this.hiv = hiv;
    }

    public Integer getLivello() {
        return livello;
    }
    public void setLivello(Integer livello) {
        this.livello = livello;
    }

    public Boolean getLong_acting() {
        return long_acting;
    }
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getNon_arv() {
        return non_arv;
    }
    public void setNon_arv(Boolean non_arv) {
        this.non_arv = non_arv;
    }

    public Boolean getPrep() {
        return prep;
    }
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliFarmaco_ATCCursorDTO.Builder builder() {
        return new CliFarmaco_ATCCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAntitumorale(Boolean antitumorale) {
            this.antitumorale = antitumorale;
            return this;
        }

        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        public Builder setDdd(String ddd) {
            this.ddd = ddd;
            return this;
        }

        public Builder setDdd_kind(String ddd_kind) {
            this.ddd_kind = ddd_kind;
            return this;
        }

        public Builder setDdd_note(String ddd_note) {
            this.ddd_note = ddd_note;
            return this;
        }

        public Builder setDdd_um(String ddd_um) {
            this.ddd_um = ddd_um;
            return this;
        }

        public Builder setEpatico(Boolean epatico) {
            this.epatico = epatico;
            return this;
        }

        public Builder setHiv(Boolean hiv) {
            this.hiv = hiv;
            return this;
        }

        public Builder setLivello(Integer livello) {
            this.livello = livello;
            return this;
        }

        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNon_arv(Boolean non_arv) {
            this.non_arv = non_arv;
            return this;
        }

        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }


        public CliFarmaco_ATCCursorDTO build() {
            CliFarmaco_ATCCursorDTO result = new CliFarmaco_ATCCursorDTO();
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
            return result;
        }

    }
}
