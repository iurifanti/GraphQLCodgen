package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Tipo_trattamento_antitumorale.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTipo_trattamento_antitumoraleCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Boolean cellulare;
    private Boolean chemioterapia;
    private Boolean chirurgico;
    private String farmaco_antitumorali_associati;
    private Boolean immunoterapia;
    private Integer n_farmaci_antitumorali_associati;
    private String nome;
    private Boolean ormonale;
    private Boolean radioterapia;
    private Boolean staminali;

    public CliTipo_trattamento_antitumoraleCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getCellulare() {
        return cellulare;
    }
    public void setCellulare(Boolean cellulare) {
        this.cellulare = cellulare;
    }

    public Boolean getChemioterapia() {
        return chemioterapia;
    }
    public void setChemioterapia(Boolean chemioterapia) {
        this.chemioterapia = chemioterapia;
    }

    public Boolean getChirurgico() {
        return chirurgico;
    }
    public void setChirurgico(Boolean chirurgico) {
        this.chirurgico = chirurgico;
    }

    public String getFarmaco_antitumorali_associati() {
        return farmaco_antitumorali_associati;
    }
    public void setFarmaco_antitumorali_associati(String farmaco_antitumorali_associati) {
        this.farmaco_antitumorali_associati = farmaco_antitumorali_associati;
    }

    public Boolean getImmunoterapia() {
        return immunoterapia;
    }
    public void setImmunoterapia(Boolean immunoterapia) {
        this.immunoterapia = immunoterapia;
    }

    public Integer getN_farmaci_antitumorali_associati() {
        return n_farmaci_antitumorali_associati;
    }
    public void setN_farmaci_antitumorali_associati(Integer n_farmaci_antitumorali_associati) {
        this.n_farmaci_antitumorali_associati = n_farmaci_antitumorali_associati;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getOrmonale() {
        return ormonale;
    }
    public void setOrmonale(Boolean ormonale) {
        this.ormonale = ormonale;
    }

    public Boolean getRadioterapia() {
        return radioterapia;
    }
    public void setRadioterapia(Boolean radioterapia) {
        this.radioterapia = radioterapia;
    }

    public Boolean getStaminali() {
        return staminali;
    }
    public void setStaminali(Boolean staminali) {
        this.staminali = staminali;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (cellulare != null) {
            joiner.add("cellulare: " + GraphQLRequestSerializer.getEntry(cellulare));
        }
        if (chemioterapia != null) {
            joiner.add("chemioterapia: " + GraphQLRequestSerializer.getEntry(chemioterapia));
        }
        if (chirurgico != null) {
            joiner.add("chirurgico: " + GraphQLRequestSerializer.getEntry(chirurgico));
        }
        if (farmaco_antitumorali_associati != null) {
            joiner.add("farmaco_antitumorali_associati: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati));
        }
        if (immunoterapia != null) {
            joiner.add("immunoterapia: " + GraphQLRequestSerializer.getEntry(immunoterapia));
        }
        if (n_farmaci_antitumorali_associati != null) {
            joiner.add("n_farmaci_antitumorali_associati: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (ormonale != null) {
            joiner.add("ormonale: " + GraphQLRequestSerializer.getEntry(ormonale));
        }
        if (radioterapia != null) {
            joiner.add("radioterapia: " + GraphQLRequestSerializer.getEntry(radioterapia));
        }
        if (staminali != null) {
            joiner.add("staminali: " + GraphQLRequestSerializer.getEntry(staminali));
        }
        return joiner.toString();
    }

    public static CliTipo_trattamento_antitumoraleCursorDTO.Builder builder() {
        return new CliTipo_trattamento_antitumoraleCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private Boolean cellulare;
        private Boolean chemioterapia;
        private Boolean chirurgico;
        private String farmaco_antitumorali_associati;
        private Boolean immunoterapia;
        private Integer n_farmaci_antitumorali_associati;
        private String nome;
        private Boolean ormonale;
        private Boolean radioterapia;
        private Boolean staminali;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCellulare(Boolean cellulare) {
            this.cellulare = cellulare;
            return this;
        }

        public Builder setChemioterapia(Boolean chemioterapia) {
            this.chemioterapia = chemioterapia;
            return this;
        }

        public Builder setChirurgico(Boolean chirurgico) {
            this.chirurgico = chirurgico;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati(String farmaco_antitumorali_associati) {
            this.farmaco_antitumorali_associati = farmaco_antitumorali_associati;
            return this;
        }

        public Builder setImmunoterapia(Boolean immunoterapia) {
            this.immunoterapia = immunoterapia;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati(Integer n_farmaci_antitumorali_associati) {
            this.n_farmaci_antitumorali_associati = n_farmaci_antitumorali_associati;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setOrmonale(Boolean ormonale) {
            this.ormonale = ormonale;
            return this;
        }

        public Builder setRadioterapia(Boolean radioterapia) {
            this.radioterapia = radioterapia;
            return this;
        }

        public Builder setStaminali(Boolean staminali) {
            this.staminali = staminali;
            return this;
        }


        public CliTipo_trattamento_antitumoraleCursorDTO build() {
            CliTipo_trattamento_antitumoraleCursorDTO result = new CliTipo_trattamento_antitumoraleCursorDTO();
            result.set_id(this._id);
            result.setCellulare(this.cellulare);
            result.setChemioterapia(this.chemioterapia);
            result.setChirurgico(this.chirurgico);
            result.setFarmaco_antitumorali_associati(this.farmaco_antitumorali_associati);
            result.setImmunoterapia(this.immunoterapia);
            result.setN_farmaci_antitumorali_associati(this.n_farmaci_antitumorali_associati);
            result.setNome(this.nome);
            result.setOrmonale(this.ormonale);
            result.setRadioterapia(this.radioterapia);
            result.setStaminali(this.staminali);
            return result;
        }

    }
}
