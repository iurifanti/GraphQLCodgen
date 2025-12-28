package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Farmaco_altro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_altroCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Boolean anche_da_solo;
    private String codice_DAD;
    private String combinazioni_accettate;
    private String gruppo;
    private String nome;
    private String nome_gruppo;
    private String nome_tipo;
    private String sottogruppo;
    private String tag;
    private Integer tipo;
    private Boolean vaccino_covid;
    private Boolean vaccino_non_covid;

    public CliFarmaco_altroCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAnche_da_solo() {
        return anche_da_solo;
    }
    public void setAnche_da_solo(Boolean anche_da_solo) {
        this.anche_da_solo = anche_da_solo;
    }

    public String getCodice_DAD() {
        return codice_DAD;
    }
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    public String getCombinazioni_accettate() {
        return combinazioni_accettate;
    }
    public void setCombinazioni_accettate(String combinazioni_accettate) {
        this.combinazioni_accettate = combinazioni_accettate;
    }

    public String getGruppo() {
        return gruppo;
    }
    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_gruppo() {
        return nome_gruppo;
    }
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public String getSottogruppo() {
        return sottogruppo;
    }
    public void setSottogruppo(String sottogruppo) {
        this.sottogruppo = sottogruppo;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Boolean getVaccino_covid() {
        return vaccino_covid;
    }
    public void setVaccino_covid(Boolean vaccino_covid) {
        this.vaccino_covid = vaccino_covid;
    }

    public Boolean getVaccino_non_covid() {
        return vaccino_non_covid;
    }
    public void setVaccino_non_covid(Boolean vaccino_non_covid) {
        this.vaccino_non_covid = vaccino_non_covid;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (anche_da_solo != null) {
            joiner.add("anche_da_solo: " + GraphQLRequestSerializer.getEntry(anche_da_solo));
        }
        if (codice_DAD != null) {
            joiner.add("codice_DAD: " + GraphQLRequestSerializer.getEntry(codice_DAD));
        }
        if (combinazioni_accettate != null) {
            joiner.add("combinazioni_accettate: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate));
        }
        if (gruppo != null) {
            joiner.add("gruppo: " + GraphQLRequestSerializer.getEntry(gruppo));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (nome_gruppo != null) {
            joiner.add("nome_gruppo: " + GraphQLRequestSerializer.getEntry(nome_gruppo));
        }
        if (nome_tipo != null) {
            joiner.add("nome_tipo: " + GraphQLRequestSerializer.getEntry(nome_tipo));
        }
        if (sottogruppo != null) {
            joiner.add("sottogruppo: " + GraphQLRequestSerializer.getEntry(sottogruppo));
        }
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag));
        }
        if (tipo != null) {
            joiner.add("tipo: " + GraphQLRequestSerializer.getEntry(tipo));
        }
        if (vaccino_covid != null) {
            joiner.add("vaccino_covid: " + GraphQLRequestSerializer.getEntry(vaccino_covid));
        }
        if (vaccino_non_covid != null) {
            joiner.add("vaccino_non_covid: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid));
        }
        return joiner.toString();
    }

    public static CliFarmaco_altroCursorDTO.Builder builder() {
        return new CliFarmaco_altroCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private Boolean anche_da_solo;
        private String codice_DAD;
        private String combinazioni_accettate;
        private String gruppo;
        private String nome;
        private String nome_gruppo;
        private String nome_tipo;
        private String sottogruppo;
        private String tag;
        private Integer tipo;
        private Boolean vaccino_covid;
        private Boolean vaccino_non_covid;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAnche_da_solo(Boolean anche_da_solo) {
            this.anche_da_solo = anche_da_solo;
            return this;
        }

        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        public Builder setCombinazioni_accettate(String combinazioni_accettate) {
            this.combinazioni_accettate = combinazioni_accettate;
            return this;
        }

        public Builder setGruppo(String gruppo) {
            this.gruppo = gruppo;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        public Builder setSottogruppo(String sottogruppo) {
            this.sottogruppo = sottogruppo;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTipo(Integer tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder setVaccino_covid(Boolean vaccino_covid) {
            this.vaccino_covid = vaccino_covid;
            return this;
        }

        public Builder setVaccino_non_covid(Boolean vaccino_non_covid) {
            this.vaccino_non_covid = vaccino_non_covid;
            return this;
        }


        public CliFarmaco_altroCursorDTO build() {
            CliFarmaco_altroCursorDTO result = new CliFarmaco_altroCursorDTO();
            result.set_id(this._id);
            result.setAnche_da_solo(this.anche_da_solo);
            result.setCodice_DAD(this.codice_DAD);
            result.setCombinazioni_accettate(this.combinazioni_accettate);
            result.setGruppo(this.gruppo);
            result.setNome(this.nome);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_tipo(this.nome_tipo);
            result.setSottogruppo(this.sottogruppo);
            result.setTag(this.tag);
            result.setTipo(this.tipo);
            result.setVaccino_covid(this.vaccino_covid);
            result.setVaccino_non_covid(this.vaccino_non_covid);
            return result;
        }

    }
}
