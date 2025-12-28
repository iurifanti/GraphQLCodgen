package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of singleton class User_message.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliUser_messageUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String messaggio;
    private String scadenza_messaggio;

    public CliUser_messageUpdateDTO() {
    }


    public String getMessaggio() {
        return messaggio;
    }
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getScadenza_messaggio() {
        return scadenza_messaggio;
    }
    public void setScadenza_messaggio(String scadenza_messaggio) {
        this.scadenza_messaggio = scadenza_messaggio;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (messaggio != null) {
            joiner.add("messaggio: " + GraphQLRequestSerializer.getEntry(messaggio));
        }
        if (scadenza_messaggio != null) {
            joiner.add("scadenza_messaggio: " + GraphQLRequestSerializer.getEntry(scadenza_messaggio));
        }
        return joiner.toString();
    }

    public static CliUser_messageUpdateDTO.Builder builder() {
        return new CliUser_messageUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String messaggio;
        private String scadenza_messaggio;

        public Builder() {
        }

        public Builder setMessaggio(String messaggio) {
            this.messaggio = messaggio;
            return this;
        }

        public Builder setScadenza_messaggio(String scadenza_messaggio) {
            this.scadenza_messaggio = scadenza_messaggio;
            return this;
        }


        public CliUser_messageUpdateDTO build() {
            CliUser_messageUpdateDTO result = new CliUser_messageUpdateDTO();
            result.setMessaggio(this.messaggio);
            result.setScadenza_messaggio(this.scadenza_messaggio);
            return result;
        }

    }
}
