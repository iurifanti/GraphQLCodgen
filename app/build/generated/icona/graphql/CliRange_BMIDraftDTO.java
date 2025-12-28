package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Range_BMI.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRange_BMIDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private String colore;
    private String messaggio;
    private String min;

    public CliRange_BMIDraftDTO() {
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

    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getMessaggio() {
        return messaggio;
    }
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMin() {
        return min;
    }
    public void setMin(String min) {
        this.min = min;
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
        if (colore != null) {
            joiner.add("colore: " + GraphQLRequestSerializer.getEntry(colore));
        }
        if (messaggio != null) {
            joiner.add("messaggio: " + GraphQLRequestSerializer.getEntry(messaggio));
        }
        if (min != null) {
            joiner.add("min: " + GraphQLRequestSerializer.getEntry(min));
        }
        return joiner.toString();
    }

    public static CliRange_BMIDraftDTO.Builder builder() {
        return new CliRange_BMIDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private String colore;
        private String messaggio;
        private String min;

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

        public Builder setColore(String colore) {
            this.colore = colore;
            return this;
        }

        public Builder setMessaggio(String messaggio) {
            this.messaggio = messaggio;
            return this;
        }

        public Builder setMin(String min) {
            this.min = min;
            return this;
        }


        public CliRange_BMIDraftDTO build() {
            CliRange_BMIDraftDTO result = new CliRange_BMIDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setColore(this.colore);
            result.setMessaggio(this.messaggio);
            result.setMin(this.min);
            return result;
        }

    }
}
