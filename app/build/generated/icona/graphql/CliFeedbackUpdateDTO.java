package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliFeedbackUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String feedback;
    private String sezione;
    private String stato;

    public CliFeedbackUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
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

    public static CliFeedbackUpdateDTO.Builder builder() {
        return new CliFeedbackUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String feedback;
        private String sezione;
        private String stato;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
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


        public CliFeedbackUpdateDTO build() {
            CliFeedbackUpdateDTO result = new CliFeedbackUpdateDTO();
            result.set_id(this._id);
            result.setFeedback(this.feedback);
            result.setSezione(this.sezione);
            result.setStato(this.stato);
            return result;
        }

    }
}
