package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Range_BMI.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRange_BMIDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String colore;
    private String messaggio;
    private String min;

    public CliRange_BMIDraftUpdateBulkDTO() {
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

    public static CliRange_BMIDraftUpdateBulkDTO.Builder builder() {
        return new CliRange_BMIDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String colore;
        private String messaggio;
        private String min;

        public Builder() {
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


        public CliRange_BMIDraftUpdateBulkDTO build() {
            CliRange_BMIDraftUpdateBulkDTO result = new CliRange_BMIDraftUpdateBulkDTO();
            result.setColore(this.colore);
            result.setMessaggio(this.messaggio);
            result.setMin(this.min);
            return result;
        }

    }
}
