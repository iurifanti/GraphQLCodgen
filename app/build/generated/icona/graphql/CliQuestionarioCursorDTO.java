package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Questionario.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionarioCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String descrizione;
    private Integer domande;
    private Integer intervallo_compil_mesi;
    private String nome;
    private Boolean parametri_personali;
    private String studi_appartenenza;
    private String titolo;

    public CliQuestionarioCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getDomande() {
        return domande;
    }
    public void setDomande(Integer domande) {
        this.domande = domande;
    }

    public Integer getIntervallo_compil_mesi() {
        return intervallo_compil_mesi;
    }
    public void setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
        this.intervallo_compil_mesi = intervallo_compil_mesi;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    public String getStudi_appartenenza() {
        return studi_appartenenza;
    }
    public void setStudi_appartenenza(String studi_appartenenza) {
        this.studi_appartenenza = studi_appartenenza;
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
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        if (domande != null) {
            joiner.add("domande: " + GraphQLRequestSerializer.getEntry(domande));
        }
        if (intervallo_compil_mesi != null) {
            joiner.add("intervallo_compil_mesi: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (parametri_personali != null) {
            joiner.add("parametri_personali: " + GraphQLRequestSerializer.getEntry(parametri_personali));
        }
        if (studi_appartenenza != null) {
            joiner.add("studi_appartenenza: " + GraphQLRequestSerializer.getEntry(studi_appartenenza));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        return joiner.toString();
    }

    public static CliQuestionarioCursorDTO.Builder builder() {
        return new CliQuestionarioCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String descrizione;
        private Integer domande;
        private Integer intervallo_compil_mesi;
        private String nome;
        private Boolean parametri_personali;
        private String studi_appartenenza;
        private String titolo;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        public Builder setDomande(Integer domande) {
            this.domande = domande;
            return this;
        }

        public Builder setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
            this.intervallo_compil_mesi = intervallo_compil_mesi;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        public Builder setStudi_appartenenza(String studi_appartenenza) {
            this.studi_appartenenza = studi_appartenenza;
            return this;
        }

        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }


        public CliQuestionarioCursorDTO build() {
            CliQuestionarioCursorDTO result = new CliQuestionarioCursorDTO();
            result.set_id(this._id);
            result.setDescrizione(this.descrizione);
            result.setDomande(this.domande);
            result.setIntervallo_compil_mesi(this.intervallo_compil_mesi);
            result.setNome(this.nome);
            result.setParametri_personali(this.parametri_personali);
            result.setStudi_appartenenza(this.studi_appartenenza);
            result.setTitolo(this.titolo);
            return result;
        }

    }
}
