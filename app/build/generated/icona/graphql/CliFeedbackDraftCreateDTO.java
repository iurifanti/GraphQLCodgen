package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFeedbackDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String feedback;
    private String sezione;
    private String stato;

    public CliFeedbackDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSezione() {
        return sezione;
    }
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (feedback != null) {
            joiner.add("feedback: " + GraphQLRequestSerializer.getEntry(feedback));
        }
        if (sezione != null) {
            joiner.add("sezione: " + GraphQLRequestSerializer.getEntry(sezione));
        }
        if (stato != null) {
            joiner.add("stato: " + GraphQLRequestSerializer.getEntry(stato));
        }
        return joiner.toString();
    }

    public static CliFeedbackDraftCreateDTO.Builder builder() {
        return new CliFeedbackDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String feedback;
        private String sezione;
        private String stato;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder setSezione(String sezione) {
            this.sezione = sezione;
            return this;
        }

        public Builder setStato(String stato) {
            this.stato = stato;
            return this;
        }


        public CliFeedbackDraftCreateDTO build() {
            CliFeedbackDraftCreateDTO result = new CliFeedbackDraftCreateDTO();
            result.set_clientId(this._clientId);
            result.setFeedback(this.feedback);
            result.setSezione(this.sezione);
            result.setStato(this.stato);
            return result;
        }

    }
}
