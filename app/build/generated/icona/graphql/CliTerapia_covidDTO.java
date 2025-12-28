package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Terapia_covid, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTerapia_covidDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String altro_farmaco;
    private String data_fine;
    private String data_inizio;
    private String farmaco_covid;
    private CliFarmaco_covidDTO farmaco_covid_;
    private CliC_dettaglioDTO c_dettaglio_;

    public CliTerapia_covidDTO() {
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
     * The attribute _id of Terapia_covid. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Terapia_covid. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro_farmaco of Terapia_covid. It is of type String. Max length: 255.
     */
    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    /**
     * The attribute altro_farmaco of Terapia_covid. It is of type String. Max length: 255.
     */
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    /**
     * The attribute data_fine of Terapia_covid. It is of type Date @dateFormat.
     */
    public String getData_fine() {
        return data_fine;
    }
    /**
     * The attribute data_fine of Terapia_covid. It is of type Date @dateFormat.
     */
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    /**
     * The attribute data_inizio of Terapia_covid. It is of type Date @dateFormat.
     */
    public String getData_inizio() {
        return data_inizio;
    }
    /**
     * The attribute data_inizio of Terapia_covid. It is of type Date @dateFormat.
     */
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    /**
     * The attribute farmaco_covid of Terapia_covid. It is of type String. Path: farmaco_covid_ nome.
     */
    public String getFarmaco_covid() {
        return farmaco_covid;
    }
    /**
     * The attribute farmaco_covid of Terapia_covid. It is of type String. Path: farmaco_covid_ nome.
     */
    public void setFarmaco_covid(String farmaco_covid) {
        this.farmaco_covid = farmaco_covid;
    }

    /**
     * The associated object for the role farmaco_covid_.
     */
    public CliFarmaco_covidDTO getFarmaco_covid_() {
        return farmaco_covid_;
    }
    /**
     * The associated object for the role farmaco_covid_.
     */
    public void setFarmaco_covid_(CliFarmaco_covidDTO farmaco_covid_) {
        this.farmaco_covid_ = farmaco_covid_;
    }

    /**
     * The associated object for the role c_dettaglio_.
     */
    public CliC_dettaglioDTO getC_dettaglio_() {
        return c_dettaglio_;
    }
    /**
     * The associated object for the role c_dettaglio_.
     */
    public void setC_dettaglio_(CliC_dettaglioDTO c_dettaglio_) {
        this.c_dettaglio_ = c_dettaglio_;
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
        if (farmaco_covid_ != null) {
            joiner.add("farmaco_covid_: " + GraphQLRequestSerializer.getEntry(farmaco_covid_));
        }
        if (c_dettaglio_ != null) {
            joiner.add("c_dettaglio_: " + GraphQLRequestSerializer.getEntry(c_dettaglio_));
        }
        return joiner.toString();
    }

    public static CliTerapia_covidDTO.Builder builder() {
        return new CliTerapia_covidDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String altro_farmaco;
        private String data_fine;
        private String data_inizio;
        private String farmaco_covid;
        private CliFarmaco_covidDTO farmaco_covid_;
        private CliC_dettaglioDTO c_dettaglio_;

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
         * The attribute _id of Terapia_covid. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro_farmaco of Terapia_covid. It is of type String. Max length: 255.
         */
        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        /**
         * The attribute data_fine of Terapia_covid. It is of type Date @dateFormat.
         */
        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        /**
         * The attribute data_inizio of Terapia_covid. It is of type Date @dateFormat.
         */
        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        /**
         * The attribute farmaco_covid of Terapia_covid. It is of type String. Path: farmaco_covid_ nome.
         */
        public Builder setFarmaco_covid(String farmaco_covid) {
            this.farmaco_covid = farmaco_covid;
            return this;
        }

        /**
         * The associated object for the role farmaco_covid_.
         */
        public Builder setFarmaco_covid_(CliFarmaco_covidDTO farmaco_covid_) {
            this.farmaco_covid_ = farmaco_covid_;
            return this;
        }

        /**
         * The associated object for the role c_dettaglio_.
         */
        public Builder setC_dettaglio_(CliC_dettaglioDTO c_dettaglio_) {
            this.c_dettaglio_ = c_dettaglio_;
            return this;
        }


        public CliTerapia_covidDTO build() {
            CliTerapia_covidDTO result = new CliTerapia_covidDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltro_farmaco(this.altro_farmaco);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setFarmaco_covid(this.farmaco_covid);
            result.setFarmaco_covid_(this.farmaco_covid_);
            result.setC_dettaglio_(this.c_dettaglio_);
            return result;
        }

    }
}
