package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Terapia_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_covidCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String altro_farmaco;
    private String data_fine;
    private String data_inizio;
    private String farmaco_covid;

    public CliTerapia_covidCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getData_inizio() {
        return data_inizio;
    }
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public String getFarmaco_covid() {
        return farmaco_covid;
    }
    public void setFarmaco_covid(String farmaco_covid) {
        this.farmaco_covid = farmaco_covid;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (farmaco_covid != null) {
            joiner.add("farmaco_covid: " + GraphQLRequestSerializer.getEntry(farmaco_covid));
        }
        return joiner.toString();
    }

    public static CliTerapia_covidCursorDTO.Builder builder() {
        return new CliTerapia_covidCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String altro_farmaco;
        private String data_fine;
        private String data_inizio;
        private String farmaco_covid;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        public Builder setFarmaco_covid(String farmaco_covid) {
            this.farmaco_covid = farmaco_covid;
            return this;
        }


        public CliTerapia_covidCursorDTO build() {
            CliTerapia_covidCursorDTO result = new CliTerapia_covidCursorDTO();
            result.set_id(this._id);
            result.setAltro_farmaco(this.altro_farmaco);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setFarmaco_covid(this.farmaco_covid);
            return result;
        }

    }
}
