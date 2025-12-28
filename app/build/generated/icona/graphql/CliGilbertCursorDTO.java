package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Gilbert.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliGilbertCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String risultato;

    public CliGilbertCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getRisultato() {
        return risultato;
    }
    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (risultato != null) {
            joiner.add("risultato: " + GraphQLRequestSerializer.getEntry(risultato));
        }
        return joiner.toString();
    }

    public static CliGilbertCursorDTO.Builder builder() {
        return new CliGilbertCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String risultato;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setRisultato(String risultato) {
            this.risultato = risultato;
            return this;
        }


        public CliGilbertCursorDTO build() {
            CliGilbertCursorDTO result = new CliGilbertCursorDTO();
            result.set_id(this._id);
            result.setRisultato(this.risultato);
            return result;
        }

    }
}
