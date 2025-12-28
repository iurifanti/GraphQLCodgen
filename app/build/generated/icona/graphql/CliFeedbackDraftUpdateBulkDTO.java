package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliFeedbackDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String feedback;
    private String sezione;
    private String stato;

    public CliFeedbackDraftUpdateBulkDTO() {
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

    public static CliFeedbackDraftUpdateBulkDTO.Builder builder() {
        return new CliFeedbackDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String feedback;
        private String sezione;
        private String stato;

        public Builder() {
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


        public CliFeedbackDraftUpdateBulkDTO build() {
            CliFeedbackDraftUpdateBulkDTO result = new CliFeedbackDraftUpdateBulkDTO();
            result.setFeedback(this.feedback);
            result.setSezione(this.sezione);
            result.setStato(this.stato);
            return result;
        }

    }
}
