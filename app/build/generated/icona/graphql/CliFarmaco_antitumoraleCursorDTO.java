package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Farmaco_antitumorale.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_antitumoraleCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String combinazioni;
    private String farmaco_ATC;
    private Integer n_tipi_trattamento_associati;
    private String nome;
    private String tipi_trattamento_associati;

    public CliFarmaco_antitumoraleCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCombinazioni() {
        return combinazioni;
    }
    public void setCombinazioni(String combinazioni) {
        this.combinazioni = combinazioni;
    }

    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    public Integer getN_tipi_trattamento_associati() {
        return n_tipi_trattamento_associati;
    }
    public void setN_tipi_trattamento_associati(Integer n_tipi_trattamento_associati) {
        this.n_tipi_trattamento_associati = n_tipi_trattamento_associati;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipi_trattamento_associati() {
        return tipi_trattamento_associati;
    }
    public void setTipi_trattamento_associati(String tipi_trattamento_associati) {
        this.tipi_trattamento_associati = tipi_trattamento_associati;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (combinazioni != null) {
            joiner.add("combinazioni: " + GraphQLRequestSerializer.getEntry(combinazioni));
        }
        if (farmaco_ATC != null) {
            joiner.add("farmaco_ATC: " + GraphQLRequestSerializer.getEntry(farmaco_ATC));
        }
        if (n_tipi_trattamento_associati != null) {
            joiner.add("n_tipi_trattamento_associati: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (tipi_trattamento_associati != null) {
            joiner.add("tipi_trattamento_associati: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati));
        }
        return joiner.toString();
    }

    public static CliFarmaco_antitumoraleCursorDTO.Builder builder() {
        return new CliFarmaco_antitumoraleCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String combinazioni;
        private String farmaco_ATC;
        private Integer n_tipi_trattamento_associati;
        private String nome;
        private String tipi_trattamento_associati;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCombinazioni(String combinazioni) {
            this.combinazioni = combinazioni;
            return this;
        }

        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        public Builder setN_tipi_trattamento_associati(Integer n_tipi_trattamento_associati) {
            this.n_tipi_trattamento_associati = n_tipi_trattamento_associati;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setTipi_trattamento_associati(String tipi_trattamento_associati) {
            this.tipi_trattamento_associati = tipi_trattamento_associati;
            return this;
        }


        public CliFarmaco_antitumoraleCursorDTO build() {
            CliFarmaco_antitumoraleCursorDTO result = new CliFarmaco_antitumoraleCursorDTO();
            result.set_id(this._id);
            result.setCombinazioni(this.combinazioni);
            result.setFarmaco_ATC(this.farmaco_ATC);
            result.setN_tipi_trattamento_associati(this.n_tipi_trattamento_associati);
            result.setNome(this.nome);
            result.setTipi_trattamento_associati(this.tipi_trattamento_associati);
            return result;
        }

    }
}
