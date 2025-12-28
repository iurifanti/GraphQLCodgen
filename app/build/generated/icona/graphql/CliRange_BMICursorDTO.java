package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Range_BMI.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliRange_BMICursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String colore;
    private String messaggio;
    private String min;

    public CliRange_BMICursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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

    public static CliRange_BMICursorDTO.Builder builder() {
        return new CliRange_BMICursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String colore;
        private String messaggio;
        private String min;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
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


        public CliRange_BMICursorDTO build() {
            CliRange_BMICursorDTO result = new CliRange_BMICursorDTO();
            result.set_id(this._id);
            result.setColore(this.colore);
            result.setMessaggio(this.messaggio);
            result.setMin(this.min);
            return result;
        }

    }
}
